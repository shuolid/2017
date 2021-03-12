package com.example.demo.apiModel.caseInfo;

import java.util.Date;
import java.util.List;

// 预检任务主档
public class IbReceivingTaskM extends AbstractWarehouseInfo implements InboundKey,BatchCodeKey {
    private IbReceivingWorker workerItem;
    // 自增主键
    private Integer id;
    // 入库单号(业务主键)
    private String inboundNo;
    // 防重码(inbound_no)
    private String uuid;
    // 原ASN号
    private String originalInboundNo;
    // Po单号  客退自营一定要存运单号 禁止赋其他值 回传用 验收也会用 用运单号匹配入库单号
    private String poNo;
    // 预约单号
    private String bookingNo;
    // 货主编号
    private String ownerNo;
    // 货主名称
    private String ownerName;
    // 机构编号
    private String orgNo;
    // 机构名称
    private String orgName;
    // 配送中心编号
    private String distributeNo;
    // 库房编号
    private String warehouseNo;
    // 入库单类别(一般入库、客户退货、大家电再投、样品入库、备件库入大库、内配入库)
    private String inboundType;
    // 状态(0待预检、1预检中、2已完验、3部分验收已关单、4全部验收已关单)
    private int inboundStatus;
    // 总数量
    private double totalQty;
    // 总重量
    private double totalWeight;
    // 重量单位
    private String weightUnit;
    // 总体积
    private double totalVolume;
    // 标签数
    private Integer labelQty;
    // 采购类型(一般采购、赠品采购)
    private String purchaseType;
    // 后续到货标识(0到货、1不到货)
    private Integer arriveAgainFlag;
    // 当前验收次数
    private Integer receivingTimes;
    // 订单备注
    private String remark;

    private String containerNo;

    private String difDetail;

    // 是否采配(0非采配、1采配对一般采购入库有用)
    private Integer purchaseTransFlag;
    // 月台
    private String dockNo;
    // 预约起始时间
    private Date bookingTimeBegin;
    // 预约结束时间
    private Date bookingTimeEnd;
    // 承运商编码
    private String carrierNo;
    // 承运商名称
    private String carrierName;
    // 供应商编码
    private String supplierNo;
    // 供应商名称
    private String supplierName;
    // 创建人
    private String createUser;
    // 创建时间
    private Date createTime;
    // 最后更新人
    private String updateUser;
    // 更新时间
    private Date updateTime;
    // 删除标识(0未删除 1已删除)
    private Integer yn;
    // 再投订单号(一个订单可多次再投)
    private String resendOrder;
    // 打印标识(0未打印 1已打印)
    private Integer printFlag;
    // 拒收原因
    private String rejectDesc;
    // 再投时间
    private Date resendTime;
    // 预检任务明细列表
    private List<IbReceivingTaskD> ibReceivingTaskDList;

    private List<Integer> taskDIds;
    // 是否分批次 1.分批次；0.非分批次
    private Integer isBatch = 0;
    // 是否开启电子回执单 1.开启；0.默认不开启
    private Integer isOpenElectronicreceipt = 0;
    private List<String> batchCodes;
    private String outWaveNo;//出库波次号
    private Date inboundFinishTime;//+整单完验时间
    private String inboundFinishUser;//+整单完验人
    private Date closeTime;//+关单时间
    private Integer oldInboundStatus;//旧验收状态

    private int inboundStatusMR;//mr表的状态
    private boolean transport;//带板运输 0:否, 1:是
    private int istransport;//带板运输 0:否, 1:是
    private boolean canLessGoods;//上架异常处理是否可以操作验收少货
    private boolean freshShortSafeFlag;//优先收货标识 1，显示“优”。标识为0，或无标识，则不显示“优”

    public boolean isCheckBackFlag() {
        return checkBackFlag;
    }

    public void setCheckBackFlag(boolean checkBackFlag) {
        this.checkBackFlag = checkBackFlag;
    }

    private boolean checkBackFlag;//验收结果回传 ordermark第五位等于3

    /**
     * 短保采购单显示 关单剩余时间
     * 2小时55分钟-（当前时间-签到时间）
     */
    private String closeRemainTime;
    //是否越库单(0:否，1：是)
    private Integer isCrossDockingBill;

    private double batchReceivedQty;//批次验收量

    // 增值服务状态
    private Integer appreciationServeStatus;
    //到货温度增值服务状态
    private Integer collectTemperatureTag;
    //增值服务明细
//    List<IbAppreciationD> ibAppreciationDList;
//    //增值服务主档
//    private List<IbAppreciationM> ibAppreciationMList;
    /**
     * 门店标示
     */
    private String shopType;

