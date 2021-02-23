package com.example.demo.apiModel.receivedScrapShipment;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "ScrapService")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScrapShipment implements Serializable {
    @XmlElement(name="Id")
    private String id;

    @XmlElement(name="Rid")
    private String rid;

    @XmlElement(name="Sid")
    private String sid;

    @XmlElement(name="isShortage")
    private String isShortage;

    @XmlElement(name="AddTime")
    private Date addTime;

    @XmlElement(name="Applicant")
    private String applicant;

    @XmlElement(name="Type")
    private String type;

    @XmlElement(name="ScrapType")
    private String scrapType;

    @XmlElementWrapper(name="WareList")
    @XmlElement(name="ScrapWareService")
    private List<ScrapWare> scrapWareList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getIsShortage() {
        return isShortage;
    }

    public void setIsShortage(String isShortage) {
        this.isShortage = isShortage;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScrapType() {
        return scrapType;
    }

    public void setScrapType(String scrapType) {
        this.scrapType = scrapType;
    }

    public List<ScrapWare> getScrapWareList() {
        return scrapWareList;
    }

    public void setScrapWareList(List<ScrapWare> scrapWareList) {
        this.scrapWareList = scrapWareList;
    }

    //    @Data
//    public static class ScrapWare {
//        @XmlElement(name="Wid")
//        private String wid;
//
//        @XmlElement(name="Wname")
//        private String wname;
//
//        @XmlElement(name="Num")
//        private String num;
//
//        @XmlElementWrapper(name="BatchList")
//        @XmlElement(name="Scrap_Lot_Detail")
//        private List<ScrapLotDetail> scrapLotDetailList;
//
//        @Data
//        public static class ScrapLotDetail {
//            @XmlElementWrapper(name="BatchAttrList")
//            @XmlElement(name="BatchAttr")
//            private List<BatchAttr> batchAttrList;
//
//            @Data
//            public static class BatchAttr {
//                @XmlElement(name="BatchAttrKey")
//                private String batchAttrKey;
//
//                @XmlElement(name="BatchAttrValue")
//                private String batchAttrValue;
//            }
//        }
//    }

}
