package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAttr implements Serializable {
    /**
     * 批次属性KEY
     */
    private String batchKey;
    /**
     * 批次属性值
     */
    private String batchValue;

    public String getBatchKey() {
        return batchKey;
    }

    public void setBatchKey(String batchKey) {
        this.batchKey = batchKey;
    }

    public String getBatchValue() {
        return batchValue;
    }

    public void setBatchValue(String batchValue) {
        this.batchValue = batchValue;
    }
}