package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 金鹏项目 --- 履约单相关信息
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OtherExtendMessage {

    /**
     *履约单号 --- 仅限自营
     */
    private String manufactureOrderNo;

    /*
     * 1.只采集包裹明细；
     * 2.采集包裹明细和耗材；
     * 3.只采集耗材
     */
    private int collectType;

    /**
     * 单据来源:  0:ofc,1:履约系统
     */
    private int orderSource;

    /**
     * 是否打印装箱明细
     */
    @JsonProperty("isPrintBoxDetail")
    private boolean isPrintBoxDetail;

    public String getManufactureOrderNo() {
        return manufactureOrderNo;
    }

    public void setManufactureOrderNo(String manufactureOrderNo) {
        this.manufactureOrderNo = manufactureOrderNo;
    }

    public int getCollectType() {
        return collectType;
    }

    public void setCollectType(int collectType) {
        this.collectType = collectType;
    }

    public int getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(int orderSource) {
        this.orderSource = orderSource;
    }

    @JsonIgnore
    public boolean getPrintBoxDetail() {
        return isPrintBoxDetail;
    }

    public void setPrintBoxDetail(boolean printBoxDetail) {
        isPrintBoxDetail = printBoxDetail;
    }
}
