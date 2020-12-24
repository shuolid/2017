package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * TrialProductMessage
 *
 * @author Lu Quan Wei
 * @date 16-3-9 下午1:48
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrialProductMessage {
    private int bizType;//试用品标识，1为试用品订单
    private List<TrialProducts> trialProducts;//试用品列表信息
    private String activitiesName;//活动名称
    private String activitiesId;//活动ID


    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public List<TrialProducts> getTrialProducts() {
        return trialProducts;
    }

    public void setTrialProducts(List<TrialProducts> trialProducts) {
        this.trialProducts = trialProducts;
    }

    public String getActivitiesName() {
        return activitiesName;
    }

    public void setActivitiesName(String activitiesName) {
        this.activitiesName = activitiesName;
    }

    public String getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(String activitiesId) {
        this.activitiesId = activitiesId;
    }
}
