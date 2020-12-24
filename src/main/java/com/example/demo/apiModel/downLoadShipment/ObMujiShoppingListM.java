package com.example.demo.apiModel.downLoadShipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by songqiang1 on 2017/8/15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObMujiShoppingListM extends BaseDomain implements Cloneable, Serializable {

    private Long id;
    private String outboundNo;
    private String salePlatform;
    private BigDecimal totalGoodsQty;
    private Integer detailsCount;
    private String spSoNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDetailsCount() {
        return detailsCount;
    }

    public void setDetailsCount(Integer detailsCount) {
        this.detailsCount = detailsCount;
    }

    public String getSpSoNo() {
        return spSoNo;
    }

    public void setSpSoNo(String spSoNo) {
        this.spSoNo = spSoNo;
    }

    private List<ObMujiShoppingListD> detailList;

    public List<ObMujiShoppingListD> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<ObMujiShoppingListD> detailList) {
        this.detailList = detailList;
    }


    public String getOutboundNo() {
        return outboundNo;
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }



    public String getSalePlatform() {
        return salePlatform;
    }

    public void setSalePlatform(String salePlatform) {
        this.salePlatform = salePlatform;
    }

    public BigDecimal getTotalGoodsQty() {
        return totalGoodsQty;
    }

    public void setTotalGoodsQty(BigDecimal totalGoodsQty) {
        this.totalGoodsQty = totalGoodsQty;
    }
}
