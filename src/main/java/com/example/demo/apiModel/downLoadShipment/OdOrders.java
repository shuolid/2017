package com.example.demo.apiModel.downLoadShipment;



import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdOrders {
    /**
     * 收货地址
     */
    private String address;
    /**
     * 配送中心
     */
    private int cky2;
    private Calendar createDate;
    /**
     * 下单时间
     */
    private Calendar createTime;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 送货方式
     */
    private int di;
    private String email;

    /**
     * 货到付款类型的实收价格
     */
    private BigDecimal factPrice;

    /**
     * eclp订单打印需求：实付价格
     */
    private BigDecimal discountPrice;
    private int id;
    private int isJdShip;
    private String jsonStr;
    private int jyn;
    private String locNo;
    /**
     * 客户编码
     */
    private String memberId;
    /**
     * 客户电话
     */
    private String mobile;
    private List<OdInvoices> odInvoicesList;
    private List<OdOrderDetail> odOrderDetailList;
    private OdPrintInfo odPrintInfo;
    private ShoppingInfo shoppingInfo;
    /**
     * 订单号
     */
    private String orderid;
    /**
     * 站点编码
     */
    private String partnerid;
    /**
     * 支付方式
     */
    private int payment;
    private String payremk;
    private Calendar paysureDate;
    /**
     * 客户电话
     */
    private String phone;
    private int printInfoFlag;
    private int printflag;
    private int printx;
    /**
     * 备注，只取100位
     */
    private String remark;
    /**
     * 业务标识
     */
    private String sendpay;
    /**
     *
     */
    private int sheetType;
    /**
     * 预计出库时间
     */
    private String sndDate;

    /**
     * 计划送到时间 b2b
     */
    private String sndTime;
    private int state;
    private int state2;
    private int status;
    /**
     * 库房号
     */
    private int storeid;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    private int ucity;
    private int ucounty;
    private Calendar updateDate;
    private int uprovince;
    private String version;
    private BigDecimal volume;
    private BigDecimal weight;
    private int yn;
    private BigDecimal youhui;
    private BigDecimal yun;
    /**
     * 客户邮编 只取20位
     */
    private String zip;
    private int ziti;
    private String orderMark;
    /**
     * 订单来源 1自营 6eclp
     */
    private Integer source;

    /**
     * 大头笔
     */
    private String paintMarker;

    /**
     * 是否是vmi类型，需要将自营sku转第三方sku
     */
    private int isVMI;

    /**
     * 三方运单信息eclp
     */
    private String thirdDistributionInfo;

    /**
     * 自营，试用品项目扩展字段
     */
    private ExtendMessage extendMessage;
    private InvoiceExtendMessage invoiceExtendMessage;

    /**
     * 扩展节点
     */
    private Map<String,Object> extendInfo;

    /**
     * 站点名称
     */
    private String siteName;

    /**
     * B计划标识 1:B2B 2:B2C
     */
    private int systemType;

    /**
     * 路区
     */
    private String road;

    /**
     * 计划出库时间
     */
    private String planDeliveryTime;

    /**
     * 门店编号
     */
    private String storeNumber;

    /**
     * 路线编号
     */
    private String routeId;

    /**
     * 目的城市名称
     */
    private String destinationCityName;

    /**
     * 目的城市编号
     */
    private String destinationCityId;

    /**
     * 运单号来源，0不从运单池获取，1从eclp获取，2从青龙（alpha）获取
     */
    private Integer shipNoSource;

    /**
     * 销售平台来源
     */
    private String shopOrderSource;

    /**
     * Json 扩展 乔洪佥 定义的, add by being
     */
    private HashMap<String,String> extrajson;

    /**
     * 承运商编码 第三方 (快递公司)
     */
    private String carrierNo;

    /**
     * 青龙运单号
     */
    private String qlShipNo;

    /**
     * 货主编码
     */
    private String ownerNo;

    /**
     * 货主名称
     */
    private String ownerName;

    /**
     * 货主类型
     */
    private String ownerType;

    /**
     * 货主类型名称
     */
    private String ownerTypeName;

    /**
     * 退货收货人姓名
     */
    private String returnConsigneeName;

    /**
     * 退货收货人地址
     */
    private String returnConsigneeAddress;

    /**
     * 退货收货人电话
     */
    private String returnConsigneePhone;

    /**
     * 网站真正的订单号(sp_so_no)
     */
    private String orderNo;

    /**
     * 销售平台号(isv_so_no)
     */
    private String channelsOutboundNo;

    /**
     * 省
     */
    private String addressProvince;

    /**
     * 市
     */
    private String addressCounty;

    /**
     * 送达城市
     */
    private String addressCity;

    /**
     * 打包使用，客户编码
     */
    private String clientNo;

    /**
     * 打包使用,客户姓名
     */
    private String clientName;

    /**
     * 二段码名称
     */
    private String twoSegmentName;

    /**
     * 三段码名称
     */
    private String threeSegmentName;

    /**
     * 集包地名称
     */
    private String assemblePackageName;

    /**
     * 购货清单列表
     */
    private List<ShopDto> shopList;

    /**
     * 安利发票列表
     */
    private List<AmwayInvoiceDto> amwayInvoicesList;

    /**
     * 生产批次ID
     */
    private String orderBatchNo;

    /**
     * 订单数量
     */
    private BigDecimal orderBatchQty;

    /**
     * 出货清单存储jfs地址
     */
    private String deliveryOrder;

    private List<ObMujiShoppingListM> muJiShopOrder;

    /**
     * 月结编码
     */
    private String monthDoneCode;

    /**
     * 母单号：随订单下传的运单号
     */
    private String parentNumber;

    /**
     * 网点编号
     */
    private String branchCode;

    /**
     * 品名
     */
    private String productName;

    /**
     * 商家单号
     */
    private String busiOutboundNo;

    /**
     * 发货仓
     */
    private String fromWarehouseCode;

    /**
     * 到货仓
     */
    private String toWarehouseCode;

    /**
     * 出货清单列表
     */
    private List<DeliveryOrderDto> obDeliveryOrder;

    /**
     * 订单报文中，唯品会订单所需要的包裹标签内容
     */
    private String expandJson;

    /**
     * 商家下单时间
     */
    private String shopOrderCreateTime;

    /**
     * 奔驰项目：接收方名称
     */
    private String receiveMerchant;

    private String spSoNo;

    /**
     * 订单优先级
     */
    private int orderPriority ;

    /**
     * 1：京配转三方 2：自采三方  3：纯自采三方 4：自提 5：京配
     */
    private Integer carrierTypeNew;

    /**
     * 订单修改版本号
     */
    private String requestionId;

    /**
     * 金鹏项目 --- 履约单相关信息
     */
    private OtherExtendMessage otherExtendMessage;
    /**
     * 装车顺序号
     */
    private Integer allocateSequence;

   /////////////派车单信息/////////////
    /**
     * 派车单号
     */
    private String scheduleBillCode;

    private String orderId;

    private Integer storeId;

    private Integer dcid;

    /**
     * 耗材指定类型节点 0,1,2,3
     **/
    private Integer isConsumable;

    private String consumable;

    /** eclp的入库仓（目的仓）编码 --调拨出库单 */
    private String eclpInWareHouseNo;

    /** eclp的入库仓（目的仓）名称 --调拨出库单 */
    private String eclpInWareHouseName;
    /**
     * 无印良品下发的客户编码
     */
    private String customerNo;

    public String getSpSoNo() {
        return spSoNo;
    }

    public void setSpSoNo(String spSoNo) {
        this.spSoNo = spSoNo;
    }

    public Integer getIsConsumable()
    {
        return isConsumable;
    }

    public void setIsConsumable(Integer isConsumable)
    {
        this.isConsumable = isConsumable;
    }

    public String getConsumable()
    {
        return consumable;
    }

    public void setConsumable(String consumable)
    {
        this.consumable = consumable;
    }

    public String getOrderBatchNo() {
        return orderBatchNo;
    }

    public void setOrderBatchNo(String orderBatchNo) {
        this.orderBatchNo = orderBatchNo;
    }

    public BigDecimal getOrderBatchQty() {
        return orderBatchQty;
    }

    public void setOrderBatchQty(BigDecimal orderBatchQty) {
        this.orderBatchQty = orderBatchQty;
    }

    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getChannelsOutboundNo() {
        return channelsOutboundNo;
    }

    public void setChannelsOutboundNo(String channelsOutboundNo) {
        this.channelsOutboundNo = channelsOutboundNo;
    }

    public String getReturnConsigneeName() {
        return returnConsigneeName;
    }
    public void setReturnConsigneeName(String returnConsigneeName) {
        this.returnConsigneeName = returnConsigneeName;
    }
    public String getReturnConsigneeAddress() {
        return returnConsigneeAddress;
    }
    public void setReturnConsigneeAddress(String returnConsigneeAddress) {
        this.returnConsigneeAddress = returnConsigneeAddress;
    }
    public String getReturnConsigneePhone() {
        return returnConsigneePhone;
    }
    public void setReturnConsigneePhone(String returnConsigneePhone) {
        this.returnConsigneePhone = returnConsigneePhone;
    }
    public String getOwnerNo() {
        return (ownerNo==null?"1":ownerNo);
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
    public String getCarrierNo() {
        return carrierNo;
    }
    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }
    public String getQlShipNo() {
        return qlShipNo;
    }
    public void setQlShipNo(String qlShipNo) {
        this.qlShipNo = qlShipNo;
    }
    public HashMap<String, String> getExtrajson() {
        return extrajson==null?new HashMap<String,String>():extrajson;
    }
    public void setExtrajson(HashMap<String, String> extrajson) {
        this.extrajson = extrajson;
    }

    public Integer getSource() {
        //默认是京东
        return source==null?1:source;
    }
    public void setSource(Integer source) {
        this.source = source;
    }

    public String getShopOrderSource() {
        return shopOrderSource;
    }

    public void setShopOrderSource(String shopOrderSource) {
        this.shopOrderSource = shopOrderSource;
    }

    public String getOrderMark() {
        return orderMark;
    }
    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCky2() {
        return cky2;
    }
    public void setCky2(int cky2) {
        this.cky2 = cky2;
    }
    public Calendar getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }
    public Calendar getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getDi() {
        return di;
    }
    public void setDi(int di) {
        this.di = di;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BigDecimal getFactPrice() {
        return factPrice;
    }
    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIsJdShip() {
        return isJdShip;
    }
    public void setIsJdShip(int isJdShip) {
        this.isJdShip = isJdShip;
    }
    public String getJsonStr() {
        return jsonStr;
    }
    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }
    public int getJyn() {
        return jyn;
    }
    public void setJyn(int jyn) {
        this.jyn = jyn;
    }
    public String getLocNo() {
        return locNo;
    }
    public void setLocNo(String locNo) {
        this.locNo = locNo;
    }
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public List<OdInvoices> getOdInvoicesList() {
        return odInvoicesList;
    }
    public void setOdInvoicesList(List<OdInvoices> odInvoicesList) {
        this.odInvoicesList = odInvoicesList;
    }
    public List<OdOrderDetail> getOdOrderDetailList() {
        return odOrderDetailList;
    }
    public void setOdOrderDetailList(List<OdOrderDetail> odOrderDetailList) {
        this.odOrderDetailList = odOrderDetailList;
    }
    public OdPrintInfo getOdPrintInfo() {
        return odPrintInfo;
    }
    public void setOdPrintInfo(OdPrintInfo odPrintInfo) {
        this.odPrintInfo = odPrintInfo;
    }
    public String getOrderid() {
        return orderid;
    }
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    public String getPartnerid() {
        return partnerid;
    }
    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }
    public int getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }
    public String getPayremk() {
        return payremk;
    }
    public void setPayremk(String payremk) {
        this.payremk = payremk;
    }
    public Calendar getPaysureDate() {
        return paysureDate;
    }
    public void setPaysureDate(Calendar paysureDate) {
        this.paysureDate = paysureDate;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getPrintInfoFlag() {
        return printInfoFlag;
    }
    public void setPrintInfoFlag(int printInfoFlag) {
        this.printInfoFlag = printInfoFlag;
    }
    public int getPrintflag() {
        return printflag;
    }
    public void setPrintflag(int printflag) {
        this.printflag = printflag;
    }
    public int getPrintx() {
        return printx;
    }
    public void setPrintx(int printx) {
        this.printx = printx;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getSendpay() {
        return sendpay;
    }
    public void setSendpay(String sendpay) {
        this.sendpay = sendpay;
    }
    public int getSheetType() {
        return sheetType;
    }
    public void setSheetType(int sheetType) {
        this.sheetType = sheetType;
    }
    public String getSndDate() {
        return sndDate;
    }
    public void setSndDate(String sndDate) {
        this.sndDate = sndDate;
    }
    public String getSndTime() {
        return sndTime;
    }
    public void setSndTime(String sndTime) {
        this.sndTime = sndTime;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public int getState2() {
        return state2;
    }
    public void setState2(int state2) {
        this.state2 = state2;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStoreid() {
        return storeid;
    }
    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    public int getUcity() {
        return ucity;
    }
    public void setUcity(int ucity) {
        this.ucity = ucity;
    }
    public int getUcounty() {
        return ucounty;
    }
    public void setUcounty(int ucounty) {
        this.ucounty = ucounty;
    }
    public Calendar getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }
    public int getUprovince() {
        return uprovince;
    }
    public void setUprovince(int uprovince) {
        this.uprovince = uprovince;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public BigDecimal getVolume() {
        return volume;
    }
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }
    public BigDecimal getWeight() {
        return weight;
    }
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    public int getYn() {
        return yn;
    }
    public void setYn(int yn) {
        this.yn = yn;
    }
    public BigDecimal getYouhui() {
        return youhui;
    }
    public void setYouhui(BigDecimal youhui) {
        this.youhui = youhui;
    }
    public BigDecimal getYun() {
        return yun;
    }
    public void setYun(BigDecimal yun) {
        this.yun = yun;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public int getZiti() {
        return ziti;
    }
    public void setZiti(int ziti) {
        this.ziti = ziti;
    }


    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }


    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getIsVMI()
    {
        return isVMI;
    }

    public void setIsVMI(int isVMI)
    {
        this.isVMI = isVMI;
    }

    public String getPaintMarker() {
        return paintMarker;
    }

    public void setPaintMarker(String paintMarker) {
        this.paintMarker = paintMarker;
    }

    public String getThirdDistributionInfo() {
        return thirdDistributionInfo;
    }

    public void setThirdDistributionInfo(String thirdDistributionInfo) {
        this.thirdDistributionInfo = thirdDistributionInfo;
    }

    public ExtendMessage getExtendMessage() {
        return extendMessage;
    }

    public void setExtendMessage(ExtendMessage extendMessage) {
        this.extendMessage = extendMessage;
    }

    public int getSystemType() {
        return systemType;
    }

    public void setSystemType(int systemType) {
        this.systemType = systemType;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getTwoSegmentName() {
        return twoSegmentName;
    }

    public void setTwoSegmentName(String twoSegmentName) {
        this.twoSegmentName = twoSegmentName;
    }

    public String getThreeSegmentName() {
        return threeSegmentName;
    }

    public void setThreeSegmentName(String threeSegmentName) {
        this.threeSegmentName = threeSegmentName;
    }

    public String getAssemblePackageName() {
        return assemblePackageName;
    }

    public void setAssemblePackageName(String assemblePackageName) {
        this.assemblePackageName = assemblePackageName;
    }

    public List<ShopDto> getShopList() {
        return shopList;
    }

    public void setShopList(List<ShopDto> shopList) {
        this.shopList = shopList;
    }

    public List<AmwayInvoiceDto> getAmwayInvoicesList() {
        return amwayInvoicesList;
    }

    public void setAmwayInvoicesList(List<AmwayInvoiceDto> amwayInvoicesList) {
        this.amwayInvoicesList = amwayInvoicesList;
    }

    public String getDeliveryOrder() {
        return deliveryOrder;
    }

    public void setDeliveryOrder(String deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }

    public String getMonthDoneCode() {
        return monthDoneCode;
    }

    public void setMonthDoneCode(String monthDoneCode) {
        this.monthDoneCode = monthDoneCode;
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBusiOutboundNo() {
        return busiOutboundNo;
    }

    public void setBusiOutboundNo(String busiOutboundNo) {
        this.busiOutboundNo = busiOutboundNo;
    }

    public String getFromWarehouseCode() {
        return fromWarehouseCode;
    }

    public void setFromWarehouseCode(String fromWarehouseCode) {
        this.fromWarehouseCode = fromWarehouseCode;
    }

    public String getToWarehouseCode() {
        return toWarehouseCode;
    }

    public void setToWarehouseCode(String toWarehouseCode) {
        this.toWarehouseCode = toWarehouseCode;
    }

    public List<DeliveryOrderDto> getObDeliveryOrder() {
        return obDeliveryOrder;
    }

    public void setObDeliveryOrder(List<DeliveryOrderDto> obDeliveryOrder) {
        this.obDeliveryOrder = obDeliveryOrder;
    }

    public String getExpandJson() {
        return expandJson;
    }

    public void setExpandJson(String expandJson) {
        this.expandJson = expandJson;
    }

    public String getShopOrderCreateTime() {
        return shopOrderCreateTime;
    }

    public void setShopOrderCreateTime(String shopOrderCreateTime) {
        this.shopOrderCreateTime = shopOrderCreateTime;
    }

    public String getReceiveMerchant() {
        return receiveMerchant;
    }

    public void setReceiveMerchant(String receiveMerchant) {
        this.receiveMerchant = receiveMerchant;
    }

    public ShoppingInfo getShoppingInfo() {
        return shoppingInfo;
    }

    public void setShoppingInfo(ShoppingInfo shoppingInfo) {
        this.shoppingInfo = shoppingInfo;
    }

    public String getPlanDeliveryTime() {
        return planDeliveryTime;
    }

    public void setPlanDeliveryTime(String planDeliveryTime) {
        this.planDeliveryTime = planDeliveryTime;
    }

    public InvoiceExtendMessage getInvoiceExtendMessage() {
        return invoiceExtendMessage;
    }

    public void setInvoiceExtendMessage(InvoiceExtendMessage invoiceExtendMessage) {
        this.invoiceExtendMessage = invoiceExtendMessage;
    }

    public Map<String,Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String,Object> extendInfo) {
        this.extendInfo = extendInfo;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerTypeName() {
        return ownerTypeName;
    }

    public void setOwnerTypeName(String ownerTypeName) {
        this.ownerTypeName = ownerTypeName;
    }

    public Integer getCarrierTypeNew() {
        return carrierTypeNew;
    }
    public int getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(int orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getRequestionId() {
        return requestionId;
    }

    public void setRequestionId(String requestionId) {
        this.requestionId = requestionId;
    }

    public String getEclpInWareHouseNo() {
        return eclpInWareHouseNo;
    }

    public void setEclpInWareHouseNo(String eclpInWareHouseNo) {
        this.eclpInWareHouseNo = eclpInWareHouseNo;
    }

    public String getEclpInWareHouseName() {
        return eclpInWareHouseName;
    }

    public void setEclpInWareHouseName(String eclpInWareHouseName) {
        this.eclpInWareHouseName = eclpInWareHouseName;
    }

    public OtherExtendMessage getOtherExtendMessage() {
        return otherExtendMessage;
    }

    public void setOtherExtendMessage(OtherExtendMessage otherExtendMessage) {
        this.otherExtendMessage = otherExtendMessage;
    }

    public String getSiteName()
    {
        return siteName;
    }

    public void setSiteName(String siteName)
    {
        this.siteName = siteName;
    }

    public String getStoreNumber()
    {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber)
    {
        this.storeNumber = storeNumber;
    }

    public String getRouteId()
    {
        return routeId;
    }

    public void setRouteId(String routeId)
    {
        this.routeId = routeId;
    }

    public String getDestinationCityName()
    {
        return destinationCityName;
    }

    public void setDestinationCityName(String destinationCityName)
    {
        this.destinationCityName = destinationCityName;
    }

    public String getDestinationCityId()
    {
        return destinationCityId;
    }

    public void setDestinationCityId(String destinationCityId)
    {
        this.destinationCityId = destinationCityId;
    }

    public Integer getShipNoSource()
    {
        return shipNoSource;
    }

    public void setShipNoSource(Integer shipNoSource)
    {
        this.shipNoSource = shipNoSource;
    }

    public List<ObMujiShoppingListM> getMuJiShopOrder()
    {
        return muJiShopOrder;
    }

    public void setMuJiShopOrder(List<ObMujiShoppingListM> muJiShopOrder)
    {
        this.muJiShopOrder = muJiShopOrder;
    }

    public void setCarrierTypeNew(Integer carrierTypeNew)
    {
        this.carrierTypeNew = carrierTypeNew;
    }

    public Integer getAllocateSequence()
    {
        return allocateSequence;
    }

    public void setAllocateSequence(Integer allocateSequence)
    {
        this.allocateSequence = allocateSequence;
    }

    public String getScheduleBillCode()
    {
        return scheduleBillCode;
    }

    public void setScheduleBillCode(String scheduleBillCode)
    {
        this.scheduleBillCode = scheduleBillCode;
    }

    public Integer getDcid()
    {
        return dcid;
    }

    public void setDcid(Integer dcid)
    {
        this.dcid = dcid;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public Integer getStoreId()
    {
        return storeId;
    }

    public void setStoreId(Integer storeId)
    {
        this.storeId = storeId;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
}