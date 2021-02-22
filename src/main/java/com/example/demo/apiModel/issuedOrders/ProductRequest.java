package com.example.demo.apiModel.issuedOrders;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * 退货下传订单商品明细
 * User: guojiyong
 * DateTime: 2012-12-20 上午09:37:53
 * Version: 1.0
 */
public class ProductRequest implements Serializable {

    //商品ID
    private String productId;

    //商品数量
    private Integer productNum;

    //商品名称t
    private String productName;

    //商品单价
    private double productPrice;

    //报损数量
    private int productLoss;

    //批次号
    private String productLotNo;

    //商品等级
    private String goodsStatus;

    private String productLevel;

    private String isUniqueCode;

    private String sellerOutOrderNo;

    // 残品拍照
    private String photo;

    // 单价
    private String unitPrice;

    // 金额
    private String money;

    // 中包装
    private String mediumPackage;

    // 大包装
    private String bigPackage;

    //eclp开放平台销售出库单号
    private String eclpOutOrderNo;

    /**
     * vmi标识，"1"代表vmi商品，其他值（"0"、空串、null等）代表非vmi商品
     */
    private String vmiFlag;

    /**
     * vmi商品emg编码
     */
    private String emgSkuId;
    //是否唯一码
    private String isuniqueCode;
    //是否序列号
    private String serialFlag;


    // **********  以下安踏项目添加 **********

    //退货原因编号
    private String returnReasonNo;
    //退货原因名称
    private String returnReasonName;

    // **********  安踏项目添加 截止 **********
    public String getReturnReasonNo() {
        return returnReasonNo;
    }

    public void setReturnReasonNo(String returnReasonNo) {
        this.returnReasonNo = returnReasonNo;
    }

    public String getReturnReasonName() {
        return returnReasonName;
    }

    public void setReturnReasonName(String returnReasonName) {
        this.returnReasonName = returnReasonName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMediumPackage() {
        return mediumPackage;
    }

    public void setMediumPackage(String mediumPackage) {
        this.mediumPackage = mediumPackage;
    }

    public String getBigPackage() {
        return bigPackage;
    }

    public void setBigPackage(String bigPackage) {
        this.bigPackage = bigPackage;
    }

    public String getEclpOutOrderNo() {
        return eclpOutOrderNo;
    }

    public void setEclpOutOrderNo(String eclpOutOrderNo) {
        this.eclpOutOrderNo = eclpOutOrderNo;
    }

    /*public String getSellerOutOrderNo() {
        return sellerOutOrderNo;
    }

    public void setSellerOutOrderNo(String sellerOutOrderNo) {
        this.sellerOutOrderNo = sellerOutOrderNo;
    }
*/

    public String getProductLotNo() {
        return productLotNo;
    }

    public void setProductLotNo(String productLotNo) {
        this.productLotNo = productLotNo;
    }



    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the productNum
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * @param productNum the productNum to set
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the productLoss
     */
    public int getProductLoss() {
        return productLoss;
    }

    /**
     * @param productLoss the productLoss to set
     */
    public void setProductLoss(int productLoss) {
        this.productLoss = productLoss;
    }

    public String getGoodsStatus() {
        return StringUtils.isBlank(goodsStatus) ? null : goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }

    public String getIsUniqueCode() {
        return isUniqueCode;
    }

    public void setIsUniqueCode(String isUniqueCode) {
        this.isUniqueCode = isUniqueCode;
    }

    public String getSellerOutOrderNo() {
        return sellerOutOrderNo;
    }

    public void setSellerOutOrderNo(String sellerOutOrderNo) {
        this.sellerOutOrderNo = sellerOutOrderNo;
    }

    public String getVmiFlag() {
        return vmiFlag;
    }

    public void setVmiFlag(String vmiFlag) {
        this.vmiFlag = vmiFlag;
    }

    public String getEmgSkuId() {
        return emgSkuId;
    }

    public void setEmgSkuId(String emgSkuId) {
        this.emgSkuId = emgSkuId;
    }
    public String getIsuniqueCode() {
        return isuniqueCode;
    }

    public void setIsuniqueCode(String isuniqueCode) {
        this.isuniqueCode = isuniqueCode;
    }

    public String getSerialFlag() {
        return serialFlag;
    }

    public void setSerialFlag(String serialFlag) {
        this.serialFlag = serialFlag;
    }
}
