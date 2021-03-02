package com.example.demo.apiModel.receivedScrapShipment;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "ScrapService")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ScrapShipment implements Serializable {
    @XmlElement(name="ProfitLossId")
    private String profitLossId;

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

}
