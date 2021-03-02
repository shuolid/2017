package com.example.demo.out;

import com.example.demo.BizType;
import com.example.demo.apiModel.BizTypeEnum;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.apiModel.SendPayEnum;
import com.example.demo.apiModel.UrlEnum;
import com.example.demo.service.OutService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@Api(tags = "标准演示接口")
public class OutController {

    @Autowired
    private OutService outService;

    @PostMapping("/downLoadShipment")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "routeRule", paramType = "query", allowableValues = "55,980", defaultValue = "55"),
        @ApiImplicitParam(name = "sendPay", paramType = "query", allowableValues = "普通C单,集采B单,直通车订单,退供出库,报废出库,内配出库,", defaultValue = "普通C单")
    })
    @ApiOperation(value = "出库接单", notes = "多商品，多个，多次出库接单")
    public ResultModel downLoadShipment(
            @ApiParam(value = "商品编号",required = true, defaultValue = "100391") @RequestParam(name = "goodId") String goodNo,
            @ApiParam(value = "商品数量",required = true, defaultValue = "1") @RequestParam(name = "goodNum") String goodNum,
            @ApiParam(value = "接口执行次数",required = true, example = "1") @RequestParam(name = "excuteCount") Integer excuteCount,
            @ApiParam(value = "渠道id",required = true, example = "1") @RequestParam(name = "profitLossId") String profitLossId,
            @RequestParam("sendPay")String sendPay,
            @RequestParam("routeRule")String routeRule){
        if("退供出库".equals(sendPay)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.OWNER_SHIPMENT.getBizType())
                    .uuid(BizTypeEnum.OWNER_SHIPMENT.getUuid())
                    .callCode(BizTypeEnum.OWNER_SHIPMENT.getCallCode())
                    .url(UrlEnum.getEnumByKey(routeRule).getUrl() + "/pickingplan/services/waveWS")
                    .routeRule(routeRule)
                    .build();
            return outService.receivedOwnerShipmentService(goodNo, goodNum, excuteCount, routeRule, bizType, profitLossId);
        }
        if("报废出库".equals(sendPay)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.SCRAP_SHIPMENT.getBizType())
                    .uuid(BizTypeEnum.SCRAP_SHIPMENT.getUuid())
                    .callCode(BizTypeEnum.SCRAP_SHIPMENT.getCallCode())
                    .url(UrlEnum.getEnumByKey(routeRule).getUrl() + "/pickingplan/services/waveWS")
                    .routeRule(routeRule)
                    .build();
            return outService.receivedScrapShipment(goodNo, goodNum, excuteCount, routeRule, bizType,profitLossId);
        }
        if("内配出库".equals(sendPay)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.RECEIVE_SHIPMENT.getBizType())
                    .uuid(BizTypeEnum.RECEIVE_SHIPMENT.getUuid())
                    .callCode(BizTypeEnum.RECEIVE_SHIPMENT.getCallCode())
                    .url(UrlEnum.getEnumByKey(routeRule).getUrl() + "/inner/services/obInternalReceiveWebServiceSoap")
                    .routeRule(routeRule)
                    .build();
            return outService.receiveOrder(goodNo, goodNum, excuteCount, routeRule, bizType,profitLossId);
        }

        BizType bizType = BizType.builder()
                .bizType(BizTypeEnum.DOWNLOAD_SHIPMENT.getBizType())
                .uuid(BizTypeEnum.DOWNLOAD_SHIPMENT.getUuid())
                .callCode(BizTypeEnum.DOWNLOAD_SHIPMENT.getCallCode())
                .url(UrlEnum.getEnumByKey(routeRule).getUrl() + "/pickingplan/services/waveWS")
                .routeRule(routeRule)
                .build();
        return outService.downLoadShipment(goodNo, goodNum, excuteCount, SendPayEnum.getEnumByName(sendPay).getValue(), routeRule, bizType,profitLossId);
    }

    @PostMapping("/packageSwitch")
    @ApiImplicitParam(name = "packageSwitch", paramType = "query", allowableValues = "开启,关闭", defaultValue = "关闭")
    @ApiOperation(value = "是否开启包裹生产", notes = "打开或关闭包裹生产")
    public ResultModel packageSwitch(@RequestParam("packageSwitch")String packageSwitch){
        return outService.packageSwitch(packageSwitch);
    }


}
