package com.example.demo.apiModel.caseInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 内配下传发货仓传输的箱子信息dto
 * @author zhangyonginfo
 *
 */
public class TransCaseInfoFromWms3 extends IbReceivingTaskM{

	/**箱子类型(见字典)*/
    private String caseType;

    /**内配类型(见字典)*/
    private String transType;
    
    /**箱子重量 + 商品重量*/
    private Double expectedWeight;
    
    /**箱子体积 + 商品体积*/
    private double caseVolume;
	
    /**耗材类型*/
    private String usedMaterial;
    
	/**箱号*/
	private String caseNo;
    
	/**箱子中商品信息*/
	private List<IbReceivingTaskD> ibReceivingTaskDs;
	private Integer caseRealQty;//实际箱数-一个箱号对应几个实物箱子
	private BigDecimal boxTotalQty;//内配箱内总箱子数

	//是否采集温度标识,1采集。
	private String collectTemperature;
	//渠道id
	private String channelId;
	private String profitLossId;//损益渠道
	private String channelType;//渠道标识

	public String getProfitLossId() {
		return profitLossId;
	}

	public void setProfitLossId(String profitLossId) {
		this.profitLossId = profitLossId;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}


	public String getCollectTemperature() {
		return collectTemperature;
	}

	public void setCollectTemperature(String collectTemperature) {
		this.collectTemperature = collectTemperature;
	}

	/**
	 * 包装类型
	 * 1：纸箱，2：缠膜，3：周装箱，4：托膜
	 */
	private Integer packType;

	/**
	 * 封签号
	 */
	private List<String> sealNos;

	public double getCaseVolume() {
		return caseVolume;
	}

	public void setCaseVolume(double caseVolume) {
		this.caseVolume = caseVolume;
	}

	public Double getExpectedWeight() {
		return expectedWeight;
	}

	public void setExpectedWeight(Double expectedWeight) {
		this.expectedWeight = expectedWeight;
	}

	public String getUsedMaterial() {
		return usedMaterial;
	}

	public void setUsedMaterial(String usedMaterial) {
		this.usedMaterial = usedMaterial;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public List<IbReceivingTaskD> getIbReceivingTaskDs() {
		return ibReceivingTaskDs;
	}

	public void setIbReceivingTaskDs(List<IbReceivingTaskD> ibReceivingTaskDs) {
		this.ibReceivingTaskDs = ibReceivingTaskDs;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Integer getCaseRealQty() {
		return caseRealQty;
	}

	public void setCaseRealQty(Integer caseRealQty) {
		this.caseRealQty = caseRealQty;
	}

	public BigDecimal getBoxTotalQty() {
		return boxTotalQty;
	}

	public void setBoxTotalQty(BigDecimal boxTotalQty) {
		this.boxTotalQty = boxTotalQty;
	}

	public Integer getPackType() {
		return packType;
}

	public void setPackType(Integer packType) {
		this.packType = packType;
	}

	public List<String> getSealNos() {
		return sealNos;
	}

	public void setSealNos(List<String> sealNos) {
		this.sealNos = sealNos;
	}
}
