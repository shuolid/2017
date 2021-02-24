package com.example.demo.service.impl;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.apiModel.Return;
import com.example.demo.apiModel.downLoadShipment.*;
import com.example.demo.apiModel.receiveOrder.ReceiveOrder;
import com.example.demo.apiModel.receivedOwnerShipment.ReturnsOrder;
import com.example.demo.apiModel.receivedScrapShipment.ScrapShipment;
import com.example.demo.apiModel.receivedScrapShipment.ScrapWare;
import com.example.demo.entity.BsItembase;
import com.example.demo.mapper.DicDetailMapper;
import com.example.demo.mapper.GoodMapper;
import com.example.demo.service.OutService;
import com.example.demo.util.CompressUtil;
import com.example.demo.util.XmlUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class OutServiceImpl implements OutService {
    private  Logger log = LoggerFactory.getLogger(OutServiceImpl.class);

    @Autowired
    private DicDetailMapper dicDetailMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public ResultModel downLoadShipment(String goodNo, String goodNum, Integer excuteCount, String sendPay, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String orderId = Long.toString(System.currentTimeMillis() + i);
                Calendar calendar = Calendar.getInstance();

                OdOrders odOrders = new OdOrders();
                odOrders.setAddress("北京西城区内环到二环里右安门内大街万博苑小区1号楼6单元302");
                odOrders.setId(0);
                odOrders.setState(7);
                odOrders.setStatus(0);
                odOrders.setWeight(new BigDecimal("57.6000"));
                odOrders.setJyn(0);
                odOrders.setSendpay(sendPay);
                odOrders.setPartnerid("604");
                odOrders.setPrintflag(1);
                odOrders.setCky2(6);
                odOrders.setStoreId(Integer.valueOf(routeRule));
                odOrders.setStoreid(Integer.valueOf(routeRule));
                odOrders.setUprovince(1);
                odOrders.setUcity(2801);
                odOrders.setUcounty(2827);
                odOrders.setCustomerName("宋斌");
                odOrders.setMobile("13911134886");
                odOrders.setPayment(4);
                odOrders.setFactPrice(new BigDecimal("95.7000"));
                odOrders.setPaysureDate(Calendar.getInstance());
                odOrders.setDi(70);
                odOrders.setYun(BigDecimal.ZERO);
                odOrders.setOrderId(orderId);
                odOrders.setOrderid(orderId);
                odOrders.setYouhui(BigDecimal.TEN);
                odOrders.setCreateDate(calendar);
                odOrders.setYn(0);
                odOrders.setPrintx(0);
                odOrders.setTotalPrice(new BigDecimal("101.70"));
                odOrders.setMemberId("rebeccawednesday");
                odOrders.setState2(9);
                odOrders.setRemark("");
                odOrders.setPhone("");
                odOrders.setEmail("");
                odOrders.setZip("");
                odOrders.setIsJdShip(1);
                odOrders.setZiti(0);
                odOrders.setQlShipNo("JDX000155638868");
                odOrders.setCreateTime(calendar);
                odOrders.setVolume(new BigDecimal("92078.0000"));
                odOrders.setPrintInfoFlag(0);
                odOrders.setUpdateDate(calendar);
                odOrders.setLocNo("");
                odOrders.setSheetType(0);
                odOrders.setSndDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                odOrders.setSndTime("");

                List<OdOrderDetail> odOrderDetailList  = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    OdOrderDetail odOrderDetail = new OdOrderDetail();
                    odOrderDetail.setId(0);
                    odOrderDetail.setPrice(33.90d);
                    odOrderDetail.setProductId(goodsArr[j]);
                    odOrderDetail.setQuantity(new BigDecimal(goodNum.split(",")[j]));
                    odOrderDetail.setProductName("swagger测试");
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        odOrderDetail.setProductName(list.get(0).getName());
                    }
                    odOrderDetail.setOrderid(orderId);
                    odOrderDetail.setSerialId(1);
                    odOrderDetail.setIsVMI(0);
                    odOrderDetailList.add(odOrderDetail);
                }
                odOrders.setOdOrderDetailList(odOrderDetailList);

                Map<String,Object> distributionInfo = new HashMap<>();
                distributionInfo.put("originalDmsName","北京马驹桥分拣中心");
                distributionInfo.put("originalDmsId",910);
                distributionInfo.put("destinationDmsName","北京马驹桥分拣中心");
                distributionInfo.put("destinationDmsId",910);
                distributionInfo.put("originalCrossCode","101");
                distributionInfo.put("originalTabletrolleyCode","101");
                distributionInfo.put("destinationCrossCode","101");
                distributionInfo.put("destinationTabletrolleyCode","101");
                distributionInfo.put("isZiTi",0);
                distributionInfo.put("printSiteName","打印站点名称");
                distributionInfo.put("printAddress","打印地址");

                Map<String,Object> extendInfo = new HashMap<>();
                extendInfo.put("distributionInfo",distributionInfo);
                odOrders.setExtendInfo(extendInfo);

                OdPrintInfo odPrintInfo = new OdPrintInfo();
                odPrintInfo.setId(0);
                odPrintInfo.setType(1);
                odPrintInfo.setCky2(6);
                odPrintInfo.setOrderid(orderId);
                odPrintInfo.setPrintInfo(getPrintInfo(odOrders,distributionInfo));
