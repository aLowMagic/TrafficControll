package com.example.demo.entity;

public class Accident {
    //事故编号
    private  String accId;
    //车辆号码
    private String vehicleNo;
    //发生道路
    private String occurRoad;
    //事故来源
    private String source;
    //事故原因
    private String accReason;
    //事故类型
    private String accType;
    //视频url
    private String videoUrl;
    //事故时间
    private String accTime;
    //责任判定结果
    private String resDetermined;

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getOccurRoad() {
        return occurRoad;
    }

    public void setOccurRoad(String occurRoad) {
        this.occurRoad = occurRoad;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAccReason() {
        return accReason;
    }

    public void setAccReason(String accReason) {
        this.accReason = accReason;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAccTime() {
        return accTime;
    }

    public void setAccTime(String accTime) {
        this.accTime = accTime;
    }

    public String getResDetermined() {
        return resDetermined;
    }

    public void setResDetermined(String resDetermined) {
        this.resDetermined = resDetermined;
    }
}
