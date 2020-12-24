package com.example.demo.apiModel.downLoadShipment;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdOrderDetail {

    protected int id;
    /**
     * 订单号
     */
    protected String orderid;

    protected Double price;
    /**
     * 商品编码
     */
    protected String productId;
    /**
     * 商品名称
     */
    protected String productName;
    /**
     * eclp商品编码
     */
    private String productSku;
    /**
     * 商品数量
     */
    protected BigDecimal quantity;
    /**
     * 序列号类型,0非序列号管理商品,1序列号管理商品,2序列号全流程管理商品
     */
    protected int serialId;
    /**
     * 商品等级
     */
    private String goodsGrade = null;
    /**
     * 是否是vmi类型，需要将自营sku转第三方sku
     */
    private Integer isVMI;
    /**
     * 商品打印名称
     */
    protected String printName;
    /**
     * sku对应的序列号列表
     */
    private List<String> serialNo;
    /**
     * 商品扩展字段名
     */
    private String expandFields;
    /**
     * 商家商品编码
     */
    private String busiGoodsNo;
    /**
     * 商家商品别名
     */
    private String busiGoodsShortName;
    /**
     * 安利转运单条件
     */
    private String condition;
    /**
     * 安利转运单原因
     */
    private String reason;
    /**
     * 所在打印清单第几页
     */
    private Integer pageNum;
    /**
     * 是否为唯一码商品
     */
    private Integer isUniqueCode;
    //是否本次验重
    private String checkUniSnCode;
    /**
     * 推荐耗材ID
     */
    private String consumableId;
    /**
     * 自己添加货主
     */
    private String owner;

    private Map<String,String>  extTagsMap;
    /**
     * 批次信息
     */
    private List<LotDetailDto> batchList;

    /**
     * isConsumable = 0或1或2, 此节点为空；isConsumable = 3，此节点值格式为
     */
    private String consumable;

    /**
     * 配送系数，必须为正整数
     */
    private Integer distributionFactor;

    /**
     * 销售平台商品编码
     */
    private String saleGoodsNo;

    /** eclp商家商品品牌名称 */
    private String brandName;

    /**
     * 货号
     */
    private String freightNumber;

    /**
     * 吊牌价
     */
    private BigDecimal hangTagPrice;

    /**
     * sku备注
     **/
    private String attributesRemark;

    public String getAttributesRemark() {
        return this.attributesRemark;
    }

    public void setAttributesRemark(String attributesRemark) {
        this.attributesRemark = attributesRemark;
    }

    public String getConsumable() {
        return consumable;
    }

    public void setConsumable(String consumable) {
        this.consumable = consumable;
    }

    public Map<String, String> getExtTagsMap() {
        return extTagsMap;
    }

    public void setExtTagsMap(Map<String, String> extTagsMap) {
        this.extTagsMap = extTagsMap;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public List<String> getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(List<String> serialNo) {
        this.serialNo = serialNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
        this.serialId = serialId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(String goodsGrade) {
        this.goodsGrade = goodsGrade;
    }

    public Integer getIsVMI() {
        return isVMI;
    }

    public void setIsVMI(Integer vmi) {
        isVMI = vmi;
    }

    public List<LotDetailDto> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<LotDetailDto> batchList) {
        this.batchList = batchList;
    }

    public String getExpandFields() {
        return expandFields;
    }

    public void setExpandFields(String expandFields) {
        this.expandFields = expandFields;
    }

    public String getBusiGoodsNo() {
        return busiGoodsNo;
    }

    public void setBusiGoodsNo(String busiGoodsNo) {
        this.busiGoodsNo = busiGoodsNo;
    }

    public String getBusiGoodsShortName() {
        return busiGoodsShortName;
    }

    public void setBusiGoodsShortName(String busiGoodsShortName) {
        this.busiGoodsShortName = busiGoodsShortName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public void setBrandName(String brandName)
    {
        this.brandName = brandName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public Integer getIsUniqueCode() {
        return isUniqueCode;
    }

    public void setIsUniqueCode(Integer isUniqueCode) {
        this.isUniqueCode = isUniqueCode;
    }

    public String getConsumableId() {
        return consumableId;
    }

    public void setConsumableId(String consumableId) {
        this.consumableId = consumableId;
    }

    public Integer getDistributionFactor()
    {
        return distributionFactor;
    }

    public void setDistributionFactor(Integer distributionFactor)
    {
        this.distributionFactor = distributionFactor;
    }

    public String getSaleGoodsNo()
    {
        return saleGoodsNo;
    }

    public void setSaleGoodsNo(String saleGoodsNo)
    {
        this.saleGoodsNo = saleGoodsNo;
    }

    public String getFreightNumber()
    {
        return freightNumber;
    }

    public void setFreightNumber(String freightNumber)
    {
        this.freightNumber = freightNumber;
    }

    public BigDecimal getHangTagPrice()
    {
        return hangTagPrice;
    }

    public void setHangTagPrice(BigDecimal hangTagPrice)
    {
        this.hangTagPrice = hangTagPrice;
    }

    public String getCheckUniSnCode() {
        return checkUniSnCode;
    }

    public void setCheckUniSnCode(String checkUniSnCode) {
        this.checkUniSnCode = checkUniSnCode;
    }
}