//                odPrintInfo.setPrintInfo("H4sIAAAAAAAAAK1TXU8TQRT9K80+ECVss7MD9CMhJrQ+kBAkhremMcPuCBu73bo7VSqaSBSwsXwY\nIBXEGAxVDKbQ0BRTvv7Mzm775F/wzhYIYIgv3ofN3Dvn3Dlz5u60NE6YNjmUfWxJcemOGrsrp1Le\nejUtp9yT9d/HG0pYUdKhl6G01CM9N50kZcTIDBsOk+KpaSlnW3peY4YO5GhvNNrXB7DzYpaYFMp8\nbpNv7/JazTsohvj2D/9to12p+qs73n4dhfuGu5HqrzRC3lrdr9YCtqEJHsbhmAL50zzJMoMVRAm0\nQMXJmxcgpKBwRJFepaFqMFHpblXO+JdFXmrKvFR2mz/94qfWVtnfXQfmOLE1SxewQWInYBUmTm7q\nXsLKFR4aE5NsjE6xga7BDmqskKMDiQfJ+0iNDnYlCSMDSI30RrHajzCGbsxiJDN6rkTpaNNIJiMu\nvfwNEsvWqT0kvLlOBPVZNmYE9qgK6pcVLKNICOE4RnEVAcKmGjWeURsA3tcZb2uZH34WJ1LRHOEY\nQggLu6Gm04xAFs77uUdH7smaV260y3XYJbpuU8cRkgI3Lt3hc7P+4h5/t+82S7Boz5f40gGvFtvl\nHdji29/BNPfXPF/YaL3/wPeXgIL40qFXOe7nC2t89g1W1ECoSewn0D5wV0ySfvVS0RA/WfHKlfbr\nmdbp6SX+Ra7D0PIOs8xE50lEblPC6G3OKBGA5B1qj3Qm65ozBsvQy1vKagy08uaKzDd3/OaZt7rn\nHn28eLKRvCmGCVLDJBPBUQg9ukVzjxg4mtVHSSGYt06oyo2AAhKbGMMHXdlAV5f4Ju2vQP9E/IdA\n8Mf8AcRWPT75AwAA");
                odPrintInfo.setInvoiceDetail("");
                odOrders.setOdPrintInfo(odPrintInfo);

                result = XmlUtil.getStringResponse(bizType,odOrders);
                if("1".equals(result.getResultCode())){
                    orderIdList.add(orderId);
                }
            }
        } catch (Exception e) {
            log.error("客单出库接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel packageSwitch(String packageSwitch) {
        if("开启".equals(packageSwitch)){
            log.info(packageSwitch + "包裹生产");
            dicDetailMapper.packageSwitch(1);
        }else{
            log.info(packageSwitch + "包裹生产");
            dicDetailMapper.packageSwitch(0);
        }
        return ResultModel.builder().code(0).message(packageSwitch + "包裹生产成功").data(null).build();
    }

    @Override
    public ResultModel receivedOwnerShipmentService(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String id = Long.toString(System.currentTimeMillis() + i);

                ReturnsOrder returnsOrder = new ReturnsOrder();
                returnsOrder.setId(id);
                returnsOrder.setProviderCode("POP_58724");
                returnsOrder.setProviderName("山姆店测试公司");
                returnsOrder.setReturnCompanyID("6");
                returnsOrder.setOperatorName("swagger测试");
                returnsOrder.setTransportType("2");
                returnsOrder.setIsScraped("2");
                returnsOrder.setBanlanceType("3");
                returnsOrder.setReturnsMoney("800");
                returnsOrder.setCarriage("0");
                returnsOrder.setTotalProductNum("1");
                returnsOrder.setPickSpot("0");
                returnsOrder.setReceiveCompanyID("6");
                returnsOrder.setIsLocalReturn("Y");
                returnsOrder.setReturnStockNo(routeRule);
                returnsOrder.setReturnOrgNo("6");
                returnsOrder.setReceiveStockNo(routeRule);
                returnsOrder.setReceiveOrgNo("6");
                returnsOrder.setSelfSource("6");
                returnsOrder.setReceiveAddress("天津天津市滨海新区新北路4668号创新创业园31号楼5层");
                returnsOrder.setReceiverCell("15901421383");
                returnsOrder.setInboundNo("88888888");
                returnsOrder.setReturnsOrderType("0");
                returnsOrder.setReturnstype("2");

                List<ReturnsOrder.RetrunProduct> retrunProductList = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    ReturnsOrder.RetrunProduct retrunProduct = new ReturnsOrder.RetrunProduct();
                    retrunProduct.setProductID(goodsArr[j]);
                    retrunProduct.setProductName("swagger测试");
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        retrunProduct.setProductName(list.get(0).getName());
                    }
                    retrunProduct.setReturnsNum(goodNum.split(",")[j]);
                    retrunProduct.setReturnsPrice("39.9");
                    retrunProduct.setSpecNo("12345");
                    retrunProductList.add(retrunProduct);
                }
                returnsOrder.setRetrunProductList(retrunProductList);

                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(returnsOrder));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(id);
                }
            }
        } catch (Exception e) {
            log.error("退供出库接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel receivedScrapShipment(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String id = Long.toString(System.currentTimeMillis() + i);

                ScrapShipment scrapShipment = new ScrapShipment();
                scrapShipment.setId(id);
                scrapShipment.setRid("6");
                scrapShipment.setSid(routeRule);
                scrapShipment.setIsShortage("0");
                scrapShipment.setAddTime(new Date());
                scrapShipment.setApplicant("swagger测试");

                List<ScrapWare> scrapWareList = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    ScrapWare scrapWare = new ScrapWare();
                    scrapWare.setWid(goodsArr[j]);
                    scrapWare.setWname("swagger测试");
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        scrapWare.setWname(list.get(0).getName());
                    }
                    scrapWare.setNum(goodNum.split(",")[j]);
                    scrapWareList.add(scrapWare);
                }
                scrapShipment.setScrapWareList(scrapWareList);

                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(scrapShipment));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(id);
                }
            }
        } catch (Exception e) {
            log.error("报废出库接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    @Override
    public ResultModel receiveOrder(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
        Return result = new Return();
        try {
            for(int i = 0; i<excuteCount; i++){
                String id = Long.toString(System.currentTimeMillis() + i);

                ReceiveOrder receiveOrder = new ReceiveOrder();
                receiveOrder.setTaskId(UUID.randomUUID().toString());
                receiveOrder.setRfid(id);
                receiveOrder.setFrom("6");
                receiveOrder.setTo("6");
                receiveOrder.setStartSid(routeRule);
                receiveOrder.setToSid("55");
                if("55".equals(routeRule)){
                    receiveOrder.setToSid("98");
                }
                receiveOrder.setOperatorName("swagger测试");
                receiveOrder.setYwtype("P");
                receiveOrder.setCrossDockingType("0");
                receiveOrder.setVendorType("-1");
                receiveOrder.setVendorId("-1");

                List<ReceiveOrder.ChuordersBase> chuordersBaseList = new ArrayList<>();
                String [] goodsArr = goodNo.split(",");
                for (int j =0; j< goodsArr.length; j++) {
                    ReceiveOrder.ChuordersBase chuordersBase = new ReceiveOrder.ChuordersBase();
                    chuordersBase.setWareid(goodsArr[j]);
                    chuordersBase.setWname("swagger测试");
                    Example example = new Example(BsItembase.class);
                    example.createCriteria().andEqualTo("goodsNo",goodsArr[j]);
                    List<BsItembase> list  = goodMapper.selectByExample(example);
                    if(!CollectionUtils.isEmpty(list)){
                        chuordersBase.setWname(list.get(0).getName());
                    }
                    chuordersBase.setNumb(goodNum.split(",")[j]);
                    chuordersBase.setProductLevel("1");
                    chuordersBaseList.add(chuordersBase);
                }
                receiveOrder.setChuordersBaseList(chuordersBaseList);

                result = XmlUtil.getStringResponse(bizType,XmlUtil.convertToXml(receiveOrder));
                if("1".equals(result.getResultCode())){
                    orderIdList.add(id);
                }
            }
        } catch (Exception e) {
            log.error("内配出库接口异常：",e);
            return ResultModel.builder().code(1).message(e.getMessage()).data(orderIdList).build();
        }
        if(CollectionUtils.isEmpty(orderIdList)){
            return ResultModel.builder().code(1).message(result.getResultMessage()).data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message(result.getResultMessage()).data(orderIdList).build();
    }

    private String getPrintInfo(OdOrders odOrders, Map<String, Object> distributionInfo) throws Exception {
        OFCWmsOrder ofcWmsOrder = new OFCWmsOrder();
        ofcWmsOrder.setBatchInfo("(29)-[[普]-[余：0.00] | ]");
        List<OFCWmsDetail> wmsDetailList = new ArrayList<>();
        odOrders.getOdOrderDetailList().forEach(n->{
            OFCWmsDetail ofcWmsDetail = new OFCWmsDetail();
            ofcWmsDetail.setProductid(n.getProductId());
            ofcWmsDetail.setProductname(n.getProductName());
            ofcWmsDetail.setPrice(new BigDecimal(n.getPrice()).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
            ofcWmsDetail.setQuantity(n.getQuantity().toString());
            ofcWmsDetail.setSumprice(new BigDecimal(n.getPrice()).setScale(2,BigDecimal.ROUND_HALF_UP).multiply(n.getQuantity()).toString());
            wmsDetailList.add(ofcWmsDetail);
        });
        ofcWmsOrder.setWmsDetailList(wmsDetailList);
        ofcWmsOrder.setSite(distributionInfo.get("printSiteName").toString());
        ofcWmsOrder.setBarcode("BarCode.aspx?CopyRightText=&BarcodeType=CODE128B&Data=12748326133");
        ofcWmsOrder.setTotalPrice(odOrders.getTotalPrice().toString());
        ofcWmsOrder.setCall("否");
        ofcWmsOrder.setOrderId(odOrders.getOrderId());
        ofcWmsOrder.setPrintTime(odOrders.getSndDate());
        ofcWmsOrder.setReceiver(odOrders.getCustomerName());
        ofcWmsOrder.setTel(odOrders.getMobile());
        ofcWmsOrder.setDeliveryTime("任何时间");
        ofcWmsOrder.setAddress(odOrders.getAddress());
        ofcWmsOrder.setRemark("swagger测试");
        ofcWmsOrder.setBatchId("2016-03-18 当日送达");
        ofcWmsOrder.setRemarkzp("");
        ofcWmsOrder.setCustomCode("");
        ofcWmsOrder.setCreateTime(odOrders.getSndDate());
        ofcWmsOrder.setUserName(odOrders.getCustomerName());
        ofcWmsOrder.setTitle("北京-29号库-在线支付");
        ofcWmsOrder.setTotalNum(odOrders.getOdOrderDetailList().get(0).getQuantity().toString());
        ofcWmsOrder.setImage("211_2016-03-18 当日送达");
        ofcWmsOrder.setSendPay(odOrders.getSendpay());

//        ofcWmsOrder.setSlideWay();
//        ofcWmsOrder.setStartDistributeNo();
//        ofcWmsOrder.setStartDistributeName();
//        ofcWmsOrder.setTargetDistributeNo();
//        ofcWmsOrder.setTargetDistributeName();
//        ofcWmsOrder.setNetType();
//        ofcWmsOrder.setMonthDoneCode();
//        ofcWmsOrder.setStartCageCar();
//        ofcWmsOrder.setTargetCageCar();
//        ofcWmsOrder.setStartSlideWay();
//        ofcWmsOrder.setPrescription();
//        ofcWmsOrder.setPrescriptionName();
        ObjectMapper objectMapper = new ObjectMapper();
        return CompressUtil.compress(objectMapper.writeValueAsString(ofcWmsOrder));
//        return CompressOrderPrint.compress(objectMapper.writeValueAsString(objectMapper));
    }
}
