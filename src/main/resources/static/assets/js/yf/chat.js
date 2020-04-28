window.onload = scrollToBottom();
function keyDownSearch(e){
    var event = e || window.event;
    var code = event.keyCode || event.which || event.charCode;
    if(code==13) {
        var text = document.getElementById('msg').value;
        if(text != "\n" && text!=null&&text!=""){
            SendMsg();
            window.event.returnValue = false;
            e.preventDefault();
        }else{
            window.event.returnValue = false;
            e.preventDefault();
            text.value = "";
        }
    }
}

function scrollToBottom(){
    var scroll = document.getElementById("dialogWindow");
    scroll.scrollTop = scroll.scrollHeight;
    document.getElementById('msg').focus();
}

function SendMsg()
{
    var text = document.getElementById("msg");
    if (text.value != "" && text.value != null && text.value!="\n")
    {
        AddMsg('user', SendMsgDispose(text.value));
        $.ajax({
            type: "POST",
            url:  "http://localhost:8080/chatWithRobot?",
            dataType: "json",
            data: {"comment": text.value, "from": null, "UserName": null},
            success: function(e){
                robotChat = e["robotChat"];
                // alert(robotChat.length);
                if(robotChat.length!=0) {
                    answer = robotChat[0]["answer"];
                }else{
                    robotInfo = e["robotInfo"];
                    answer = robotInfo[0]["rOBOTNOKNOW"];
                }
                AddMsg('robot', answer);
            }

        });
        text.value = "";
    }
    scrollToBottom();
}


// 发送的信息处理
function SendMsgDispose(detail)
{
    detail = detail.replace(" ", "&nbsp;");
    return detail;
}

// 增加信息
function AddMsg(user,content)
{
    newDiv = CreadMsg(user, content);
    var msgs = document.getElementById("msgCard");
    msgs.appendChild(newDiv);
}

// 生成内容
function CreadMsg(user, content)
{
    newDiv = document.createElement("div");
    if(user == 'user')
    {
        newDiv.setAttribute("class", "msgright");
        // str = "<div class=\"msgright\">"+
        //     "<img class=\"chat_head\" src=\"../static/assets/img/dsp.png\">" +
        //     "<p class=\"msgText\">"+content+"</p>" +"</div>";
    }
    else
    {
        newDiv.setAttribute("class", "msgleft");
        // str="<div class=\"msgleft\">" +
        //     "<img class=\"chat_head\" src=\"../static/assets/img/dsp.png\">\n" +
        //     "<p class=\"msgText\">"+content+"</p>\n" +
        //     "</div>";
    }
    newImg = document.createElement("img");
    newImg.setAttribute("class", "chat_head");
    newImg.setAttribute("src", "./static/assets/img/dsp.png");
    newP = document.createElement("p");
    newP.setAttribute("class", "msgText");
    newP.innerHTML = content;
    newDiv.append(newImg);
    newDiv.append(newP);
    return newDiv;
}