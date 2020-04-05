package com.example.demo.entity;

public class IllegalVehicle {
    //车辆号码牌
    private  String carNo;
    //车辆驾驶人
    private String driver;
    //所在公司
    private String company;
    //车辆类型
    private String carType;
    //车辆违法行为数
    private int illegalBehaviorNum;
    //车辆违法类型
    private String illegalBehaviorType;
    //车辆违法原因
    private String illegalBehaviorReason;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getIllegalBehaviorNum() {
        return illegalBehaviorNum;
    }

    public void setIllegalBehaviorNum(int illegalBehaviorNum) {
        this.illegalBehaviorNum = illegalBehaviorNum;
    }

    public String getIllegalBehaviorType() {
        return illegalBehaviorType;
    }

    public void setIllegalBehaviorType(String illegalBehaviorType) {
        this.illegalBehaviorType = illegalBehaviorType;
    }

    public String getIllegalBehaviorReason() {
        return illegalBehaviorReason;
    }

    public void setIllegalBehaviorReason(String illegalBehaviorReason) {
        this.illegalBehaviorReason = illegalBehaviorReason;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
