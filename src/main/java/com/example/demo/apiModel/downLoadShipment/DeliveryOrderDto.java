package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

//出货清单
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryOrderDto implements Cloneable, Serializable {
    //订单日期
    private String saleDate;
    //收货人姓名
    private String consigneeName;
    //联系电话
    private String consigneeMobile;
    //固话
    private String consigneeLandNo;
    //送货地址
    private String shipToAddress;
    //送货时间
    private String expectedDeliveryPeriod;
    //办理人编号
    private String distributorNumber;
    //办理人
    private String distributorName;
    //联系电话(手机+固话)
    private String contactNumber;
    //订单数
    private BigDecimal orderNum;
    //出货清单明细
    private List<DeliveryOrderDetailDto> detailList;

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeLandNo() {
        return consigneeLandNo;
    }

    public void setConsigneeLandNo(String consigneeLandNo) {
        this.consigneeLandNo = consigneeLandNo;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getExpectedDeliveryPeriod() {
        return expectedDeliveryPeriod;
    }

    public void setExpectedDeliveryPeriod(String expectedDeliveryPeriod) {
        this.expectedDeliveryPeriod = expectedDeliveryPeriod;
    }

    public String getDistributorNumber() {
        return distributorNumber;
    }

    public void setDistributorNumber(String distributorNumber) {
        this.distributorNumber = distributorNumber;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public BigDecimal getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(BigDecimal orderNum) {
        this.orderNum = orderNum;
    }

    public List<DeliveryOrderDetailDto> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DeliveryOrderDetailDto> detailList) {
        this.detailList = detailList;
    }
}
