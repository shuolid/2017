package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @program: wms5-pickingplan
 * @description:
 * @author: lizhen381
 * @create: 2019-01-03 14:22
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PopInfo {
    private String venderId;
    private String venderName;

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }
}
