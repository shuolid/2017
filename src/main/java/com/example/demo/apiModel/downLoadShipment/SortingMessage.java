package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created with IntelliJ IDEA.
 * User: luquanwei
 * Date: 16-6-28
 * Time: 上午8:40
 * To change this template use File | Settings | File Templates.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortingMessage {
    private String stationType;//三方站点提示

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }
}
