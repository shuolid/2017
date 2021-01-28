package com.example.demo.service.impl;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.apiModel.asnDataImport.ParkAsnD;
import com.example.demo.apiModel.asnDataImport.ParkAsnExpend;
import com.example.demo.apiModel.asnDataImport.ParkAsnM;
import com.example.demo.service.InService;
import com.example.demo.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class InServiceImpl implements InService {
    private  Logger log = LoggerFactory.getLogger(InServiceImpl.class);

    @Override
    public ResultModel asnDataImport(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
        try {
            for(int i = 0; i<excuteCount; i++){
                String inboundNo = Long.toString(System.currentTimeMillis() + i);
                Calendar calendar = Calendar.getInstance();

                ParkAsnM parkAsnM = new ParkAsnM();
                parkAsnM.setInboundNo(inboundNo);
                parkAsnM.setPoNo(inboundNo);
                parkAsnM.setPoType(1);//1：采购单；2：ASN单
                parkAsnM.setDistributeNo("6");
                parkAsnM.setDistributeNo(routeRule);
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
                    parkAsnD.setBarCodeType("3");
                    parkAsnD.setSerialListFlag("0");
                    parkAsnD.setIncomplete("1");
                    parkAsnD.setExcess("0");
                    parkAsnD.setExceedQty(-1d);
                    parkAsnD.setUnitPackage(1);
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
                parkAsnExpendList.add(twiceSerialFlag);

                parkAsnM.setParkAsnExpendList(parkAsnExpendList);

                XmlUtil.getStringResponse(bizType,parkAsnM);
                orderIdList.add(inboundNo);
            }
        } catch (Exception e) {
            log.error("采购单接口异常：",e);
            return ResultModel.builder().code(1).message("失败").data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message("成功").data(orderIdList).build();
    }
}
