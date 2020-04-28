package com.example.demo.po;

public class Robot {
    private String ROBOTID;

    private String ROBOTNAME;

    private String ROBOTIMAGE;

    private String ROBOTINTRODUCTION;

    private String ROBOTWELCOME;

    private String ROBOTNOKNOW;

    public String getROBOTID() {
        return ROBOTID;
    }

    public void setROBOTID(String ROBOTID) {
        this.ROBOTID = ROBOTID == null ? null : ROBOTID.trim();
    }

    public String getROBOTNAME() {
        return ROBOTNAME;
    }

    public void setROBOTNAME(String ROBOTNAME) {
        this.ROBOTNAME = ROBOTNAME == null ? null : ROBOTNAME.trim();
    }

    public String getROBOTIMAGE() {
        return ROBOTIMAGE;
    }

    public void setROBOTIMAGE(String ROBOTIMAGE) {
        this.ROBOTIMAGE = ROBOTIMAGE == null ? null : ROBOTIMAGE.trim();
    }

    public String getROBOTINTRODUCTION() {
        return ROBOTINTRODUCTION;
    }

    public void setROBOTINTRODUCTION(String ROBOTINTRODUCTION) {
        this.ROBOTINTRODUCTION = ROBOTINTRODUCTION == null ? null : ROBOTINTRODUCTION.trim();
    }

    public String getROBOTWELCOME() {
        return ROBOTWELCOME;
    }

    public void setROBOTWELCOME(String ROBOTWELCOME) {
        this.ROBOTWELCOME = ROBOTWELCOME == null ? null : ROBOTWELCOME.trim();
    }

    public String getROBOTNOKNOW() {
        return ROBOTNOKNOW;
    }

    public void setROBOTNOKNOW(String ROBOTNOKNOW) {
        this.ROBOTNOKNOW = ROBOTNOKNOW == null ? null : ROBOTNOKNOW.trim();
    }
}