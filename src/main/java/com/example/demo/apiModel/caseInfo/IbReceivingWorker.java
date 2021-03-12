package com.example.demo.apiModel.caseInfo;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;

public class IbReceivingWorker extends AbstractWarehouseInfo implements BatchCodeKey, Serializable{

    private String eosMsg;

    private Integer regionNo;
	//新业务主键
    private String bizKeyNew;
	//自增主键
	private Integer id;
	//worker类型(0关单状态回传、1超量ASN回传、2库存回传、3、任务下发 4、大家电再投异常回传)
	private Integer workerType;
	//业务主键
	private String bizKey;
	//机构编号
	private String orgNo;
	//配送中心编号
	private String distributeNo;
	//库房编号
	private String warehouseNo;
	//创建时间
	private Date createTime;
	//删除标识
	private Integer yn;
	//单据回传状态(0未完成、1锁定、2已完成、3异常)
	private Integer eosStatus;
	//单据回传时间
	private String eosFilename;
	//单据回传次数
	private Integer eosTimes;
	//更新时间
    private Date updateTime;
    //sunxiaomei add   eosStatusWhere.  更新worker记录时where条件的状态
    private Integer eosStatusWhere;
	//存放唯一的uuid
	private String wmsUuid;
	//存放批次号
	private String wmsBatchno;
	// 来源 1 自营 6 eclp
	private String wmsSource;
	//预约号、批次号
	private String bookingNo;

	private String remark;

	public String getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getWmsUuid() {
		return wmsUuid;
	}

	public void setWmsUuid(String wmsUuid) {
		this.wmsUuid = wmsUuid;
	}

	public String getWmsBatchno() {
		return wmsBatchno;
	}

	public void setWmsBatchno(String wmsBatchno) {
		this.wmsBatchno = wmsBatchno;
	}

	public String getWmsSource() {
		return wmsSource;
	}

	public void setWmsSource(String wmsSource) {
		this.wmsSource = wmsSource;
	}

    public Integer getEosStatusWhere() {
        return eosStatusWhere;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setEosStatusWhere(Integer eosStatusWhere) {
        this.eosStatusWhere = eosStatusWhere;
    }

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWorkerType() {
		return workerType;
	}
	public void setWorkerType(Integer workerType) {
		this.workerType = workerType;
	}
	public String getBizKey() {
		return bizKey;
	}
	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getYn() {
		return yn;
	}
	public void setYn(Integer yn) {
		this.yn = yn;
	}
	public Integer getEosStatus() {
		return eosStatus;
	}
	public void setEosStatus(Integer eosStatus) {
		this.eosStatus = eosStatus;
	}
	public String getEosFilename() {
		return eosFilename;
	}
	public void setEosFilename(String eosFilename) {
		this.eosFilename = eosFilename;
	}
	public Integer getEosTimes() {
		return eosTimes;
	}
	public void setEosTimes(Integer eosTimes) {
		this.eosTimes = eosTimes;
	}

    public String getBizKeyNew() {
        return bizKeyNew;
    }

    public void setBizKeyNew(String bizKeyNew) {
        this.bizKeyNew = bizKeyNew;
    }

    public Integer getRegionNo() {
        return regionNo;
    }

    public void setRegionNo(Integer regionNo) {
        this.regionNo = regionNo;
    }

    public String getEosMsg() {
        return eosMsg;
    }

	public void setEosMsg(String eosMsg) {
		if (StringUtils.isNotEmpty(eosMsg) && eosMsg.length()>65530)
			eosMsg = eosMsg.substring(0, 65530);
		this.eosMsg = eosMsg;
	}
	@Override
	public String getInboundNo() {
		return bizKey;
	}

	@Override
	public String getBatchCode() {
		return bookingNo;
	}

	@Override
	public String getTarget() {
		return orgNo+","+distributeNo+","+warehouseNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
