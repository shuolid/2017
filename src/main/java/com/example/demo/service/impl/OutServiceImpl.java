package com.example.demo.service.impl;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.apiModel.downLoadShipment.*;
import com.example.demo.service.OutService;
import com.example.demo.util.CompressUtil;
import com.example.demo.util.XmlUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class OutServiceImpl implements OutService {
    private  Logger log = LoggerFactory.getLogger(OutServiceImpl.class);

    @Override
    public ResultModel downLoadShipment(String goodNo, String goodNum, Integer excuteCount, String sendPay, String routeRule, BizType bizType) {
        List<String> orderIdList =  new ArrayList<>();
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

                XmlUtil.getStringResponse(bizType,odOrders);
                orderIdList.add(orderId);
            }
        } catch (Exception e) {
            log.error("接单接口异常：",e);
            return ResultModel.builder().code(1).message("失败").data(orderIdList).build();
        }
        return ResultModel.builder().code(0).message("成功").data(orderIdList).build();
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
