package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Orderdetails {
    /**
     *商品编号
     */
    private String goodsNo;
    /**
     *商品名称
     */
    private String goodsName;
    /**
     *原单价
     */
    private BigDecimal originPrice;
    /**
     *折扣后单价
     */
    private BigDecimal discountPrice;
    /**
     *数量
     */
    private BigDecimal qty;
    /**
     *折扣后总价
     */
    private BigDecimal discountTotalAmount;

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(BigDecimal originPrice) {
        this.originPrice = originPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getDiscountTotalAmount() {
        return discountTotalAmount;
    }

    public void setDiscountTotalAmount(BigDecimal discountTotalAmount) {
        this.discountTotalAmount = discountTotalAmount;
    }
}
