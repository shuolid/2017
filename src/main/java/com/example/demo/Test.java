package com.example.demo;

import com.example.demo.apiModel.Return;
import com.example.demo.apiModel.asnDataImport.ParkAsnD;
import com.example.demo.apiModel.asnDataImport.ParkAsnExpend;
import com.example.demo.apiModel.asnDataImport.ParkAsnM;
import com.example.demo.util.XmlUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.currentTimeMillis());
//        double d = new BigDecimal("33.90").doubleValue();
//        System.out.println(new BigDecimal(d).multiply(new BigDecimal(1)).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
//        String printInfo = "H4sIAAAAAAAAAK1TXU8TQRT9K80+ECVss7MD9CMhJrQ+kBAkhremMcPuCBu73bo7VSqaSBSwsXwY\nIBXEGAxVDKbQ0BRTvv7Mzm775F/wzhYIYIgv3ofN3Dvn3Dlz5u60NE6YNjmUfWxJcemOGrsrp1Le\nejUtp9yT9d/HG0pYUdKhl6G01CM9N50kZcTIDBsOk+KpaSlnW3peY4YO5GhvNNrXB7DzYpaYFMp8\nbpNv7/JazTsohvj2D/9to12p+qs73n4dhfuGu5HqrzRC3lrdr9YCtqEJHsbhmAL50zzJMoMVRAm0\nQMXJmxcgpKBwRJFepaFqMFHpblXO+JdFXmrKvFR2mz/94qfWVtnfXQfmOLE1SxewQWInYBUmTm7q\nXsLKFR4aE5NsjE6xga7BDmqskKMDiQfJ+0iNDnYlCSMDSI30RrHajzCGbsxiJDN6rkTpaNNIJiMu\nvfwNEsvWqT0kvLlOBPVZNmYE9qgK6pcVLKNICOE4RnEVAcKmGjWeURsA3tcZb2uZH34WJ1LRHOEY\nQggLu6Gm04xAFs77uUdH7smaV260y3XYJbpuU8cRkgI3Lt3hc7P+4h5/t+82S7Boz5f40gGvFtvl\nHdji29/BNPfXPF/YaL3/wPeXgIL40qFXOe7nC2t89g1W1ECoSewn0D5wV0ySfvVS0RA/WfHKlfbr\nmdbp6SX+Ra7D0PIOs8xE50lEblPC6G3OKBGA5B1qj3Qm65ozBsvQy1vKagy08uaKzDd3/OaZt7rn\nHn28eLKRvCmGCVLDJBPBUQg9ukVzjxg4mtVHSSGYt06oyo2AAhKbGMMHXdlAV5f4Ju2vQP9E/IdA\n8Mf8AcRWPT75AwAA";
//        System.out.println(EnDecryptUtil.decript(printInfo));
//
//        String printInfoStr = "{\"batchInfo\":\"(29)-[[普]-[余：0.00] | ]\",\"wmsDetailList\":[{\"productid\":\"848855\",\"productname\":\"农夫山泉 天然饮用水1.5L*12瓶 整箱\",\"price\":\"33.90\",\"quantity\":\"3.00\",\"sumprice\":\"101.70\"}],\"site\":\"*西城区-北京牛街站\",\"barcode\":\"BarCode.aspx?CopyRightText=&BarcodeType=CODE128B&Data=12748326133\",\"totalPrice\":\"0.00\",\"call\":\"否\",\"orderId\":\"12748326133\",\"printTime\":\"2016-03-17 13:31:21\",\"receiver\":\"梁桐川\",\"tel\":\"13911134885\",\"deliveryTime\":\"任何时间\",\"address\":\"北京西城区内环到二环里右安门内大街万博苑小区1号楼6单元302\",\"remark\":\"\",\"batchId\":\"2016-03-18 当日送达\",\"remarkzp\":\"\",\"customCode\":\"\",\"createTime\":\"2016-03-17 13:31:07\",\"userName\":\"梁桐川\",\"title\":\"北京-29号库-在线支付\",\"totalNum\":\"3\",\"image\":\"211_2016-03-18 当日送达,\",\"sendPay\":\"10000000200000000000000002001100033000100000000000100000000001030000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010\"}\n";
//        System.out.println(EnDecryptUtil.encript(printInfoStr));
//
//        System.out.println(printInfo.equals(EnDecryptUtil.encript(printInfoStr)));


