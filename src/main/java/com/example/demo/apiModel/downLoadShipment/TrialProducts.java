package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * TrialProducts
 *   试用品列表信息
 * @author Lu Quan Wei
 * @date 16-3-9 下午1:51
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrialProducts {
    private String trialSkuId;//试用品商品SKUID
    private String trialSkuName;//试用品商品名称
    private BigDecimal trialCount;//发放试用品的数量

    public String getTrialSkuId() {
        return trialSkuId;
    }

    public void setTrialSkuId(String trialSkuId) {
        this.trialSkuId = trialSkuId;
    }

    public String getTrialSkuName() {
        return trialSkuName;
    }

    public void setTrialSkuName(String trialSkuName) {
        this.trialSkuName = trialSkuName;
    }

    public BigDecimal getTrialCount() {
        return trialCount;
    }

    public void setTrialCount(BigDecimal trialCount) {
        this.trialCount = trialCount;
    }
}
