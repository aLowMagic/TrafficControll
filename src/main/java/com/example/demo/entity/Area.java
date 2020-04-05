package com.example.demo.entity;

public class Area {
    //区域编号
    private String areaNo;
    //区域名称
    private String areaName;
    //拥堵指数
    private int CongestionIndex;
    //事故数
    private int accidentNum;
    //违法数
    private int illegalNum;
    //天气情况
    private String weaher;
    //重点区域数
    private int keyAreaNum;
    //停车场数
    private int parkLotNum;
    //车辆迁入
    private int immigration;
    //车辆迁出
    private int emigration;

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getCongestionIndex() {
        return CongestionIndex;
    }

    public void setCongestionIndex(int congestionIndex) {
        CongestionIndex = congestionIndex;
    }

    public int getAccidentNum() {
        return accidentNum;
    }

    public void setAccidentNum(int accidentNum) {
        this.accidentNum = accidentNum;
    }

    public int getIllegalNum() {
        return illegalNum;
    }

    public void setIllegalNum(int illegalNum) {
        this.illegalNum = illegalNum;
    }

    public String getWeaher() {
        return weaher;
    }

    public void setWeaher(String weaher) {
        this.weaher = weaher;
    }

    public int getKeyAreaNum() {
        return keyAreaNum;
    }

    public void setKeyAreaNum(int keyAreaNum) {
        this.keyAreaNum = keyAreaNum;
    }

    public int getParkLotNum() {
        return parkLotNum;
    }

    public void setParkLotNum(int parkLotNum) {
        this.parkLotNum = parkLotNum;
    }

    public int getImmigration() {
        return immigration;
    }

    public void setImmigration(int immigration) {
        this.immigration = immigration;
    }

    public int getEmigration() {
        return emigration;
    }

    public void setEmigration(int emigration) {
        this.emigration = emigration;
    }
}
