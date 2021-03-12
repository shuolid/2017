package com.example.demo.apiModel.caseInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 预检任务明细
 * User: liumingxi
 * Date: 12-6-18
 * Time: 下午4:37
 */
public class
IbReceivingTaskD extends AbstractWarehouseInfo implements InboundKey {

    // 自增主键
    private Integer id;
    // tc批次号
    private String batchCode;
    // 入库单号
    private String inboundNo;
    // 防重码(inbound_no    +inner_id)
    private String uuid;
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
    // 目的机构编号
    private String destOrgNo;
    // 目的机构名称
    private String destOrgName;
    // 目的配送中心编码
    private String destDistributeNo;
    // 目的库房编号
    private String destWarehouseNo;
    // 明细序号
    private Integer innerId;
    // 商品编码
    private String goodsNo;
    /**
     * 商品明细
     */
    private List<String> goodsNoList;

    // 商品名称
    private String goodsName;

    /**
     * 特殊属性前缀+商品名称
     */
    private String goodsNameForShow;

    /// <summary>
    /// 【套/高/危】
    /// </summary>
    public String goodsNamePrefix;
    /// <summary>
    /// 套、高、危 格式 详细
    /// 格式是 别名1  、 别名1...
    /// </summary>
    public String prefixDetail;

    // 商品名称（调用master接口获取商品名称 用于更新taskd）
    private String goodsNameForUpdate;
    // 商品条码
    private String goodsBarcode;
    // 商品类别编码
    private String goodsTypeNo;
    // 包装数量
    private Integer packingQty;
    // 包装单位
    private String packingUnit;
	// 单品数量
	private Integer oneCatSkuQuantity;
	// 多品数量
	private Integer mulCatSkuQuantity;
	// 采购数量
    private Double expectedQty;
    // 已验收数量
    private Double receivedQty;
    // 回冲的质检数量
    private Double accRealQaQty;
    // tc验收少量 临时变量
    private Double tcQty;

    //差异详情
    private String difDetail;

    //差异详情对应的号
    private String colValueStr;

    //打码量之和 临时变量
    private Integer printQtySum;
    private Integer lifeType;
    //更新前的已验收数量
    private Double oldReceivedQty;
    // 返库生产日期(退货、内配)
    private Date returnProductionDate;
    //到期日期
    private Date expirationDate;
    // 返库保质期(退货、内配)
    private Integer returnShelfLife;
    // 退货报损数量(退货)
    private Double returnLossQty;
    // 返库批号(退货、内配)
    private String lotNo;
    // 是否序列号(0否、1是)
    private Integer snFlag;
    // 是否保质期(0否、1是)
    private Integer lifeFlag;
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
    // 是否打码
    private Integer printBarcodeFlag;
    // 仓报价
    private Double unitPrice;
    // 定价
    private Double price;
    // 供应商编码
    private String supplierNo;
    // 供应商名称
    private String supplierName;
    // 原出口单号(客户订单、出备件库单)
    private String originalOutboundNo;
    // 是否高值(0否、1是)
    private Integer topFlag;
    // 目的配送中心名称
    private String destDistributeName;
    //图书当天已验收数
    private Double curDateQty;
    //模糊保质期标识
    private String shelfLifeVague;
    // 是否箱规管理
    private String isCarton;
    //是否药品 0-否  1-是
    private String isQa;
    //模糊保质期标识取服务器时间
    private Date serverDate;
    private String md5Value;//md5=机构号+配送中心号+库房号+单号+商品编码+商品等级

    private String md5ValueForUpdate;

    public Integer getInboundStatus() {
        return inboundStatus;
    }

    public void setInboundStatus(Integer inboundStatus) {
        this.inboundStatus = inboundStatus;
    }

    private Integer inboundStatus;
    /**
     * 单据标示（0：ISV，1：闪购，2：仓储服务，3：ECLP 6：全球购采购单）
     */
    private Integer eclpSign;// 用于eclp超量验收
    /**
     * 可超验量
     */
    private Double exceedQty;
    /***********药品类增加*************/
    // 药品不合格原因
    private String unQuaReason;
    // 药品抽检数量
    private String samplingQty;

    /*********** 亚一增加 ***********/
    private Double totalVolume;
    private Integer isPromotion;
    private Integer isSpecialShaped;
    private Integer isSmall;
    private Integer isBig;
    private String barCodeType;
    private Integer priority;
    private String palletizingStandard;//码盘要求
    private String palletizingSuggestion;//码盘建议
    private String palletizingSugCode;//码盘建议编码
    private String outWaveNo;//出库波次号
    private String sourceCellNo;//源仓下架储位、可能为空(智能搬仓加)
    private String outWaveNoWhere;//出库波次号
    private String level3;//商品的3级分类
    /*********** 亚一广州增加 ***********/
    private String destZone;//目的区域 储区
    /**
     * 目的储区的入库逻辑区:未持久化 只能用于计算过程使用
     */
    private String logicZone;
    // 默认拣选区
    private String defaultZone;
    // 商品band
    private String band;
    private String pluCode;
    private Integer lotManageFlag;
    /************* B业务 ****************/
    private String boxRule;//箱规名称
    private String plateRule;
    /*********** 亚一广州增加 ***********/
    private String productLevel;//商品质量等级
    private String productLevelName;//商品等级名称
    private List<String> productLevels;
    private String productLevelUpdate;
    /**
     * 原产地 全球购项目添加
     */
    private String producingarea;
    // master中当前sku的箱规列表
//    private List<BoxRuleDTO> boxRuleDTOList;
//    /*********** 亚一增加 ***********/
//    // master中当前sku的质量等级列表
//    private List<ProductLevelDTO> productLevelDTOList;
    //已质检数
    private BigDecimal realQaQty;
    //已拒收数
    private BigDecimal rejectQaQty;
    private String boxRuleCode;//箱规编码
    private BigDecimal boxQty;//箱子数量-箱规的箱数量
    private Integer isBox;//按照整箱验收还是按照零散验收
    private String medicineLot;//医药批号

    /**
     * 扩展属性value
     */
    private String boxRegulations;
    /**
     * 是否序列号清单管理 0:非清单管理 ,1:是清单管理 全检, 2:是清单管理 抽检
     */
    private Integer serialFlag;

    private boolean samplingIsCompleted;//序列号抽检 完成
    private boolean serialFlagChange2to1;//序列号抽检变全检
    private Integer sampledQty;//已抽检数
    /**
     * 是否新通路商品
     */
    private String masterIsDistribution;

    private boolean incompleteAble;//eclp可缺量
    private boolean excessAble;//eclp可超量
    private boolean assignLot;//eclp按指定的批属性值验收

    private String receivingMark;
    //是否配码箱
    private Integer isPMX;
    //批次验收量
    private double batchReceivedQty;

    //批次已拒收数
    private BigDecimal batchRejectQaQty;

    private String unitPackage;

    private boolean flowRebin;

    /**
     * 通用药品名称=4401
     */
    private String drugGenericName;

    //产品规格(药品)2589
    private String specification;

    //剂型(药品)4085
    private String formulation;

    //批准文号(药品)3885
    private String approvalNumber;

    //生产企业(药品)4402
    private String manufacturer;

    //品牌（药品）
    private String medicineBrand;

    /**
     * 组加工中心 指定批属性
     */
//    private List<CncLotAttrDTO> lotAttrDTOList;
//
//    private List<BsPackCodeMDTO> bsPackCodeMDTOList;//包装代码

    /**
     * 内部批次号
     */
    private String internalLotNo;

//    private IbReceivingTaskDB2bEx ibReceivingTaskDB2BEx;

    private String returnReasonNo;

    private String returnReasonName;

    private List<Integer> idList;


    /**
     * 商家商品编码
     */
    private String sellerGoodsNo;

    /**
     * vmi标识，"1"代表vmi商品，其他值（"0"、空串、null等）代表非vmi商品
     */
    private String vmiFlag;

    /**
     * vmi商品emg编码
     */
    private String emgSkuId;
    /**
     * 是否序列号全流程管理 1否2是
     */
    private Integer allSerial;

    /**
     * 是否重码商品
     */
    private boolean isDuplicateGoodsNo;

    /**
     * 是否是新品
     */
    private String newFlag;

    /**
     * 包装代码第4层的最大系数
     */
    private Integer packQty4;

    /**
     * 预计到货量除第4级最大系数后，向下取整的整数
     */
    private Integer packBoxQty4;

    /**
     * 预计到货量除第4级最大系数后，向下取整后的余数
     */
    private Integer packRemainderQty4;

    /**
     * 包装代码第5层的最大系数
     */
    private Integer packQty5;

    /**
     * 预计到货量除第5级最大系数后，向下取整的整数
     */
    private Integer packBoxQty5;

    /**
     * 预计到货量除第5级最大系数后，向下取整后的余数
     */
    private Integer packRemainderQty5;

    /**
     * 温层
     */
    private String storeProperty;

    /**
     * 箱规（包装代码）
     */
    private String boxPackageRule;

    /**
     * 采购量除以包装代码第四级箱规取到的箱数
     */
    private Integer boxPackageQty;

    /**
     * 包规（包装代码）
     */
    private String packageRule;


    /**
     * 是否支持扫描二维码信息获取到期日期,1-否，2-是
     */
    private String scanQrCode;

    //渠道id (add by qiaojie7)
    private String channelId;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 包装批号
     */
    private String isPackageBatch;

    private String isLot;

    private BigDecimal baseUnitNum;

    private String inBoundTip;

    public String getScanQrCode() {
        return scanQrCode;
    }

    public void setScanQrCode(String scanQrCode) {
        this.scanQrCode = scanQrCode;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public String getInternalLotNo() {
        return internalLotNo;
    }

    public void setInternalLotNo(String internalLotNo) {
        this.internalLotNo = internalLotNo;
    }

//    public List<BsPackCodeMDTO> getBsPackCodeMDTOList() {
//        return bsPackCodeMDTOList;
//    }
//
//    public void setBsPackCodeMDTOList(List<BsPackCodeMDTO> bsPackCodeMDTOList) {
//        this.bsPackCodeMDTOList = bsPackCodeMDTOList;
//    }

    public String getReturnReasonNo() {
        return returnReasonNo;
    }

    public void setReturnReasonNo(String returnReasonNo) {
        this.returnReasonNo = returnReasonNo;
    }

    public String getReturnReasonName() {
        return returnReasonName;
    }

    public void setReturnReasonName(String returnReasonName) {
        this.returnReasonName = returnReasonName;
    }


//    public IbReceivingTaskDB2bEx getIbReceivingTaskDB2BEx() {
//        return ibReceivingTaskDB2BEx;
//    }
//
//    public void setIbReceivingTaskDB2BEx(IbReceivingTaskDB2bEx ibReceivingTaskDB2BEx) {
//        this.ibReceivingTaskDB2BEx = ibReceivingTaskDB2BEx;
//    }

    /**
     * 防损签
     */
    private String fsq;


    public boolean isFlowRebin() {
        return flowRebin;
    }

    public void setFlowRebin(boolean flowRebin) {
        this.flowRebin = flowRebin;
    }

    public double getBatchReceivedQty() {
        return batchReceivedQty;
    }

    public void setBatchReceivedQty(double batchReceivedQty) {
        this.batchReceivedQty = batchReceivedQty;
    }

    public BigDecimal getBatchRejectQaQty() {
        return batchRejectQaQty;
    }

    public void setBatchRejectQaQty(BigDecimal batchRejectQaQty) {
        this.batchRejectQaQty = batchRejectQaQty;
    }


    // 标签数  taskm表中有，2b客退用于逆向退回包裹数
    private Integer labelQty;

    private boolean isShuttle;//是否shuttle
//    private IbReceivingTaskDExt taskDExt;
//
//    private List<IbReceivingTaskDExt> ibReceivingTaskDExts;

    //商家商品编码
    private String isvSkuId;
    //品牌
    private String brand;
    //款式
    private String fashionNo;
    //颜色
    private String color;
    //尺码
    private String size;

    private String productSeason;

    //件型（无印）
    private String sellerSizeDefinition;
    /**
     * 入库单提示
     */
    private String inboundTips;

    public String getProductSeason() {
        return productSeason;
    }

    public void setProductSeason(String productSeason) {
        this.productSeason = productSeason;
    }


    public String getIsvSkuId() {
        return isvSkuId;
    }

    public void setIsvSkuId(String isvSkuId) {
        this.isvSkuId = isvSkuId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFashionNo() {
        return fashionNo;
    }

    public void setFashionNo(String fashionNo) {
        this.fashionNo = fashionNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getSkipQty() {
        return skipQty;
    }

    public void setSkipQty(BigDecimal skipQty) {
        this.skipQty = skipQty;
    }

//    public List<IbReceivingTaskDExt> getIbReceivingTaskDExts() {
//        return ibReceivingTaskDExts;
//    }
//
//    public void setIbReceivingTaskDExts(List<IbReceivingTaskDExt> ibReceivingTaskDExts) {
//        this.ibReceivingTaskDExts = ibReceivingTaskDExts;
//    }
//
//    public IbReceivingTaskDExt getTaskDExt() {
//        return taskDExt;
//    }
//
//    public void setTaskDExt(IbReceivingTaskDExt taskDExt) {
//        this.taskDExt = taskDExt;
//    }

    public Integer getLabelQty() {
        return labelQty;
    }

    public void setLabelQty(Integer labelQty) {
        this.labelQty = labelQty;
    }


    /**
     * 是否可越库（0：否，1：是内配越库，2：小区乐越库）
     */
    private Integer isCrossDocking;

    /**
     * 内配越库返回的唯一标识，用来释放预占使用
     */
    private String uniqueId;


    //TC箱号
    private String caseNo;
    //TC板号
    private String boardCode;
    //TC箱最晚上架时间
    private Date putawayTime;
    //TC优先上架时间阈值
    private int tcPrecedenceThresholds;
    /**
     * 越库数量
     */
    private BigDecimal skipQty;

    //商家单号
    private String sellerRtwNo;

    //合并单号
    private String mergeAsnNo;

    public String getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(String boardCode) {
        this.boardCode = boardCode;
    }

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public int getTcPrecedenceThresholds() {
        return tcPrecedenceThresholds;
    }

    public void setTcPrecedenceThresholds(int tcPrecedenceThresholds) {
        this.tcPrecedenceThresholds = tcPrecedenceThresholds;
    }

    private Integer sytm;//溯源贴码

    public Integer getSytm() {
        return sytm;
    }

    public void setSytm(Integer sytm) {
        this.sytm = sytm;
    }

    //医药TOB客退验收任务明细扩展信息
//    private List<IbReceivingTaskDB2bEx> ibReceivingTaskDB2BExes;

    private String issupplier;

    private String wms2Buuid;

    private Double goodsTotalPrice;

    private Double goodsUnitPrice;

    //1医药
    private Integer isMedicine;

//    private List<IbReceivingTaskDB2bEx> taskdB2BExList;

    //计量单位
    private String saleUnit;

    private String snJfsUrl;

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getSellerRtwNo() {
        return sellerRtwNo;
    }

    public void setSellerRtwNo(String sellerRtwNo) {
        this.sellerRtwNo = sellerRtwNo;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getMergeAsnNo() {
        return mergeAsnNo;
    }

    public void setMergeAsnNo(String mergeAsnNo) {
        this.mergeAsnNo = mergeAsnNo;
    }


    public boolean getIsShuttle() {
        return isShuttle;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getIsMedicine() {
        return isMedicine;
    }

    public void setIsMedicine(Integer isMedicine) {
        this.isMedicine = isMedicine;
    }

    public Double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(Double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public Double getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(Double goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    public String getWms2Buuid() {
        return wms2Buuid;
    }

    public void setWms2Buuid(String wms2Buuid) {
        this.wms2Buuid = wms2Buuid;
    }

    public String getSourceCellNo() {
        return sourceCellNo;
    }

    public void setSourceCellNo(String sourceCellNo) {
        this.sourceCellNo = sourceCellNo;
    }

    public boolean getSamplingIsCompleted() {
        return samplingIsCompleted;
    }

    public void setSamplingIsCompleted(boolean samplingIsCompleted) {
        this.samplingIsCompleted = samplingIsCompleted;
    }

    public boolean getSerialFlagChange2to1() {
        return serialFlagChange2to1;
    }

    public void setSerialFlagChange2to1(boolean serialFlagChange2to1) {
        this.serialFlagChange2to1 = serialFlagChange2to1;
    }

    public Integer getSampledQty() {
        return sampledQty;
    }

    public void setSampledQty(Integer sampledQty) {
        this.sampledQty = sampledQty;
    }

    public boolean getAssignLot() {
        return assignLot;
    }

    public void setAssignLot(boolean assignLot) {
        this.assignLot = assignLot;
    }

    public boolean getExcessAble() {
        return excessAble;
    }

    public void setExcessAble(boolean excessAble) {
        this.excessAble = excessAble;
    }

    public boolean getIncompleteAble() {
        return incompleteAble;
    }

    public void setIncompleteAble(boolean incompleteAble) {
        this.incompleteAble = incompleteAble;
    }

    public String getReceivingMark() {
        return receivingMark;
    }

    public void setReceivingMark(String receivingMark) {
        this.receivingMark = receivingMark;
    }

    public Integer getIsPMX() {
        return isPMX;
    }

    public void setIsPMX(Integer isPMX) {
        this.isPMX = isPMX;
    }

    public Double getTcQty() {
        return tcQty;
    }

    public void setTcQty(Double tcQty) {
        this.tcQty = tcQty;
    }

    public Integer getPrintQtySum() {
        return printQtySum;
    }

    public void setPrintQtySum(Integer printQtySum) {
        this.printQtySum = printQtySum;
    }

    public String getIsQa() {
        return isQa;
    }

    public void setIsQa(String isQa) {
        this.isQa = isQa;
    }

    public String getIsCarton() {
        return isCarton;
    }

    public void setIsCarton(String isCarton) {
        this.isCarton = isCarton;
    }

    public Integer getEclpSign() {
        return eclpSign;
    }

    public void setEclpSign(Integer eclpSign) {
        this.eclpSign = eclpSign;
    }

    public Double getExceedQty() {
        return exceedQty;
    }

    public void setExceedQty(Double exceedQty) {
        this.exceedQty = exceedQty;
    }

    public String getPluCode() {
        return pluCode;
    }

    public void setPluCode(String pluCode) {
        this.pluCode = pluCode;
    }

    /**
     * fdc 退回内配增加
     *
     * @return
     */
    private Integer adeventDay;//临期

    public Integer getAdeventDay() {
        return adeventDay;
    }

    public void setAdeventDay(Integer adeventDay) {
        this.adeventDay = adeventDay;
    }

//    public List<BoxRuleDTO> getBoxRuleDTOList() {
//        return boxRuleDTOList;
//    }
//
//    public void setBoxRuleDTOList(List<BoxRuleDTO> boxRuleDTOList) {
//        this.boxRuleDTOList = boxRuleDTOList;
//    }
//
//    public List<ProductLevelDTO> getProductLevelDTOList() {
//        return productLevelDTOList;
//    }
//
//    public void setProductLevelDTOList(List<ProductLevelDTO> productLevelDTOList) {
//        this.productLevelDTOList = productLevelDTOList;
//    }

    public String getDifDetail() {
        return difDetail;
    }

    public void setDifDetail(String difDetail) {
        this.difDetail = difDetail;
    }

    public String getColValueStr() {
        return colValueStr;
    }

    public void setColValueStr(String colValueStr) {
        this.colValueStr = colValueStr;
    }

    public String getMasterIsDistribution() {
        return masterIsDistribution;
    }

    public void setMasterIsDistribution(String masterIsDistribution) {
        this.masterIsDistribution = masterIsDistribution;
    }

    public String getProducingarea() {
        return producingarea;
    }

    public void setProducingarea(String producingarea) {
        this.producingarea = producingarea;
    }

    public Double getCurDateQty() {
        return curDateQty;
    }

    public void setCurDateQty(Double curDateQty) {
        this.curDateQty = curDateQty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getDestOrgNo() {
        return destOrgNo;
    }

    public void setDestOrgNo(String destOrgNo) {
        this.destOrgNo = destOrgNo;
    }

    public String getDestOrgName() {
        return destOrgName;
    }

    public void setDestOrgName(String destOrgName) {
        this.destOrgName = destOrgName;
    }

    public String getDestDistributeNo() {
        return destDistributeNo;
    }

    public void setDestDistributeNo(String destDistributeNo) {
        this.destDistributeNo = destDistributeNo;
    }

    public String getDestWarehouseNo() {
        return destWarehouseNo;
    }

    public void setDestWarehouseNo(String destWarehouseNo) {
        this.destWarehouseNo = destWarehouseNo;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsBarcode() {
        return goodsBarcode;
    }

    public void setGoodsBarcode(String goodsBarcode) {
        this.goodsBarcode = goodsBarcode;
    }

    public String getGoodsTypeNo() {
        return goodsTypeNo;
    }

    public void setGoodsTypeNo(String goodsTypeNo) {
        this.goodsTypeNo = goodsTypeNo;
    }

    public Integer getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(Integer packingQty) {
        this.packingQty = packingQty;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

	public Integer getOneCatSkuQuantity() {
		return oneCatSkuQuantity;
	}

	public void setOneCatSkuQuantity(Integer oneCatSkuQuantity) {
		this.oneCatSkuQuantity = oneCatSkuQuantity;
	}

	public Integer getMulCatSkuQuantity() {
		return mulCatSkuQuantity;
	}

	public void setMulCatSkuQuantity(Integer mulCatSkuQuantity) {
		this.mulCatSkuQuantity = mulCatSkuQuantity;
	}

	public Double getExpectedQty() {
		return expectedQty;
	}

    public void setExpectedQty(Double expectedQty) {
        this.expectedQty = expectedQty;
    }

    public Double getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Double receivedQty) {
        this.receivedQty = receivedQty;
    }

    public Date getReturnProductionDate() {
        return returnProductionDate;
    }

    public void setReturnProductionDate(Date returnProductionDate) {
        this.returnProductionDate = returnProductionDate;
    }

    public Integer getReturnShelfLife() {
        return returnShelfLife;
    }

    public void setReturnShelfLife(Integer returnShelfLife) {
        this.returnShelfLife = returnShelfLife;
    }

    public Double getReturnLossQty() {
        return returnLossQty;
    }

    public void setReturnLossQty(Double returnLossQty) {
        this.returnLossQty = returnLossQty;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public Integer getSnFlag() {
        return snFlag;
    }

    public void setSnFlag(Integer snFlag) {
        this.snFlag = snFlag;
    }

    public Integer getLifeFlag() {
        return lifeFlag;
    }

    public void setLifeFlag(Integer lifeFlag) {
        this.lifeFlag = lifeFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getPrintBarcodeFlag() {
        return printBarcodeFlag;
    }

    public void setPrintBarcodeFlag(Integer printBarcodeFlag) {
        this.printBarcodeFlag = printBarcodeFlag;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getOriginalOutboundNo() {
        return originalOutboundNo;
    }

    public void setOriginalOutboundNo(String originalOutboundNo) {
        this.originalOutboundNo = originalOutboundNo;
    }

    public Integer getTopFlag() {
        return topFlag;
    }

    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }

    public String getDestDistributeName() {
        return destDistributeName;
    }

    public void setDestDistributeName(String destDistributeName) {
        this.destDistributeName = destDistributeName;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getPalletizingStandard() {
        return palletizingStandard;
    }

    public void setPalletizingStandard(String palletizingStandard) {
        this.palletizingStandard = palletizingStandard;
    }

    public String getPalletizingSuggestion() {
        return palletizingSuggestion;
    }

    public void setPalletizingSuggestion(String palletizingSuggestion) {
        this.palletizingSuggestion = palletizingSuggestion;
    }

    public String getPalletizingSugCode() {
        return palletizingSugCode;
    }

    public void setPalletizingSugCode(String palletizingSugCode) {
        this.palletizingSugCode = palletizingSugCode;
    }

    public String getOutWaveNo() {
        return outWaveNo;
    }

    public void setOutWaveNo(String outWaveNo) {
        this.outWaveNo = outWaveNo;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getDestZone() {
        return destZone;
    }

    public void setDestZone(String destZone) {
        this.destZone = destZone;
    }

    public String getDefaultZone() {
        return defaultZone;
    }

    public void setDefaultZone(String defaultZone) {
        this.defaultZone = defaultZone;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBarCodeType() {
        return barCodeType;
    }

    public void setBarCodeType(String barCodeType) {
        this.barCodeType = barCodeType;
    }

    public Integer getLotManageFlag() {
        if (null == lotManageFlag) {
            return 0;
        }
        return lotManageFlag;
    }

    public void setLotManageFlag(Integer lotManageFlag) {
        this.lotManageFlag = lotManageFlag;
    }

    public Integer getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(Integer isPromotion) {
        this.isPromotion = isPromotion;
    }

    public Integer getIsSpecialShaped() {
        return isSpecialShaped;
    }

    public void setIsSpecialShaped(Integer isSpecialShaped) {
        this.isSpecialShaped = isSpecialShaped;
    }

    public Integer getIsSmall() {
        return isSmall;
    }

    public void setIsSmall(Integer isSmall) {
        this.isSmall = isSmall;
    }

    public Integer getIsBig() {
        return isBig;
    }

    public void setIsBig(Integer isBig) {
        this.isBig = isBig;
    }

    public Double getOldReceivedQty() {
        return oldReceivedQty;
    }

    public void setOldReceivedQty(Double oldReceivedQty) {
        this.oldReceivedQty = oldReceivedQty;
    }

    //模糊保质期标识
    public String getShelfLifeVague() {
        return shelfLifeVague;
    }

    public void setShelfLifeVague(String shelfLifeVague) {
        this.shelfLifeVague = shelfLifeVague;
    }

    public Date getServerDate() {
        return new Date();
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = new Date();
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }


    public String getBoxRule() {
        return boxRule;
    }

    public void setBoxRule(String boxRule) {
        this.boxRule = boxRule;
    }

    public String getPlateRule() {
        return plateRule;
    }

    public void setPlateRule(String plateRule) {
        this.plateRule = plateRule;
    }

    public String getMd5Value() {
        return md5Value;
    }

    public void setMd5Value(String md5Value) {
        this.md5Value = md5Value;
    }

    public BigDecimal getRealQaQty() {
        return realQaQty;
    }

    public void setRealQaQty(BigDecimal realQaQty) {
        this.realQaQty = realQaQty;
    }

    public BigDecimal getRejectQaQty() {
        return rejectQaQty;
    }

    public void setRejectQaQty(BigDecimal rejectQaQty) {
        this.rejectQaQty = rejectQaQty;
    }

    public String getBoxRuleCode() {
        return boxRuleCode;
    }

    public void setBoxRuleCode(String boxRuleCode) {
        this.boxRuleCode = boxRuleCode;
    }

    public BigDecimal getBoxQty() {
        return boxQty;
    }

    public void setBoxQty(BigDecimal boxQty) {
        this.boxQty = boxQty;
    }

    public Integer getIsBox() {
        return isBox;
    }

    public void setIsBox(Integer isBox) {
        this.isBox = isBox;
    }

    public String getMedicineLot() {
        return medicineLot;
    }

    public void setMedicineLot(String medicineLot) {
        this.medicineLot = medicineLot;
    }

    public String getProductLevelName() {
        return productLevelName;
    }

    public void setProductLevelName(String productLevelName) {
        this.productLevelName = productLevelName;
    }

    public List<String> getProductLevels() {
        return productLevels;
    }

    public void setProductLevels(List<String> productLevels) {
        this.productLevels = productLevels;
    }

    public Integer getLifeType() {
        return lifeType;
    }

    public void setLifeType(Integer lifeType) {
        this.lifeType = lifeType;
    }

    public Double getAccRealQaQty() {
        return accRealQaQty;
    }

    public void setAccRealQaQty(Double accRealQaQty) {
        this.accRealQaQty = accRealQaQty;
    }

    public String getGoodsNameForUpdate() {
        return goodsNameForUpdate;
    }

    public void setGoodsNameForUpdate(String goodsNameForUpdate) {
        this.goodsNameForUpdate = goodsNameForUpdate;
    }

    public String getMd5ValueForUpdate() {
        return md5ValueForUpdate;
    }

    public void setMd5ValueForUpdate(String md5ValueForUpdate) {
        this.md5ValueForUpdate = md5ValueForUpdate;
    }

    public Integer getSerialFlag() {
        return serialFlag;
    }

    public void setSerialFlag(Integer serialFlag) {
        this.serialFlag = serialFlag;
    }

    public String getPrefixDetail() {
        return prefixDetail;
    }

    public void setPrefixDetail(String prefixDetail) {
        this.prefixDetail = prefixDetail;
    }

    public String getGoodsNamePrefix() {
        return null == prefixDetail ? "" : ("【" + (prefixDetail.length() > 5 ? prefixDetail.replaceAll("、", "/").substring(0, 5) :
                prefixDetail.replaceAll("、", "/")) + "】");
    }

    public void setGoodsNamePrefix(String goodsNameWithPrefix) {
        this.goodsNamePrefix = goodsNameWithPrefix;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getUnQuaReason() {
        return unQuaReason;
    }

    public void setUnQuaReason(String unQuaReason) {
        this.unQuaReason = unQuaReason;
    }

    public String getSamplingQty() {
        return samplingQty;
    }

    public void setSamplingQty(String samplingQty) {
        this.samplingQty = samplingQty;
    }

    public String getProductLevelUpdate() {
        return productLevelUpdate;
    }

    public void setProductLevelUpdate(String productLevelUpdate) {
        this.productLevelUpdate = productLevelUpdate;
    }

    public String getOutWaveNoWhere() {
        return outWaveNoWhere;
    }

    public void setOutWaveNoWhere(String outWaveNoWhere) {
        this.outWaveNoWhere = outWaveNoWhere;
    }

    public String getLogicZone() {
        return logicZone;
    }

    public void setLogicZone(String logicZone) {
        this.logicZone = logicZone;
    }

    public Integer getIsCrossDocking() {
        return isCrossDocking;
    }

    public void setIsCrossDocking(Integer isCrossDocking) {
        this.isCrossDocking = isCrossDocking;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUnitPackage() {
        return unitPackage;
    }

    public void setUnitPackage(String unitPackage) {
        this.unitPackage = unitPackage;
    }

//    public List<CncLotAttrDTO> getLotAttrDTOList() {
//        return lotAttrDTOList;
//    }
//
//    public void setLotAttrDTOList(List<CncLotAttrDTO> lotAttrDTOList) {
//        this.lotAttrDTOList = lotAttrDTOList;
//    }
//
//    public List<IbReceivingTaskDB2bEx> getIbReceivingTaskDB2BExes() {
//        return ibReceivingTaskDB2BExes;
//    }
//
//    public void setIbReceivingTaskDB2BExes(List<IbReceivingTaskDB2bEx> ibReceivingTaskDB2BExes) {
//        this.ibReceivingTaskDB2BExes = ibReceivingTaskDB2BExes;
//    }

    public String getIssupplier() {
        return issupplier;
    }

    public void setIssupplier(String issupplier) {
        this.issupplier = issupplier;
    }

//    public List<IbReceivingTaskDB2bEx> getTaskdB2BExList() {
//        return taskdB2BExList;
//    }
//
//    public void setTaskdB2BExList(List<IbReceivingTaskDB2bEx> taskdB2BExList) {
//        this.taskdB2BExList = taskdB2BExList;
//    }

    public String getMedicineBrand() {
        return medicineBrand;
    }

    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }

    public String getDrugGenericName() {
        return drugGenericName;
    }

    public void setDrugGenericName(String drugGenericName) {
        this.drugGenericName = drugGenericName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public String getSellerGoodsNo() {
        return sellerGoodsNo;
    }

    public void setSellerGoodsNo(String sellerGoodsNo) {
        this.sellerGoodsNo = sellerGoodsNo;
    }

    public String getVmiFlag() {
        return vmiFlag;
    }

    public void setVmiFlag(String vmiFlag) {
        this.vmiFlag = vmiFlag;
    }

    public String getEmgSkuId() {
        return emgSkuId;
    }

    public void setEmgSkuId(String emgSkuId) {
        this.emgSkuId = emgSkuId;
    }

    public String getGoodsNameForShow() {
        return goodsNameForShow;
    }

    public void setGoodsNameForShow(String goodsNameForShow) {
        this.goodsNameForShow = goodsNameForShow;
    }

    public String getFsq() {
        return fsq;
    }

    public void setFsq(String fsq) {
        this.fsq = fsq;
    }

    public boolean isDuplicateGoodsNo() {
        return isDuplicateGoodsNo;
    }

    public void setDuplicateGoodsNo(boolean duplicateGoodsNo) {
        isDuplicateGoodsNo = duplicateGoodsNo;
    }

    public String getNewFlag() {
        return newFlag;
    }

    public void setNewFlag(String newFlag) {
        this.newFlag = newFlag;
    }

    public Integer getPackQty4() {
        return packQty4;
    }

    public void setPackQty4(Integer packQty4) {
        this.packQty4 = packQty4;
    }

    public Integer getPackBoxQty4() {
        return packBoxQty4;
    }

    public void setPackBoxQty4(Integer packBoxQty4) {
        this.packBoxQty4 = packBoxQty4;
    }

    public Integer getPackRemainderQty4() {
        return packRemainderQty4;
    }

    public void setPackRemainderQty4(Integer packRemainderQty4) {
        this.packRemainderQty4 = packRemainderQty4;
    }

    public Integer getPackQty5() {
        return packQty5;
    }

    public void setPackQty5(Integer packQty5) {
        this.packQty5 = packQty5;
    }

    public Integer getPackBoxQty5() {
        return packBoxQty5;
    }

    public void setPackBoxQty5(Integer packBoxQty5) {
        this.packBoxQty5 = packBoxQty5;
    }

    public Integer getPackRemainderQty5() {
        return packRemainderQty5;
    }

    public void setPackRemainderQty5(Integer packRemainderQty5) {
        this.packRemainderQty5 = packRemainderQty5;
    }

    public String getStoreProperty() {
        return storeProperty;
    }

    public void setStoreProperty(String storeProperty) {
        this.storeProperty = storeProperty;
    }



    public String getBoxPackageRule() {
        return boxPackageRule;
    }

    public void setBoxPackageRule(String boxPackageRule) {
        this.boxPackageRule = boxPackageRule;
    }

    public String getPackageRule() {
        return packageRule;
    }

    public void setPackageRule(String packageRule) {
        this.packageRule = packageRule;
    }

    public Integer getAllSerial() {
        return allSerial;
    }

    public void setAllSerial(Integer allSerial) {
        this.allSerial = allSerial;
	}
    /**
     * receiveNum	Integer	    是否必填  ：是  	TC验收数量
     */
    private Integer receiveNum;

    public Integer getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Integer receiveNum) {
        this.receiveNum = receiveNum;
    }

    public String getIsPackageBatch() {
        return isPackageBatch;
    }

    public void setIsPackageBatch(String isPackageBatch) {
        this.isPackageBatch = isPackageBatch;
    }

    public String getIsLot() {
        return isLot;
    }

    public void setIsLot(String isLot) {
        this.isLot = isLot;
    }

    public String getSellerSizeDefinition() {
        return sellerSizeDefinition;
    }

    public void setSellerSizeDefinition(String sellerSizeDefinition) {
        this.sellerSizeDefinition = sellerSizeDefinition;
    }

    public Integer getBoxPackageQty() {
        return boxPackageQty;
    }

    public void setBoxPackageQty(Integer boxPackageQty) {
        this.boxPackageQty = boxPackageQty;
	}




    public BigDecimal getBaseUnitNum() {
        return baseUnitNum;
    }

    public void setBaseUnitNum(BigDecimal baseUnitNum) {
        this.baseUnitNum = baseUnitNum;
    }

    public String getSnJfsUrl() {
        return snJfsUrl;
    }

    public void setSnJfsUrl(String snJfsUrl) {
        this.snJfsUrl = snJfsUrl;
    }

    public List<String> getGoodsNoList() {
        return goodsNoList;
    }

    public void setGoodsNoList(List<String> goodsNoList) {
        this.goodsNoList = goodsNoList;
    }

    public String getInboundTips() {
        return inboundTips;
    }

    public void setInboundTips(String inboundTips) {
        this.inboundTips = inboundTips;
    }

    public String getInBoundTip() {
        return inBoundTip;
    }

    public void setInBoundTip(String inBoundTip) {
        this.inBoundTip = inBoundTip;
    }

    public void setBoxRegulations(String boxRegulations) {
        this.boxRegulations = boxRegulations;
    }

    public String getBoxRegulations() {
        return boxRegulations;
    }

    @Override
    public String toString() {
        return "IbReceivingTaskD{" +
                "id=" + id +
                ", batchCode='" + batchCode + '\'' +
                ", inboundNo='" + inboundNo + '\'' +
                ", uuid='" + uuid + '\'' +
                ", ownerNo='" + ownerNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", orgNo='" + orgNo + '\'' +
                ", orgName='" + orgName + '\'' +
                ", distributeNo='" + distributeNo + '\'' +
                ", warehouseNo='" + warehouseNo + '\'' +
                ", destOrgNo='" + destOrgNo + '\'' +
                ", destOrgName='" + destOrgName + '\'' +
                ", destDistributeNo='" + destDistributeNo + '\'' +
                ", destWarehouseNo='" + destWarehouseNo + '\'' +
                ", innerId=" + innerId +
                ", goodsNo='" + goodsNo + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsNameForShow='" + goodsNameForShow + '\'' +
                ", goodsNamePrefix='" + goodsNamePrefix + '\'' +
                ", prefixDetail='" + prefixDetail + '\'' +
                ", goodsNameForUpdate='" + goodsNameForUpdate + '\'' +
                ", goodsBarcode='" + goodsBarcode + '\'' +
                ", goodsTypeNo='" + goodsTypeNo + '\'' +
                ", packingQty=" + packingQty +
                ", packingUnit='" + packingUnit + '\'' +
                ", expectedQty=" + expectedQty +
                ", receivedQty=" + receivedQty +
                ", accRealQaQty=" + accRealQaQty +
                ", tcQty=" + tcQty +
                ", difDetail='" + difDetail + '\'' +
                ", colValueStr='" + colValueStr + '\'' +
                ", printQtySum=" + printQtySum +
                ", lifeType=" + lifeType +
                ", oldReceivedQty=" + oldReceivedQty +
                ", returnProductionDate=" + returnProductionDate +
                ", expirationDate=" + expirationDate +
                ", returnShelfLife=" + returnShelfLife +
                ", returnLossQty=" + returnLossQty +
                ", lotNo='" + lotNo + '\'' +
                ", snFlag=" + snFlag +
                ", lifeFlag=" + lifeFlag +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                ", yn=" + yn +
                ", printBarcodeFlag=" + printBarcodeFlag +
                ", unitPrice=" + unitPrice +
                ", price=" + price +
                ", supplierNo='" + supplierNo + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", originalOutboundNo='" + originalOutboundNo + '\'' +
                ", topFlag=" + topFlag +
                ", destDistributeName='" + destDistributeName + '\'' +
                ", curDateQty=" + curDateQty +
                ", shelfLifeVague='" + shelfLifeVague + '\'' +
                ", isCarton='" + isCarton + '\'' +
                ", isQa='" + isQa + '\'' +
                ", serverDate=" + serverDate +
                ", md5Value='" + md5Value + '\'' +
                ", md5ValueForUpdate='" + md5ValueForUpdate + '\'' +
                ", inboundStatus=" + inboundStatus +
                ", eclpSign=" + eclpSign +
                ", exceedQty=" + exceedQty +
                ", unQuaReason='" + unQuaReason + '\'' +
                ", samplingQty='" + samplingQty + '\'' +
                ", totalVolume=" + totalVolume +
                ", isPromotion=" + isPromotion +
                ", isSpecialShaped=" + isSpecialShaped +
                ", isSmall=" + isSmall +
                ", isBig=" + isBig +
                ", barCodeType='" + barCodeType + '\'' +
                ", priority=" + priority +
                ", palletizingStandard='" + palletizingStandard + '\'' +
                ", palletizingSuggestion='" + palletizingSuggestion + '\'' +
                ", palletizingSugCode='" + palletizingSugCode + '\'' +
                ", outWaveNo='" + outWaveNo + '\'' +
                ", sourceCellNo='" + sourceCellNo + '\'' +
                ", outWaveNoWhere='" + outWaveNoWhere + '\'' +
                ", level3='" + level3 + '\'' +
                ", destZone='" + destZone + '\'' +
                ", logicZone='" + logicZone + '\'' +
                ", defaultZone='" + defaultZone + '\'' +
                ", band='" + band + '\'' +
                ", pluCode='" + pluCode + '\'' +
                ", lotManageFlag=" + lotManageFlag +
                ", boxRule='" + boxRule + '\'' +
                ", plateRule='" + plateRule + '\'' +
                ", productLevel='" + productLevel + '\'' +
                ", productLevelName='" + productLevelName + '\'' +
                ", productLevels=" + productLevels +
                ", productLevelUpdate='" + productLevelUpdate + '\'' +
                ", producingarea='" + producingarea + '\'' +
//                ", boxRuleDTOList=" + boxRuleDTOList +
//                ", productLevelDTOList=" + productLevelDTOList +
                ", realQaQty=" + realQaQty +
                ", rejectQaQty=" + rejectQaQty +
                ", boxRuleCode='" + boxRuleCode + '\'' +
                ", boxQty=" + boxQty +
                ", isBox=" + isBox +
                ", medicineLot='" + medicineLot + '\'' +
                ", serialFlag=" + serialFlag +
                ", samplingIsCompleted=" + samplingIsCompleted +
                ", serialFlagChange2to1=" + serialFlagChange2to1 +
                ", sampledQty=" + sampledQty +
                ", masterIsDistribution='" + masterIsDistribution + '\'' +
                ", incompleteAble=" + incompleteAble +
                ", excessAble=" + excessAble +
                ", assignLot=" + assignLot +
                ", receivingMark='" + receivingMark + '\'' +
                ", isPMX=" + isPMX +
                ", batchReceivedQty=" + batchReceivedQty +
                ", batchRejectQaQty=" + batchRejectQaQty +
                ", unitPackage='" + unitPackage + '\'' +
                ", flowRebin=" + flowRebin +
                ", specification='" + specification + '\'' +
                ", formulation='" + formulation + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", medicineBrand='" + medicineBrand + '\'' +
//                ", lotAttrDTOList=" + lotAttrDTOList +
//                ", bsPackCodeMDTOList=" + bsPackCodeMDTOList +
                ", internalLotNo='" + internalLotNo + '\'' +
//                ", ibReceivingTaskDB2BEx=" + ibReceivingTaskDB2BEx +
                ", returnReasonNo='" + returnReasonNo + '\'' +
                ", returnReasonName='" + returnReasonName + '\'' +
                ", idList=" + idList +
                ", sellerGoodsNo='" + sellerGoodsNo + '\'' +
                ", vmiFlag='" + vmiFlag + '\'' +
                ", emgSkuId='" + emgSkuId + '\'' +
                ", labelQty=" + labelQty +
                ", isShuttle=" + isShuttle +
//                ", taskDExt=" + taskDExt +
//                ", ibReceivingTaskDExts=" + ibReceivingTaskDExts +
                ", isvSkuId='" + isvSkuId + '\'' +
                ", brand='" + brand + '\'' +
                ", fashionNo='" + fashionNo + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", productSeason='" + productSeason + '\'' +
                ", isCrossDocking=" + isCrossDocking +
                ", uniqueId='" + uniqueId + '\'' +
                ", caseNo='" + caseNo + '\'' +
                ", boardCode='" + boardCode + '\'' +
                ", putawayTime=" + putawayTime +
                ", tcPrecedenceThresholds=" + tcPrecedenceThresholds +
                ", skipQty=" + skipQty +
                ", sellerRtwNo='" + sellerRtwNo + '\'' +
                ", mergeAsnNo='" + mergeAsnNo + '\'' +
                ", sytm=" + sytm +
//                ", ibReceivingTaskDB2BExes=" + ibReceivingTaskDB2BExes +
                ", issupplier='" + issupplier + '\'' +
                ", wms2Buuid='" + wms2Buuid + '\'' +
                ", goodsTotalPrice=" + goodsTotalPrice +
                ", goodsUnitPrice=" + goodsUnitPrice +
                ", isMedicine=" + isMedicine +
//                ", taskdB2BExList=" + taskdB2BExList +
                ", saleUnit='" + saleUnit + '\'' +
                ", adeventDay=" + adeventDay +
                '}';
    }
}