package com.example.demo.entity;

public class KeyArea {
    //重点区域编号
    private String keyAreaId;
    //重点区域名称
    private String keyAreaName;
    //重点区域类型
    private String keyAreaType;
    //重点区域地址
    private String keyAreaAdress;
    //人流量
    private String flowRate;
    //车流量
    private String vehicleRate;
    //可用停车位
    private String avaParklot;
    //拥堵指数
    private String congestion_index;
    //疏导方案
    private String trafficControl;

    public String getKeyAreaId() {
        return keyAreaId;
    }

    public void setKeyAreaId(String keyAreaId) {
        this.keyAreaId = keyAreaId;
    }

    public String getKeyAreaName() {
        return keyAreaName;
    }

    public void setKeyAreaName(String keyAreaName) {
        this.keyAreaName = keyAreaName;
    }

    public String getKeyAreaType() {
        return keyAreaType;
    }

    public void setKeyAreaType(String keyAreaType) {
        this.keyAreaType = keyAreaType;
    }

    public String getKeyAreaAdress() {
        return keyAreaAdress;
    }

    public void setKeyAreaAdress(String keyAreaAdress) {
        this.keyAreaAdress = keyAreaAdress;
    }

    public String getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(String  flowRate) {
        this.flowRate = flowRate;
    }

    public String getVehicleRate() {
        return vehicleRate;
    }

    public void setVehicleRate(String vehicleRate) {
        this.vehicleRate = vehicleRate;
    }

    public String getAvaParklot() {
        return avaParklot;
    }

    public void setAvaParklot(String avaParklot) {
        this.avaParklot = avaParklot;
    }

    public String getCongestion_index() {
        return congestion_index;
    }

    public void setCongestion_index(String congestion_index) {
        this.congestion_index = congestion_index;
    }

    public String getTrafficControl() {
        return trafficControl;
    }

    public void setTrafficControl(String trafficControl) {
        this.trafficControl = trafficControl;
    }
}
