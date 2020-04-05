package com.example.demo.entity;

public class Road {
    //道路编号
    private String roadId;
    //道路名称
    private String roadName;
    //行政区域
    private String areaName;
    //道路类型
    private String roadType;
    //拥堵数
    private int congestionNum;

    private String congestionTime;

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }

    public int getCongestionNum() {
        return congestionNum;
    }

    public void setCongestionNum(int congestionNum) {
        this.congestionNum = congestionNum;
    }

    public String getCongestionTime() {
        return congestionTime;
    }

    public void setCongestionTime(String congestionTime) {
        this.congestionTime = congestionTime;
    }
}
