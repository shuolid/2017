package com.example.demo.apiModel;



@SuppressWarnings("unused")
public enum BizTypeEnum {
    TEST("querySkuAmountByTaskNoAndStatus", "uuid","360BUY.WMS3.WS.CALLCODE.wave","http://merge.wms5.jd.test/pickingplan/services/waveWS"),
    DOWNLOAD_SHIPMENT("downLoadShipment", "uuid","360BUY.WMS3.WS.CALLCODE.wave","http://merge.wms5.jd.test/pickingplan/services/waveWS"),
    ASN_DATA_IMPORT("wms_ib_receScheduling_asnDataImport", "uuid","360BUY.WMS3.WS.CALLCODE.100","http://merge.wms5.jd.test/inbound/services/receScheduling"),
    IMPORT_RECEIVING_TASK("wms_receiving_Itface_importReceivingTask", "uuid","360BUY.WMS3.WS.CALLCODE.100","http://merge.wms5.jd.test/inbound/services/receivingWSSoap"),
    ISSUED_ORDERS("wms_receiving_orderIdIssuedFromDmsService_issuedOrders", "uuid","360BUY.WMS3.WS.CALLCODE.100","http://merge.wms5.jd.test/inbound/services/receivingWSSoap"),
    CASE_INFO("wms_receiving_downLoad_downLoadNewReceivedNoAndCaseInfo", "uuid","360BUY.WMS3.WS.CALLCODE.100","http://merge.wms5.jd.test/inbound/services/receivingWSSoap"),
    TRANS_BILLS("wms_receiving_wmsDownload_downLoadTransBillsFromWms3", "uuid","360BUY.WMS3.WS.CALLCODE.100","http://merge.wms5.jd.test/inbound/services/receScheduling");


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
