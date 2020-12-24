package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

//购货清单
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopDto implements Cloneable, Serializable {
    //收货人编号
    private String shipToDst;
    //收货人姓名
    private String consigneeName;
    //折扣
    private BigDecimal orderDiscount;
    //应收
    private BigDecimal paymentHeaderAmount;
    //数量
    private BigDecimal totalGoodsQty;
    //计算额
    private BigDecimal calculationAmount;
    //小计
    private BigDecimal orderOriginalPrice;
    //销售指数
    private BigDecimal salesIndex;
    //获得积分
    private BigDecimal giftPointGenerated;
    //使用积分
    private BigDecimal giftPointUsed;
    //累计积分
    private BigDecimal giftPointLeft;
    //打印页脚
    private String pc;
    //打印页脚
    private String rn;
    //办理人编号
    private String distributorNumber;
    //办理人姓名
    private String distributorName;
    //配偶名称
    private String distributorSpouseName;
    //服务场所名称
    private String serviceName;
    //发票类型 1:开具销售发票 2:电子发票 3:开具专用发票
    private Integer invoiceType;
    //发票抬头
    private String invoiceTitle;
    //纳税识别号
    private String invoiceTax;
    //是否团单
    private String isGroupOrderFlag;
    //套装信息列表
    private List<String> description;
    //购货清单明细
    private List<ShopDetailDto> shopDetailList;

    public String getShipToDst() {
        return shipToDst;
    }

    public void setShipToDst(String shipToDst) {
        this.shipToDst = shipToDst;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public BigDecimal getPaymentHeaderAmount() {
        return paymentHeaderAmount;
    }

    public void setPaymentHeaderAmount(BigDecimal paymentHeaderAmount) {
        this.paymentHeaderAmount = paymentHeaderAmount;
    }

    public BigDecimal getTotalGoodsQty() {
        return totalGoodsQty;
    }

    public void setTotalGoodsQty(BigDecimal totalGoodsQty) {
        this.totalGoodsQty = totalGoodsQty;
    }

    public BigDecimal getCalculationAmount() {
        return calculationAmount;
    }

    public void setCalculationAmount(BigDecimal calculationAmount) {
        this.calculationAmount = calculationAmount;
    }

    public BigDecimal getOrderOriginalPrice() {
        return orderOriginalPrice;
    }

    public void setOrderOriginalPrice(BigDecimal orderOriginalPrice) {
        this.orderOriginalPrice = orderOriginalPrice;
    }

    public BigDecimal getSalesIndex() {
        return salesIndex;
    }

    public void setSalesIndex(BigDecimal salesIndex) {
        this.salesIndex = salesIndex;
    }

    public BigDecimal getGiftPointGenerated() {
        return giftPointGenerated;
    }

    public void setGiftPointGenerated(BigDecimal giftPointGenerated) {
        this.giftPointGenerated = giftPointGenerated;
    }

    public BigDecimal getGiftPointUsed() {
        return giftPointUsed;
    }

    public void setGiftPointUsed(BigDecimal giftPointUsed) {
        this.giftPointUsed = giftPointUsed;
    }

    public BigDecimal getGiftPointLeft() {
        return giftPointLeft;
    }

    public void setGiftPointLeft(BigDecimal giftPointLeft) {
        this.giftPointLeft = giftPointLeft;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
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

    public String getDistributorSpouseName() {
        return distributorSpouseName;
    }

    public void setDistributorSpouseName(String distributorSpouseName) {
        this.distributorSpouseName = distributorSpouseName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceTax() {
        return invoiceTax;
    }

    public void setInvoiceTax(String invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    public String getIsGroupOrderFlag() {
        return isGroupOrderFlag;
    }

    public void setIsGroupOrderFlag(String isGroupOrderFlag) {
        this.isGroupOrderFlag = isGroupOrderFlag;
    }

    public List<ShopDetailDto> getShopDetailList() {
        return shopDetailList;
    }

    public void setShopDetailList(List<ShopDetailDto> shopDetailList) {
        this.shopDetailList = shopDetailList;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
}
