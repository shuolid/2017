package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdPrintInfo {

	protected int cky2;
	protected int id;
	protected String invoiceDetail;
	protected String orderid;
	protected String printInfo;
	protected int type;

	public int getCky2() {
		return cky2;
	}

	public void setCky2(int cky2) {
		this.cky2 = cky2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvoiceDetail() {
		return invoiceDetail;
	}

	public void setInvoiceDetail(String invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getPrintInfo() {
		return printInfo;
	}

	public void setPrintInfo(String printInfo) {
		this.printInfo = printInfo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
