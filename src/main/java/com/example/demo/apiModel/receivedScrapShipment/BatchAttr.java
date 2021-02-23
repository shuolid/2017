package com.example.demo.apiModel.receivedScrapShipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BatchAttr {
    @XmlElement(name="BatchAttrKey")
    private String batchAttrKey;

    @XmlElement(name="BatchAttrValue")
    private String batchAttrValue;

    public String getBatchAttrKey() {
        return batchAttrKey;
    }

    public void setBatchAttrKey(String batchAttrKey) {
        this.batchAttrKey = batchAttrKey;
    }

    public String getBatchAttrValue() {
        return batchAttrValue;
    }

    public void setBatchAttrValue(String batchAttrValue) {
        this.batchAttrValue = batchAttrValue;
    }
}
