package com.example.demo.apiModel.asnDataImport;

public class AsnExpend extends AbstractBaseInfo {
    private Long id;
    private String asnNo;
    private String colName;
    private String colValue;
    private Boolean canUse;
    private String colNameWhere;


    public String getColNameWhere() {
        return colNameWhere;
    }

    public void setColNameWhere(String colNameWhere) {
        this.colNameWhere = colNameWhere;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsnNo() {
        return asnNo;
    }

    public void setAsnNo(String asnNo) {
        this.asnNo = asnNo;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColValue() {
        return colValue;
    }

    public void setColValue(String colValue) {
        this.colValue = colValue;
    }

    public Boolean getCanUse() {
        return canUse;
    }

    public void setCanUse(Boolean canUse) {
        this.canUse = canUse;
    }

}
