package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;

//出货清单明细
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryOrderDetailDto implements Cloneable, Serializable {
    //产品编号
    private String orderingItemNumber;
    //产品名称
    private String orderingItemName;
    //订货数量
    private BigDecimal orderQty;
    //送货数量
    private BigDecimal deliveryQty;

    public String getOrderingItemNumber() {
        return orderingItemNumber;
    }

    public void setOrderingItemNumber(String orderingItemNumber) {
        this.orderingItemNumber = orderingItemNumber;
    }

    public String getOrderingItemName() {
        return orderingItemName;
    }

    public void setOrderingItemName(String orderingItemName) {
        this.orderingItemName = orderingItemName;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getDeliveryQty() {
        return deliveryQty;
    }

    public void setDeliveryQty(BigDecimal deliveryQty) {
        this.deliveryQty = deliveryQty;
    }
}
