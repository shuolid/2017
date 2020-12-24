package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luquanwei
 * Date: 15-8-17
 * Time: 下午5:05
 * To change this template use File | Settings | File Templates.
 * 退供应商报文对应的批次相关字段
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LotDetailDto implements Serializable {
    /**
     * 批次明细编号
     */
    private Long batchId;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 批次数量
     */
    private BigDecimal batchQty;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 总价格
     */
    private BigDecimal totalPrice;
    /**
     * 批次属性列表
     */
    private List<BatchAttr> batchAttrList;
    /**
     * 修改标识 0:默认 1:待修改
     */
    private Integer updateFlag;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public BigDecimal getBatchQty() {
        return batchQty;
    }

    public void setBatchQty(BigDecimal batchQty) {
        this.batchQty = batchQty;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public List<BatchAttr> getBatchAttrList() {
        return batchAttrList;
    }

    public void setBatchAttrList(List<BatchAttr> batchAttrList) {
        this.batchAttrList = batchAttrList;
    }

    public Integer getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(Integer updateFlag) {
        this.updateFlag = updateFlag;
    }
}
