package com.example.demo.apiModel.receivedScrapShipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScrapWare {
    @XmlElement(name="Wid")
    private String wid;

    @XmlElement(name="Wname")
    private String wname;

    @XmlElement(name="Num")
    private String num;

    @XmlElementWrapper(name="BatchList")
    @XmlElement(name="Scrap_Lot_Detail")
    private List<ScrapLotDetail> scrapLotDetailList;

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<ScrapLotDetail> getScrapLotDetailList() {
        return scrapLotDetailList;
    }

    public void setScrapLotDetailList(List<ScrapLotDetail> scrapLotDetailList) {
        this.scrapLotDetailList = scrapLotDetailList;
    }
}
