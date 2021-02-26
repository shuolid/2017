package com.example.demo.apiModel.importReceivingTask;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**z
 * Created by IntelliJ IDEA.
 * User: sunxiaomei
 * Date: 2012-9-21
 * Time: 10:11:44
 * 备件库系统下传入库单报文实体主档
 */
@XmlRootElement(name = "wms_purchase_m")
@XmlAccessorType(XmlAccessType.FIELD)
public class SparePartsImportM implements Serializable{
    @XmlElement(name="documentId")
    private String documentId;
    @XmlElementWrapper(name="Wms_purchase_ds")
    @XmlElement(name="wms_purchase_d")
    private List<SparePartsImportD> sparePartsImportDList;
    @XmlElement(name="SeqNo")
    private String seqNo;
    @XmlElement(name="poNo")
    private String poNo;
    @XmlElement(name="Sheetid")
    private String sheetId;
    @XmlElement(name="SheetType")
    private String sheetType;
    @XmlElement(name="WareNo")
    private String wareNo;
    @XmlElement(name="LocNo")
    private String locNo;
    @XmlElement(name="Checker")
    private String checker;
    @XmlElement(name="ClassType")
    private String classType;

    private Date purDate;

    private Date validDate;
    private String notes;
    @XmlElement(name="ErpWareNo")
    private String erpWareNo;
    //机构，配送中心，仓库
    @XmlElement(name="WmsTarget")
    private String wmsTarget;
    //单据来源
    @XmlElement(name="source")
    private Integer source;
    // 货主编号
    @XmlElement(name="ownerNo")
    private String ownerNo;
    // 货主名称
    @XmlElement(name="ownerName")
    private String ownerName;
    @XmlElement(name="isSecondHand")
    private String isSecondHand;
    @XmlElement(name="grade")
    private String grade;
    //是否允许缺量，允许半收。0，不允许半收
    @XmlElement(name="isPartAccept")
    private String isPartAccept;

    private String orgNo;

    private String distributeNo;

    private String warehouseNo;

    public List<SparePartsImportD> getSparePartsImportDList() {
        return sparePartsImportDList;
    }

    public void setSparePartsImportDList(List<SparePartsImportD> sparePartsImportDList) {
        this.sparePartsImportDList = sparePartsImportDList;
    }
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

    public String getSheetType() {
        return sheetType;
    }

    public void setSheetType(String sheetType) {
        this.sheetType = sheetType;
    }

    public String getWareNo() {
        return wareNo;
    }

    public void setWareNo(String wareNo) {
        this.wareNo = wareNo;
    }

    public String getLocNo() {
        return locNo;
    }

    public void setLocNo(String locNo) {
        this.locNo = locNo;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getErpWareNo() {
        return erpWareNo;
    }

    public void setErpWareNo(String erpWareNo) {
        this.erpWareNo = erpWareNo;
    }

    public String getWmsTarget() {
        return wmsTarget;
    }

    public void setWmsTarget(String wmsTarget) {
        this.wmsTarget = wmsTarget;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getIsSecondHand() {
        return isSecondHand;
    }

    public void setIsSecondHand(String isSecondHand) {
        this.isSecondHand = isSecondHand;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getIsPartAccept() {
        return isPartAccept;
    }

    public void setIsPartAccept(String isPartAccept) {
        this.isPartAccept = isPartAccept;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
