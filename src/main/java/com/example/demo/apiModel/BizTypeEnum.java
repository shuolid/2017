package com.example.demo.apiModel;



@SuppressWarnings("unused")
public enum BizTypeEnum {
    TEST("querySkuAmountByTaskNoAndStatus", "uuid","360BUY.WMS3.WS.CALLCODE.wave","http://merge.wms5.jd.test/pickingplan/services/waveWS"),
    DOWNLOAD_SHIPMENT("downLoadShipment", "uuid","360BUY.WMS3.WS.CALLCODE.wave","http://merge.wms5.jd.test/pickingplan/services/waveWS");


    private String bizType;
    private String uuid;
    private String callCode;
    private String url;

    BizTypeEnum(String bizType, String uuid,String callCode, String url) {
        this.bizType = bizType;
        this.uuid = uuid;
        this.callCode = callCode;
        this.url = url;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCallCode() {
        return callCode;
    }

    public void setCallCode(String callCode) {
        this.callCode = callCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
