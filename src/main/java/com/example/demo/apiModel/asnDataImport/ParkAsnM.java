package com.example.demo.apiModel.asnDataImport;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "com.jd.poDownStreamWorker.worker.domain.IbReceivingTaskM")
public class ParkAsnM extends AbstractWarehouseInfo implements AsnKey {
    private String inboundNo;
    private String poNo;
    private String distributeNo;
    private String warehouseNo;
    private String inboundType;
    private Integer inboundStatus;
    private Double totalQty;
    private Integer purchaseTransFlag;
    private String supplierNo;
    private String supplierName;
    private Integer eclpSign;
    private String orderAttribute;
    @XmlElement(name = "ibReceivingTaskDList")
    private List<ParkAsnD> parkAsnDList;
    private List<String> ibItemJfsList;
    @XmlElement(name = "poExtInfos")
    private List<ParkAsnExpend> parkAsnExpendList;
    private Boolean needBooking;
    private String orgNo;
    private String orgName;
    private Integer source;
    private String remark;
    private String grade;
    private String sellerId;
    private String ownerNo;
    private String ownerName;
    //ECLP扩展字段
    private String ordermark;

    //1表示修改明细，0或者null为采购单下传
    private Integer modify;

    //订单总价格
    private BigDecimal poTotalPrice;

    public BigDecimal getPoTotalPrice() {
        return poTotalPrice;
    }

    public void setPoTotalPrice(BigDecimal poTotalPrice) {
        this.poTotalPrice = poTotalPrice;
    }
    private boolean backContainerType;//回传方式，按板or按单(分批次预约需求需要)

    private Integer poType;// 1是采购单 2是ASN单

    //对应的出库单
    private String outboundInfo;

    private List<AsnPrint> asnPrintList;
    //到货温度增值服务温控区间
    private String temperature;
    //增值服务节点下传
    private List<ParkAppreciation> ibAppreciationList;
    //收纳存储产品标
    private List<String> productsCode;

    //收纳存储订单 1:是 0:不是
    private Integer isRentalWarehouse;

    //采购单子类型
    private String asnSubType;

    //始发仓
    private String sourceWarehouse;

    /**
     * 新增字段： 采购员 报表展示
     */
    private String buyer;
    private Integer isAppMode;//验收模式：0=APP验收模式，1=非APP验收模式

    public Integer getIsAppMode() {
        return isAppMode;
    }

    public void setIsAppMode(Integer isAppMode) {
        this.isAppMode = isAppMode;
    }

    public Integer getIsRentalWarehouse() {
        return isRentalWarehouse;
    }

    public void setIsRentalWarehouse(Integer isRentalWarehouse) {
        this.isRentalWarehouse = isRentalWarehouse;
    }

    public List<String> getIbItemJfsList() {
        return ibItemJfsList;
    }

    public void setIbItemJfsList(List<String> ibItemJfsList) {
        this.ibItemJfsList = ibItemJfsList;
    }
    public boolean isBackContainerType() {
        return backContainerType;
    }

    public void setBackContainerType(boolean backContainerType) {
        this.backContainerType = backContainerType;
    }

    public Integer getPoType() {
        return poType;
    }

    public void setPoType(Integer poType) {
        this.poType = poType;
    }

    public Integer getModify() {
        return modify;
    }

    public void setModify(Integer modify) {
        this.modify = modify;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getInboundType() {
        return inboundType;
    }

    public void setInboundType(String inboundType) {
        this.inboundType = inboundType;
    }

    public Integer getInboundStatus() {
        return inboundStatus;
    }

    public void setInboundStatus(Integer inboundStatus) {
        this.inboundStatus = inboundStatus;
    }

    public Double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Double totalQty) {
        this.totalQty = totalQty;
    }

    public Integer getPurchaseTransFlag() {
        return purchaseTransFlag;
    }

    public void setPurchaseTransFlag(Integer purchaseTransFlag) {
        this.purchaseTransFlag = purchaseTransFlag;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getEclpSign() {
        return eclpSign;
    }

    public void setEclpSign(Integer eclpSign) {
        this.eclpSign = eclpSign;
    }

    public String getOrderAttribute() {
        return orderAttribute;
    }

    public void setOrderAttribute(String orderAttribute) {
        this.orderAttribute = orderAttribute;
    }

    public List<ParkAsnD> getParkAsnDList() {
        return parkAsnDList;
    }

    public void setParkAsnDList(List<ParkAsnD> parkAsnDList) {
        this.parkAsnDList = parkAsnDList;
    }

    public List<ParkAsnExpend> getParkAsnExpendList() {
        return parkAsnExpendList;
    }

    public void setParkAsnExpendList(List<ParkAsnExpend> parkAsnExpendList) {
        this.parkAsnExpendList = parkAsnExpendList;
    }

    public String getOrdermark() {
        return ordermark;
    }

    public void setOrdermark(String ordermark) {
        this.ordermark = ordermark;
    }

    public String getOutboundInfo() {
        return outboundInfo;
    }

    public void setOutboundInfo(String outboundInfo) {
        this.outboundInfo = outboundInfo;
    }

    @Override
    public String getOrgNo() {
        return orgNo;
    }

    @Override
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String getDistributeNo() {
        return distributeNo;
    }

    @Override
    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    @Override
    public String getWarehouseNo() {
        return warehouseNo;
    }

    @Override
    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public void validate() {
    }

    @Override
    public String getAsnNo() {
        return inboundNo;
    }

    public Boolean getYn() {
        return null;
    }

    public Boolean getNeedBooking() {
        return needBooking;
    }

    public void setNeedBooking(Boolean needBooking) {
        this.needBooking = needBooking;
    }

    public List<AsnPrint> getAsnPrintList() {
        return asnPrintList;
    }

    public void setAsnPrintList(List<AsnPrint> asnPrintList) {
        this.asnPrintList = asnPrintList;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public List<ParkAppreciation> getIbAppreciationList() {
        return ibAppreciationList;
    }

    public void setIbAppreciationList(List<ParkAppreciation> ibAppreciationList) {
        this.ibAppreciationList = ibAppreciationList;
    }

    public List<String> getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(List<String> productsCode) {
        this.productsCode = productsCode;
    }

    public String getAsnSubType() {
        return asnSubType;
    }

    public void setAsnSubType(String asnSubType) {
        this.asnSubType = asnSubType;
    }

    public String getSourceWarehouse() {
        return sourceWarehouse;
    }

    public void setSourceWarehouse(String sourceWarehouse) {
        this.sourceWarehouse = sourceWarehouse;
    }


    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }


}
