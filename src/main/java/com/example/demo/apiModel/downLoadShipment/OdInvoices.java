package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Calendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdInvoices {

	protected int cky2;
	protected String content;
	protected String drawer;
	protected int groupNo;
	protected int id;
	protected int jyn;
	protected int lockFlag;
	protected String orderId;
	protected int processStatus;
	protected int retryNum;
	protected int shipmentId;
	protected int storeid;
	protected int stu;
	protected String suffix;
	protected int types;
	protected Calendar updateDate;
	protected Calendar cDate;
	public int getCky2() {
		return cky2;
	}
	public void setCky2(int cky2) {
		this.cky2 = cky2;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDrawer() {
		return drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJyn() {
		return jyn;
	}
	public void setJyn(int jyn) {
		this.jyn = jyn;
	}
	public int getLockFlag() {
		return lockFlag;
	}
	public void setLockFlag(int lockFlag) {
		this.lockFlag = lockFlag;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}
	public int getRetryNum() {
		return retryNum;
	}
	public void setRetryNum(int retryNum) {
		this.retryNum = retryNum;
	}
	public int getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getStu() {
		return stu;
	}
	public void setStu(int stu) {
		this.stu = stu;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public int getTypes() {
		return types;
	}
	public void setTypes(int types) {
		this.types = types;
	}
	public Calendar getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}
	public Calendar getcDate() {
		return cDate;
	}
	public void setcDate(Calendar cDate) {
		this.cDate = cDate;
	}

	

}
