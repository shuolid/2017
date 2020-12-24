package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

//安利发票信息
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmwayInvoiceDto implements Cloneable, Serializable {
    //安利子单号
    private String subOutboundNo;
    //发票代码
    private String ordpfx;
    //发票号码
    private String ordnum;
    //发票代码
    private String pckpfx;
    //发票号码
    private String pcknum;
    //购货单位
    private String company;
    //购货单位地址
    private String address;
    //订单折扣金额
    private BigDecimal totalAmount;
    //税务识别号
    private String taxNumber;
    //购货单位地址
    private String invoiceAddress;
    //开户银行名称
    private String bankName;
    //开户银行账号
    private String bankAccount;
    //购货单位电话
    private String phoneNumber;
    //实际分拣仓代码
    private String warehouseId;
    //发票类型 1:增值税普通发票
    private String invoiceType;
    //补开标识 0:正常 2:补开
    private String invoiceBiz;
    //邮寄发票地址
    private String invoiceMailAddress;
    //收件人
    private String invoiceConsignee;
    //邮编
    private String postCode;
    //防重码
    private String uuid;
    //备注
    private String remark;

    private List<AmwayInvoiceDetailDto> detailList;

    public String getSubOutboundNo() {
        return subOutboundNo;
    }

    public void setSubOutboundNo(String subOutboundNo) {
        this.subOutboundNo = subOutboundNo;
    }

    public String getOrdpfx() {
        return ordpfx;
    }

    public void setOrdpfx(String ordpfx) {
        this.ordpfx = ordpfx;
    }

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getPckpfx() {
        return pckpfx;
    }

    public void setPckpfx(String pckpfx) {
        this.pckpfx = pckpfx;
    }

    public String getPcknum() {
        return pcknum;
    }

    public void setPcknum(String pcknum) {
        this.pcknum = pcknum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceBiz() {
        return invoiceBiz;
    }

    public void setInvoiceBiz(String invoiceBiz) {
        this.invoiceBiz = invoiceBiz;
    }

    public String getInvoiceMailAddress() {
        return invoiceMailAddress;
    }

    public void setInvoiceMailAddress(String invoiceMailAddress) {
        this.invoiceMailAddress = invoiceMailAddress;
    }

    public String getInvoiceConsignee() {
        return invoiceConsignee;
    }

    public void setInvoiceConsignee(String invoiceConsignee) {
        this.invoiceConsignee = invoiceConsignee;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AmwayInvoiceDetailDto> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<AmwayInvoiceDetailDto> detailList) {
        this.detailList = detailList;
    }
}