    private String transportWay; //昆山医药，运输方式
    private String goodsTemperature;//昆山医药，到货温度

    /**
     * 是否免运费  1是0否
     */
    private Integer freeFreight;

    /**
     * ECLP是否允许超期入库
     */
    private boolean allowExceedReceiving;
    /**
     * 是否是TC点大包采购单
     */
    private boolean tcDdb;

    /**
     * 是否越库
     */
    private boolean skipStore;
    private String userCode;
    private boolean hasIsNoSale;

    /**
     * 商家业务类型编码
     */
    private String sellerRtwType;

    /**
     * 商家业务类型名称
     */
    private String sellerRtwTypeName;

    /**
     * taskm扩展字段
     */
//    private IbReceivingTaskMB2bEx ibReceivingTaskMB2BEx;

    /**
     * 超期入库日期
     */
    private Date exceedTime;

    /**
     *预计到货时间
     */
    private Date expectedArrivalTime;

    public Date getExceedTime() {
        return exceedTime;
    }

    public void setExceedTime(Date exceedTime) {
        this.exceedTime = exceedTime;
    }

    /**
     * 属性配置
     */
    private String orderMark;


    /**
     * 运单号
     */
    private String trackingNo;
    private String packageCodes;//补发退货消息中的包裹号，仅限预售
    private String preSellType;//预售类型 1=预售到仓 2=预售到配

//    //documentId B/C标识(0--C单、1B单) (add by qiaojie7)
//    private Integer documentId;
//    //documentId B/C标识(0--C单、1B单) (add by qiaojie7)
//    private String documentIdStr;

//    public Integer getDocumentId() {
//        return documentId;
//    }
//
//    public void setDocumentId(Integer documentId) {
//        this.documentId = documentId;
//    }
    private String inboundMark;

    //仓库地址
    private String warehouseAddress;
    //供应商联系人
    private String supplierContactPersonJfs;
    //供应商电话
    private String supplierContactPhoneJfs;
    //供应商名称
    private String supplierNameJfs;
    //采购单备注
    private String remarkJfs;
    //奢侈品入库校验方式显示
    private String checkModeForShow;

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getSupplierContactPersonJfs() {
        return supplierContactPersonJfs;
    }

    public void setSupplierContactPersonJfs(String supplierContactPersonJfs) {
        this.supplierContactPersonJfs = supplierContactPersonJfs;
    }

    public String getSupplierContactPhoneJfs() {
        return supplierContactPhoneJfs;
    }

    public void setSupplierContactPhoneJfs(String supplierContactPhoneJfs) {
        this.supplierContactPhoneJfs = supplierContactPhoneJfs;
    }

    public String getSupplierNameJfs() {
        return supplierNameJfs;
    }

    public void setSupplierNameJfs(String supplierNameJfs) {
        this.supplierNameJfs = supplierNameJfs;
    }

    public String getRemarkJfs() {
        return remarkJfs;
    }

    public void setRemarkJfs(String remarkJfs) {
        this.remarkJfs = remarkJfs;
    }


    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }
    public String getCloseRemainTime() {
        return closeRemainTime;
    }

    public void setCloseRemainTime(String closeRemainTime) {
        this.closeRemainTime = closeRemainTime;
    }

