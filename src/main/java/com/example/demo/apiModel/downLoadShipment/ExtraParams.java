package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by caozhen1 on 2017/5/2.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraParams {
    private String scheduleBillCode;//派车单号
    private String allocateSequence;//装车顺序
    private String truckSpot;//卡位
    private String requireTransMode;//
    //新通路代配站点 编码
    private String vicePartnerid;
    //新通路代配站点 名称
    private String vicePartnerName;

    //代理地址
    private String vicePartnerAddress;

    public String getVicePartnerAddress() {
        return vicePartnerAddress;
    }

    public void setVicePartnerAddress(String vicePartnerAddress) {
        this.vicePartnerAddress = vicePartnerAddress;
    }

    public String getScheduleBillCode() {
        return scheduleBillCode;
    }

    public void setScheduleBillCode(String scheduleBillCode) {
        this.scheduleBillCode = scheduleBillCode;
    }

    public String getAllocateSequence() {
        return allocateSequence;
    }

    public void setAllocateSequence(String allocateSequence) {
        this.allocateSequence = allocateSequence;
    }

    public String getTruckSpot() {
        return truckSpot;
    }

    public void setTruckSpot(String truckSpot) {
        this.truckSpot = truckSpot;
    }

    public String getRequireTransMode() {
        return requireTransMode;
    }

    public void setRequireTransMode(String requireTransMode) {
        this.requireTransMode = requireTransMode;
    }

    public String getVicePartnerid() {
        return vicePartnerid;
    }

    public void setVicePartnerid(String vicePartnerid) {
        this.vicePartnerid = vicePartnerid;
    }

    public String getVicePartnerName() {
        return vicePartnerName;
    }

    public void setVicePartnerName(String vicePartnerName) {
        this.vicePartnerName = vicePartnerName;
    }
}
