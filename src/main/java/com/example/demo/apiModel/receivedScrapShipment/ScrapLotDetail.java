package com.example.demo.apiModel.receivedScrapShipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScrapLotDetail {
    @XmlElementWrapper(name="BatchAttrList")
    @XmlElement(name="BatchAttr")
    private List<BatchAttr> batchAttrList;

    public List<BatchAttr> getBatchAttrList() {
        return batchAttrList;
    }

    public void setBatchAttrList(List<BatchAttr> batchAttrList) {
        this.batchAttrList = batchAttrList;
    }
}