//    public IbReceivingTaskMB2bEx getIbReceivingTaskMB2BEx() {
//        return ibReceivingTaskMB2BEx;
//    }
//
//    public void setIbReceivingTaskMB2BEx(IbReceivingTaskMB2bEx ibReceivingTaskMB2BEx) {
//        this.ibReceivingTaskMB2BEx = ibReceivingTaskMB2BEx;
//    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getDifDetail() {
        return difDetail;
    }

    public void setDifDetail(String difDetail) {
        this.difDetail = difDetail;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    /**
     * 是否Tc采购单,无纸化打印
     * true :是
     * false :否
     */
    private boolean tcPurchaseFlag;

    public IbReceivingTaskM() {
    }

    public IbReceivingTaskM(String inboundNo, String orgNo, String distributeNo, String warehouseNo) {
        this.inboundNo = inboundNo;
        this.orgNo = orgNo;
        this.distributeNo = distributeNo;
        this.warehouseNo = warehouseNo;

    }


    public double getBatchReceivedQty() {
        return batchReceivedQty;
    }

    public void setBatchReceivedQty(double batchReceivedQty) {
        this.batchReceivedQty = batchReceivedQty;
    }

    public int getInboundStatusMR() {
        return inboundStatusMR;
    }

    public void setInboundStatusMR(int inboundStatusMR) {
        this.inboundStatusMR = inboundStatusMR;
    }

    public String getSupplierGradName() {
        return supplierGradName;
    }

    public void setSupplierGradName(String supplierGradName) {
        this.supplierGradName = supplierGradName;
    }

    //单号集合
    private List<String> inboundNoList;
    //单据来源
    private Integer source;
    // 单据标示（0：ISV，1：闪购，2：仓储服务，3：ECLP 6：全球购采购单）
    private Integer eclpSign;
    private String supplierGradName;

    //eclp超期时间
    private Date rejectTime;
    private String shipperType;//货主名单类型
    //入库子类型
    private Integer subInboundType;

    public Integer getSubInboundType() {
        return subInboundType;
    }

    public void setSubInboundType(Integer subInboundType) {
        this.subInboundType = subInboundType;
    }

    public Date getRejectTime() {
        return rejectTime;
    }

    public void setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
    }

    //首次签到时间
    private Date firstSignInTime;

    private String markSign;
    //入库标示(从右往左) 第1位:是否多串码采集 0:否 1: 是
    private String inboundRemark;

    // 单维度验收质检标识 1 整单待质检 0 非整单质检
    private String inboundQa;

    // ECLP 是否按等级验收  1-是  2-否
    private String grade;

    // 是否整箱管理 1-是  2-否  1:整箱管理为B业务
    private String isCarton;
    private String orderAttribute;
    // 若为是，则严格按照采购单下发等级验收，若为否，则可以随意选择等级验收
    private boolean needReceivingByBillProductLevel;

    // grade==2随意选择等级进行验收
    public boolean isNeedReceivingByBillProductLevel() {
        needReceivingByBillProductLevel = "1".equals(getGrade());
        return needReceivingByBillProductLevel;
    }

    private List<String> poNoList;//用于搬仓入库批量查询

    //搬仓入来源机构
    private String fromOrgNo;
    // 搬仓入来源配送中心编号
    private String fromDistributeNo;
    // 搬仓入来源库房编号
    private String fromWarehouseNo;
    //序列号验收方式
    private String snCollectType;
    //是否整箱验收标示
    private boolean boxFlag;
    //是否整板验收标识
    private boolean plateFlag;
    //是否信任交接
    private boolean popularFlag;
    //验收方式 1:预检方式 2:整箱方式
    private String receivingMethod;
    /**
     * 未关单状态
     */
    private Boolean unFinished;
    //安利内配入库添加
    private String defectiveShelfLifeFlag;//是否判断残品保质期标识

    //表示单据来源，目前有分销系统（FX）、加履中心订单（JLZX）和ofc下发
    private String orderSource;

    //医药TOB客退验收任务主档扩展信息
//    private IbReceivingTaskMB2bEx ibReceivingTaskmB2BEx;

    private Double totalPrice;

//    private List<IbReceivingTaskDExt> ibreceivingTaskDExts;
//
//    public List<IbReceivingTaskDExt> getIbreceivingTaskDExts() {
//        return ibreceivingTaskDExts;
//    }
//
//    public void setIbreceivingTaskDExts(List<IbReceivingTaskDExt> ibreceivingTaskDExts) {
//        this.ibreceivingTaskDExts = ibreceivingTaskDExts;
//    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    //是否TC单子
    private boolean tcFlag;

    //是否按板回传
    private boolean backByContainer;

    //是否不依赖序列号清单
    private boolean snManager;

    //是否存在指定批次入库商品
    private boolean assignLot;

    //合并单号
    private String mergeAsnNo;

    //是否合并采购单子单
    private boolean childAsn;

    private Integer snFlag;

    //是否冷链
    private boolean ColdChain;

    public boolean isColdChain() {
        return ColdChain;
    }

    public void setColdChain(boolean coldChain) {
        ColdChain = coldChain;
    }


    //增值服务状态1、新建 2、执行中 3、已完成、4、取消
    private String orderStatus;
    //增值服务单号
    private String orderNo;
    //判断是否为增值服务
    private boolean appreciationServe;
    //判断是否为淘淘汽增值服务
    private boolean taotaoAppreciationServe;

