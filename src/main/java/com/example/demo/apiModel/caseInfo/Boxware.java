package com.example.demo.apiModel.caseInfo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Boxware implements Serializable{
	private static final long serialVersionUID = 1L;

	/**安利:锁库存标识**/
	private String isLocking;
	/**安利：出库单**/
	private String outBoundNo;

	private String id;  //自增id
	private Integer type;  //箱子类型
	private Integer bilv;  //商品比率
	@XmlElement(name="Wid")
	private String wid;   //商品编号
	@XmlElement(name="WName")
	private String wname;  //商品名称
	@XmlElement(name="Wnum")
	private Integer wnum;//数量
	private String boxid;//箱子号
	@XmlElement(name="OperatorID")
	private String operatorId;//操作人id
	@XmlElement(name="TimeState")
	private String timeState;//时间
	@XmlElement(name="State")
	private Integer state;//状态
	private Integer rfid;
	@XmlElement(name="OldState")
	private Integer oldState;// 老的状态
	@XmlElement(name="NewState")
	private Integer newState;//新状态
	private String barcode;// 箱子编码
	/**
	 * 事业部编码
	 */
	private String deptNo;
	/**
	 * 调拨入库单号
	 */
	private String insideNo;
	/**
	 * orderMark标 （第30位代表仓产品编码计费模式，0无；1按箱；2按件；3按箱件最低；4箱件并存；5可箱可件）
	 */
	private String orderMark;
	/**
	 * 产品标
	 */
	private List<String> productsCode;

}
