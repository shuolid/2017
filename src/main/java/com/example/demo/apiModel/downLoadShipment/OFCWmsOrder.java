package com.example.demo.apiModel.downLoadShipment;

import java.util.List;

/**
 * 面单主档信息
 */
public class OFCWmsOrder {
    private String batchInfo;
    private List<OFCWmsDetail> wmsDetailList;
    private String site;
    private String barcode;
    private String totalPrice;
    private String call;
    private String orderId;
    private String printTime;
    private String  receiver;
    private String tel;
    private String deliveryTime;
    private String address;
    private String remark;
    private String batchId;
    private String remarkzp;
    private String customCode;
    private String createTime;
    private String userName;
    private String  title;
    private String totalNum;
    private String image;
    private String sendPay;

    //网易严选新增--start
    /**
     * 滑道口号 -新京配必填
     */
    private String slideWay;

    /**
     * 始发分拣中心 -必填
     */
    private String startDistributeNo;
    /**
     * 始发分拣中心名称--新京配必填
     */
    private String startDistributeName;
    /**
     * 目的分拣中心
     */
    private String targetDistributeNo;
    /**
     * 目的分拣中心名称
     */
    private String targetDistributeName;
    /**
     * 网点类型
     */
    private String netType;
    /**
     * 月结卡号
     */
    private String monthDoneCode;
    /**
     * 始发笼车号
     */
    private String startCageCar;
    /**
     * 目的笼车号
     */
    private String targetCageCar;
    /**
     * 始发滑道口号
     */
    private String startSlideWay;

    /**
     *时效
     */
    private String prescription;
    /**
     * 时效名称
     */
    private String prescriptionName;
    //网易严选新增 end

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getRemarkzp() {
        return remarkzp;
    }

    public void setRemarkzp(String remarkzp) {
        this.remarkzp = remarkzp;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPrintTime() {
        return printTime;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public List<OFCWmsDetail> getWmsDetailList() {
        return wmsDetailList;
    }

    public void setWmsDetailList(List<OFCWmsDetail> wmsDetailList) {
        this.wmsDetailList = wmsDetailList;
    }

    public String getBatchInfo() {
        return batchInfo;
    }

    public void setBatchInfo(String batchInfo) {
        this.batchInfo = batchInfo;
    }

    public String getSendPay() {
        return sendPay;
    }

    public void setSendPay(String sendPay) {
        this.sendPay = sendPay;
    }

    public String getSlideWay()
    {
        return slideWay;
    }

    public void setSlideWay(String slideWay)
    {
        this.slideWay = slideWay;
    }

    public String getStartDistributeNo()
    {
        return startDistributeNo;
    }

    public void setStartDistributeNo(String startDistributeNo)
    {
        this.startDistributeNo = startDistributeNo;
    }

    public String getStartDistributeName()
    {
        return startDistributeName;
    }

    public void setStartDistributeName(String startDistributeName)
    {
        this.startDistributeName = startDistributeName;
    }

    public String getTargetDistributeNo()
    {
        return targetDistributeNo;
    }

    public void setTargetDistributeNo(String targetDistributeNo)
    {
        this.targetDistributeNo = targetDistributeNo;
    }

    public String getTargetDistributeName()
    {
        return targetDistributeName;
    }

    public void setTargetDistributeName(String targetDistributeName)
    {
        this.targetDistributeName = targetDistributeName;
    }

    public String getNetType()
    {
        return netType;
    }

    public void setNetType(String netType)
    {
        this.netType = netType;
    }

    public String getMonthDoneCode()
    {
        return monthDoneCode;
    }

    public void setMonthDoneCode(String monthDoneCode)
    {
        this.monthDoneCode = monthDoneCode;
    }

    public String getStartCageCar()
    {
        return startCageCar;
    }

    public void setStartCageCar(String startCageCar)
    {
        this.startCageCar = startCageCar;
    }

    public String getTargetCageCar()
    {
        return targetCageCar;
    }

    public void setTargetCageCar(String targetCageCar)
    {
        this.targetCageCar = targetCageCar;
    }

    public String getStartSlideWay()
    {
        return startSlideWay;
    }

    public void setStartSlideWay(String startSlideWay)
    {
        this.startSlideWay = startSlideWay;
    }

    public String getPrescription()
    {
        return prescription;
    }

    public void setPrescription(String prescription)
    {
        this.prescription = prescription;
    }

    public String getPrescriptionName()
    {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName)
    {
        this.prescriptionName = prescriptionName;
    }
}
