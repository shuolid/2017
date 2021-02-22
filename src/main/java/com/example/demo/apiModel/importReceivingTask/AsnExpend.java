package com.example.demo.apiModel.importReceivingTask;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AsnExpend {
    private Long id;
    private String asnNo;
    @XmlElement(name="value")
    private String colValue;
    private Boolean canUse;
    @XmlElement(name="key")
    private String colName;
    private String orgNo;
    private String distributeNo;
    private String warehouseNo;
    private Boolean yn;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;

}
