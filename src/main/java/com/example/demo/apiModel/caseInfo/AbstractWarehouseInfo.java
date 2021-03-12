package com.example.demo.apiModel.caseInfo;

import com.example.demo.apiModel.asnDataImport.WarehouseInfo;

/**
 * 基础方法
 */
public abstract class AbstractWarehouseInfo implements WarehouseInfo {
    public abstract void setOrgNo(String orgNo);

    public abstract void setDistributeNo(String distributeNo);

    public abstract void setWarehouseNo(String warehouseNo);

    public void setWarehouseInfo(WarehouseInfo warehouseInfo) {
        this.setOrgNo(warehouseInfo.getOrgNo());
        this.setDistributeNo(warehouseInfo.getDistributeNo());
        this.setWarehouseNo(warehouseInfo.getWarehouseNo());
    }

    @Override
    public String getTarget() {
        return getOrgNo() + "," + getDistributeNo() + "," + getWarehouseNo();
    }
}
