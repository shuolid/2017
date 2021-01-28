package com.example.demo.apiModel.asnDataImport;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AsnM extends AbstractBaseInfo implements AsnBookingKey,BatchCodeKey,Cloneable {
    private Long id; // bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键(自增主键)',
    private String uuid; // varchar(64) NOT NULL COMMENT '防重码(asn号)',
    private String asnNo; // varchar(32) NOT NULL COMMENT 'asn号',
    private String ownerNo; // varchar(20) DEFAULT NULL COMMENT '货主编码',
    private String ownerName; // varchar(128) DEFAULT NULL COMMENT '货主名称',
    private String supplierNo; // varchar(20) NOT NULL COMMENT '供应商编号',
    private String supplierName; // varchar(128) NOT NULL COMMENT '供应商名称',
    private String orgName; // varchar(128) NOT NULL COMMENT '机构名称',
    private Integer purchaseTransFlag; // int(11) DEFAULT NULL COMMENT '是否采配',
    private String poNo; // varchar(32) DEFAULT NULL COMMENT 'PO单号',
    private String purchaseType; // varchar(32) NOT NULL COMMENT '采购类型(一般采购，赠品采配)',
    private AsnType asnType; // varchar(32) NOT NULL COMMENT '入库单类别(一般采购，内配)',
    private AsnStatus asnStatus; // int(11) NOT NULL COMMENT '预约状态(0未预约、1已预约、2已签到)',
    private Double totalQty; // decimal(15,4) DEFAULT NULL COMMENT '总数量',
    private Double totalWeight; // decimal(15,4) DEFAULT NULL COMMENT '总重量',
    private String weightUnit; // varchar(32) DEFAULT NULL COMMENT '重量单位',
    private Double totalVolume; // decimal(18,4) DEFAULT NULL COMMENT '总体积',
    private String remark; // varchar(256) DEFAULT NULL COMMENT '订单备注',
    private String carrierNo; // varchar(32) DEFAULT NULL COMMENT '承运商编码',
    private String carrierName; // varchar(128) DEFAULT NULL COMMENT '承运商名称',
    private String dockNo; // varchar(30) DEFAULT NULL COMMENT '－月台',
    private String bookingNo; // varchar(32) DEFAULT NULL COMMENT '－预约号',
    private Date bookingBeginTime; // datetime DEFAULT NULL COMMENT '预约起始时间',
    private Date bookingEndTime; // datetime DEFAULT NULL COMMENT '预约截止时间',
    private Integer source; // tinyint(1) DEFAULT NULL COMMENT '单据来源(1:erp;5:josl)',
    private Integer eclpSign; // tinyint(1) DEFAULT NULL COMMENT 'eclp采购单类型',
    private Integer labelQty; // int(11) DEFAULT NULL COMMENT '标签数',
    private Integer printFlag; // int(11) NOT NULL DEFAULT '0' COMMENT '打印标识(0未打印 1已打印)',
    private String supplierGradCode; // varchar(20) DEFAULT NULL COMMENT '供应商级别编码',
    private String supplierGradName; // varchar(20) DEFAULT NULL COMMENT '供应商级别名称',
    private String orderAttribute; // varchar(10) DEFAULT NULL COMMENT '关单标识',
    private String grade; // varchar(10) DEFAULT NULL COMMENT 'ECLP 是否按等级验收  1-是  2-否',
    private String isCarton; // varchar(10) DEFAULT NULL COMMENT '是否整箱管理  1-是  0-否',
    private String orderMark;
    private String asnMark; // ASN_MARK
    private String orderNo;//增值服务单号
    private String orderStatus;//增值服务状态1、新建 2、执行中 3、已完成、4、取消
    private boolean appreciationServe;//是否为增值服务
    //订单总价格
    private BigDecimal poTotalPrice;
    private List<AsnD> asnDList;
    private List<AsnExpend> asnExpendList;
    private  Integer transport;//是否带板运输 0否，1是
    private AsnStatus tcBookingStatus;//TC不看asnm的预约看asnr
    private List<String> asnNoList;
    private boolean freshShortSafeFlag;//优先收货标识 1，显示“优”。标识为0，或无标识，则不显示“优”
    private String outboundInfo;//对应的出库单
    private boolean booking;

    private Boolean taotaoAppreciationServe;
    /**
     * 新增字段： 采购员 报表展示
     */
    private String buyer;

    //增值服务节点下传
    private List<ParkAppreciation> ibAppreciationList;

    //到货温度增值服务温控区间
    private String temperature;
    //产品标
    private List<String> productsCode;

    //收纳存储订单 1:是 0:不是
    private Integer isRentalWarehouse;

    private String asnSubType;//采购单子类型
    private String  sourceWarehouse;//始发仓

    public Integer getIsRentalWarehouse() {
        return isRentalWarehouse;
    }

    public void setIsRentalWarehouse(Integer isRentalWarehouse) {
        this.isRentalWarehouse = isRentalWarehouse;
    }
    public List<String> getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(List<String> productsCode) {
        this.productsCode = productsCode;
    }

    public Boolean getTaotaoAppreciationServe() {
        return taotaoAppreciationServe;
    }

    public void setTaotaoAppreciationServe(Boolean taotaoAppreciationServe) {
        this.taotaoAppreciationServe = taotaoAppreciationServe;
    }

    public List<ParkAppreciation> getIbAppreciationList() {
        return ibAppreciationList;
    }

    public void setIbAppreciationList(List<ParkAppreciation> ibAppreciationList) {
        this.ibAppreciationList = ibAppreciationList;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public boolean getBooking() {
        return booking;
    }

    public void setBooking(boolean booking) {
        this.booking = booking;
    }

    public boolean isFreshShortSafeFlag() {
        return freshShortSafeFlag;
    }

    public void setFreshShortSafeFlag(boolean freshShortSafeFlag) {
        this.freshShortSafeFlag = freshShortSafeFlag;
    }

    public List<String> getAsnNoList() {
        return asnNoList;
    }

    public void setAsnNoList(List<String> asnNoList) {
        this.asnNoList = asnNoList;
    }

    public Integer getTransport() {
        return transport;
    }

    public void setTransport(Integer transport) {
        this.transport = transport;
    }

    //园区化二期增加属性
    private String bizNo;//业务单号
    private Date callTime;//叫号时间
    private CallStatus callStatus;//业务单状态
    private Date passCallTime;//过号时间
    private Long bizNoID;//ib_booking_call表的id
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

    @Override
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getPurchaseTransFlag() {
        return purchaseTransFlag;
    }

    public void setPurchaseTransFlag(Integer purchaseTransFlag) {
        this.purchaseTransFlag = purchaseTransFlag;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public AsnType getAsnType() {
        return asnType;
    }

    public void setAsnType(AsnType asnType) {
        this.asnType = asnType;
    }

    public AsnStatus getAsnStatus() {
        return asnStatus;
    }

    public void setAsnStatus(AsnStatus asnStatus) {
        this.asnStatus = asnStatus;
    }

    public Double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Double totalQty) {
        this.totalQty = totalQty;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCarrierNo() {
        return carrierNo;
    }

    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getDockNo() {
        return dockNo;
    }

    public void setDockNo(String dockNo) {
        this.dockNo = dockNo;
    }

    @Override
    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    public Date getBookingBeginTime() {
        return bookingBeginTime;
    }

    public void setBookingBeginTime(Date bookingBeginTime) {
        this.bookingBeginTime = bookingBeginTime;
    }

    public Date getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(Date bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getEclpSign() {
        return eclpSign;
    }

    public void setEclpSign(Integer eclpSign) {
        this.eclpSign = eclpSign;
    }

    public Integer getLabelQty() {
        return labelQty;
    }

    public void setLabelQty(Integer labelQty) {
        this.labelQty = labelQty;
    }

    public Integer getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(Integer printFlag) {
        this.printFlag = printFlag;
    }

    public String getSupplierGradCode() {
        return supplierGradCode;
    }

    public void setSupplierGradCode(String supplierGradCode) {
        this.supplierGradCode = supplierGradCode;
    }

    public String getSupplierGradName() {
        return supplierGradName;
    }

    public void setSupplierGradName(String supplierGradName) {
        this.supplierGradName = supplierGradName;
    }

    public String getOrderAttribute() {
        return orderAttribute;
    }

    public void setOrderAttribute(String orderAttribute) {
        this.orderAttribute = orderAttribute;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIsCarton() {
        return isCarton;
    }

    public void setIsCarton(String isCarton) {
        this.isCarton = isCarton;
    }

    public boolean isNeedBooking() {
        return asnStatus != AsnStatus.NOT_NEED;
    }

    public List<AsnD> getAsnDList() {
        return asnDList;
    }

    public void setAsnDList(List<AsnD> asnDList) {
        this.asnDList = asnDList;
    }

    public List<AsnExpend> getAsnExpendList() {
        return asnExpendList;
    }

    public void setAsnExpendList(List<AsnExpend> asnExpendList) {
        this.asnExpendList = asnExpendList;
    }

    public String getAsnMark() {
        return asnMark;
    }

    public void setAsnMark(String asnMark) {
        this.asnMark = asnMark;
    }

	public String getOrderNo() {
        return orderNo;
    }


    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isAppreciationServe() {
        return appreciationServe;
    }

    public void setAppreciationServe(boolean appreciationServe) {
        this.appreciationServe = appreciationServe;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public CallStatus getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(CallStatus callStatus) {
        this.callStatus = callStatus;
    }

    public Date getPassCallTime() {
        return passCallTime;
    }

    public void setPassCallTime(Date passCallTime) {
        this.passCallTime = passCallTime;
    }

    public Long getBizNoID() {
        return bizNoID;
    }

    public void setBizNoID(Long bizNoID) {
        this.bizNoID = bizNoID;
    }

    public String getOutboundInfo() {
        return outboundInfo;
    }

    public void setOutboundInfo(String outboundInfo) {
        this.outboundInfo = outboundInfo;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    @Override
    public String getBatchCode() {
        return bookingNo;
    }

    @Override
    public String getInboundNo() {
        return asnNo;
    }

    @Override
    public AsnM clone() {
        AsnM o = null;
        try {
            o = (AsnM)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
    public BigDecimal getPoTotalPrice() {
        return poTotalPrice;
    }

    public void setPoTotalPrice(BigDecimal poTotalPrice) {
        this.poTotalPrice = poTotalPrice;
    }

    public AsnStatus getTcBookingStatus() {
        return tcBookingStatus;
    }

    public void setTcBookingStatus(AsnStatus tcBookingStatus) {
        this.tcBookingStatus = tcBookingStatus;
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
