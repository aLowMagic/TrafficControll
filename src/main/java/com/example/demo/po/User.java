package com.example.demo.po;

public class User {
    private String USERID;

    private String USERNAME;

    private String USERPASSWORD;

    private String USEREMAIL;

    private String GENDER;

    private String USERBIRTHDAY;

    private String USERADDRESS;

    private String USERSIGNATURE;

    private String CREATETIME;

    private String ROLEID;

    private String AVATAR;

    private Integer USERSTATE;

    private String VERIFICATIONCODE;

    private String TIMEREMARKS;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getUSERPASSWORD() {
        return USERPASSWORD;
    }

    public void setUSERPASSWORD(String USERPASSWORD) {
        this.USERPASSWORD = USERPASSWORD == null ? null : USERPASSWORD.trim();
    }

    public String getUSEREMAIL() {
        return USEREMAIL;
    }

    public void setUSEREMAIL(String USEREMAIL) {
        this.USEREMAIL = USEREMAIL == null ? null : USEREMAIL.trim();
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER == null ? null : GENDER.trim();
    }

    public String getUSERBIRTHDAY() {
        return USERBIRTHDAY;
    }

    public void setUSERBIRTHDAY(String USERBIRTHDAY) {
        this.USERBIRTHDAY = USERBIRTHDAY == null ? null : USERBIRTHDAY.trim();
    }

    public String getUSERADDRESS() {
        return USERADDRESS;
    }

    public void setUSERADDRESS(String USERADDRESS) {
        this.USERADDRESS = USERADDRESS == null ? null : USERADDRESS.trim();
    }

    public String getUSERSIGNATURE() {
        return USERSIGNATURE;
    }

    public void setUSERSIGNATURE(String USERSIGNATURE) {
        this.USERSIGNATURE = USERSIGNATURE == null ? null : USERSIGNATURE.trim();
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME == null ? null : CREATETIME.trim();
    }

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID == null ? null : ROLEID.trim();
    }

    public String getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(String AVATAR) {
        this.AVATAR = AVATAR == null ? null : AVATAR.trim();
    }

    public Integer getUSERSTATE() {
        return USERSTATE;
    }

    public void setUSERSTATE(Integer USERSTATE) {
        this.USERSTATE = USERSTATE;
    }

    public String getVERIFICATIONCODE() {
        return VERIFICATIONCODE;
    }

    public void setVERIFICATIONCODE(String VERIFICATIONCODE) {
        this.VERIFICATIONCODE = VERIFICATIONCODE == null ? null : VERIFICATIONCODE.trim();
    }

    public String getTIMEREMARKS() {
        return TIMEREMARKS;
    }

    public void setTIMEREMARKS(String TIMEREMARKS) {
        this.TIMEREMARKS = TIMEREMARKS == null ? null : TIMEREMARKS.trim();
    }
}