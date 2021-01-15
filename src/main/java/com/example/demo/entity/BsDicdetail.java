package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class BsDicdetail implements Serializable {
    private Long id;

    private String warehouseNo;

    private String codeType;

    private String code;

    private String dicdetailName;

    private String value;

    private Boolean useFlag;

    private String systemFlag;

    private String refvalue;

    private Long seq;

    private String visibleFlag;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String orgNo;

    private String distributeNo;

    private Byte yn;

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

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDicdetailName() {
        return dicdetailName;
    }

    public void setDicdetailName(String dicdetailName) {
        this.dicdetailName = dicdetailName == null ? null : dicdetailName.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Boolean getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
    }

    public String getSystemFlag() {
        return systemFlag;
    }

    public void setSystemFlag(String systemFlag) {
        this.systemFlag = systemFlag == null ? null : systemFlag.trim();
    }

    public String getRefvalue() {
        return refvalue;
    }

    public void setRefvalue(String refvalue) {
        this.refvalue = refvalue == null ? null : refvalue.trim();
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getVisibleFlag() {
        return visibleFlag;
    }

    public void setVisibleFlag(String visibleFlag) {
        this.visibleFlag = visibleFlag == null ? null : visibleFlag.trim();
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

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
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
        BsDicdetail other = (BsDicdetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getCodeType() == null ? other.getCodeType() == null : this.getCodeType().equals(other.getCodeType()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getDicdetailName() == null ? other.getDicdetailName() == null : this.getDicdetailName().equals(other.getDicdetailName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getUseFlag() == null ? other.getUseFlag() == null : this.getUseFlag().equals(other.getUseFlag()))
            && (this.getSystemFlag() == null ? other.getSystemFlag() == null : this.getSystemFlag().equals(other.getSystemFlag()))
            && (this.getRefvalue() == null ? other.getRefvalue() == null : this.getRefvalue().equals(other.getRefvalue()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getVisibleFlag() == null ? other.getVisibleFlag() == null : this.getVisibleFlag().equals(other.getVisibleFlag()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getOrgNo() == null ? other.getOrgNo() == null : this.getOrgNo().equals(other.getOrgNo()))
            && (this.getDistributeNo() == null ? other.getDistributeNo() == null : this.getDistributeNo().equals(other.getDistributeNo()))
            && (this.getYn() == null ? other.getYn() == null : this.getYn().equals(other.getYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getCodeType() == null) ? 0 : getCodeType().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getDicdetailName() == null) ? 0 : getDicdetailName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getUseFlag() == null) ? 0 : getUseFlag().hashCode());
        result = prime * result + ((getSystemFlag() == null) ? 0 : getSystemFlag().hashCode());
        result = prime * result + ((getRefvalue() == null) ? 0 : getRefvalue().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getVisibleFlag() == null) ? 0 : getVisibleFlag().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getOrgNo() == null) ? 0 : getOrgNo().hashCode());
        result = prime * result + ((getDistributeNo() == null) ? 0 : getDistributeNo().hashCode());
        result = prime * result + ((getYn() == null) ? 0 : getYn().hashCode());
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
        sb.append(", codeType=").append(codeType);
        sb.append(", code=").append(code);
        sb.append(", dicdetailName=").append(dicdetailName);
        sb.append(", value=").append(value);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", systemFlag=").append(systemFlag);
        sb.append(", refvalue=").append(refvalue);
        sb.append(", seq=").append(seq);
        sb.append(", visibleFlag=").append(visibleFlag);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", distributeNo=").append(distributeNo);
        sb.append(", yn=").append(yn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}