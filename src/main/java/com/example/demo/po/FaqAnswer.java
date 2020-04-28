package com.example.demo.po;

public class FaqAnswer {
    private String FAQANSWERID;

    private String FAQQUESTIONID;

    private String USERID;

    private String FAQCONTENT;

    public String getFAQANSWERID() {
        return FAQANSWERID;
    }

    public void setFAQANSWERID(String FAQANSWERID) {
        this.FAQANSWERID = FAQANSWERID == null ? null : FAQANSWERID.trim();
    }

    public String getFAQQUESTIONID() {
        return FAQQUESTIONID;
    }

    public void setFAQQUESTIONID(String FAQQUESTIONID) {
        this.FAQQUESTIONID = FAQQUESTIONID == null ? null : FAQQUESTIONID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getFAQCONTENT() {
        return FAQCONTENT;
    }

    public void setFAQCONTENT(String FAQCONTENT) {
        this.FAQCONTENT = FAQCONTENT == null ? null : FAQCONTENT.trim();
    }
}