package com.example.demo.apiModel.caseInfo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BoxDetail")
public class BoxDetail implements Serializable{
	private static final long serialVersionUID = 1L;
	private String taskId; //任务编号
	private Integer from;  //出库机构
	private Integer to;   //入库机构
    private String operatorName; //操作人
	private String barcode;   //箱子编码


	private String boxid;  //箱子号
	private Integer startSid; // 出库机构库房
	private Integer toSid;  //入库机构库房
	@XmlElement(name = "Boxware")
	@XmlElementWrapper(name = "qingdanlist")
	private List<Boxware> qingdanlist;  //箱子明细
    private Integer source;    //来源 6==ECLP 内配 为第三方
    // 移动仓库上线，报文添加节点outsideno、ywtype，对wms5.0仓没有影响，添加属性以保证解析报文不报错。
    private String outsideno;
    private String ywtype;

	//京东之家--内配半收差异，增加子节点
	private String subType;



	//32位的字符串，从右往左其中第一位：0表示普通内配 1表示保税仓内配
	private String Mark;

	//是否采集温度标识,1采集。
	private String collectTemperature;
	//温控区间
	private String temperature;

	public String getCollectTemperature() {
		return collectTemperature;
	}

	public void setCollectTemperature(String collectTemperature) {
		this.collectTemperature = collectTemperature;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Integer getStartSid() {
		return startSid;
	}
	public void setStartSid(Integer startSid) {
		this.startSid = startSid;
	}
	public Integer getToSid() {
		return toSid;
	}
	public void setToSid(Integer toSid) {
		this.toSid = toSid;
	}
	public List<Boxware> getQingdanlist() {
		return qingdanlist;
	}
	public void setQingdanlist(List<Boxware> qingdanlist) {
		this.qingdanlist = qingdanlist;
	}

    public String getBoxid() {
        return boxid;
    }

    public void setBoxid(String boxid) {
        this.boxid = boxid;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOutsideno() {
        return outsideno;
    }

    public void setOutsideno(String outsideno) {
        this.outsideno = outsideno;
    }

    public String getYwtype() {
        return ywtype;
    }

    public void setYwtype(String ywtype) {
        this.ywtype = ywtype;
    }
	public String getMark() {
		return Mark;
	}

	public void setMark(String mark) {
		Mark = mark;
	}
}
