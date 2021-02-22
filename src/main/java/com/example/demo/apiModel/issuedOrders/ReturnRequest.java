package com.example.demo.apiModel.issuedOrders;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * User: guojiyong
 * DateTime: 2012-12-14 上午11:27:46
 * Version: 1.0
 */
@XmlRootElement(name = "ReturnRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReturnRequest implements Serializable {

    //退货类型（见ReturnParcelType常量） sunxiaomei 增加部分退货库外返架流程
    private Integer targetSource;
    //青龙那边的退货类型字段见ReturnParcelType常量）sunxiaomei 增加部分退货库外返架流程，最终保存的时候，保存targerSource字段
    private Integer isPackageFull;
    //亚一下传，要求增加以下３个字段
    private String orgId;
    //配送中心编码
    private String cky2;
    //仓库编码
    private String storeId;
    //亚一下传，要求增加以上３个字段

    //青龙发货批次，是否离开分拣中心 0离开，1未离开
    private String isInStore;

    //批次编号
    private String sendCode;

    //收货时
    private String operateTime;

    //收货人
    private String userName;

    //订单ID
    private String orderId;
    private String orderType;
    private String busiOrderCode;
    //包裹号
    private String packageCodes;

    private Timestamp operateTimeDate;

    //订单信息(分销系统)
    @XmlElement(name = "ProductRequest")
    @XmlElementWrapper(name = "productRequests")
    private List<ProductRequest> productRequests = new ArrayList<ProductRequest>();

    private List<String> productRequestJfsList;

    //订单和包裹对应关系(分销系统)，订单包裹对应关系后发送
//    private List<PackageRequest> packageRequests = new ArrayList<PackageRequest>();
    //报损数量, 实际没用
    private int lossQuantity;

    //单据来源
    private Integer source;

    //ECLP超期时间
    private String extendedTime;

    // 超期入库日期
    private String exceedTime;

    private String grade;
    private String token;

    private String orderMark;

    //退货单状态，1只可接收 2 可预检(新时代客退)
    private int orderStatus;

    private String billProp;

    private String soNo;
    //商家退货单号
    private String sellerRtwNo;
    //商家出库单号 中视项目，验收扫描这个单号来验收
    private String isvOutstoreNo;
    //业务员
    private String salesman;
    //销售开票员
    private  String salesBillingStaff;
    //流通电子监管码
    private  String drugElectronicSupervisionCode;
    //退货单位名称
    private  String customerName;
    //货主
    private  String ownerCode;
    //备注
    private  String remark;

    private String customerCode;//退货单位编码
    //0或空：客退入；其他：非客退入
    private Integer guestBackType;

    /**
     * from 区分青龙和京喜，京喜业务为1
     */
    private Integer from;

    /**
     * afsServiceId 服务单号
     */
    private String afsServiceId;

    /**
     * saleOrderId 销售订单号
     */
    private String saleOrderId;

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public String getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(String afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getSalesBillingStaff() {
        return salesBillingStaff;
    }

    public void setSalesBillingStaff(String salesBillingStaff) {
        this.salesBillingStaff = salesBillingStaff;
    }

    public String getDrugElectronicSupervisionCode() {
        return drugElectronicSupervisionCode;
    }

    public void setDrugElectronicSupervisionCode(String drugElectronicSupervisionCode) {
        this.drugElectronicSupervisionCode = drugElectronicSupervisionCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    //唯一码 (分销系统，必填)
    private String uniqueCode;
    //客户名称(发起门店)  (分销系统，必填)
    private String sourceName;
    //客户编码  (分销系统，必填)
    private String sourceNo;
    //是否允许半收(分销系统，必填)1，允许半收。0，不允许半收
    private Integer isPartAccept;
    //表示单据来源，目前有分销系统（FX）、加履中心订单（JLZX）和ofc下发
    private String orderSource;

    // 分销系统，新增运单号，@郭宇飞，目前运单号=退货订单号，但是以后随着国家物流运输管理办法出台后，可能就不一样了，因此新增字段，支持运单号
    //运单号(分销系统，必填，一个入库单，对应一个运单)
    private String waybillNo;
    //包裹数量(分销系统，非必填)
    private Integer packageNum;

    private String sickWaybill;

    //爱步 门店ID
    private String shopId;
    //卡宾 箱报文地址
    private String boxJfs;
    //联通 序列号报文地址
    private String serialJfs;

    /**
     * 联通打印模板列表
     */
//    private List<AsnPrint> asnPrintList;

    /**
     * 商家备注信息（退货原因）
     */
    private String sellerRemark;

    /**
     * 商家退货类型编码
     */
    private String sellerRtwType;

    /**
     * 商家退货类型名称
     */
    private String sellerRtwTypeName;

//    private List<InboundExtInfo> extInfos;

	//商家合作方式
    private Integer xniType;

    //门店ID 采购bip提供的该字段为供应商编码，为保持报表一直客退该字段存入taskm的供应商编码
    private String venderId;
    //产品标
    private List<String> productsCode;

    //青龙病单入库面单包裹号
    private String billPackageCode;

    // **********  以下安踏项目添加 **********

    //销售平台交易号
    private String salePlatformTransactionNo;
    //承运商名称
    private String carrierName;
    //退货人姓名
    private String refunderName;
    //退货人联系电话
    private String refunderPhoneNo;
    //退货人手机号
    private String refunderMobileNo;
    //店铺名称
    private String shopName;
    //销售平台
    private String salePlatform;
    //工单号 异常等级表的 差异申请单号
    private String applyDifNo;

    // **********  安踏项目添加 截止 **********


    public String getSalePlatformTransactionNo() {
        return salePlatformTransactionNo;
    }

    public void setSalePlatformTransactionNo(String salePlatformTransactionNo) {
        this.salePlatformTransactionNo = salePlatformTransactionNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getRefunderName() {
        return refunderName;
    }

    public void setRefunderName(String refunderName) {
        this.refunderName = refunderName;
    }

    public String getRefunderPhoneNo() {
        return refunderPhoneNo;
    }

    public void setRefunderPhoneNo(String refunderPhoneNo) {
        this.refunderPhoneNo = refunderPhoneNo;
    }

    public String getRefunderMobileNo() {
        return refunderMobileNo;
    }

    public void setRefunderMobileNo(String refunderMobileNo) {
        this.refunderMobileNo = refunderMobileNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSalePlatform() {
        return salePlatform;
    }

    public void setSalePlatform(String salePlatform) {
        this.salePlatform = salePlatform;
    }

    public String getApplyDifNo() {
        return applyDifNo;
    }

    public void setApplyDifNo(String applyDifNo) {
        this.applyDifNo = applyDifNo;
    }

    public Integer getXniType() {
        return xniType;
    }

    public void setXniType(Integer xniType) {
        this.xniType = xniType;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getSickWaybill() {
        return sickWaybill;
    }

    public void setSickWaybill(String sickWaybill) {
        this.sickWaybill = sickWaybill;
    }

    public List<String> getProductRequestJfsList() {
        return productRequestJfsList;
    }

    public void setProductRequestJfsList(List<String> productRequestJfsList) {
        this.productRequestJfsList = productRequestJfsList;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    public String getSellerRtwType() {
        return sellerRtwType;
    }

    public void setSellerRtwType(String sellerRtwType) {
        this.sellerRtwType = sellerRtwType;
    }

    public String getSellerRtwTypeName() {
        return sellerRtwTypeName;
    }

    public void setSellerRtwTypeName(String sellerRtwTypeName) {
        this.sellerRtwTypeName = sellerRtwTypeName;
    }

    public String getBoxJfs() {
        return boxJfs;
    }

    public void setBoxJfs(String boxJfs) {
        this.boxJfs = boxJfs;
    }

    public String getSerialJfs() {
        return serialJfs;
    }

    public void setSerialJfs(String serialJfs) {
        this.serialJfs = serialJfs;
    }


    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public String getIsvOutstoreNo() {
        return isvOutstoreNo;
    }

    public void setIsvOutstoreNo(String isvOutstoreNo) {
        this.isvOutstoreNo = isvOutstoreNo;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public Integer getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Integer packageNum) {
        this.packageNum = packageNum;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    public Integer getIsPartAccept() {
        return isPartAccept;
    }

    public void setIsPartAccept(Integer isPartAccept) {
        this.isPartAccept = isPartAccept;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getSellerRtwNo() {
        return sellerRtwNo;
    }

    public void setSellerRtwNo(String sellerRtwNo) {
        this.sellerRtwNo = sellerRtwNo;
    }

    public String getBillProp() {
        return billProp;
    }

    public void setBillProp(String billProp) {
        this.billProp = billProp;
    }

    public String getBillPackageCode() {
        return billPackageCode;
    }

    public void setBillPackageCode(String billPackageCode) {
        this.billPackageCode = billPackageCode;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getExtendedTime() {
        return extendedTime;
    }

    public void setExtendedTime(String extendedTime) {
        this.extendedTime = extendedTime;
    }

    public String getExceedTime() {
        return exceedTime;
    }

    public void setExceedTime(String exceedTime) {
        this.exceedTime = exceedTime;
    }

    /**
     * @return the sendCode
     */
    public String getSendCode() {
        return sendCode;
    }

    /**
     * @param sendCode the sendCode to set
     */
    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    /**
     * @return the operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * @param operateTime the operateTime to set
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getBusiOrderCode() {
        return busiOrderCode;
    }

    public void setBusiOrderCode(String busiOrderCode) {
        this.busiOrderCode = busiOrderCode;
    }

    /**
     * @return the packageCodes
     */
    public String getPackageCodes() {
        return packageCodes;
    }

    /**
     * @param packageCodes the packageCodes to set
     */
    public void setPackageCodes(String packageCodes) {
        this.packageCodes = packageCodes;
    }

    /**
     * @return the operateTimeDate
     */
    public Timestamp getOperateTimeDate() throws ParseException {
        Timestamp timestampData = null;
        DateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isNotBlank(operateTime)) {
            timestampData = new Timestamp(sf.parse(operateTime).getTime());
        }
        return timestampData;
    }

    /**
     * @param operateTimeDate the operateTimeDate to set
     */
    public void setOperateTimeDate(Timestamp operateTimeDate) {
        this.operateTimeDate = operateTimeDate;
    }

    /**
     * @return the productRequests
     */
    public List<ProductRequest> getProductRequests() {
        return productRequests;
    }

    /**
     * @param productRequests the productRequests to set
     */
    public void setProductRequests(List<ProductRequest> productRequests) {
        this.productRequests = productRequests;
    }

    /**
     * @return the lossQuantity
     */
    public int getLossQuantity() {
        return lossQuantity;
    }

    /**
     * @param lossQuantity the lossQuantity to set
     */
    public void setLossQuantity(int lossQuantity) {
        this.lossQuantity = lossQuantity;
    }

    public Integer getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(Integer targetSource) {
        this.targetSource = targetSource;
    }

    public Integer getPackageFull() {
        return isPackageFull;
    }

    public void setPackageFull(Integer packageFull) {
        isPackageFull = packageFull;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCky2() {
        return cky2;
    }

    public void setCky2(String cky2) {
        this.cky2 = cky2;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getInStore() {
        return isInStore;
    }

    public void setInStore(String inStore) {
        isInStore = inStore;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getGrade() {
        return StringUtils.isBlank(grade) ? Grade.GOODS.getValue() : grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void validate() {
        if (Grade.ORDER.getValue().equals(grade)) {
            for (ProductRequest productRequest : productRequests) {
                if (StringUtils.isBlank(productRequest.getGoodsStatus())) {
                    throw new RuntimeException(productRequest.getProductId() + "下发等级字段[goodsStatus]为空");
                }
            }
        }
        validateSendCode();
    }


    /**
     * 新增方法体，用于传递其他不适用当前validate()形式的request
     * @param request
     */
    public void validate(ReturnRequest request) {
            request.validate();
    }



    public void validateSendCode() {
        if (StringUtils.isBlank(getSendCode())) {
            throw new RuntimeException("报文批次编号为空");
        }
        if (source.equals("1")) {
            if (!StringUtils.isNotBlank(getPackageCodes())) {
                throw new RuntimeException("报文包裹号为空");
            }
        }
        if (!StringUtils.isNotBlank(getCky2()) || !StringUtils.isNotBlank(getStoreId())) {
            throw new RuntimeException("下传报文中没有配送中心号或库房号!");
        }
    }
    public void validateFor2B(){
        if (getSource()==null) {
            throw new RuntimeException("报文来源为空");
        }
        if (StringUtils.isBlank(getCky2()) || StringUtils.isBlank(getStoreId())) {
            throw new RuntimeException("下传报文中没有配送中心号或库房号!");
        }

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

//    public List<PackageRequest> getPackageRequests() {
//        return packageRequests;
//    }
//
//    public void setPackageRequests(List<PackageRequest> packageRequests) {
//        this.packageRequests = packageRequests;
//    }
//
//    public List<InboundExtInfo> getExtInfos() {
//        return extInfos;
//    }
//
//    public void setExtInfos(
//            List<InboundExtInfo> extInfos) {
//        this.extInfos = extInfos;
//    }
//
//    public List<AsnPrint> getAsnPrintList() {
//        return asnPrintList;
//    }
//
//    public void setAsnPrintList(List<AsnPrint> asnPrintList) {
//        this.asnPrintList = asnPrintList;
//    }

    public List<String> getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(List<String> productsCode) {
        this.productsCode = productsCode;
    }

    public String getThirdCode() {
        throw new UnsupportedOperationException();
	}
    public Integer getGuestBackType() {
        return guestBackType;
    }

    public void setGuestBackType(Integer guestBackType) {
        this.guestBackType = guestBackType;
    }
}
