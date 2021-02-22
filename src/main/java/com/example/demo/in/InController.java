package com.example.demo.in;

import com.example.demo.BizType;
import com.example.demo.apiModel.BizTypeEnum;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.service.InService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/in")
@Api(tags = "入库接口")
public class InController {
    @Autowired
    private InService inService;

    @PostMapping("/asnDataImport")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "routeRule", paramType = "query", allowableValues = "55", defaultValue = "55"),
            @ApiImplicitParam(name = "asnType", paramType = "query", allowableValues = "采购单,采购ASN单,备件库入大库,客户退货单,内配入箱报文,内配入批次报文", defaultValue = "采购单"),
            @ApiImplicitParam(name = "profitLossType", paramType = "query", allowableValues = "B单,C单", defaultValue = "C单")
    })
    @ApiOperation(value = "入库下单", notes = "多商品，多个，多次入库下单")
    public ResultModel asnDataImport(
            @ApiParam(value = "商品编号",required = true, defaultValue = "100391") @RequestParam(name = "goodId") String goodNo,
            @ApiParam(value = "商品数量",required = true, defaultValue = "1") @RequestParam(name = "goodNum") String goodNum,
            @ApiParam(value = "接口执行次数",required = true, example = "1") @RequestParam(name = "excuteCount") Integer excuteCount,
            @ApiParam(value = "渠道id",required = true, example = "1") @RequestParam(name = "profitLossId") String profitLossId,
            @ApiParam(value = "渠道采购数量",required = true, example = "1") @RequestParam(name = "qty") String profitLossQty,
            @RequestParam("asnType")String asnType,
            @RequestParam("profitLossType")String profitLossType,
            @RequestParam("routeRule")String routeRule){
        if("备件库入大库".equals(asnType)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.IMPORT_RECEIVING_TASK.getBizType())
                    .uuid(BizTypeEnum.IMPORT_RECEIVING_TASK.getUuid())
                    .callCode(BizTypeEnum.IMPORT_RECEIVING_TASK.getCallCode())
                    .url(BizTypeEnum.IMPORT_RECEIVING_TASK.getUrl())
                    .routeRule(routeRule)
                    .build();
            return inService.importReceivingTask(goodNo, goodNum, excuteCount, routeRule, bizType,asnType,profitLossId,profitLossType,profitLossQty);
        }

        if("客户退货单".equals(asnType)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.ISSUED_ORDERS.getBizType())
                    .uuid(BizTypeEnum.ISSUED_ORDERS.getUuid())
                    .callCode(BizTypeEnum.ISSUED_ORDERS.getCallCode())
                    .url(BizTypeEnum.ISSUED_ORDERS.getUrl())
                    .routeRule(routeRule)
                    .build();
            return inService.issuedOrders(goodNo, goodNum, excuteCount, routeRule, bizType,asnType,profitLossId,profitLossType,profitLossQty);
        }

        if("内配入箱报文".equals(asnType)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.CASE_INFO.getBizType())
                    .uuid(BizTypeEnum.CASE_INFO.getUuid())
                    .callCode(BizTypeEnum.CASE_INFO.getCallCode())
                    .url(BizTypeEnum.CASE_INFO.getUrl())
                    .routeRule(routeRule)
                    .build();
            return inService.asnDataImport(goodNo, goodNum, excuteCount, routeRule, bizType,asnType,profitLossId,profitLossType,profitLossQty);
        }

        if("内配入批次报文".equals(asnType)){
            BizType bizType = BizType.builder()
                    .bizType(BizTypeEnum.TRANS_BILLS.getBizType())
                    .uuid(BizTypeEnum.TRANS_BILLS.getUuid())
                    .callCode(BizTypeEnum.TRANS_BILLS.getCallCode())
                    .url(BizTypeEnum.TRANS_BILLS.getUrl())
                    .routeRule(routeRule)
                    .build();
            return inService.asnDataImport(goodNo, goodNum, excuteCount, routeRule, bizType,asnType,profitLossId,profitLossType,profitLossQty);
        }

        BizType bizType = BizType.builder()
                .bizType(BizTypeEnum.ASN_DATA_IMPORT.getBizType())
                .uuid(BizTypeEnum.ASN_DATA_IMPORT.getUuid())
                .callCode(BizTypeEnum.ASN_DATA_IMPORT.getCallCode())
                .url(BizTypeEnum.ASN_DATA_IMPORT.getUrl())
                .routeRule(routeRule)
                .build();
        return inService.asnDataImport(goodNo, goodNum, excuteCount, routeRule, bizType,asnType,profitLossId,profitLossType,profitLossQty);
    }
}
