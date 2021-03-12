package com.example.demo.apiModel.caseInfo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * 配送单实体
 * User: ChenGuoQing
 * DateTime: 12-6-20 上午9:59
 * Version: 1.0
 */
public class IbTransferDeliveryBill {
    //主键id
    private Integer id;
    //内配配送单号
    private String deliveryBillNo;

    // 货主编号
    private String ownerNo;
    // 机构编号
    private String orgNo;
    //机构名称
     private String orgName;
    // 配送中心编号
    private String distributeNo;
    // 库房编号
    private String warehouseNo;
    // 出库机构编号
    private String fromOrgNo;
    //出库机构名称
    private  String fromOrgName;
    // 出库配送中心
    private String fromDistributeNo;
    // 出库库房编号
    private String fromWarehouseNo;
    //发货时间
    private String deliveryTime;
    //收货时间
    private Date receivingTime;
    //配送单状态
    private Integer optStatus;
    //箱数
    private BigDecimal caseQty;
    //备注
    private String remark;
    //内配类型
    private String transferType;
    //承运商编码
    private String carrierCode;
    //承运单号
    private String carrierBillNo;
    //承运商名称
    private String carrierName;
    //打印次数
    private Integer printTimes;
    //打印日期
    private Date printTime;
    //签收日期
    private Date signTime;
    //创建时间
    private Date createTime;
    //创建人
    private String createUser;
    //最后更新时间
    private Date updateTime;
    //最后更新用户
    private String updateUser;
    //删除标识
    private Integer yn;
    private Integer source;//箱子来源
    public String getCarrierBillNo() {
        return carrierBillNo;
    }

    public void setCarrierBillNo(String carrierBillNo) {
        this.carrierBillNo = carrierBillNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getFromOrgName() {
        return fromOrgName;
    }

    public void setFromOrgName(String fromOrgName) {
        this.fromOrgName = fromOrgName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeliveryBillNo() {
        return deliveryBillNo;
    }

    public void setDeliveryBillNo(String deliveryBillNo) {
        this.deliveryBillNo = deliveryBillNo;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getFromOrgNo() {
        return fromOrgNo;
    }

    public void setFromOrgNo(String fromOrgNo) {
        this.fromOrgNo = fromOrgNo;
    }

    public String getFromWarehouseNo() {
        return fromWarehouseNo;
    }

    public void setFromWarehouseNo(String fromWarehouseNo) {
        this.fromWarehouseNo = fromWarehouseNo;
    }

    public String getFromDistributeNo() {
        return fromDistributeNo;
    }

    public void setFromDistributeNo(String fromDistributeNo) {
        this.fromDistributeNo = fromDistributeNo;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = receivingTime;
    }

    public Integer getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(Integer optStatus) {
        this.optStatus = optStatus;
    }

    public BigDecimal getCaseQty() {
        return caseQty;
    }

    public void setCaseQty(BigDecimal caseQty) {
        this.caseQty = caseQty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Integer getPrintTimes() {
        return printTimes;
    }

    public void setPrintTimes(Integer printTimes) {
        this.printTimes = printTimes;
    }

    public Date getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

   public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}
