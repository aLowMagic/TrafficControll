package com.example.demo.service.chatService.iService;

import java.lang.reflect.Method;
import java.util.*;

import javax.transaction.Transactional;

import com.example.demo.storage.MysqlStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.NLP.Segmentation_ansj;
import com.example.demo.po.FaqAnswer;
import com.example.demo.po.FaqAnswerExample;
import com.example.demo.po.FaqQuestion;
import com.example.demo.po.FaqQuestionExample;
import com.example.demo.po.Robot;
import com.example.demo.service.chatService.RobotService;
import com.example.demo.vo.robot_Chat;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RobotServiceImpl implements RobotService {

    @Autowired
    MysqlStorage mysqlStorage;

    private Logger logger = LoggerFactory.getLogger(RobotService.class);
	/**
	 * robot_ajax获取机器人信息
	 */
    @Override
    public List<Robot> robotinfo() {
        List<Robot> list = new ArrayList<>();
        List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
        String sql = "select * from robot;";
        res = mysqlStorage.select(sql, true);
        if (res != null) {
            for (int i = 0; i < res.size(); i++) {
                Map<String, Object> obj2v = res.get(i);
                if (obj2v != null) {
                    Robot r = new Robot();
                    Class c = r.getClass();
                    for (String title : obj2v.keySet()) {
                        try {
                            Method m = c.getDeclaredMethod("set" + title.toUpperCase(), String.class);
                            m.invoke(r, obj2v.get(title).toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    list.add(r);
                }
            }
        }
        return list;
    }
	
	/**
	 * robot_ajax_和机器人聊天
	 */
	@Override
	public List<robot_Chat> getRobotAnswer(String comment) throws Exception {
		List<robot_Chat> robot_Chats = Segmentation_ansj.robot_Chats(comment);	
		List<robot_Chat> list = new ArrayList<robot_Chat>();
		while(robot_Chats.size()>1){
			robot_Chats.remove(robot_Chats.size()-1);
		}
		if (robot_Chats.size()==1) {
			robot_Chat robot_Chat = new robot_Chat();
			System.out.println("机器人提问问题号："+robot_Chats.get(0).getQuestionId());
			robot_Chat.setQuestionId(robot_Chats.get(0).getQuestionId());
			//List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(robot_Chats.get(0).getQuestionId());
			String sql = "select * from FaqAnswer where faqquestionid='"+robot_Chats.get(0).getQuestionId()+"';";
			List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
			logger.info("============getRobotAnswer sql: "+sql);
			res = mysqlStorage.select(sql, true);
			if(res.size()!=0){
				Map<String, Object> map = res.get(0);
				robot_Chat.setAnswerId(map.get("faqanswerid").toString());
				robot_Chat.setAnswer(map.get("faqcontent").toString());
			}
			list.add(robot_Chat);
		}else {
			robot_Chats = ListSort(robot_Chats);
			robot_Chat robot_Chat = new robot_Chat();
			robot_Chat.setQuestionId(robot_Chats.get(0).getQuestionId());
			String sql = "select * from FaqAnswer where faqquestionid="+String.valueOf(robot_Chats.get(0).getQuestionId());
			List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
			res = mysqlStorage.select(sql, true);
			if(res.size()!=0){
				Map<String, Object> map = res.get(0);
				robot_Chat.setAnswerId(map.get("faqanswerid").toString());
				robot_Chat.setAnswer(map.get("faqcontent").toString());
			}
			list.add(robot_Chat);
		}
		return list;
	}
	
	//对按余弦相似度进行排序
	private List<robot_Chat> ListSort(List<robot_Chat> list){
		Collections.sort(list,new Comparator<robot_Chat>() {
			@Override
			public int compare(robot_Chat o1, robot_Chat o2) {
				double number1 = o1.getValue();
				double number2 = o2.getValue();
				if (number1<number2) {
					return 1;
				}else if (number1>number2) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		return list;
	}
	

}
