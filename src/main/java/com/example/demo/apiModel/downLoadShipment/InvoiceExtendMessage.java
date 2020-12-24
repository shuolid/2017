package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceExtendMessage {
    /**
     * 流通监管码
     */
    private String supervisionCode;
    /**
     *开票员
     */
    private String invoiceChecker;
    /**
     *付款方式
     */
    private String paymentType;
    /**
     *销售类型
     */
    private String saleType;
    /**
     *客户执照址址
     */
    private String licenseAddress;
    /**
     *客户执照单位
     */
    private String licenseCompany;
    /**
     *客户执照单位编码
     */
    private String licenseCompanyCode;

    public String getSupervisionCode() {
        return supervisionCode;
    }

    public void setSupervisionCode(String supervisionCode) {
        this.supervisionCode = supervisionCode;
    }

    public String getInvoiceChecker() {
        return invoiceChecker;
    }

    public void setInvoiceChecker(String invoiceChecker) {
        this.invoiceChecker = invoiceChecker;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getLicenseAddress() {
        return licenseAddress;
    }

    public void setLicenseAddress(String licenseAddress) {
        this.licenseAddress = licenseAddress;
    }

    public String getLicenseCompany() {
        return licenseCompany;
    }

    public void setLicenseCompany(String licenseCompany) {
        this.licenseCompany = licenseCompany;
    }

    public String getLicenseCompanyCode() {
        return licenseCompanyCode;
    }

    public void setLicenseCompanyCode(String licenseCompanyCode) {
        this.licenseCompanyCode = licenseCompanyCode;
    }
}
