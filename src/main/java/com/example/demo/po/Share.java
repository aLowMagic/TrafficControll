package com.example.demo.po;

public class Share {
    private String SHAREID;

    private String USERID;

    private String TIME;

    private String FAQQUESTIONID;

    private String COMMUNITYQUESTIONID;

    public String getSHAREID() {
        return SHAREID;
    }

    public void setSHAREID(String SHAREID) {
        this.SHAREID = SHAREID == null ? null : SHAREID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
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
}