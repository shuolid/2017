package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;

//购货清单明细
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopDetailDto implements Cloneable, Serializable {
    //明细编号
    private Long index;
    //商品编号
    private String goodsNo;
    //商品名称
    private String goodsName;
    //商品数量
    private BigDecimal goodsQty;
    //单价
    private BigDecimal price;
    //主产品编号
    private String masterGoodsNo;
    //主产品名称
    private String masterGoodsName;
    //主产品数量
    private BigDecimal masterGoodsQty;
    //主产品价格
    private BigDecimal masterPrice;
    //金额
    private BigDecimal totalPrice;

    private String itemSku;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

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

    public BigDecimal getGoodsQty() {
        return goodsQty;
    }

    public void setGoodsQty(BigDecimal goodsQty) {
        this.goodsQty = goodsQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMasterGoodsNo() {
        return masterGoodsNo;
    }

    public void setMasterGoodsNo(String masterGoodsNo) {
        this.masterGoodsNo = masterGoodsNo;
    }

    public String getMasterGoodsName() {
        return masterGoodsName;
    }

    public void setMasterGoodsName(String masterGoodsName) {
        this.masterGoodsName = masterGoodsName;
    }

    public BigDecimal getMasterGoodsQty() {
        return masterGoodsQty;
    }

    public void setMasterGoodsQty(BigDecimal masterGoodsQty) {
        this.masterGoodsQty = masterGoodsQty;
    }

    public BigDecimal getMasterPrice() {
        return masterPrice;
    }

    public void setMasterPrice(BigDecimal masterPrice) {
        this.masterPrice = masterPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }
}
