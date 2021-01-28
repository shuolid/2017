package com.example.demo.apiModel.asnDataImport;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "com.jd.poDownStreamWorker.worker.domain.IbReceivingTaskD")
public class ParkAsnD {
    private String destOrgNo;
    private String destWarehouseNo;
    private Integer innerId;
    private String goodsNo;
    private String goodsName;
    private Double expectedQty;
    private Double unitPrice;
    private String destDistributeNo;
    private Double price;
    private String repeatUpc;

    /**
     * 原商品编号  add by wuxin
     */
    private String sourceGoodsNo;

    /**
     * 商品等级
     * 仅用在下发的时候
     */
    //商品质量等级
    private String goodsStatus;

    /**
     * 商品等级
     */
    //商品质量等级
    private String productLevel;

    /**
     * 0:非清单管理 ,1:是清单管理
     */
    private String serialListFlag;
    //條碼類型
    private String barCodeType;
    private String receivingMark;
    //eclp 缺量 0 不可缺量、 1 可缺量
    private String incomplete;
    //eclp 超量 0 不能超量、 1 可超量
    private String excess;
    //eclp超量范围 -1表示无限大各批号超量之和不能超过这个数
    private Double exceedQty;
    //eclp指定批次判断此节点；非指定批次，无此节点
    private List<AsnDExt> ibReceivingTaskDExtList;
    private Integer unitPackage;
    private BigDecimal goodsTotalPrice;
    private BigDecimal goodsUnitPrice;

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }


    public BigDecimal getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(BigDecimal goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    private Integer sytm;//1，则表明需要进行溯源贴码

    public Integer getSytm() {
        return sytm;
    }

    public void setSytm(Integer sytm) {
        this.sytm = sytm;
    }

    public String getBarCodeType() {
        return barCodeType;
    }

    public void setBarCodeType(String barCodeType) {
        this.barCodeType = barCodeType;
    }

    public Double getExceedQty() {
        return exceedQty;
    }

    public void setExceedQty(Double exceedQty) {
        this.exceedQty = exceedQty;
    }

    public String getSourceGoodsNo() {
        return sourceGoodsNo;
    }

    public void setSourceGoodsNo(String sourceGoodsNo) {
        this.sourceGoodsNo = sourceGoodsNo;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }

    public String getSerialListFlag() {
        return serialListFlag;
    }

    public void setSerialListFlag(String serialListFlag) {
        this.serialListFlag = serialListFlag;
    }

    public String getDestOrgNo() {
        return destOrgNo;
    }

    public void setDestOrgNo(String destOrgNo) {
        this.destOrgNo = destOrgNo;
    }

    public String getDestWarehouseNo() {
        return destWarehouseNo;
    }

    public void setDestWarehouseNo(String destWarehouseNo) {
        this.destWarehouseNo = destWarehouseNo;
    }

    public String getReceivingMark() {
        return receivingMark;
    }

    public void setReceivingMark(String receivingMark) {
        this.receivingMark = receivingMark;
    }

    public String getIncomplete() {
        return incomplete;
    }

    public void setIncomplete(String incomplete) {
        this.incomplete = incomplete;
    }

    public String getExcess() {
        return excess;
    }

    public void setExcess(String excess) {
        this.excess = excess;
    }

    public List<AsnDExt> getIbReceivingTaskDExtList() {
        return ibReceivingTaskDExtList;
    }

    public void setIbReceivingTaskDExtList(List<AsnDExt> ibReceivingTaskDExtList) {
        this.ibReceivingTaskDExtList = ibReceivingTaskDExtList;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
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

    public Double getExpectedQty() {
        return expectedQty;
    }

    public void setExpectedQty(Double expectedQty) {
        this.expectedQty = expectedQty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDestDistributeNo() {
        return destDistributeNo;
    }

    public void setDestDistributeNo(String destDistributeNo) {
        this.destDistributeNo = destDistributeNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRepeatUpc() {
        return repeatUpc;
    }

    public void setRepeatUpc(String repeatUpc) {
        this.repeatUpc = repeatUpc;
    }

    public Integer getUnitPackage() {
        return unitPackage;
    }

    public void setUnitPackage(Integer unitPackage) {
        this.unitPackage = unitPackage;
    }
}
