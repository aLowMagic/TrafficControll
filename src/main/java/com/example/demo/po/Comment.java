package com.example.demo.po;

public class Comment {
    private String COMMENTID;

    private String FAQQUESTIONID;

    private String COMMUNITYQUESTIONID;

    private String USERID;

    private String COMMENTCONTENT;

    private String COMMENTTIME;

    private String COMMENTPARENTID;

    private String TOUSERID;

    private Integer ISNOTICE;
    
    //非数据库项
    private String NUM;

    public String getNUM() {
		return NUM;
	}

	public void setNUM(String nUM) {
		NUM = nUM;
	}

	public String getCOMMENTID() {
        return COMMENTID;
    }

    public void setCOMMENTID(String COMMENTID) {
        this.COMMENTID = COMMENTID == null ? null : COMMENTID.trim();
    }

    public String getFAQQUESTIONID() {
        return FAQQUESTIONID;
    }

    public void setFAQQUESTIONID(String FAQQUESTIONID) {
        this.FAQQUESTIONID = FAQQUESTIONID == null ? null : FAQQUESTIONID.trim();
    }

    public String getCOMMUNITYQUESTIONID() {
        return COMMUNITYQUESTIONID;
    }

    public void setCOMMUNITYQUESTIONID(String COMMUNITYQUESTIONID) {
        this.COMMUNITYQUESTIONID = COMMUNITYQUESTIONID == null ? null : COMMUNITYQUESTIONID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getCOMMENTCONTENT() {
        return COMMENTCONTENT;
    }

    public void setCOMMENTCONTENT(String COMMENTCONTENT) {
        this.COMMENTCONTENT = COMMENTCONTENT == null ? null : COMMENTCONTENT.trim();
    }

    public String getCOMMENTTIME() {
        return COMMENTTIME;
    }

    public void setCOMMENTTIME(String COMMENTTIME) {
        this.COMMENTTIME = COMMENTTIME == null ? null : COMMENTTIME.trim();
    }

    public String getCOMMENTPARENTID() {
        return COMMENTPARENTID;
    }

    public void setCOMMENTPARENTID(String COMMENTPARENTID) {
        this.COMMENTPARENTID = COMMENTPARENTID == null ? null : COMMENTPARENTID.trim();
    }

    public String getTOUSERID() {
        return TOUSERID;
    }

    public void setTOUSERID(String TOUSERID) {
        this.TOUSERID = TOUSERID == null ? null : TOUSERID.trim();
    }

    public Integer getISNOTICE() {
        return ISNOTICE;
    }

    public void setISNOTICE(Integer ISNOTICE) {
        this.ISNOTICE = ISNOTICE;
    }
}