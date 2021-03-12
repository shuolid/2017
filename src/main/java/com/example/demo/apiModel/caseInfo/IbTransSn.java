package com.example.demo.apiModel.caseInfo;

import java.util.Map;

/**
 * Created by
 * 序列号信息
 * @author zhangyonginfo
 * @DeteTime: 2012-8-14 下午06:29:03
 * @version: 1.0
 */
public class IbTransSn {

	/**ID*/
	private Integer id;
	/**序列号*/
	private String transSn;
	/**机构*/
	private String orgNo;
	/**机构名称*/
	private String orgName;
	/**配送中心编码*/
	private String distributeNo;
	/**仓库号*/
	private String warehouseNo;
	/**内部id*/
	private Integer caseDetailInnerId;
	/**原内配单号*/
    private String originalTransNo;
	/**入库单号*/
	private String inboundNo ;     
	/**箱号*/
	private String caseNo;
	/**货主编码*/
	private String ownerNo;
	/**货主名称*/
	private String ownerName;
	/**商品编号*/
	private String goodsNo;
	/**商品名称*/
	private String goodsName;
	/**状态*/
	 Integer optStatus;
	/**供应商编码*/
	private String supplierNo;
	/**创建时间*/
	private String createTime;
	/**创建人*/
	private String createUser;
	/**最后更新时间*/
	private String updateTime;
	/**最后更新用户*/
	private String updateUser;
	/**删除标识*/
	private String yn;
	
	private Map<String,Object> map;
    private String productLevel;//商品质量等级
	private String boxNo;//箱码
	public IbTransSn(){

	}
	public IbTransSn(String inboundNo, String orgNo, String distributeNo, String warehouseNo) {
		this.inboundNo = inboundNo;
		this.orgNo = orgNo;
		this.distributeNo = distributeNo;
		this.warehouseNo = warehouseNo;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTransSn() {
		return transSn;
	}
	public void setTransSn(String transSn) {
		this.transSn = transSn;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDistributeNo() {
		return distributeNo;
	}
	public void setDistributeNo(String distributeNo) {
		this.distributeNo = distributeNo;
	}
	public String getWarehouseNo() {
		return warehouseNo;
	}
	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}
	public Integer getCaseDetailInnerId() {
		return caseDetailInnerId;
	}
	public void setCaseDetailInnerId(Integer caseDetailInnerId) {
		this.caseDetailInnerId = caseDetailInnerId;
	}
	public String getOriginalTransNo() {
		return originalTransNo;
	}
	public void setOriginalTransNo(String originalTransNo) {
		this.originalTransNo = originalTransNo;
	}
	public String getInboundNo() {
		return inboundNo;
	}
	public void setInboundNo(String inboundNo) {
		this.inboundNo = inboundNo;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
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
	public Integer getOptStatus() {
		return optStatus;
	}
	public void setOptStatus(Integer optStatus) {
		this.optStatus = optStatus;
	}
	public String getSupplierNo() {
		return supplierNo;
	}
	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
	}

	public String getProductLevel() {
		return productLevel;
	}

	public void setProductLevel(String productLevel) {
		this.productLevel = productLevel;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}
}
