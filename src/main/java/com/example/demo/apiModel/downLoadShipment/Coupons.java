package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coupons {
    /**
     *优惠类型
     */
    private int couponType;
    /**
     *优惠类型名称
     */
    private String couponName;
    /**
     *优惠件数
     */
    private BigDecimal couponCnt;
    /**
     *优惠金额
     */
    private BigDecimal couponPrice;

    public int getCouponType() {
        return couponType;
    }

    public void setCouponType(int couponType) {
        this.couponType = couponType;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public BigDecimal getCouponCnt() {
        return couponCnt;
    }

    public void setCouponCnt(BigDecimal couponCnt) {
        this.couponCnt = couponCnt;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }
}
