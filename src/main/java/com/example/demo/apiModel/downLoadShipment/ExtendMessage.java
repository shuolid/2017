package com.example.demo.apiModel.downLoadShipment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ExtendMessage
 * 试用品列表信息
 * @author Lu Quan Wei
 * @date 16-3-9 下午1:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtendMessage {
    private TrialProductMessage trialProductMessage;

    /**
     * 售后换新WMS打包提示
     */
    private String questiontype;

    /**
     * 手机三联单提示
     */
    private String cetusAuditorPhone;

    /**
     * 三方站点提示
     */
    private String stationType;
    private SortingMessage sortingMessage;

    /**
     * 会员标示,钻石,金牌....
     */
    private Integer userLevel;

    /**
     * plus标示
     */
    private String plusUserFlag;

    /**
     * 新贺卡信息
     */
    private String cardInfo;

    /**
     * PO单号扩展字段,json串
     */
    private String b2bOrder;

    /**
     * 城配项目，中增加的属性
     */
    private ExtraParams extraParams;

    /**
     * 外单号(一盘货)
     */
    private String sopShipmentId;

    @JsonProperty(value="toplife-giftcards")
    private List<ToplifeBiftcards> toplifeBiftcards;
    @JsonProperty(value="toplife-giftcards-cnt")
    private int toplifeBiftcardsCnt;
    @JsonProperty(value="is_receipt_ad")
    private int isReceiptAd;
    @JsonProperty(value="receipt_ad_key")
    private String receiptAdKey;
    @JsonProperty(value="activity_desc")
    private String activityDesc;
    private String groupNo;
    /**
     * 大客户临期
     **/
    @JsonProperty("VXP_jinpeng_ext")
    private String vxpJinpengExt;

    private String groupName;

    private int dm;

    /**
     * jit类型 0或者空: 用wms的jit初始化订单，1: 用计划出库时间作为jit时间，
     * 当为1时，planDeliveryTime  字段不能为空，如果为空，默认值为 当天 23:59:59
     */
    private String jitType;

    //预约送货时间
    private String bookDeliveryTime;

    //电子发票URL地址
    private String invoiceUrl;
    //门店
    private String storeName;

    //自提订单
    public String PickerName;//提货人
    public String PickerMobile;//提货人电话
    public String PickerID;//提货人身份真证号
    public String AgencyName;//经销商公司主体

    //门店
    private PopInfo popInfo;

    /**
     * KA-WMSJIT和Promis打通需求  promise 添加jit 时间 20180917 add lzw
     */
    private String jitMessage;

    /**
     * 始发配送中心名称
     */
    private String fmDistributeName;

    /**
     * 目的配送中心名称
     */
    private String toDistributeName;

    /**
     *
     */
    private String pickNo;
    /**
     *
     */
    private String grCity;
    /**
     * 商家单号
     */
    private String poNo;

    /**
     * 上架客服电话
     */
    private String afterSalePhone;

    /**
     * 目的配送中心编码 大件打印使用
     */
    private String toDistributeNo;

    /**
     * 时效新增字段---交接单打印使用
     */
    private String timeForTranfer;

    /** 冷链城配需求 同车批次号*/
    private String truckLotNo;

    /** 冷链城配需求 派车单订单总数*/
    private Integer truckingOrderSum;

    public PopInfo getPopInfo() {
        return popInfo;
    }

    public void setPopInfo(PopInfo popInfo) {
        this.popInfo = popInfo;
    }

    /**
     * 7Fresh门店信息
     */
    @JsonProperty("B2B_StorePromiseInfo")
    private String B2B_StorePromiseInfo;

    public String getB2B_StorePromiseInfo() {
        return this.B2B_StorePromiseInfo;
    }

    public void setB2B_StorePromiseInfo(String b2B_StorePromiseInfo) {
        this.B2B_StorePromiseInfo = b2B_StorePromiseInfo;
    }

    /**
     * 代收货款
     */
    private String agentReceivingMoney;
    /**
     * 收货人单位
     */
    private String receiverUnit;
    /**
     * 付款名称
     */
    private String paymentModeName;
    /**
     * 承运商名称
     */
    private String shipperName;

    /**
     * 样式:[{\"tagContent\":\"物业代收\",...}] 此节点只关注tagContent节点(标签备注)
     */
    @JsonProperty(value="OrderPayShipmentInfo")
    private String orderPayShipmentInfos;
    @JsonProperty(value="OrderTraceAbilityAddress")
    private String orderTraceAbilityAddress;
    public String getAgentReceivingMoney() {
        return this.agentReceivingMoney;
    }

    public void setAgentReceivingMoney(String agentReceivingMoney) {
        this.agentReceivingMoney = agentReceivingMoney;
    }

    public String getReceiverUnit() {
        return this.receiverUnit;
    }

    public void setReceiverUnit(String receiverUnit) {
        this.receiverUnit = receiverUnit;
    }

    public String getPaymentModeName() {
        return this.paymentModeName;
    }

    public void setPaymentModeName(String paymentModeName) {
        this.paymentModeName = paymentModeName;
    }

    public String getShipperName() {
        return this.shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getVxpJinpengExt() {
        return vxpJinpengExt;
    }

    public void setVxpJinpengExt(String vxpJinpengExt) {
        this.vxpJinpengExt = vxpJinpengExt;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ExtraParams getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(ExtraParams extraParams) {
        this.extraParams = extraParams;
    }

    public TrialProductMessage getTrialProductMessage() {
        return trialProductMessage;
    }

    public void setTrialProductMessage(TrialProductMessage trialProductMessage) {
        this.trialProductMessage = trialProductMessage;
    }

    public String getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype;
    }

    public String getCetusAuditorPhone() {
        return cetusAuditorPhone;
    }

    public void setCetusAuditorPhone(String cetusAuditorPhone) {
        this.cetusAuditorPhone = cetusAuditorPhone;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public SortingMessage getSortingMessage() {
        return sortingMessage;
    }

    public void setSortingMessage(SortingMessage sortingMessage) {
        this.sortingMessage = sortingMessage;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }
    public String getPlusUserFlag() {
        return plusUserFlag;
    }

    public void setPlusUserFlag(String plusUserFlag) {
        this.plusUserFlag = plusUserFlag;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getB2bOrder() {
        return b2bOrder;
    }

    public void setB2bOrder(String b2bOrder) {
        this.b2bOrder = b2bOrder;
    }

    public String getSopShipmentId() {
        return sopShipmentId;
    }

    public void setSopShipmentId(String sopShipmentId) {
        this.sopShipmentId = sopShipmentId;
    }

    public List<ToplifeBiftcards> getToplifeBiftcards() {
        return toplifeBiftcards;
    }

    public void setToplifeBiftcards(List<ToplifeBiftcards> toplifeBiftcards) {
        this.toplifeBiftcards = toplifeBiftcards;
    }

    public int getToplifeBiftcardsCnt() {
        return toplifeBiftcardsCnt;
    }

    public void setToplifeBiftcardsCnt(int toplifeBiftcardsCnt) {
        this.toplifeBiftcardsCnt = toplifeBiftcardsCnt;
    }

    public String getJitType() {
        return jitType;
    }

    public void setJitType(String jitType) {
        this.jitType = jitType;
    }

    public String getBookDeliveryTime() {
        return bookDeliveryTime;
    }

    public void setBookDeliveryTime(String bookDeliveryTime) {
        this.bookDeliveryTime = bookDeliveryTime;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPickerName() {
        return PickerName;
    }

    public void setPickerName(String pickerName) {
        PickerName = pickerName;
    }

    public String getPickerMobile() {
        return PickerMobile;
    }

    public void setPickerMobile(String pickerMobile) {
        PickerMobile = pickerMobile;
    }

    public String getPickerID() {
        return PickerID;
    }

    public void setPickerID(String pickerID) {
        PickerID = pickerID;
    }

    public String getAgencyName() {
        return AgencyName;
    }

    public void setAgencyName(String agencyName) {
        AgencyName = agencyName;
    }

    public int getIsReceiptAd() {
        return isReceiptAd;
    }

    public void setIsReceiptAd(int isReceiptAd) {
        this.isReceiptAd = isReceiptAd;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getReceiptAdKey() {
        return receiptAdKey;
    }

    public void setReceiptAdKey(String receiptAdKey) {
        this.receiptAdKey = receiptAdKey;
    }

    public String getJitMessage()
    {
        return jitMessage;
    }

    public void setJitMessage(String jitMessage)
    {
        this.jitMessage = jitMessage;
    }

    public String getOrderPayShipmentInfos()
    {
        return orderPayShipmentInfos;
    }

    public void setOrderPayShipmentInfos(String orderPayShipmentInfos)
    {
        this.orderPayShipmentInfos = orderPayShipmentInfos;
    }

    public String getFmDistributeName()
    {
        return fmDistributeName;
    }

    public void setFmDistributeName(String fmDistributeName)
    {
        this.fmDistributeName = fmDistributeName;
    }

    public String getToDistributeName()
    {
        return toDistributeName;
    }

    public void setToDistributeName(String toDistributeName)
    {
        this.toDistributeName = toDistributeName;
    }

    public String getPickNo()
    {
        return pickNo;
    }

    public void setPickNo(String pickNo)
    {
        this.pickNo = pickNo;
    }

    public String getGrCity()
    {
        return grCity;
    }

    public void setGrCity(String grCity)
    {
        this.grCity = grCity;
    }

    public String getPoNo()
    {
        return poNo;
    }

    public void setPoNo(String poNo)
    {
        this.poNo = poNo;
    }

    public String getAfterSalePhone()
    {
        return afterSalePhone;
    }

    public void setAfterSalePhone(String afterSalePhone)
    {
        this.afterSalePhone = afterSalePhone;
    }

    public String getToDistributeNo()
    {
        return toDistributeNo;
    }

    public void setToDistributeNo(String toDistributeNo)
    {
        this.toDistributeNo = toDistributeNo;
    }

    public String getTimeForTranfer()
    {
        return timeForTranfer;
    }

    public void setTimeForTranfer(String timeForTranfer)
    {
        this.timeForTranfer = timeForTranfer;
    }

    public String getTruckLotNo()
    {
        return truckLotNo;
    }

    public void setTruckLotNo(String truckLotNo)
    {
        this.truckLotNo = truckLotNo;
    }

    public Integer getTruckingOrderSum()
    {
        return truckingOrderSum;
    }

    public void setTruckingOrderSum(Integer truckingOrderSum)
    {
        this.truckingOrderSum = truckingOrderSum;
    }

    public String getOrderTraceAbilityAddress() {
        return orderTraceAbilityAddress;
    }

    public void setOrderTraceAbilityAddress(String orderTraceAbilityAddress) {
        this.orderTraceAbilityAddress = orderTraceAbilityAddress;
    }
}
