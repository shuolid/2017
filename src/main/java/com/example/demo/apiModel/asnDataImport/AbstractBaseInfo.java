package com.example.demo.apiModel.asnDataImport;

import java.util.Date;

public class AbstractBaseInfo extends AbstractWarehouseInfo {
    private String orgNo;
    private String distributeNo;
    private String warehouseNo;
    private Boolean yn;

    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;

    @Override
    public String getOrgNo() {
        return orgNo;
    }

    @Override
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
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

    public Boolean getYn() {
        return yn;
    }

    public void setYn(Boolean yn) {
        this.yn = yn;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
