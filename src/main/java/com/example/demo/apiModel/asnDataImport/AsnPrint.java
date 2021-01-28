package com.example.demo.apiModel.asnDataImport;


import java.util.List;

/**
 * Created by chenhaifeng1 on 2018/10/11.
 */
public class AsnPrint extends AbstractBaseInfo implements AsnKey {


    private Long id;
    private String asnNo;
    /**
     * 单据类型,1预检单，2验收单
     */
    private String type;
    /**
     * 是否打印纸质面单
     */
    private String isPrint;
    /**
     * 模板编号
     */
    private String code;
    /**
     * JFS地址，存取上游下发的打印数据
     */
    private String jfs;

    /**
     * 是否云打印：1- 是
     * 云打印时，AsnPrint节点isPrint、type取值来自与 打印模板的“是否打印”、“业务类型”
     */
    private String printType;

    /**
     * 占位符
     */
    private List<String> placeholders;

    /**
     * 云打印时，前台传入批次信息
     */
    private String bookingNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAsnNo() {
        return asnNo;
    }

    public void setAsnNo(String asnNo) {
        this.asnNo = asnNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJfs() {
        return jfs;
    }

    public void setJfs(String jfs) {
        this.jfs = jfs;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public List<String> getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(List<String> placeholders) {
        this.placeholders = placeholders;
    }

    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }
}
