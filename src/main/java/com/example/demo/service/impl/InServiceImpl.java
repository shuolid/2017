package com.example.demo.service.impl;

import com.example.demo.BizType;
import com.example.demo.apiModel.BizTypeEnum;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.apiModel.Return;
import com.example.demo.apiModel.asnDataImport.ParkAsnD;
import com.example.demo.apiModel.asnDataImport.ParkAsnExpend;
import com.example.demo.apiModel.asnDataImport.ParkAsnM;
import com.example.demo.apiModel.asnDataImport.SkuProfitLossInfo;
import com.example.demo.apiModel.caseInfo.*;
import com.example.demo.apiModel.importReceivingTask.SparePartsImportD;
import com.example.demo.apiModel.importReceivingTask.SparePartsImportM;
import com.example.demo.apiModel.issuedOrders.ProductRequest;
import com.example.demo.apiModel.issuedOrders.ReturnRequest;
import com.example.demo.entity.BsItembase;
import com.example.demo.mapper.GoodMapper;
import com.example.demo.service.InService;
import com.example.demo.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class InServiceImpl implements InService {
    private  Logger log = LoggerFactory.getLogger(InServiceImpl.class);
    @Autowired
    private GoodMapper goodMapper;

    @Override
    public ResultModel asnDataImport(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String asnType, String profitLossId, String profitLossType, String profitLossQty) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String inboundNo = Long.toString(System.currentTimeMillis() + i);
                ParkAsnM parkAsnM = new ParkAsnM();
                if("采购ASN单".equals(asnType)){
                    parkAsnM.setInboundNo("ASN" + inboundNo);
                    parkAsnM.setPoNo(inboundNo);
                    parkAsnM.setPoType(2);//1：采购单；2：ASN单
                }else {
                    parkAsnM.setInboundNo(inboundNo);
                    parkAsnM.setPoNo(inboundNo);
                    parkAsnM.setPoType(1);//1：采购单；2：ASN单
                }
                parkAsnM.setDistributeNo("6");
                parkAsnM.setWarehouseNo(routeRule);
                parkAsnM.setInboundType("0");
                parkAsnM.setInboundStatus(0);
                parkAsnM.setTotalQty(60.0d);
                parkAsnM.setPurchaseTransFlag(0);
                parkAsnM.setSupplierNo("bjylgxgs");
                parkAsnM.setSupplierName("北京燕轮供销公司");
                parkAsnM.setEclpSign(0);
                parkAsnM.setOrderAttribute("1");

                List<ParkAsnD> parkAsnDList = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    ParkAsnD parkAsnD = new ParkAsnD();
                    parkAsnD.setInnerId(0);
                    parkAsnD.setGoodsNo(goodsArr[j]);
                    parkAsnD.setExpectedQty(new BigDecimal(goodNum.split(",")[j]).doubleValue());
                    parkAsnD.setSourceGoodsNo("swagger测试");
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        parkAsnD.setSourceGoodsNo(list.get(0).getName());
                    }
                    parkAsnD.setBarCodeType("3");
                    parkAsnD.setSerialListFlag("0");
                    parkAsnD.setIncomplete("1");
                    parkAsnD.setExcess("0");
                    parkAsnD.setExceedQty(-1d);
                    parkAsnD.setUnitPackage(1);

                    //渠道
                    if(!"0".equals(profitLossId)){
                        List<SkuProfitLossInfo> skuProfitLossInfoList = new ArrayList<>();
                        SkuProfitLossInfo skuProfitLossInfo  =  new SkuProfitLossInfo();
                        skuProfitLossInfo.setProfitLossId(profitLossId.split(",")[j]);
                        skuProfitLossInfo.setQty(profitLossQty);
                        skuProfitLossInfoList.add(skuProfitLossInfo);
                        parkAsnD.setSkuProfitLossInfoList(skuProfitLossInfoList);
                    }



                    parkAsnDList.add(parkAsnD);
                }
                parkAsnM.setParkAsnDList(parkAsnDList);

                List<ParkAsnExpend> parkAsnExpendList = new ArrayList<>();
                ParkAsnExpend licensedSign = new ParkAsnExpend();
                licensedSign.setKey("licensedSign");
                licensedSign.setValue("0");
                parkAsnExpendList.add(licensedSign);

                ParkAsnExpend markSign = new ParkAsnExpend();
                markSign.setKey("markSign");
                markSign.setValue("1");
                parkAsnExpendList.add(markSign);

                ParkAsnExpend isMulReceiving = new ParkAsnExpend();
                isMulReceiving.setKey("isMulReceiving");
                isMulReceiving.setValue("1");
                parkAsnExpendList.add(isMulReceiving);

                ParkAsnExpend frontWhsFlag = new ParkAsnExpend();
                frontWhsFlag.setKey("frontWhsFlag");
                frontWhsFlag.setValue("0");
                parkAsnExpendList.add(frontWhsFlag);

                ParkAsnExpend freshShortSafeFlag = new ParkAsnExpend();
                freshShortSafeFlag.setKey("freshShortSafeFlag");
                freshShortSafeFlag.setValue("0");
                parkAsnExpendList.add(freshShortSafeFlag);

                ParkAsnExpend putawayType = new ParkAsnExpend();
                putawayType.setKey("putawayType");
                putawayType.setValue("1");
                parkAsnExpendList.add(putawayType);

                ParkAsnExpend xnitype = new ParkAsnExpend();
                xnitype.setKey("xnitype");
                xnitype.setValue("0");
                parkAsnExpendList.add(xnitype);

                ParkAsnExpend twiceSerialFlag = new ParkAsnExpend();
                twiceSerialFlag.setKey("twiceSerialFlag");
                twiceSerialFlag.setValue("");
                parkAsnExpendList.add(twiceSerialFlag);

                if(!"0".equals(profitLossId)){
                    ParkAsnExpend channelType = new ParkAsnExpend();
                    channelType.setKey("channelType");
                    channelType.setValue("2");
                    if("B单".equals(profitLossType)){
                        channelType.setValue("1");
                    }
                    parkAsnExpendList.add(channelType);
                }

                parkAsnM.setParkAsnExpendList(parkAsnExpendList);

                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(parkAsnM));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(inboundNo);
                }
            }
        } catch (Exception e) {
            log.error("采购单接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel importReceivingTask(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String asnType, String profitLossId, String profitLossType, String profitLossQty) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String inboundNo = Long.toString(System.currentTimeMillis() + i);
                SparePartsImportM sparePartsImportM = new SparePartsImportM();
                Date date = new Date();
                String seqNo = UUID.randomUUID().toString().replaceAll("-", "");
                sparePartsImportM.setChecker("备件库");
                sparePartsImportM.setClassType("0");
                sparePartsImportM.setLocNo("3");
                sparePartsImportM.setNotes("B");
                sparePartsImportM.setPurDate(date);
                sparePartsImportM.setSeqNo(seqNo);
                sparePartsImportM.setSheetId(inboundNo);
                sparePartsImportM.setSheetType("4");
                sparePartsImportM.setValidDate(date);
                sparePartsImportM.setWareNo(routeRule);
                sparePartsImportM.setErpWareNo(routeRule);
                sparePartsImportM.setWmsTarget("6,6," + routeRule);
                if(!"0".equals(profitLossId)){
                    sparePartsImportM.setDocumentId("0");
                    if("B单".equals(profitLossType)){
                        sparePartsImportM.setDocumentId("1");
                    }
                }

                List<SparePartsImportD> sparePartsImportDList = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    SparePartsImportD sparePartsImportD = new SparePartsImportD();
                    sparePartsImportD.setSeqNo(seqNo);
                    sparePartsImportD.setGoodsId(goodsArr[j]);
                    sparePartsImportD.setSheetId(inboundNo);
                    sparePartsImportD.setLocNo("3");
                    sparePartsImportD.setPkCount(0);
                    sparePartsImportD.setQty(new BigDecimal(goodNum.split(",")[j]).doubleValue());
                    sparePartsImportD.setSerialId("1");
                    sparePartsImportD.setSupplierNo("lsbjgdgc");
                    //渠道
                    if(!"0".equals(profitLossId)){
                        sparePartsImportD.setChannelId(profitLossId.split(",")[j]);
                    }

                    sparePartsImportDList.add(sparePartsImportD);
                }
                sparePartsImportM.setSparePartsImportDList(sparePartsImportDList);


                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(sparePartsImportM));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(inboundNo);
                }
            }
        } catch (Exception e) {
            log.error("备件库入大库接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel issuedOrders(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String asnType, String profitLossId, String profitLossType, String profitLossQty) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String inboundNo = Long.toString(System.currentTimeMillis() + i);
                ReturnRequest returnRequest = new ReturnRequest();
                String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                String sendCode = UUID.randomUUID().toString().replaceAll("-", "");
                returnRequest.setCky2("6");
                returnRequest.setInStore(routeRule);
                returnRequest.setLossQuantity(0);
                returnRequest.setOperateTime(date);
                returnRequest.setOrderId(inboundNo);
                returnRequest.setOrgId("6");
                returnRequest.setPackageCodes(inboundNo);
                returnRequest.setSendCode(sendCode);
                returnRequest.setStoreId(routeRule);
                returnRequest.setUserName("swagger测试");
                returnRequest.setSource(1);

                List<ProductRequest> productRequests = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    ProductRequest productRequest = new ProductRequest();
                    productRequest.setProductId(goodsArr[j]);
                    productRequest.setProductLoss(1);
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        productRequest.setProductName(list.get(0).getName());
                    }
                    productRequest.setProductNum(new BigDecimal(goodNum.split(",")[j]).intValue());
                    productRequest.setProductPrice(39.9d);

                    //渠道
                    productRequests.add(productRequest);
                }
                returnRequest.setProductRequests(productRequests);


                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(returnRequest));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(inboundNo);
                }
            }
        } catch (Exception e) {
            log.error("客户退货单接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel downLoadNewReceivedNoAndCaseInfo(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String asnType, String profitLossId, String profitLossType, String profitLossQty) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            //内配入箱报文
            for(int i = 0; i<excuteCount; i++){
                String boxId = Long.toString(System.currentTimeMillis() + i);
                BoxDetail boxDetail = new BoxDetail();
                String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                boxDetail.setTaskId(UUID.randomUUID().toString());
                boxDetail.setFrom(686);
                boxDetail.setTo(6);
                boxDetail.setOperatorName("swagger测试");
                boxDetail.setBoxid(boxId);
                boxDetail.setBarcode(boxId);
                boxDetail.setStartSid(571110);
                boxDetail.setToSid(Integer.parseInt(routeRule));
                boxDetail.setOutsideno("VW" + boxId);

                List<Boxware> qingdanlist = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    Boxware boxware = new Boxware();
                    boxware.setId(boxId);
                    boxware.setType(1);
                    boxware.setBilv(1);
                    boxware.setWid(goodsArr[j]);
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        boxware.setWname(list.get(0).getName());
                    }
                    boxware.setWnum(Integer.valueOf(goodNum));
                    boxware.setBoxid(boxId);
                    boxware.setOperatorId("swagger");
                    boxware.setTimeState(date);
                    boxware.setState(2);
                    boxware.setRfid(0);
                    boxware.setOldState(0);
                    boxware.setNewState(0);
                    boxware.setBarcode(boxId);
                    qingdanlist.add(boxware);
                }
                boxDetail.setQingdanlist(qingdanlist);


                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(boxDetail));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(boxId);
                }
            }

            //内配入批次报文
            for(int m = 0; m<orderIdList.size(); m++){
                TransBillsFromWms3 transBillsFromWms3 = new TransBillsFromWms3();

                String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                IbTransferDeliveryBill ibTransferDeliveryBill = new IbTransferDeliveryBill();
                ibTransferDeliveryBill.setId(0);
                ibTransferDeliveryBill.setDeliveryBillNo(orderIdList.get(m) + "swagger");
                ibTransferDeliveryBill.setSource(1);
                ibTransferDeliveryBill.setOrgNo("6");
                ibTransferDeliveryBill.setDistributeNo("6");
                ibTransferDeliveryBill.setWarehouseNo(routeRule);
                ibTransferDeliveryBill.setFromOrgNo("6");
                ibTransferDeliveryBill.setFromDistributeNo("6");
                ibTransferDeliveryBill.setFromWarehouseNo("80");
                ibTransferDeliveryBill.setDeliveryTime(date);
                ibTransferDeliveryBill.setCaseQty(new BigDecimal("1"));
                ibTransferDeliveryBill.setCarrierCode("001");
                ibTransferDeliveryBill.setCarrierBillNo("2016110701");
                ibTransferDeliveryBill.setCarrierName("中外运久凌储运有限公司上海分公司");

                transBillsFromWms3.setIbTransferDeliveryBill(ibTransferDeliveryBill);

                List<TransCaseInfoFromWms3> caseInfos = new ArrayList<>();
                TransCaseInfoFromWms3 transCaseInfoFromWms3 = new TransCaseInfoFromWms3();
                transCaseInfoFromWms3.setProfitLossId("111");
                transCaseInfoFromWms3.setChannelType("B");
                transCaseInfoFromWms3.setOrgNo("6");
                transCaseInfoFromWms3.setDistributeNo("6");
                transCaseInfoFromWms3.setWarehouseNo(routeRule);
                transCaseInfoFromWms3.setInboundStatus(0);
                transCaseInfoFromWms3.setTotalQty(10);
                transCaseInfoFromWms3.setTotalWeight(0);
                transCaseInfoFromWms3.setTotalVolume(0);
                transCaseInfoFromWms3.setLabelQty(0);
                transCaseInfoFromWms3.setPurchaseTransFlag(0);
                transCaseInfoFromWms3.setCarrierNo("001");
                transCaseInfoFromWms3.setCarrierName("中外运久凌储运有限公司上海分公司");
                transCaseInfoFromWms3.setCaseType("masterBox");
                transCaseInfoFromWms3.setTransType("G1");
                transCaseInfoFromWms3.setExpectedWeight(0.24d);
                transCaseInfoFromWms3.setCaseVolume(1287000d);
                transCaseInfoFromWms3.setCaseNo(orderIdList.get(m));
                transCaseInfoFromWms3.setCaseRealQty(1);

                List<IbReceivingTaskD> ibReceivingTaskDs = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int n =0; n< goodsArr.length; n++) {
                    IbReceivingTaskD ibReceivingTaskD = new IbReceivingTaskD();
                    ibReceivingTaskD.setInboundNo(orderIdList.get(m));
                    ibReceivingTaskD.setUuid(orderIdList.get(m));
                    ibReceivingTaskD.setOwnerNo("1");
                    ibReceivingTaskD.setOrgNo("6");
                    ibReceivingTaskD.setDistributeNo("6");
                    ibReceivingTaskD.setWarehouseNo(routeRule);
                    ibReceivingTaskD.setInnerId(0);
                    ibReceivingTaskD.setGoodsNo(goodsArr[n]);
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[n]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        ibReceivingTaskD.setGoodsName(list.get(0).getName());
                    }
                    ibReceivingTaskD.setPackingQty(0);
                    ibReceivingTaskD.setPackingUnit("件");
                    ibReceivingTaskD.setExpectedQty(new BigDecimal(goodNum.split(",")[n]).doubleValue());
                    ibReceivingTaskD.setReceivedQty(0d);
                    ibReceivingTaskD.setReturnLossQty(0d);
                    ibReceivingTaskD.setLotNo("-1");
                    ibReceivingTaskD.setSnFlag(1);
                    ibReceivingTaskD.setIsBox(0);
                    ibReceivingTaskD.setBoxRuleCode("3-each");
                    ibReceivingTaskDs.add(ibReceivingTaskD);
                }
                transCaseInfoFromWms3.setIbReceivingTaskDs(ibReceivingTaskDs);
                caseInfos.add(transCaseInfoFromWms3);
                transBillsFromWms3.setCaseInfos(caseInfos);

                List<TransGoodsFromWms3> transGoodsFromWms3s = new ArrayList<>();
                TransGoodsFromWms3 transGoodsFromWms3 = new TransGoodsFromWms3();
                transGoodsFromWms3.setGoodsNo("100000055000");
                transGoodsFromWms3.setLotNo("-1");
                transGoodsFromWms3s.add(transGoodsFromWms3);
                transBillsFromWms3.setTransGoodsFromWms3s(transGoodsFromWms3s);

                BizType b= BizType.builder()
                        .bizType(BizTypeEnum.TRANS_BILLS.getBizType())
                        .uuid(BizTypeEnum.TRANS_BILLS.getUuid())
                        .callCode(BizTypeEnum.TRANS_BILLS.getCallCode())
                        .url(BizTypeEnum.TRANS_BILLS.getUrl())
                        .routeRule(routeRule)
                        .build();
                result = XmlUtil.getStringResponse(b,transBillsFromWms3);
            }
        } catch (Exception e) {
            log.error("内配入报文接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }
}