//        System.out.println(CompressUtil.uncompress(printInfo));
//
//        String printInfoStr = "{\"batchInfo\":\"(29)-[[普]-[余：0.00] | ]\",\"wmsDetailList\":[{\"productid\":\"848855\",\"productname\":\"农夫山泉 天然饮用水1.5L*12瓶 整箱\",\"price\":\"33.90\",\"quantity\":\"3.00\",\"sumprice\":\"101.70\"}],\"site\":\"*西城区-北京牛街站\",\"barcode\":\"BarCode.aspx?CopyRightText=&BarcodeType=CODE128B&Data=12748326133\",\"totalPrice\":\"0.00\",\"call\":\"否\",\"orderId\":\"12748326133\",\"printTime\":\"2016-03-17 13:31:21\",\"receiver\":\"梁桐川\",\"tel\":\"13911134885\",\"deliveryTime\":\"任何时间\",\"address\":\"北京西城区内环到二环里右安门内大街万博苑小区1号楼6单元302\",\"remark\":\"\",\"batchId\":\"2016-03-18 当日送达\",\"remarkzp\":\"\",\"customCode\":\"\",\"createTime\":\"2016-03-17 13:31:07\",\"userName\":\"梁桐川\",\"title\":\"北京-29号库-在线支付\",\"totalNum\":\"3\",\"image\":\"211_2016-03-18 当日送达,\",\"sendPay\":\"10000000200000000000000002001100033000100000000000100000000001030000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010\"}\n";
//        System.out.println(CompressUtil.compress(printInfoStr));
//
//        System.out.println(printInfo.equals(CompressUtil.compress(printInfoStr)));
//
//        System.out.println(CompressUtil.uncompress(CompressUtil.compress(printInfoStr)));
//
//        System.out.println(printInfoStr.equals(CompressUtil.uncompress(CompressUtil.compress(printInfoStr))));


//        {
//            "batchInfo": "(29)-[[普]-[余：0.00] | ]",
//                "wmsDetailList": [{
//            "productid": "848855",
//                    "productname": "农夫山泉 天然饮用水1.5L*12瓶 整箱",
//                    "price": "33.90",
//                    "quantity": "3.00",
//                    "sumprice": "101.70"
//        }],
//            "site": "*西城区-北京牛街站",
//                "barcode": "BarCode.aspx?CopyRightText=&BarcodeType=CODE128B&Data=12748326133",
//                "totalPrice": "0.00",
//                "call": "否",
//                "orderId": "12748326133",
//                "printTime": "2016-03-17 13:31:21",
//                "receiver": "梁桐川",
//                "tel": "13911134885",
//                "deliveryTime": "任何时间",
//                "address": "北京西城区内环到二环里右安门内大街万博苑小区1号楼6单元302",
//                "remark": "",
//                "batchId": "2016-03-18 当日送达",
//                "remarkzp": "",
//                "customCode": "",
//                "createTime": "2016-03-17 13:31:07",
//                "userName": "梁桐川",
//                "title": "北京-29号库-在线支付",
//                "totalNum": "3",
//                "image": "211_2016-03-18 当日送达,",
//                "sendPay": "10000000200000000000000002001100033000100000000000100000000001030000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010"
//        }




        ParkAsnM parkAsnM = new ParkAsnM();
        parkAsnM.setInboundNo("11111");
        parkAsnM.setPoNo("11111");
        parkAsnM.setPoType(1);//1：采购单；2：ASN单
        parkAsnM.setDistributeNo("6");
        parkAsnM.setDistributeNo("55");
        parkAsnM.setInboundType("0");
        parkAsnM.setInboundStatus(0);
        parkAsnM.setTotalQty(60.0d);
        parkAsnM.setPurchaseTransFlag(0);
        parkAsnM.setSupplierNo("bjylgxgs");
        parkAsnM.setSupplierName("北京燕轮供销公司");
        parkAsnM.setEclpSign(0);
        parkAsnM.setOrderAttribute("1");

        List<ParkAsnD> parkAsnDList = new ArrayList<>();
        ParkAsnD parkAsnD = new ParkAsnD();
        parkAsnD.setInnerId(0);
        parkAsnD.setGoodsNo("LS001");
        parkAsnD.setExpectedQty(3d);
        parkAsnD.setSourceGoodsNo("swagger测试");
        parkAsnD.setBarCodeType("3");
        parkAsnD.setSerialListFlag("0");
        parkAsnD.setIncomplete("1");
        parkAsnD.setExcess("0");
        parkAsnD.setExceedQty(-1d);
        parkAsnD.setUnitPackage(1);
        parkAsnDList.add(parkAsnD);
        parkAsnM.setParkAsnDList(parkAsnDList);

        List<ParkAsnExpend> parkAsnExpendList = new ArrayList<>();

        ParkAsnExpend xnitype = new ParkAsnExpend();
        xnitype.setKey("xnitype");
        xnitype.setValue("0");
        parkAsnExpendList.add(xnitype);

        ParkAsnExpend twiceSerialFlag = new ParkAsnExpend();
        twiceSerialFlag.setKey("twiceSerialFlag");
        twiceSerialFlag.setValue("");
        parkAsnExpendList.add(twiceSerialFlag);

        parkAsnM.setParkAsnExpendList(parkAsnExpendList);
        System.out.println(XmlUtil.convertToXml(parkAsnM));

        String s = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:queryWsResponse xmlns:ns2=\"http://wms3.360buy.com\"><return><resultCode>1</resultCode><resultMessage>调用成功</resultMessage></return></ns2:queryWsResponse></soap:Body></soap:Envelope>\n";
        String s2 = "<return><resultCode>1</resultCode><resultMessage>调用成功</resultMessage></return>";
        System.out.println(s.substring(s.indexOf("return") - 1,s.lastIndexOf("return") + 7));
        System.out.println(XmlUtil.convertToJava(s2, Return.class).getResultCode());
        System.out.println(XmlUtil.convertToJava(s2, Return.class).getResultMessage());


    }
}
