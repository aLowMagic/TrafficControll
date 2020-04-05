package com.example.demo.entity;

public class Vehicle {
    //车辆号码
    private  String driverNo;
    //车辆类型
    private String type;
    //核定乘客
    private String contain;
    //检验有效截止日期
    private String inspectionDeadline;
    //车辆所有人
    private String owner;
    //车辆违法数
    private String numberOfIllegal;
    //车辆事故数
    private String numberOfAccident;
    //是否为黑名单车辆
    private String isBlackList;
    //车辆违法行为记录
    private String illegalRecord;

    public String getDriverNo() {
        return driverNo;
    }

    public void setDriverNo(String driverNo) {
        this.driverNo = driverNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getInspectionDeadline() {
        return inspectionDeadline;
    }

    public void setInspectionDeadline(String inspectionDeadline) {
        this.inspectionDeadline = inspectionDeadline;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumberOfIllegal() {
        return numberOfIllegal;
    }

    public void setNumberOfIllegal(String numberOfIllegal) {
        this.numberOfIllegal = numberOfIllegal;
    }

    public String getNumberOfAccident() {
        return numberOfAccident;
    }

    public void setNumberOfAccident(String numberOfAccident) {
        this.numberOfAccident = numberOfAccident;
    }

    public String getIsBlackList() {
        return isBlackList;
    }

    public void setIsBlackList(String isBlackList) {
        this.isBlackList = isBlackList;
    }

    public String getIllegalRecord() {
        return illegalRecord;
    }

    public void setIllegalRecord(String illegalRecord) {
        this.illegalRecord = illegalRecord;
    }
}
