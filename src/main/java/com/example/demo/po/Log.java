package com.example.demo.po;

public class Log {
    private String LOGID;

    private String USERID;

    private String LOGMETHOD;

    private String LOGTIME;

    private String OPERATION;

    private String URL;

    private String IP;

    public String getLOGID() {
        return LOGID;
    }

    public void setLOGID(String LOGID) {
        this.LOGID = LOGID == null ? null : LOGID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getLOGMETHOD() {
        return LOGMETHOD;
    }

    public void setLOGMETHOD(String LOGMETHOD) {
        this.LOGMETHOD = LOGMETHOD == null ? null : LOGMETHOD.trim();
    }

    public String getLOGTIME() {
        return LOGTIME;
    }

    public void setLOGTIME(String LOGTIME) {
        this.LOGTIME = LOGTIME == null ? null : LOGTIME.trim();
    }

    public String getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(String OPERATION) {
        this.OPERATION = OPERATION == null ? null : OPERATION.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }
}