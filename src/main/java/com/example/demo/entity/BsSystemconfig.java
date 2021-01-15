package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class BsSystemconfig implements Serializable {
    private Long id;

    private String warehouseNo;

    private String cfgKey;

    private String value;

    private String defaultvalue;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String orgNo;

    private String distributeNo;

    private Boolean yn;

    private String wmsModule;

    private Byte cfgLevel;

    private Byte isSwitch;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    public String getCfgKey() {
        return cfgKey;
    }

    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey == null ? null : cfgKey.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue == null ? null : defaultvalue.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo == null ? null : distributeNo.trim();
    }

    public Boolean getYn() {
        return yn;
    }

    public void setYn(Boolean yn) {
        this.yn = yn;
    }

    public String getWmsModule() {
        return wmsModule;
    }

    public void setWmsModule(String wmsModule) {
        this.wmsModule = wmsModule == null ? null : wmsModule.trim();
    }

    public Byte getCfgLevel() {
        return cfgLevel;
    }

    public void setCfgLevel(Byte cfgLevel) {
        this.cfgLevel = cfgLevel;
    }

    public Byte getIsSwitch() {
        return isSwitch;
    }

    public void setIsSwitch(Byte isSwitch) {
        this.isSwitch = isSwitch;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BsSystemconfig other = (BsSystemconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getCfgKey() == null ? other.getCfgKey() == null : this.getCfgKey().equals(other.getCfgKey()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getDefaultvalue() == null ? other.getDefaultvalue() == null : this.getDefaultvalue().equals(other.getDefaultvalue()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getOrgNo() == null ? other.getOrgNo() == null : this.getOrgNo().equals(other.getOrgNo()))
            && (this.getDistributeNo() == null ? other.getDistributeNo() == null : this.getDistributeNo().equals(other.getDistributeNo()))
            && (this.getYn() == null ? other.getYn() == null : this.getYn().equals(other.getYn()))
            && (this.getWmsModule() == null ? other.getWmsModule() == null : this.getWmsModule().equals(other.getWmsModule()))
            && (this.getCfgLevel() == null ? other.getCfgLevel() == null : this.getCfgLevel().equals(other.getCfgLevel()))
            && (this.getIsSwitch() == null ? other.getIsSwitch() == null : this.getIsSwitch().equals(other.getIsSwitch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getCfgKey() == null) ? 0 : getCfgKey().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getDefaultvalue() == null) ? 0 : getDefaultvalue().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getOrgNo() == null) ? 0 : getOrgNo().hashCode());
        result = prime * result + ((getDistributeNo() == null) ? 0 : getDistributeNo().hashCode());
        result = prime * result + ((getYn() == null) ? 0 : getYn().hashCode());
        result = prime * result + ((getWmsModule() == null) ? 0 : getWmsModule().hashCode());
        result = prime * result + ((getCfgLevel() == null) ? 0 : getCfgLevel().hashCode());
        result = prime * result + ((getIsSwitch() == null) ? 0 : getIsSwitch().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", cfgKey=").append(cfgKey);
        sb.append(", value=").append(value);
        sb.append(", defaultvalue=").append(defaultvalue);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", distributeNo=").append(distributeNo);
        sb.append(", yn=").append(yn);
        sb.append(", wmsModule=").append(wmsModule);
        sb.append(", cfgLevel=").append(cfgLevel);
        sb.append(", isSwitch=").append(isSwitch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}