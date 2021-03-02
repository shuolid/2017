package com.example.demo.apiModel.receivedOwnerShipment;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Provider_ReturnsOrder")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReturnsOrder {
    @XmlElement(name="ProfitLossId")
    private String profitLossId;

    @XmlElement(name="ID")
    private String id;

    @XmlElement(name="ProviderCode")
    private String providerCode;

    @XmlElement(name="ProviderName")
    private String providerName;

    @XmlElement(name="ReturnCompanyID")
    private String returnCompanyID;

    @XmlElement(name="OperatorName")
    private String operatorName;

    @XmlElement(name="Picker")
    private String picker;

    @XmlElement(name="PickerCell")
    private String pickerCell;

    @XmlElement(name="TransportType")
    private String transportType;

    @XmlElement(name="IsScraped")
    private String isScraped;

    @XmlElement(name="BanlanceType")
    private String banlanceType;

    @XmlElement(name="ReturnsMoney")
    private String returnsMoney;

    @XmlElement(name="Carriage")
    private String carriage;

    @XmlElement(name="TotalProductNum")
    private String totalProductNum;

    @XmlElement(name="PickSpot")
    private String pickSpot;

    @XmlElement(name="Receiver")
    private String receiver;

    @XmlElement(name="ReceiverCell")
    private String receiverCell;

    @XmlElement(name="ReceiveCompanyID")
    private String receiveCompanyID;

    @XmlElement(name="IsLocalReturn")
    private String isLocalReturn;

    @XmlElement(name="ReturnStockNo")
    private String returnStockNo;

    @XmlElement(name="ReturnOrgNo")
    private String returnOrgNo;

    @XmlElement(name="ReceiveStockNo")
    private String receiveStockNo;

    @XmlElement(name="ReceiveOrgNo")
    private String receiveOrgNo;

    @XmlElement(name="SelfSource")
    private String selfSource;

    @XmlElement(name="ReceiveAddress")
    private String receiveAddress;

    @XmlElement(name="InboundNo")
    private String inboundNo;

    @XmlElement(name="ReturnsOrderType")
    private String returnsOrderType;

    @XmlElement(name="Returnstype")
    private String returnstype;

    @XmlElementWrapper(name="ProductList")
    @XmlElement(name="Provider_ReturnsOrder_Details")
    private List<RetrunProduct> retrunProductList;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class RetrunProduct{
        @XmlElement(name="ProductID")
        private String productID;

        @XmlElement(name="ProductName")
        private String productName;

        @XmlElement(name="ReturnsNum")
        private String returnsNum;

        @XmlElement(name="ReturnsPrice")
        private String returnsPrice;

        @XmlElement(name="Discount")
        private String discount;

        @XmlElement(name="PublicPrice")
        private String publicPrice;

        @XmlElement(name="SpecNo")
        private String specNo;

    }
}
