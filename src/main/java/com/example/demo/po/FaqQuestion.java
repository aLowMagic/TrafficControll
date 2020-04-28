package com.example.demo.po;

public class FaqQuestion {
    private String FAQQUESTIONID;

    private String FAQTITLE;

    private String FAQKEYWORDS;

    private String FAQCLASSIFYID;

    private String COLLECTION;

    private String SCAN;

    private String MODIFYTIME;

    private String MODIFYNUMBER;

    private Integer FAQSTATE;

    private String USERID;

    private String FAQDESCRIPTION;

    public String getFAQQUESTIONID() {
        return FAQQUESTIONID;
    }

    public void setFAQQUESTIONID(String FAQQUESTIONID) {
        this.FAQQUESTIONID = FAQQUESTIONID == null ? null : FAQQUESTIONID.trim();
    }

    public String getFAQTITLE() {
        return FAQTITLE;
    }

    public void setFAQTITLE(String FAQTITLE) {
        this.FAQTITLE = FAQTITLE == null ? null : FAQTITLE.trim();
    }

    public String getFAQKEYWORDS() {
        return FAQKEYWORDS;
    }

    public void setFAQKEYWORDS(String FAQKEYWORDS) {
        this.FAQKEYWORDS = FAQKEYWORDS == null ? null : FAQKEYWORDS.trim();
    }

    public String getFAQCLASSIFYID() {
        return FAQCLASSIFYID;
    }

    public void setFAQCLASSIFYID(String FAQCLASSIFYID) {
        this.FAQCLASSIFYID = FAQCLASSIFYID == null ? null : FAQCLASSIFYID.trim();
    }

    public String getCOLLECTION() {
        return COLLECTION;
    }

    public void setCOLLECTION(String COLLECTION) {
        this.COLLECTION = COLLECTION == null ? null : COLLECTION.trim();
    }

    public String getSCAN() {
        return SCAN;
    }

    public void setSCAN(String SCAN) {
        this.SCAN = SCAN == null ? null : SCAN.trim();
    }

    public String getMODIFYTIME() {
        return MODIFYTIME;
    }

    public void setMODIFYTIME(String MODIFYTIME) {
        this.MODIFYTIME = MODIFYTIME == null ? null : MODIFYTIME.trim();
    }

    public String getMODIFYNUMBER() {
        return MODIFYNUMBER;
    }

    public void setMODIFYNUMBER(String MODIFYNUMBER) {
        this.MODIFYNUMBER = MODIFYNUMBER == null ? null : MODIFYNUMBER.trim();
    }

    public Integer getFAQSTATE() {
        return FAQSTATE;
    }

    public void setFAQSTATE(Integer FAQSTATE) {
        this.FAQSTATE = FAQSTATE;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getFAQDESCRIPTION() {
        return FAQDESCRIPTION;
    }

    public void setFAQDESCRIPTION(String FAQDESCRIPTION) {
        this.FAQDESCRIPTION = FAQDESCRIPTION == null ? null : FAQDESCRIPTION.trim();
    }
}