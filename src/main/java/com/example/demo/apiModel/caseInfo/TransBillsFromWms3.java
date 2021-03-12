package com.example.demo.apiModel.caseInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Created by
 * 内配下传发货仓传递dto
 * @author zhangyonginfo
 * @DeteTime: 2012-8-14 下午06:29:03
 * @version: 1.0
 */
public class TransBillsFromWms3 {
	
	private static final Logger logger = LoggerFactory.getLogger(TransBillsFromWms3.class);

	/**配送单信息*/
	private IbTransferDeliveryBill ibTransferDeliveryBill;
	
	/**箱子明细信息*/
	List<TransCaseInfoFromWms3> caseInfos;
	
	/**序列号信息*/
	List<IbTransSn> ibTransSns;
	
	/**商品编码 */
	List<TransGoodsFromWms3> transGoodsFromWms3s;

	/**
	 * 内配报文jfs地址
	 */
	private String jfsKey;

	public String getJfsKey() {
		return jfsKey;
	}

	public void setJfsKey(String jfsKey) {
		this.jfsKey = jfsKey;
	}

	public List<TransGoodsFromWms3> getTransGoodsFromWms3s() {
		return transGoodsFromWms3s;
	}

	public void setTransGoodsFromWms3s(List<TransGoodsFromWms3> transGoodsFromWms3s) {
		this.transGoodsFromWms3s = transGoodsFromWms3s;
	}

	public List<IbTransSn> getIbTransSns() {
		return ibTransSns;
	}

	public void setIbTransSns(List<IbTransSn> ibTransSns) {
		this.ibTransSns = ibTransSns;
	}

	public IbTransferDeliveryBill getIbTransferDeliveryBill() {
		return ibTransferDeliveryBill;
	}

	public void setIbTransferDeliveryBill(
			IbTransferDeliveryBill ibTransferDeliveryBill) {
		this.ibTransferDeliveryBill = ibTransferDeliveryBill;
	}

	public List<TransCaseInfoFromWms3> getCaseInfos() {
		return caseInfos;
	}

	public void setCaseInfos(List<TransCaseInfoFromWms3> caseInfos) {
		this.caseInfos = caseInfos;
	}
	
	/**
	 * 校验参数有效性
	 * @return
	 */
	public boolean validateParam(){
		if(this.ibTransferDeliveryBill == null){
			logger.info("内配WMS3下传配送单信息为空!");
			return false;
		}
		if(this.caseInfos == null || this.caseInfos.isEmpty()){
			logger.info("内配WMS3下传箱子信息为空!");
			return false;
		}
		if(this.caseInfos != null && !this.caseInfos.isEmpty()){
			for (TransCaseInfoFromWms3 caseInfo : caseInfos) {
				if(caseInfo.getIbReceivingTaskDs() == null || caseInfo.getIbReceivingTaskDs().isEmpty()){
					logger.info("内配WMS3下传,箱号: " + caseInfo.getCaseNo() + " 商品信息集合为空!");
					return false;
				}
			}
		}
		if(this.transGoodsFromWms3s == null || this.transGoodsFromWms3s.isEmpty()){
			logger.info("内配WMS3下传商品信息集合为空!");
			return false;
		}
		return true;
	}

}
