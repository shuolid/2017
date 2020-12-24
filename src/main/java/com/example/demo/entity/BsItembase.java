package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BsItembase implements Serializable {
    private Long id;

    private String ownerNo;

    private String goodsNo;

    private String name;

    private String virtualFlag;

    private String volumnscale;

    private BigDecimal grassweight;

    private BigDecimal netweight;

    private String optStatus;

    private String qc;

    private String producer;

    private String suppiler;

    private String brand;

    private String producingarea;

    private String validFlag;

    private String newFlag;

    private String buyer;

    private String packagetype;

    private String is3gexpenseFlag;

    private String luxuryFlag;

    private String movableFlag;

    private String healthcareFlag;

    private String qcsampleFlag;

    private String goodsTypeNo;

    private String serialManageFlag;

    private String jdbarcode;

    private String lotmanageFlag;

    private String mixbatchstorageFlag;

    private String generalType;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String warehouseNo;

    private String createUser;

    private String updateUser;

    private String upcCode;

    private String probesninbound;

    private String uniquesninbound;

    private String returncellNo;

    private BigDecimal tare;

    private String areaNo;

    private String zoneNo;

    private String cellNo;

    private String qczoneNo;

    private String highvalue;

    private String frangible;

    private String chuanweiable;

    private String shelflifeFlag;

    private BigDecimal maxinventoryQty;

    private String tempcontrolFlag;

    private BigDecimal tempmax;

    private BigDecimal tempmin;

    private BigDecimal hummax;

    private BigDecimal hummin;

    private String transportway;

    private String transporttype;

    private BigDecimal deviation;

    private String containerable;

    private String probesnoutbound;

    private String uniquesnoutbound;

    private String inventoryleavel;

    private String processcc;

    private String replenishpriority;

    private String orgNo;

    private String distributeNo;

    private Boolean yn;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private String adultUsingFlag;

    private String irregularShapeFlag;

    private String importedFlag;

    private Byte boxManage;

    private String expensiveFlag;

    private String isbn;

    private String author;

    private String press;

    private String batchNo;

    private String imagePath;

    private String foreignName;

    private String spec;

    private String saleUnit;

    private Boolean isAllotype;

    private Long omcVersion;

    private Boolean pmx;

    private BigDecimal plateGaugeBottom;

    private BigDecimal plateGaugeHeight;

    private Long ppp;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo == null ? null : ownerNo.trim();
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVirtualFlag() {
        return virtualFlag;
    }

    public void setVirtualFlag(String virtualFlag) {
        this.virtualFlag = virtualFlag == null ? null : virtualFlag.trim();
    }

    public String getVolumnscale() {
        return volumnscale;
    }

    public void setVolumnscale(String volumnscale) {
        this.volumnscale = volumnscale == null ? null : volumnscale.trim();
    }

    public BigDecimal getGrassweight() {
        return grassweight;
    }

    public void setGrassweight(BigDecimal grassweight) {
        this.grassweight = grassweight;
    }

    public BigDecimal getNetweight() {
        return netweight;
    }

    public void setNetweight(BigDecimal netweight) {
        this.netweight = netweight;
    }

    public String getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(String optStatus) {
        this.optStatus = optStatus == null ? null : optStatus.trim();
    }

    public String getQc() {
        return qc;
    }

    public void setQc(String qc) {
        this.qc = qc == null ? null : qc.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getSuppiler() {
        return suppiler;
    }

    public void setSuppiler(String suppiler) {
        this.suppiler = suppiler == null ? null : suppiler.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getProducingarea() {
        return producingarea;
    }

    public void setProducingarea(String producingarea) {
        this.producingarea = producingarea == null ? null : producingarea.trim();
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }

    public String getNewFlag() {
        return newFlag;
    }

    public void setNewFlag(String newFlag) {
        this.newFlag = newFlag == null ? null : newFlag.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public String getPackagetype() {
        return packagetype;
    }

    public void setPackagetype(String packagetype) {
        this.packagetype = packagetype == null ? null : packagetype.trim();
    }

    public String getIs3gexpenseFlag() {
        return is3gexpenseFlag;
    }

    public void setIs3gexpenseFlag(String is3gexpenseFlag) {
        this.is3gexpenseFlag = is3gexpenseFlag == null ? null : is3gexpenseFlag.trim();
    }

    public String getLuxuryFlag() {
        return luxuryFlag;
    }

    public void setLuxuryFlag(String luxuryFlag) {
        this.luxuryFlag = luxuryFlag == null ? null : luxuryFlag.trim();
    }

    public String getMovableFlag() {
        return movableFlag;
    }

    public void setMovableFlag(String movableFlag) {
        this.movableFlag = movableFlag == null ? null : movableFlag.trim();
    }

    public String getHealthcareFlag() {
        return healthcareFlag;
    }

    public void setHealthcareFlag(String healthcareFlag) {
        this.healthcareFlag = healthcareFlag == null ? null : healthcareFlag.trim();
    }

    public String getQcsampleFlag() {
        return qcsampleFlag;
    }

    public void setQcsampleFlag(String qcsampleFlag) {
        this.qcsampleFlag = qcsampleFlag == null ? null : qcsampleFlag.trim();
    }

    public String getGoodsTypeNo() {
        return goodsTypeNo;
    }

    public void setGoodsTypeNo(String goodsTypeNo) {
        this.goodsTypeNo = goodsTypeNo == null ? null : goodsTypeNo.trim();
    }

    public String getSerialManageFlag() {
        return serialManageFlag;
    }

    public void setSerialManageFlag(String serialManageFlag) {
        this.serialManageFlag = serialManageFlag == null ? null : serialManageFlag.trim();
    }

    public String getJdbarcode() {
        return jdbarcode;
    }

    public void setJdbarcode(String jdbarcode) {
        this.jdbarcode = jdbarcode == null ? null : jdbarcode.trim();
    }

    public String getLotmanageFlag() {
        return lotmanageFlag;
    }

    public void setLotmanageFlag(String lotmanageFlag) {
        this.lotmanageFlag = lotmanageFlag == null ? null : lotmanageFlag.trim();
    }

    public String getMixbatchstorageFlag() {
        return mixbatchstorageFlag;
    }

    public void setMixbatchstorageFlag(String mixbatchstorageFlag) {
        this.mixbatchstorageFlag = mixbatchstorageFlag == null ? null : mixbatchstorageFlag.trim();
    }

    public String getGeneralType() {
        return generalType;
    }

    public void setGeneralType(String generalType) {
        this.generalType = generalType == null ? null : generalType.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode == null ? null : upcCode.trim();
    }

    public String getProbesninbound() {
        return probesninbound;
    }

    public void setProbesninbound(String probesninbound) {
        this.probesninbound = probesninbound == null ? null : probesninbound.trim();
    }

    public String getUniquesninbound() {
        return uniquesninbound;
    }

    public void setUniquesninbound(String uniquesninbound) {
        this.uniquesninbound = uniquesninbound == null ? null : uniquesninbound.trim();
    }

    public String getReturncellNo() {
        return returncellNo;
    }

    public void setReturncellNo(String returncellNo) {
        this.returncellNo = returncellNo == null ? null : returncellNo.trim();
    }

    public BigDecimal getTare() {
        return tare;
    }

    public void setTare(BigDecimal tare) {
        this.tare = tare;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo == null ? null : areaNo.trim();
    }

    public String getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo == null ? null : zoneNo.trim();
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo == null ? null : cellNo.trim();
    }

    public String getQczoneNo() {
        return qczoneNo;
    }

    public void setQczoneNo(String qczoneNo) {
        this.qczoneNo = qczoneNo == null ? null : qczoneNo.trim();
    }

    public String getHighvalue() {
        return highvalue;
    }

    public void setHighvalue(String highvalue) {
        this.highvalue = highvalue == null ? null : highvalue.trim();
    }

    public String getFrangible() {
        return frangible;
    }

    public void setFrangible(String frangible) {
        this.frangible = frangible == null ? null : frangible.trim();
    }

    public String getChuanweiable() {
        return chuanweiable;
    }

    public void setChuanweiable(String chuanweiable) {
        this.chuanweiable = chuanweiable == null ? null : chuanweiable.trim();
    }

    public String getShelflifeFlag() {
        return shelflifeFlag;
    }

    public void setShelflifeFlag(String shelflifeFlag) {
        this.shelflifeFlag = shelflifeFlag == null ? null : shelflifeFlag.trim();
    }

    public BigDecimal getMaxinventoryQty() {
        return maxinventoryQty;
    }

    public void setMaxinventoryQty(BigDecimal maxinventoryQty) {
        this.maxinventoryQty = maxinventoryQty;
    }

    public String getTempcontrolFlag() {
        return tempcontrolFlag;
    }

    public void setTempcontrolFlag(String tempcontrolFlag) {
        this.tempcontrolFlag = tempcontrolFlag == null ? null : tempcontrolFlag.trim();
    }

    public BigDecimal getTempmax() {
        return tempmax;
    }

    public void setTempmax(BigDecimal tempmax) {
        this.tempmax = tempmax;
    }

    public BigDecimal getTempmin() {
        return tempmin;
    }

    public void setTempmin(BigDecimal tempmin) {
        this.tempmin = tempmin;
    }

    public BigDecimal getHummax() {
        return hummax;
    }

    public void setHummax(BigDecimal hummax) {
        this.hummax = hummax;
    }

    public BigDecimal getHummin() {
        return hummin;
    }

    public void setHummin(BigDecimal hummin) {
        this.hummin = hummin;
    }

    public String getTransportway() {
        return transportway;
    }

    public void setTransportway(String transportway) {
        this.transportway = transportway == null ? null : transportway.trim();
    }

    public String getTransporttype() {
        return transporttype;
    }

    public void setTransporttype(String transporttype) {
        this.transporttype = transporttype == null ? null : transporttype.trim();
    }

    public BigDecimal getDeviation() {
        return deviation;
    }

    public void setDeviation(BigDecimal deviation) {
        this.deviation = deviation;
    }

    public String getContainerable() {
        return containerable;
    }

    public void setContainerable(String containerable) {
        this.containerable = containerable == null ? null : containerable.trim();
    }

    public String getProbesnoutbound() {
        return probesnoutbound;
    }

    public void setProbesnoutbound(String probesnoutbound) {
        this.probesnoutbound = probesnoutbound == null ? null : probesnoutbound.trim();
    }

    public String getUniquesnoutbound() {
        return uniquesnoutbound;
    }

    public void setUniquesnoutbound(String uniquesnoutbound) {
        this.uniquesnoutbound = uniquesnoutbound == null ? null : uniquesnoutbound.trim();
    }

    public String getInventoryleavel() {
        return inventoryleavel;
    }

    public void setInventoryleavel(String inventoryleavel) {
        this.inventoryleavel = inventoryleavel == null ? null : inventoryleavel.trim();
    }

    public String getProcesscc() {
        return processcc;
    }

    public void setProcesscc(String processcc) {
        this.processcc = processcc == null ? null : processcc.trim();
    }

    public String getReplenishpriority() {
        return replenishpriority;
    }

    public void setReplenishpriority(String replenishpriority) {
        this.replenishpriority = replenishpriority == null ? null : replenishpriority.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo == null ? null : distributeNo.trim();
    }

    public Boolean getYn() {
        return yn;
    }

    public void setYn(Boolean yn) {
        this.yn = yn;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getAdultUsingFlag() {
        return adultUsingFlag;
    }

    public void setAdultUsingFlag(String adultUsingFlag) {
        this.adultUsingFlag = adultUsingFlag == null ? null : adultUsingFlag.trim();
    }

    public String getIrregularShapeFlag() {
        return irregularShapeFlag;
    }

    public void setIrregularShapeFlag(String irregularShapeFlag) {
        this.irregularShapeFlag = irregularShapeFlag == null ? null : irregularShapeFlag.trim();
    }

    public String getImportedFlag() {
        return importedFlag;
    }

    public void setImportedFlag(String importedFlag) {
        this.importedFlag = importedFlag == null ? null : importedFlag.trim();
    }

    public Byte getBoxManage() {
        return boxManage;
    }

    public void setBoxManage(Byte boxManage) {
        this.boxManage = boxManage;
    }

    public String getExpensiveFlag() {
        return expensiveFlag;
    }

    public void setExpensiveFlag(String expensiveFlag) {
        this.expensiveFlag = expensiveFlag == null ? null : expensiveFlag.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName == null ? null : foreignName.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit == null ? null : saleUnit.trim();
    }

    public Boolean getIsAllotype() {
        return isAllotype;
    }

    public void setIsAllotype(Boolean isAllotype) {
        this.isAllotype = isAllotype;
    }

    public Long getOmcVersion() {
        return omcVersion;
    }

    public void setOmcVersion(Long omcVersion) {
        this.omcVersion = omcVersion;
    }

    public Boolean getPmx() {
        return pmx;
    }

    public void setPmx(Boolean pmx) {
        this.pmx = pmx;
    }

    public BigDecimal getPlateGaugeBottom() {
        return plateGaugeBottom;
    }

    public void setPlateGaugeBottom(BigDecimal plateGaugeBottom) {
        this.plateGaugeBottom = plateGaugeBottom;
    }

    public BigDecimal getPlateGaugeHeight() {
        return plateGaugeHeight;
    }

    public void setPlateGaugeHeight(BigDecimal plateGaugeHeight) {
        this.plateGaugeHeight = plateGaugeHeight;
    }

    public Long getPpp() {
        return ppp;
    }

    public void setPpp(Long ppp) {
        this.ppp = ppp;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BsItembase other = (BsItembase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOwnerNo() == null ? other.getOwnerNo() == null : this.getOwnerNo().equals(other.getOwnerNo()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getVirtualFlag() == null ? other.getVirtualFlag() == null : this.getVirtualFlag().equals(other.getVirtualFlag()))
            && (this.getVolumnscale() == null ? other.getVolumnscale() == null : this.getVolumnscale().equals(other.getVolumnscale()))
            && (this.getGrassweight() == null ? other.getGrassweight() == null : this.getGrassweight().equals(other.getGrassweight()))
            && (this.getNetweight() == null ? other.getNetweight() == null : this.getNetweight().equals(other.getNetweight()))
            && (this.getOptStatus() == null ? other.getOptStatus() == null : this.getOptStatus().equals(other.getOptStatus()))
            && (this.getQc() == null ? other.getQc() == null : this.getQc().equals(other.getQc()))
            && (this.getProducer() == null ? other.getProducer() == null : this.getProducer().equals(other.getProducer()))
            && (this.getSuppiler() == null ? other.getSuppiler() == null : this.getSuppiler().equals(other.getSuppiler()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getProducingarea() == null ? other.getProducingarea() == null : this.getProducingarea().equals(other.getProducingarea()))
            && (this.getValidFlag() == null ? other.getValidFlag() == null : this.getValidFlag().equals(other.getValidFlag()))
            && (this.getNewFlag() == null ? other.getNewFlag() == null : this.getNewFlag().equals(other.getNewFlag()))
            && (this.getBuyer() == null ? other.getBuyer() == null : this.getBuyer().equals(other.getBuyer()))
            && (this.getPackagetype() == null ? other.getPackagetype() == null : this.getPackagetype().equals(other.getPackagetype()))
            && (this.getIs3gexpenseFlag() == null ? other.getIs3gexpenseFlag() == null : this.getIs3gexpenseFlag().equals(other.getIs3gexpenseFlag()))
            && (this.getLuxuryFlag() == null ? other.getLuxuryFlag() == null : this.getLuxuryFlag().equals(other.getLuxuryFlag()))
            && (this.getMovableFlag() == null ? other.getMovableFlag() == null : this.getMovableFlag().equals(other.getMovableFlag()))
            && (this.getHealthcareFlag() == null ? other.getHealthcareFlag() == null : this.getHealthcareFlag().equals(other.getHealthcareFlag()))
            && (this.getQcsampleFlag() == null ? other.getQcsampleFlag() == null : this.getQcsampleFlag().equals(other.getQcsampleFlag()))
            && (this.getGoodsTypeNo() == null ? other.getGoodsTypeNo() == null : this.getGoodsTypeNo().equals(other.getGoodsTypeNo()))
            && (this.getSerialManageFlag() == null ? other.getSerialManageFlag() == null : this.getSerialManageFlag().equals(other.getSerialManageFlag()))
            && (this.getJdbarcode() == null ? other.getJdbarcode() == null : this.getJdbarcode().equals(other.getJdbarcode()))
            && (this.getLotmanageFlag() == null ? other.getLotmanageFlag() == null : this.getLotmanageFlag().equals(other.getLotmanageFlag()))
            && (this.getMixbatchstorageFlag() == null ? other.getMixbatchstorageFlag() == null : this.getMixbatchstorageFlag().equals(other.getMixbatchstorageFlag()))
            && (this.getGeneralType() == null ? other.getGeneralType() == null : this.getGeneralType().equals(other.getGeneralType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpcCode() == null ? other.getUpcCode() == null : this.getUpcCode().equals(other.getUpcCode()))
            && (this.getProbesninbound() == null ? other.getProbesninbound() == null : this.getProbesninbound().equals(other.getProbesninbound()))
            && (this.getUniquesninbound() == null ? other.getUniquesninbound() == null : this.getUniquesninbound().equals(other.getUniquesninbound()))
            && (this.getReturncellNo() == null ? other.getReturncellNo() == null : this.getReturncellNo().equals(other.getReturncellNo()))
            && (this.getTare() == null ? other.getTare() == null : this.getTare().equals(other.getTare()))
            && (this.getAreaNo() == null ? other.getAreaNo() == null : this.getAreaNo().equals(other.getAreaNo()))
            && (this.getZoneNo() == null ? other.getZoneNo() == null : this.getZoneNo().equals(other.getZoneNo()))
            && (this.getCellNo() == null ? other.getCellNo() == null : this.getCellNo().equals(other.getCellNo()))
            && (this.getQczoneNo() == null ? other.getQczoneNo() == null : this.getQczoneNo().equals(other.getQczoneNo()))
            && (this.getHighvalue() == null ? other.getHighvalue() == null : this.getHighvalue().equals(other.getHighvalue()))
            && (this.getFrangible() == null ? other.getFrangible() == null : this.getFrangible().equals(other.getFrangible()))
            && (this.getChuanweiable() == null ? other.getChuanweiable() == null : this.getChuanweiable().equals(other.getChuanweiable()))
            && (this.getShelflifeFlag() == null ? other.getShelflifeFlag() == null : this.getShelflifeFlag().equals(other.getShelflifeFlag()))
            && (this.getMaxinventoryQty() == null ? other.getMaxinventoryQty() == null : this.getMaxinventoryQty().equals(other.getMaxinventoryQty()))
            && (this.getTempcontrolFlag() == null ? other.getTempcontrolFlag() == null : this.getTempcontrolFlag().equals(other.getTempcontrolFlag()))
            && (this.getTempmax() == null ? other.getTempmax() == null : this.getTempmax().equals(other.getTempmax()))
            && (this.getTempmin() == null ? other.getTempmin() == null : this.getTempmin().equals(other.getTempmin()))
            && (this.getHummax() == null ? other.getHummax() == null : this.getHummax().equals(other.getHummax()))
            && (this.getHummin() == null ? other.getHummin() == null : this.getHummin().equals(other.getHummin()))
            && (this.getTransportway() == null ? other.getTransportway() == null : this.getTransportway().equals(other.getTransportway()))
            && (this.getTransporttype() == null ? other.getTransporttype() == null : this.getTransporttype().equals(other.getTransporttype()))
            && (this.getDeviation() == null ? other.getDeviation() == null : this.getDeviation().equals(other.getDeviation()))
            && (this.getContainerable() == null ? other.getContainerable() == null : this.getContainerable().equals(other.getContainerable()))
            && (this.getProbesnoutbound() == null ? other.getProbesnoutbound() == null : this.getProbesnoutbound().equals(other.getProbesnoutbound()))
            && (this.getUniquesnoutbound() == null ? other.getUniquesnoutbound() == null : this.getUniquesnoutbound().equals(other.getUniquesnoutbound()))
            && (this.getInventoryleavel() == null ? other.getInventoryleavel() == null : this.getInventoryleavel().equals(other.getInventoryleavel()))
            && (this.getProcesscc() == null ? other.getProcesscc() == null : this.getProcesscc().equals(other.getProcesscc()))
            && (this.getReplenishpriority() == null ? other.getReplenishpriority() == null : this.getReplenishpriority().equals(other.getReplenishpriority()))
            && (this.getOrgNo() == null ? other.getOrgNo() == null : this.getOrgNo().equals(other.getOrgNo()))
            && (this.getDistributeNo() == null ? other.getDistributeNo() == null : this.getDistributeNo().equals(other.getDistributeNo()))
            && (this.getYn() == null ? other.getYn() == null : this.getYn().equals(other.getYn()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getAdultUsingFlag() == null ? other.getAdultUsingFlag() == null : this.getAdultUsingFlag().equals(other.getAdultUsingFlag()))
            && (this.getIrregularShapeFlag() == null ? other.getIrregularShapeFlag() == null : this.getIrregularShapeFlag().equals(other.getIrregularShapeFlag()))
            && (this.getImportedFlag() == null ? other.getImportedFlag() == null : this.getImportedFlag().equals(other.getImportedFlag()))
            && (this.getBoxManage() == null ? other.getBoxManage() == null : this.getBoxManage().equals(other.getBoxManage()))
            && (this.getExpensiveFlag() == null ? other.getExpensiveFlag() == null : this.getExpensiveFlag().equals(other.getExpensiveFlag()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPress() == null ? other.getPress() == null : this.getPress().equals(other.getPress()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getImagePath() == null ? other.getImagePath() == null : this.getImagePath().equals(other.getImagePath()))
            && (this.getForeignName() == null ? other.getForeignName() == null : this.getForeignName().equals(other.getForeignName()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getSaleUnit() == null ? other.getSaleUnit() == null : this.getSaleUnit().equals(other.getSaleUnit()))
            && (this.getIsAllotype() == null ? other.getIsAllotype() == null : this.getIsAllotype().equals(other.getIsAllotype()))
            && (this.getOmcVersion() == null ? other.getOmcVersion() == null : this.getOmcVersion().equals(other.getOmcVersion()))
            && (this.getPmx() == null ? other.getPmx() == null : this.getPmx().equals(other.getPmx()))
            && (this.getPlateGaugeBottom() == null ? other.getPlateGaugeBottom() == null : this.getPlateGaugeBottom().equals(other.getPlateGaugeBottom()))
            && (this.getPlateGaugeHeight() == null ? other.getPlateGaugeHeight() == null : this.getPlateGaugeHeight().equals(other.getPlateGaugeHeight()))
            && (this.getPpp() == null ? other.getPpp() == null : this.getPpp().equals(other.getPpp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOwnerNo() == null) ? 0 : getOwnerNo().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getVirtualFlag() == null) ? 0 : getVirtualFlag().hashCode());
        result = prime * result + ((getVolumnscale() == null) ? 0 : getVolumnscale().hashCode());
        result = prime * result + ((getGrassweight() == null) ? 0 : getGrassweight().hashCode());
        result = prime * result + ((getNetweight() == null) ? 0 : getNetweight().hashCode());
        result = prime * result + ((getOptStatus() == null) ? 0 : getOptStatus().hashCode());
        result = prime * result + ((getQc() == null) ? 0 : getQc().hashCode());
        result = prime * result + ((getProducer() == null) ? 0 : getProducer().hashCode());
        result = prime * result + ((getSuppiler() == null) ? 0 : getSuppiler().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getProducingarea() == null) ? 0 : getProducingarea().hashCode());
        result = prime * result + ((getValidFlag() == null) ? 0 : getValidFlag().hashCode());
        result = prime * result + ((getNewFlag() == null) ? 0 : getNewFlag().hashCode());
        result = prime * result + ((getBuyer() == null) ? 0 : getBuyer().hashCode());
        result = prime * result + ((getPackagetype() == null) ? 0 : getPackagetype().hashCode());
        result = prime * result + ((getIs3gexpenseFlag() == null) ? 0 : getIs3gexpenseFlag().hashCode());
        result = prime * result + ((getLuxuryFlag() == null) ? 0 : getLuxuryFlag().hashCode());
        result = prime * result + ((getMovableFlag() == null) ? 0 : getMovableFlag().hashCode());
        result = prime * result + ((getHealthcareFlag() == null) ? 0 : getHealthcareFlag().hashCode());
        result = prime * result + ((getQcsampleFlag() == null) ? 0 : getQcsampleFlag().hashCode());
        result = prime * result + ((getGoodsTypeNo() == null) ? 0 : getGoodsTypeNo().hashCode());
        result = prime * result + ((getSerialManageFlag() == null) ? 0 : getSerialManageFlag().hashCode());
        result = prime * result + ((getJdbarcode() == null) ? 0 : getJdbarcode().hashCode());
        result = prime * result + ((getLotmanageFlag() == null) ? 0 : getLotmanageFlag().hashCode());
        result = prime * result + ((getMixbatchstorageFlag() == null) ? 0 : getMixbatchstorageFlag().hashCode());
        result = prime * result + ((getGeneralType() == null) ? 0 : getGeneralType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpcCode() == null) ? 0 : getUpcCode().hashCode());
        result = prime * result + ((getProbesninbound() == null) ? 0 : getProbesninbound().hashCode());
        result = prime * result + ((getUniquesninbound() == null) ? 0 : getUniquesninbound().hashCode());
        result = prime * result + ((getReturncellNo() == null) ? 0 : getReturncellNo().hashCode());
        result = prime * result + ((getTare() == null) ? 0 : getTare().hashCode());
        result = prime * result + ((getAreaNo() == null) ? 0 : getAreaNo().hashCode());
        result = prime * result + ((getZoneNo() == null) ? 0 : getZoneNo().hashCode());
        result = prime * result + ((getCellNo() == null) ? 0 : getCellNo().hashCode());
        result = prime * result + ((getQczoneNo() == null) ? 0 : getQczoneNo().hashCode());
        result = prime * result + ((getHighvalue() == null) ? 0 : getHighvalue().hashCode());
        result = prime * result + ((getFrangible() == null) ? 0 : getFrangible().hashCode());
        result = prime * result + ((getChuanweiable() == null) ? 0 : getChuanweiable().hashCode());
        result = prime * result + ((getShelflifeFlag() == null) ? 0 : getShelflifeFlag().hashCode());
        result = prime * result + ((getMaxinventoryQty() == null) ? 0 : getMaxinventoryQty().hashCode());
        result = prime * result + ((getTempcontrolFlag() == null) ? 0 : getTempcontrolFlag().hashCode());
        result = prime * result + ((getTempmax() == null) ? 0 : getTempmax().hashCode());
        result = prime * result + ((getTempmin() == null) ? 0 : getTempmin().hashCode());
        result = prime * result + ((getHummax() == null) ? 0 : getHummax().hashCode());
        result = prime * result + ((getHummin() == null) ? 0 : getHummin().hashCode());
        result = prime * result + ((getTransportway() == null) ? 0 : getTransportway().hashCode());
        result = prime * result + ((getTransporttype() == null) ? 0 : getTransporttype().hashCode());
        result = prime * result + ((getDeviation() == null) ? 0 : getDeviation().hashCode());
        result = prime * result + ((getContainerable() == null) ? 0 : getContainerable().hashCode());
        result = prime * result + ((getProbesnoutbound() == null) ? 0 : getProbesnoutbound().hashCode());
        result = prime * result + ((getUniquesnoutbound() == null) ? 0 : getUniquesnoutbound().hashCode());
        result = prime * result + ((getInventoryleavel() == null) ? 0 : getInventoryleavel().hashCode());
        result = prime * result + ((getProcesscc() == null) ? 0 : getProcesscc().hashCode());
        result = prime * result + ((getReplenishpriority() == null) ? 0 : getReplenishpriority().hashCode());
        result = prime * result + ((getOrgNo() == null) ? 0 : getOrgNo().hashCode());
        result = prime * result + ((getDistributeNo() == null) ? 0 : getDistributeNo().hashCode());
        result = prime * result + ((getYn() == null) ? 0 : getYn().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getAdultUsingFlag() == null) ? 0 : getAdultUsingFlag().hashCode());
        result = prime * result + ((getIrregularShapeFlag() == null) ? 0 : getIrregularShapeFlag().hashCode());
        result = prime * result + ((getImportedFlag() == null) ? 0 : getImportedFlag().hashCode());
        result = prime * result + ((getBoxManage() == null) ? 0 : getBoxManage().hashCode());
        result = prime * result + ((getExpensiveFlag() == null) ? 0 : getExpensiveFlag().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPress() == null) ? 0 : getPress().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getImagePath() == null) ? 0 : getImagePath().hashCode());
        result = prime * result + ((getForeignName() == null) ? 0 : getForeignName().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getSaleUnit() == null) ? 0 : getSaleUnit().hashCode());
        result = prime * result + ((getIsAllotype() == null) ? 0 : getIsAllotype().hashCode());
        result = prime * result + ((getOmcVersion() == null) ? 0 : getOmcVersion().hashCode());
        result = prime * result + ((getPmx() == null) ? 0 : getPmx().hashCode());
        result = prime * result + ((getPlateGaugeBottom() == null) ? 0 : getPlateGaugeBottom().hashCode());
        result = prime * result + ((getPlateGaugeHeight() == null) ? 0 : getPlateGaugeHeight().hashCode());
        result = prime * result + ((getPpp() == null) ? 0 : getPpp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ownerNo=").append(ownerNo);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", name=").append(name);
        sb.append(", virtualFlag=").append(virtualFlag);
        sb.append(", volumnscale=").append(volumnscale);
        sb.append(", grassweight=").append(grassweight);
        sb.append(", netweight=").append(netweight);
        sb.append(", optStatus=").append(optStatus);
        sb.append(", qc=").append(qc);
        sb.append(", producer=").append(producer);
        sb.append(", suppiler=").append(suppiler);
        sb.append(", brand=").append(brand);
        sb.append(", producingarea=").append(producingarea);
        sb.append(", validFlag=").append(validFlag);
        sb.append(", newFlag=").append(newFlag);
        sb.append(", buyer=").append(buyer);
        sb.append(", packagetype=").append(packagetype);
        sb.append(", is3gexpenseFlag=").append(is3gexpenseFlag);
        sb.append(", luxuryFlag=").append(luxuryFlag);
        sb.append(", movableFlag=").append(movableFlag);
        sb.append(", healthcareFlag=").append(healthcareFlag);
        sb.append(", qcsampleFlag=").append(qcsampleFlag);
        sb.append(", goodsTypeNo=").append(goodsTypeNo);
        sb.append(", serialManageFlag=").append(serialManageFlag);
        sb.append(", jdbarcode=").append(jdbarcode);
        sb.append(", lotmanageFlag=").append(lotmanageFlag);
        sb.append(", mixbatchstorageFlag=").append(mixbatchstorageFlag);
        sb.append(", generalType=").append(generalType);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", upcCode=").append(upcCode);
        sb.append(", probesninbound=").append(probesninbound);
        sb.append(", uniquesninbound=").append(uniquesninbound);
        sb.append(", returncellNo=").append(returncellNo);
        sb.append(", tare=").append(tare);
        sb.append(", areaNo=").append(areaNo);
        sb.append(", zoneNo=").append(zoneNo);
        sb.append(", cellNo=").append(cellNo);
        sb.append(", qczoneNo=").append(qczoneNo);
        sb.append(", highvalue=").append(highvalue);
        sb.append(", frangible=").append(frangible);
        sb.append(", chuanweiable=").append(chuanweiable);
        sb.append(", shelflifeFlag=").append(shelflifeFlag);
        sb.append(", maxinventoryQty=").append(maxinventoryQty);
        sb.append(", tempcontrolFlag=").append(tempcontrolFlag);
        sb.append(", tempmax=").append(tempmax);
        sb.append(", tempmin=").append(tempmin);
        sb.append(", hummax=").append(hummax);
        sb.append(", hummin=").append(hummin);
        sb.append(", transportway=").append(transportway);
        sb.append(", transporttype=").append(transporttype);
        sb.append(", deviation=").append(deviation);
        sb.append(", containerable=").append(containerable);
        sb.append(", probesnoutbound=").append(probesnoutbound);
        sb.append(", uniquesnoutbound=").append(uniquesnoutbound);
        sb.append(", inventoryleavel=").append(inventoryleavel);
        sb.append(", processcc=").append(processcc);
        sb.append(", replenishpriority=").append(replenishpriority);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", distributeNo=").append(distributeNo);
        sb.append(", yn=").append(yn);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", adultUsingFlag=").append(adultUsingFlag);
        sb.append(", irregularShapeFlag=").append(irregularShapeFlag);
        sb.append(", importedFlag=").append(importedFlag);
        sb.append(", boxManage=").append(boxManage);
        sb.append(", expensiveFlag=").append(expensiveFlag);
        sb.append(", isbn=").append(isbn);
        sb.append(", author=").append(author);
        sb.append(", press=").append(press);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", imagePath=").append(imagePath);
        sb.append(", foreignName=").append(foreignName);
        sb.append(", spec=").append(spec);
        sb.append(", saleUnit=").append(saleUnit);
        sb.append(", isAllotype=").append(isAllotype);
        sb.append(", omcVersion=").append(omcVersion);
        sb.append(", pmx=").append(pmx);
        sb.append(", plateGaugeBottom=").append(plateGaugeBottom);
        sb.append(", plateGaugeHeight=").append(plateGaugeHeight);
        sb.append(", ppp=").append(ppp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}