package com.example.demo.apiModel.receiveOrder;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "PeiHuoDan")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReceiveOrder {
    private String taskId;
    private String rfid;
    private String from;
    private String to;
    private String startSid;
    private String toSid;
    private String operatorName;
    private String ywtype;
    private String subtype;
    private String innerboxno;
    private String isMiniTransport;
    private String crossDockingType;
    private String vendorType;
    private String vendorId;
    @XmlElementWrapper(name="qingdanlist")
    @XmlElement(name="ChuordersBase")
    private List<ChuordersBase> chuordersBaseList;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ChuordersBase{
        private String wareid;
        private String wname;
        private String numb;
        private String productLevel;
    }

}
