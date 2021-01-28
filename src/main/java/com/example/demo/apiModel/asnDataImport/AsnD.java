package com.example.demo.apiModel.asnDataImport;

import java.math.BigDecimal;
import java.util.List;

public class AsnD extends AbstractBaseInfo implements AsnKey {
    private Long id;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    private String uuid;// varchar(64) NOT NULL COMMENT '防重码(asn号+inner_id)',
    private String asnNo;// varchar(32) NOT NULL COMMENT 'asn号',
    private String ownerNo;// varchar(20) NOT NULL COMMENT '货主编码',
    private String ownerName;// varchar(128) NOT NULL COMMENT '货主名称',

    private String orgName;// varchar(128) NOT NULL COMMENT '机构名称',
    private String destOrgNo;// varchar(20) DEFAULT NULL COMMENT '目的机构编号',
    private String destOrgName;// varchar(128) DEFAULT NULL COMMENT '目的机构名称',
    private String destDistributeNo;// varchar(20) DEFAULT NULL COMMENT '目的配送中心编码',
    private String destWarehouseNo;// varchar(20) DEFAULT NULL COMMENT '目的库房编号',
    private Integer innerId;// int(11) NOT NULL COMMENT '明细序号',
    private String goodsCode;// varchar(30) NOT NULL COMMENT '商品编码(采配时同一商品的区分方式)',
    private String goodsName;// varchar(300) NOT NULL COMMENT '商品名称',
    private String goodsTypeNo;// varchar(30) DEFAULT NULL COMMENT '商品类别编码(类别编码：大类+中类+小类)',
    private Double expectedQty;// decimal(15,4) NOT NULL COMMENT '采购数量',
    private Integer packingQty;// decimal(15,4) DEFAULT NULL COMMENT '包装数量',
    private String packingUnit;// varchar(20) NOT NULL COMMENT '包装单位',

    private String goodsBarcode;// varchar(64) DEFAULT NULL COMMENT '商品条码',
    private Integer printBarcodeFlag;// int(11) DEFAULT NULL COMMENT '是否打码',
    private Double unitPrice;// decimal(15,4) DEFAULT NULL COMMENT '仓报价',
    private Double totalVolume;// decimal(18,4) DEFAULT NULL COMMENT '+商品总体积',
    private Boolean isPromotion;// int(11) DEFAULT NULL COMMENT '+是否促销品',
    private Boolean isSpecialShaped;// int(11) DEFAULT NULL COMMENT '+是否异形品',
    private Boolean isSmall;// int(11) DEFAULT NULL COMMENT '+是否小件品',
    private Boolean isBig;// int(11) DEFAULT NULL COMMENT '+是否大宗订单商品',
    private Integer priority;// int(11) DEFAULT NULL COMMENT '+收货优先级',
    private String palletizingStandard;// varchar(100) DEFAULT NULL COMMENT '+码盘要求',
    private String palletizingSuggestion;// varchar(100) DEFAULT NULL COMMENT '+码盘建议',
    private String palletizingSugCode;// varchar(64) DEFAULT NULL COMMENT '+码盘建议编码',
    private String destZone;// varchar(32) DEFAULT NULL COMMENT '目标环境区域',
    private Boolean snFlag;// int(11) NOT NULL DEFAULT '0' COMMENT '是否序列号(0否、1是)',
    private Boolean lifeFlag;// int(11) NOT NULL DEFAULT '0' COMMENT '是否保质期(0否、1是)',
    private int lifeType;
    private String barCodeType;// varchar(20) DEFAULT NULL COMMENT '商品条码类别',
    private String productLevel;// varchar(50) NOT NULL DEFAULT '1',
    private String md5Value;// varchar(32) DEFAULT NULL COMMENT 'md5=机构号+配送中心号+库房号+单号+商品编码+商品等级',
    private Double price;// decimal(15,4) DEFAULT NULL COMMENT '定价',
    private String serialListFlag;
    private Integer unitPackage;//包装系数

    // 已验收数量
    private Double receivedQty;

    /**
     * eclp 安利 start
     */
    private String receivingMark;
    private String incomplete;//eclp 缺量 0 不可缺量、 1 可缺量
    private String excess;//eclp 超量 0 不能超量、 1 可超量
    private List<AsnDExt> ibReceivingTaskDExtList;//eclp指定批次判断此节点；非指定批次，无此节点
    private Double exceedQty;

    /**
     * 目的储区的入库逻辑区:未持久化 只能用于计算过程使用
     */
    private String logicZone;

    private Integer sytm;//1，则表明需要进行溯源贴码

    public Integer getSytm() {
        return sytm;
    }

    public void setSytm(Integer sytm) {
        this.sytm = sytm;
    }

    public String getLogicZone() {
        return logicZone;
    }

    public void setLogicZone(String logicZone) {
        this.logicZone = logicZone;
    }


    //sku采购单价
    private BigDecimal goodsUnitPrice;

    //sku采购总价
    private BigDecimal goodsTotalPrice;

    public String getExcess() {
        return excess;
    }

