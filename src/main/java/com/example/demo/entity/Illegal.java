package com.example.demo.entity;

public class Illegal {
    //违法编号
    private String nid;
    //号牌种类
    private String clicensetype;
    //车牌号码
    private String carNo;
    //违法时间
    private String illegalTime;
    //违法行为
    private String illegalBehavior;
    //违法地址
    private String illegalAddress;
    //车辆速度
    private String speed;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getClicensetype() {
        return clicensetype;
    }

    public void setClicensetype(String clicensetype) {
        this.clicensetype = clicensetype;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getIllegalTime() {
        return illegalTime;
    }

    public void setIllegalTime(String illegalTime) {
        this.illegalTime = illegalTime;
    }

    public String getIllegalBehavior() {
        return illegalBehavior;
    }

    public void setIllegalBehavior(String illegalBehavior) {
        this.illegalBehavior = illegalBehavior;
    }

    public String getIllegalAddress() {
        return illegalAddress;
    }

    public void setIllegalAddress(String illegalAddress) {
        this.illegalAddress = illegalAddress;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