//    private List<AsnExpend> asnExpends;

    private String isBoxRemark;//箱校验标识，0 校验 ，1 不校验
    /**
     * 爱步门店ID
     */
    private String shopId;

    /**
     * 客退序列号报文地址
     */
    private String serialJfs;


    /**
     * 卡宾客退箱报文地址
     */
    private String boxJfs;

    /**
     * 中石化订单备注
     */
    private String orderReason;

    private Boolean allReject;
    //广州亚一，签到状态
    private Integer queueStatus;

    //产品标
    private List<String> productsCode;

    //供应链订单标识，按箱计费/箱件最低
    private String productType;


    private String asnSubType;//采购单子类型

    private String sourceWarehouse;//始发仓
    //是否允许缺量1，允许。0，不允许
    private String isPartAccept;

    /**
     * 是否需要贴码
     */
    private boolean markFlag;

	/**
     *  商家供应商编码
     */
    private String sellerSupplierNo;
    /**
     * 商家单号1
     */
    private String sellerAsnNo;

    /**
     * selfOrderSource 自营单据来源（ 0青龙，1京喜）
     */
    private Integer selfOrderSource;

    /**
     * afsServiceId 服务单号
     */
    private String afsServiceId;

    /**
     * saleOrderId 销售订单号
     */
    private String saleOrderId;

    public Integer getSelfOrderSource() {
        return selfOrderSource;
    }

    public void setSelfOrderSource(Integer selfOrderSource) {
        this.selfOrderSource = selfOrderSource;
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

    public String getIsPartAccept() {
        return isPartAccept;
    }

    public void setIsPartAccept(String isPartAccept) {
        this.isPartAccept = isPartAccept;
    }

    public Boolean getAllReject() {
        return allReject;
    }

    public void setAllReject(Boolean allReject) {
        this.allReject = allReject;
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

//    public List<AsnExpend> getAsnExpends() {
//        return asnExpends;
//    }
//
//    public void setAsnExpends(List<AsnExpend> asnExpends) {
//        this.asnExpends = asnExpends;
//    }

    public Integer getSnFlag() {
        return snFlag;
    }

    public void setSnFlag(Integer snFlag) {
        this.snFlag = snFlag;
    }

    //是否TC验明细
    private boolean tcDetails;


    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public boolean isAppreciationServe() {
        return appreciationServe;
    }

    public void setAppreciationServe(boolean appreciationServe) {
        this.appreciationServe = appreciationServe;
    }

    public boolean isChildAsn() {
        return childAsn;
    }

    public void setChildAsn(boolean childAsn) {
        this.childAsn = childAsn;
    }


    //移动仓内配变质商品备注信息
    private String promise;

    public boolean isTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }

    public int getIstransport() {
        return istransport;
    }

    public void setIstransport(int istransport) {
        this.istransport = istransport;
    }

    public String getDefectiveShelfLifeFlag() {
        return defectiveShelfLifeFlag;
    }

    public String getMergeAsnNo() {
        return mergeAsnNo;
    }

    public void setMergeAsnNo(String mergeAsnNo) {
        this.mergeAsnNo = mergeAsnNo;
    }

    public void setDefectiveShelfLifeFlag(String defectiveShelfLifeFlag) {
        this.defectiveShelfLifeFlag = defectiveShelfLifeFlag;
    }

    public String getIsCarton() {
        return isCarton;
    }

    public void setIsCarton(String isCarton) {
        this.isCarton = isCarton;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //是否自动采集多串码
    public String getMarkSign() {
        return markSign;
    }

    public void setMarkSign(String markSign) {
        this.markSign = markSign;
    }

    public Date getFirstSignInTime() {
        return firstSignInTime;
    }

    public void setFirstSignInTime(Date firstSignInTime) {
        this.firstSignInTime = firstSignInTime;
    }

    // get自增主键
    public Integer getId() {
        return id;
    }

    // set自增主键
    public void setId(Integer id) {
        this.id = id;
    }

    // get入库单号(业务主键)
    @Override
    public String getInboundNo() {
        return inboundNo;
    }

    // set入库单号(业务主键)
    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    // get防重码(inbound_no)
    public String getUuid() {
        return uuid;
    }

    // set防重码(inbound_no)
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    // get原ASN号
    public String getOriginalInboundNo() {
        return originalInboundNo;
    }

    // set原ASN号
    public void setOriginalInboundNo(String originalInboundNo) {
        this.originalInboundNo = originalInboundNo;
    }

    // getPo单号
    public String getPoNo() {
        return poNo;
    }

    // setPo单号
    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    // get预约单号
    public String getBookingNo() {
        return bookingNo;
    }

    // set预约单号
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    // get货主编号
    public String getOwnerNo() {
        return ownerNo;
    }

    // set货主编号
    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    // get货主名称
    public String getOwnerName() {
        return ownerName;
    }

    // set货主名称
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // get机构编号
    @Override
    public String getOrgNo() {
        return orgNo;
    }

    // set机构编号
    @Override
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    // get机构名称
    public String getOrgName() {
        return orgName;
    }

    // set机构名称
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    // get配送中心编号
    @Override
    public String getDistributeNo() {
        return distributeNo;
    }

    // set配送中心编号
    @Override
    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    // get库房编号
    @Override
    public String getWarehouseNo() {
        return warehouseNo;
    }

    // set库房编号
    @Override
    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    // get入库单类别(一般入库、客户退货、大家电再投、样品入库、备件库入大库、内配入库)
    public String getInboundType() {
        return inboundType;
    }

    // set入库单类别(一般入库、客户退货、大家电再投、样品入库、备件库入大库、内配入库)
    public void setInboundType(String inboundType) {
        this.inboundType = inboundType;
    }

    // get状态(0待预检、1预检中、2已完验、3部分验收已关单、4全部验收已关单)
    public int getInboundStatus() {
        return inboundStatus;
    }

    // set状态(0待预检、1预检中、2已完验、3部分验收已关单、4全部验收已关单)
    public void setInboundStatus(int inboundStatus) {
        this.inboundStatus = inboundStatus;
    }

    // get总数量
    public double getTotalQty() {
        return totalQty;
    }

    // set总数量
    public void setTotalQty(double totalQty) {
        this.totalQty = totalQty;
    }

    // get总重量
    public double getTotalWeight() {
        return totalWeight;
    }

    // set总重量
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    // get重量单位
    public String getWeightUnit() {
        return weightUnit;
    }

    // set重量单位
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    // get总体积
    public double getTotalVolume() {
        return totalVolume;
    }

    // set总体积
    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    // get标签数
    public Integer getLabelQty() {
        return labelQty;
    }

    // set标签数
    public void setLabelQty(Integer labelQty) {
        this.labelQty = labelQty;
    }

    // get采购类型(一般采购、赠品采购)
    public String getPurchaseType() {
        return purchaseType;
    }

    // set采购类型(一般采购、赠品采购)
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    // get后续到货标识(0到货、1不到货)
    public Integer getArriveAgainFlag() {
        return arriveAgainFlag;
    }

    // set后续到货标识(0到货、1不到货)
    public void setArriveAgainFlag(Integer arriveAgainFlag) {
        this.arriveAgainFlag = arriveAgainFlag;
    }

    // get当前验收次数
    public Integer getReceivingTimes() {
        return receivingTimes;
    }

    // set当前验收次数
    public void setReceivingTimes(Integer receivingTimes) {
        this.receivingTimes = receivingTimes;
    }

    // get订单备注
    public String getRemark() {
        return remark;
    }

    // set订单备注
    public void setRemark(String remark) {
        this.remark = remark;
    }

    // get是否采配(0非采配、1采配对一般采购入库有用)
    public Integer getPurchaseTransFlag() {
        return purchaseTransFlag;
    }

    // set是否采配(0非采配、1采配对一般采购入库有用)
    public void setPurchaseTransFlag(Integer purchaseTransFlag) {
        this.purchaseTransFlag = purchaseTransFlag;
    }

    // get月台
    public String getDockNo() {
        return dockNo;
    }

    // set月台
    public void setDockNo(String dockNo) {
        this.dockNo = dockNo;
    }

    // get预约起始时间
    public Date getBookingTimeBegin() {
        return bookingTimeBegin;
    }

    // set预约起始时间
    public void setBookingTimeBegin(Date bookingTimeBegin) {
        this.bookingTimeBegin = bookingTimeBegin;
    }

    // get预约结束时间
    public Date getBookingTimeEnd() {
        return bookingTimeEnd;
    }

    // set预约结束时间
    public void setBookingTimeEnd(Date bookingTimeEnd) {
        this.bookingTimeEnd = bookingTimeEnd;
    }

    // get承运商编码
    public String getCarrierNo() {
        return carrierNo;
    }

    // set承运商编码
    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }

    // get承运商名称
    public String getCarrierName() {
        return carrierName;
    }

    // set承运商名称
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    // get供应商编码
    public String getSupplierNo() {
        return supplierNo;
    }

    // set供应商编码
    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    // get供应商名称
    public String getSupplierName() {
        return supplierName;
    }

    // set供应商名称
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    // get创建人
    public String getCreateUser() {
        return createUser;
    }

    // set创建人
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    // get创建时间
    public Date getCreateTime() {
        return createTime;
    }

    // set创建时间
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    // get最后更新人
    public String getUpdateUser() {
        return updateUser;
    }

    // set最后更新人
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    // get更新时间
    public Date getUpdateTime() {
        return updateTime;
    }

    // set更新时间
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    // get删除标识(0未删除 1已删除)
    public Integer getYn() {
        return yn;
    }

    // set删除标识(0未删除 1已删除)
    public void setYn(Integer yn) {
        this.yn = yn;
    }

    // get再投订单号(一个订单可多次再投)
    public String getResendOrder() {
        return resendOrder;
    }

    // set再投订单号(一个订单可多次再投)
    public void setResendOrder(String resendOrder) {
        this.resendOrder = resendOrder;
    }

    // get打印标识(0未打印 1已打印)
    public Integer getPrintFlag() {
        return printFlag;
    }

    //add by zhangyaping8 20171029 begin
    //tc批次号
    public String batchCode;
    //add by zhangyaping8 20171029 begin

    //腾讯箱规序列号标示
    public boolean tencentBoxRegulationsSerial;

    // set打印标识(0未打印 1已打印)
    public void setPrintFlag(Integer printFlag) {
        this.printFlag = printFlag;
    }

    public String getRejectDesc() {
        return rejectDesc;
    }

    public void setRejectDesc(String rejectDesc) {
        this.rejectDesc = rejectDesc;
    }

    public Date getResendTime() {
        return resendTime;
    }

    public void setResendTime(Date resendTime) {
        this.resendTime = resendTime;
    }

    public List<IbReceivingTaskD> getIbReceivingTaskDList() {
        return ibReceivingTaskDList;
    }

    public void setIbReceivingTaskDList(List<IbReceivingTaskD> ibReceivingTaskDList) {
        this.ibReceivingTaskDList = ibReceivingTaskDList;
    }

    public Integer getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(Integer isBatch) {
        this.isBatch = isBatch;
    }

    public Integer getIsOpenElectronicreceipt() {
        return isOpenElectronicreceipt;
    }

    public void setIsOpenElectronicreceipt(Integer isOpenElectronicreceipt) {
        this.isOpenElectronicreceipt = isOpenElectronicreceipt;
    }

    public String getOutWaveNo() {
        return outWaveNo;
    }

    public void setOutWaveNo(String outWaveNo) {
        this.outWaveNo = outWaveNo;
    }

    public Date getInboundFinishTime() {
        return inboundFinishTime;
    }

    public void setInboundFinishTime(Date inboundFinishTime) {
        this.inboundFinishTime = inboundFinishTime;
    }

    public String getInboundFinishUser() {
        return inboundFinishUser;
    }

    public void setInboundFinishUser(String inboundFinishUser) {
        this.inboundFinishUser = inboundFinishUser;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public List<String> getInboundNoList() {
        return inboundNoList;
    }

    public void setInboundNoList(List<String> inboundNoList) {
        this.inboundNoList = inboundNoList;
    }

    public IbReceivingWorker getWorkerItem() {
        return workerItem;
    }

    public void setWorkerItem(IbReceivingWorker workerItem) {
        this.workerItem = workerItem;
    }

    /*
    默认返回erp来源1
     */
    public Integer getSource() {
        if (source == null) return 1;
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getEclpSign() {
        return eclpSign == null ? 0 : eclpSign;
    }

    public void setEclpSign(Integer eclpSign) {
        this.eclpSign = eclpSign;
    }

    public String getShipperType() {
        return shipperType;
    }

    public void setShipperType(String shipperType) {
        this.shipperType = shipperType;
    }

    public String getOrderAttribute() {
        return orderAttribute;
    }

    public void setOrderAttribute(String orderAttribute) {
        this.orderAttribute = orderAttribute;
    }

    public void setInboundMark(String inboundMark) {
        this.inboundMark = inboundMark;
    }

    public String getInboundMark() {
        return inboundMark;
    }

    public String getSnCollectType() {
        return snCollectType;
    }

    public void setSnCollectType(String snCollectType) {
        this.snCollectType = snCollectType;
    }

    public Integer getOldInboundStatus() {
        return oldInboundStatus;
    }

    public void setOldInboundStatus(Integer oldInboundStatus) {
        this.oldInboundStatus = oldInboundStatus;
    }

    public List<String> getPoNoList() {
        return poNoList;
    }

    public void setPoNoList(List<String> poNoList) {
        this.poNoList = poNoList;
    }


    public String getFromOrgNo() {
        return fromOrgNo;
    }

    public void setFromOrgNo(String fromOrgNo) {
        this.fromOrgNo = fromOrgNo;
    }

    public String getFromDistributeNo() {
        return fromDistributeNo;
    }

    public void setFromDistributeNo(String fromDistributeNo) {
        this.fromDistributeNo = fromDistributeNo;
    }

    public String getFromWarehouseNo() {
        return fromWarehouseNo;
    }

    public void setFromWarehouseNo(String fromWarehouseNo) {
        this.fromWarehouseNo = fromWarehouseNo;
    }

    public boolean isBoxFlag() {
        return boxFlag;
    }

    public void setBoxFlag(boolean boxFlag) {
        this.boxFlag = boxFlag;
    }

    public Boolean getUnFinished() {
        return unFinished;
    }

    public void setUnFinished(Boolean unFinished) {
        this.unFinished = unFinished;
    }

    public boolean isPopularFlag() {
        return popularFlag;
    }

    public void setPopularFlag(boolean popularFlag) {
        this.popularFlag = popularFlag;
    }

    public String getReceivingMethod() {
        return receivingMethod;
    }

    public void setReceivingMethod(String receivingMethod) {
        this.receivingMethod = receivingMethod;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public boolean isTcFlag() {
        return tcFlag;
    }

    public void setTcFlag(boolean tcFlag) {
        this.tcFlag = tcFlag;
    }

    public boolean isBackByContainer() {
        return backByContainer;
    }

    public void setBackByContainer(boolean backByContainer) {
        this.backByContainer = backByContainer;
    }

    public boolean isSnManager() {
        return snManager;
    }

    public void setSnManager(boolean snManager) {
        this.snManager = snManager;
    }

    public boolean isAssignLot() {
        return assignLot;
    }

    public void setAssignLot(boolean assignLot) {
        this.assignLot = assignLot;
    }


    public List<Integer> getTaskDIds() {
        return taskDIds;
    }

    public void setTaskDIds(List<Integer> taskDIds) {
        this.taskDIds = taskDIds;
    }

//    public IbReceivingTaskMB2bEx getIbReceivingTaskmB2BEx() {
//        return ibReceivingTaskmB2BEx;
//    }
//
//    public void setIbReceivingTaskmB2BEx(IbReceivingTaskMB2bEx ibReceivingTaskmB2BEx) {
//        this.ibReceivingTaskmB2BEx = ibReceivingTaskmB2BEx;
//    }

    public List<String> getBatchCodes() {
        return batchCodes;
    }

    public void setBatchCodes(List<String> batchCodes) {
        this.batchCodes = batchCodes;
    }

    public boolean isTcDetails() {
        return tcDetails;
    }

    public void setTcDetails(boolean tcDetails) {
        this.tcDetails = tcDetails;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getTransportWay() {
        return transportWay;
    }

    public void setTransportWay(String transportWay) {
        this.transportWay = transportWay;
    }

    public String getGoodsTemperature() {
        return goodsTemperature;
    }

    public void setGoodsTemperature(String goodsTemperature) {
        this.goodsTemperature = goodsTemperature;
    }

    public boolean isCanLessGoods() {
        return canLessGoods;
    }

    public void setCanLessGoods(boolean canLessGoods) {
        this.canLessGoods = canLessGoods;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }


    public Integer getIsCrossDockingBill() {
        return isCrossDockingBill;
    }

    public void setIsCrossDockingBill(Integer isCrossDockingBill) {
        this.isCrossDockingBill = isCrossDockingBill;
    }

    public boolean isFreshShortSafeFlag() {
        return freshShortSafeFlag;
    }

    public void setFreshShortSafeFlag(boolean freshShortSafeFlag) {
        this.freshShortSafeFlag = freshShortSafeFlag;
    }

    public boolean isAllowExceedReceiving() {
        return allowExceedReceiving;
    }

    public void setAllowExceedReceiving(boolean allowExceedReceiving) {
        this.allowExceedReceiving = allowExceedReceiving;
    }

    public String getIsBoxRemark() {
        return isBoxRemark;
    }

    public void setIsBoxRemark(String isBoxRemark) {
        this.isBoxRemark = isBoxRemark;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }

    public Integer getFreeFreight() {
        return freeFreight;
    }

    public void setFreeFreight(Integer freeFreight) {
        this.freeFreight = freeFreight;
    }

    public boolean isSkipStore() {
        return skipStore;
    }

    public void setSkipStore(boolean skipStore) {
        this.skipStore = skipStore;
    }

    public boolean getHasIsNoSale() {
        return hasIsNoSale;
    }

    public void setHasIsNoSale(boolean hasIsNoSale) {
        this.hasIsNoSale = hasIsNoSale;
    }

    public Integer getAppreciationServeStatus() {
        return appreciationServeStatus;
    }

    public void setAppreciationServeStatus(Integer appreciationServeStatus) {
        this.appreciationServeStatus = appreciationServeStatus;
    }

    public Integer getCollectTemperatureTag() {
        return collectTemperatureTag;
    }

    public void setCollectTemperatureTag(Integer collectTemperatureTag) {
        this.collectTemperatureTag = collectTemperatureTag;
    }

//    public List<IbAppreciationD> getIbAppreciationDList() {
//        return ibAppreciationDList;
//    }
//
//    public void setIbAppreciationDList(List<IbAppreciationD> ibAppreciationDList) {
//        this.ibAppreciationDList = ibAppreciationDList;
//    }
//
//    public List<IbAppreciationM> getIbAppreciationMList() {
//        return ibAppreciationMList;
//    }
//
//    public void setIbAppreciationMList(List<IbAppreciationM> ibAppreciationMList) {
//        this.ibAppreciationMList = ibAppreciationMList;
//    }

    public List<String> getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(List<String> productsCode) {
        this.productsCode = productsCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
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

    public boolean isTencentBoxRegulationsSerial() {
        return tencentBoxRegulationsSerial;
    }

    public void setTencentBoxRegulationsSerial(boolean tencentBoxRegulationsSerial) {
        this.tencentBoxRegulationsSerial = tencentBoxRegulationsSerial;
    }

    public boolean isTaotaoAppreciationServe() {
        return taotaoAppreciationServe;
    }

    public void setTaotaoAppreciationServe(boolean taotaoAppreciationServe) {
        this.taotaoAppreciationServe = taotaoAppreciationServe;
    }

    public boolean isTcDdb() {
        return tcDdb;
    }

    public void setTcDdb(boolean tcDdb) {
        this.tcDdb = tcDdb;
    }

    public Integer getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(Integer queueStatus) {
        this.queueStatus = queueStatus;
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

    public String getInboundQa() {
        return inboundQa;
    }

    public void setInboundQa(String inboundQa) {
        this.inboundQa = inboundQa;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    public Date getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(Date expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public boolean isTcPurchaseFlag() {
        return tcPurchaseFlag;
    }

    public void setTcPurchaseFlag(boolean tcPurchaseFlag) {
        this.tcPurchaseFlag = tcPurchaseFlag;
    }
    public boolean isMarkFlag() {
       return markFlag;
    }
    public void setMarkFlag(boolean markFlag) {
       this.markFlag = markFlag;
    }
	/**
     * 是否前置验货   0  否   1 是
	*/
	private Integer frontCheck;
	public Integer getFrontCheck() {
		return frontCheck;
	}
	public void setFrontCheck(Integer frontCheck) {
		this.frontCheck = frontCheck;
	}

//    public String getDocumentIdStr() {
//	    if (this.getDocumentId() == 1){
//	        this.setDocumentIdStr("B");
//        }
//	    if(this.getDocumentId() == 0 || this.getDocumentId() == null) {
//            this.setDocumentIdStr("C");
//        }
//        return documentIdStr;
//    }
//
//    public void setDocumentIdStr(String documentIdStr) {
//        this.documentIdStr = documentIdStr;
//    }

    /**
     * 下单人
     */
	private String buyer;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * 仓库名称
     */
    private String warHouseName;

    public String getWarHouseName() {
        return warHouseName;
    }

    public void setWarHouseName(String warHouseName) {
        this.warHouseName = warHouseName;
    }

    /**
     * 审核人
     */
    private String billPerson;

    public String getBillPerson() {
        return billPerson;
    }

    public void setBillPerson(String billPerson) {
        this.billPerson = billPerson;
    }

    public String getInboundRemark() {
        return inboundRemark;
    }

    public void setInboundRemark(String inboundRemark) {
        this.inboundRemark = inboundRemark;
    }


    public String getSellerSupplierNo() {
        return sellerSupplierNo;
    }


    public void setSellerSupplierNo(String sellerSupplierNo) {
        this.sellerSupplierNo = sellerSupplierNo;
    }

    public String getSellerAsnNo() {
        return sellerAsnNo;
    }

    public void setSellerAsnNo(String sellerAsnNo) {
        this.sellerAsnNo = sellerAsnNo;
    }

    public boolean isPlateFlag() {
        return plateFlag;
    }

    public void setPlateFlag(boolean plateFlag) {
        this.plateFlag = plateFlag;
    }

    public String getCheckModeForShow() {
        return checkModeForShow;
    }

    public void setCheckModeForShow(String checkModeForShow) {
        this.checkModeForShow = checkModeForShow;
    }

    public String getPackageCodes() {
        return packageCodes;
    }

    public void setPackageCodes(String packageCodes) {
        this.packageCodes = packageCodes;
    }

    public String getPreSellType() {
        return preSellType;
    }

    public void setPreSellType(String preSellType) {
        this.preSellType = preSellType;
    }
}