    public void setExcess(String excess) {
        this.excess = excess;
    }

    public Double getExceedQty() {
        return exceedQty;
    }

    public void setExceedQty(Double exceedQty) {
        this.exceedQty = exceedQty;
    }

    public List<AsnDExt> getIbReceivingTaskDExtList() {
        return ibReceivingTaskDExtList;
    }

    public void setIbReceivingTaskDExtList(List<AsnDExt> ibReceivingTaskDExtList) {
        this.ibReceivingTaskDExtList = ibReceivingTaskDExtList;
    }

    public int getLifeType() {
        return lifeType;
    }

    public void setLifeType(int lifeType) {
        this.lifeType = lifeType;
    }

    public String getIncomplete() {

        return incomplete;
    }

    public void setIncomplete(String incomplete) {
        this.incomplete = incomplete;
    }

    public String getReceivingMark() {
        return receivingMark;
    }

    public void setReceivingMark(String receivingMark) {
        this.receivingMark = receivingMark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAsnNo() {
        return asnNo;
    }

    public void setAsnNo(String asnNo) {
        this.asnNo = asnNo;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDestOrgNo() {
        return destOrgNo;
    }

    public void setDestOrgNo(String destOrgNo) {
        this.destOrgNo = destOrgNo;
    }

    public String getDestOrgName() {
        return destOrgName;
    }

    public void setDestOrgName(String destOrgName) {
        this.destOrgName = destOrgName;
    }

    public String getDestDistributeNo() {
        return destDistributeNo;
    }

    public void setDestDistributeNo(String destDistributeNo) {
        this.destDistributeNo = destDistributeNo;
    }

    public String getDestWarehouseNo() {
        return destWarehouseNo;
    }

    public void setDestWarehouseNo(String destWarehouseNo) {
        this.destWarehouseNo = destWarehouseNo;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTypeNo() {
        return goodsTypeNo;
    }

    public void setGoodsTypeNo(String goodsTypeNo) {
        this.goodsTypeNo = goodsTypeNo;
    }

    public Double getExpectedQty() {
        return expectedQty;
    }

    public void setExpectedQty(Double expectedQty) {
        this.expectedQty = expectedQty;
    }

    public Integer getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(Integer packingQty) {
        this.packingQty = packingQty;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    public String getGoodsBarcode() {
        return goodsBarcode;
    }

    public void setGoodsBarcode(String goodsBarcode) {
        this.goodsBarcode = goodsBarcode;
    }

    public Integer getPrintBarcodeFlag() {
        return printBarcodeFlag;
    }

    public void setPrintBarcodeFlag(Integer printBarcodeFlag) {
        this.printBarcodeFlag = printBarcodeFlag;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Boolean getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public Boolean getIsSpecialShaped() {
        return isSpecialShaped;
    }

    public void setIsSpecialShaped(Boolean isSpecialShaped) {
        this.isSpecialShaped = isSpecialShaped;
    }

    public Boolean getIsSmall() {
        return isSmall;
    }

    public void setIsSmall(Boolean isSmall) {
        this.isSmall = isSmall;
    }

    public Boolean getIsBig() {
        return isBig;
    }

    public void setIsBig(Boolean isBig) {
        this.isBig = isBig;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getPalletizingStandard() {
        return palletizingStandard;
    }

    public void setPalletizingStandard(String palletizingStandard) {
        this.palletizingStandard = palletizingStandard;
    }

    public String getPalletizingSuggestion() {
        return palletizingSuggestion;
    }

    public void setPalletizingSuggestion(String palletizingSuggestion) {
        this.palletizingSuggestion = palletizingSuggestion;
    }

    public String getPalletizingSugCode() {
        return palletizingSugCode;
    }

    public void setPalletizingSugCode(String palletizingSugCode) {
        this.palletizingSugCode = palletizingSugCode;
    }

    public String getDestZone() {
        return destZone;
    }

    public void setDestZone(String destZone) {
        this.destZone = destZone;
    }

    public Boolean getSnFlag() {
        return snFlag;
    }

    public void setSnFlag(Boolean snFlag) {
        this.snFlag = snFlag;
    }

    public Boolean getLifeFlag() {
        return lifeFlag;
    }

    public void setLifeFlag(Boolean lifeFlag) {
        this.lifeFlag = lifeFlag;
    }

    public String getBarCodeType() {
        return barCodeType;
    }

    public void setBarCodeType(String barcodeType) {
        this.barCodeType = barcodeType;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }

    public String getMd5Value() {
        return md5Value;
    }

    public void setMd5Value(String md5Value) {
        this.md5Value = md5Value;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSerialListFlag() {
        return serialListFlag;
    }

    public void setSerialListFlag(String serialListFlag) {
        this.serialListFlag = serialListFlag;
    }

    public Integer getUnitPackage() {
        return unitPackage;
    }

    public void setUnitPackage(Integer unitPackage) {
        this.unitPackage = unitPackage;
    }

    public Double getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Double receivedQty) {
        this.receivedQty = receivedQty;
    }

    public BigDecimal getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(BigDecimal goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }
}