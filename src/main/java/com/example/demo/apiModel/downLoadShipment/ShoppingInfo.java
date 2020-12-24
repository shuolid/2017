package com.example.demo.apiModel.downLoadShipment;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShoppingInfo {
    /**
     *购物清单类型
     */
    private String shoppingListType;
    /**
     *订单号
     */
    private String orderNo;
    /**
     *子单号
     */
    private String productionOrderNo;
    /**
     *运费
     */
    private BigDecimal freight;
    /**
     *总价
     */
    private BigDecimal totalPrice;
    /**
     *实付金额
     */
    private BigDecimal actualAmount;
    /**
     *购物时间
     */
    private String shoppingTime;
    /**
     *客户姓名
     */
    private String custName;
    /**
     *商品总数
     */
    private BigDecimal skuCnt;
    /**
     *是否打印
     */
    private boolean isPrint;
    /**
     *
     */
    private  List<Coupons> coupons;
    /**
     *
     */
    private List<Orderdetails> orderdetails;

    private String newShoppingInfo;

    private String cangzhifaInfo;

    public String getCangzhifaInfo() {
        return this.cangzhifaInfo;
    }

    public void setCangzhifaInfo(String cangzhifaInfo) {
        this.cangzhifaInfo = cangzhifaInfo;
    }

    public String getShoppingListType() {
        return shoppingListType;
    }

    public void setShoppingListType(String shoppingListType) {
        this.shoppingListType = shoppingListType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getShoppingTime() {
        return shoppingTime;
    }

    public void setShoppingTime(String shoppingTime) {
        this.shoppingTime = shoppingTime;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public BigDecimal getSkuCnt() {
        return skuCnt;
    }

    public void setSkuCnt(BigDecimal skuCnt) {
        this.skuCnt = skuCnt;
    }
    @JsonProperty(value = "isPrint")
    public boolean isPrint() {
        return isPrint;
    }
    @JsonProperty(value = "isPrint")
    public void setPrint(boolean print) {
        isPrint = print;
    }

    public List<Coupons> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupons> coupons) {
        this.coupons = coupons;
    }

    public List<Orderdetails> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetails> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public String getProductionOrderNo() {
        return productionOrderNo;
    }

    public void setProductionOrderNo(String productionOrderNo) {
        this.productionOrderNo = productionOrderNo;
    }

    public String getNewShoppingInfo() {
        return newShoppingInfo;
    }

    public void setNewShoppingInfo(String newShoppingInfo) {
        this.newShoppingInfo = newShoppingInfo;
    }
}
