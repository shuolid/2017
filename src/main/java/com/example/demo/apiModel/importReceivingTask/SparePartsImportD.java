package com.example.demo.apiModel.importReceivingTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sunxiaomei
 * Date: 2012-9-21
 * Time: 10:11:59
 * 备件库系统下传入库单报文实体明细
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SparePartsImportD implements Serializable {
    @XmlElement(name="SEQNO")
    private String seqNo;
    @XmlElement(name="Sheetid")
    private String sheetId;
    @XmlElement(name="LocNo")
    private String locNo;
    @XmlElement(name="Serialid")
    private String serialId;
    @XmlElement(name="Goodsid")
    private String goodsId;
    @XmlElement(name="Pkcount")
    private Integer pkCount;
    @XmlElement(name="Qty")
    private Double qty;
    @XmlElement(name="SupplierNo")
    private String supplierNo;
    @XmlElement(name="productLevel")
    private String productLevel;//商品质量等级
    @XmlElementWrapper(name="exts")
    @XmlElement(name="ext")
    private List<AsnExpend> asnExpends;

    public List<AsnExpend> getAsnExpends() {
        return asnExpends;
    }

    public void setAsnExpends(List<AsnExpend> asnExpends) {
        this.asnExpends = asnExpends;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getSheetId() {
        return sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getLocNo() {
        return locNo;
    }

    public void setLocNo(String locNo) {
        this.locNo = locNo;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPkCount() {
        return pkCount;
    }

    public void setPkCount(Integer pkCount) {
        this.pkCount = pkCount;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }


    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }

    @Override
    public String toString() {
        return "SparePartsImportD{" +
                "seqNo='" + seqNo + '\'' +
                ", sheetId='" + sheetId + '\'' +
                ", locNo='" + locNo + '\'' +
                ", serialId='" + serialId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", pkCount=" + pkCount +
                ", qty=" + qty +
                ", supplierNo='" + supplierNo + '\'' +
                ", productLevel='" + productLevel + '\'' +
                ", asnExpends=" + asnExpends +
                '}';
    }
}
