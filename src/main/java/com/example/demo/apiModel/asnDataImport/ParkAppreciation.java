package com.example.demo.apiModel.asnDataImport;

/**
 * Demo class
 *
 * @author liuyicen1
 * @date 2019/3/19
 */
public class ParkAppreciation {

    //商品编码
    private String goodsNo;
    //商品名称
    private String goodsName;
    //增值服务项id
    private String appreciationCode;
    //增值服务项名称
    private String appreciationName;
    //增值服务项说明
    private String appreciationRemark;
    //增值服务项要求
    private String appreciationClaim;
    //增值服务项数量
    private Double appreciationQty;

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

    public String getAppreciationCode() {
        return appreciationCode;
    }

    public void setAppreciationCode(String appreciationCode) {
        this.appreciationCode = appreciationCode;
    }

    public String getAppreciationName() {
        return appreciationName;
    }

    public void setAppreciationName(String appreciationName) {
        this.appreciationName = appreciationName;
    }

    public String getAppreciationRemark() {
        return appreciationRemark;
    }

    public void setAppreciationRemark(String appreciationRemark) {
        this.appreciationRemark = appreciationRemark;
    }

    public String getAppreciationClaim() {
        return appreciationClaim;
    }

    public void setAppreciationClaim(String appreciationClaim) {
        this.appreciationClaim = appreciationClaim;
    }

    public Double getAppreciationQty() {
        return appreciationQty;
    }

    public void setAppreciationQty(Double appreciationQty) {
        this.appreciationQty = appreciationQty;
    }
}
