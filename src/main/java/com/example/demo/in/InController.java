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
            @ApiImplicitParam(name = "asnType", paramType = "query", allowableValues = "采购单,采购ASN单", defaultValue = "采购单")
    })
    @ApiOperation(value = "入库下单", notes = "多商品，多个，多次入库下单")
    public ResultModel asnDataImport(
            @ApiParam(value = "商品编号",required = true, defaultValue = "100391") @RequestParam(name = "goodId") String goodNo,
            @ApiParam(value = "商品数量",required = true, defaultValue = "1") @RequestParam(name = "goodNum") String goodNum,
            @ApiParam(value = "接口执行次数",required = true, example = "1") @RequestParam(name = "excuteCount") Integer excuteCount,
            @RequestParam("asnType")String asnType,
            @RequestParam("routeRule")String routeRule){

        BizType bizType = BizType.builder()
                .bizType(BizTypeEnum.ASN_DATA_IMPORT.getBizType())
                .uuid(BizTypeEnum.ASN_DATA_IMPORT.getUuid())
                .callCode(BizTypeEnum.ASN_DATA_IMPORT.getCallCode())
                .url(BizTypeEnum.ASN_DATA_IMPORT.getUrl())
                .routeRule(routeRule)
                .build();

        return inService.asnDataImport(goodNo, goodNum, excuteCount, routeRule, bizType);
    }
}
