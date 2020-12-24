package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author zhoubiyin
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDomain implements Cloneable, Serializable {
	/**
     *机构号
     */
    private String orgNo;

	/**
	 * 配送中心号
	 */
    private String distributeNo;

    /**
     * 库房号
     */
    private String warehouseNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 逻辑删除
     */
    private Integer yn;

    public BaseDomain() { }

    public BaseDomain(String orgNo, String distributeNo, String warehouseNo) {
        this.orgNo = orgNo;
        this.distributeNo = distributeNo;
        this.warehouseNo = warehouseNo;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}
