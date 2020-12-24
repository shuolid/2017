package com.example.demo.out;

import com.example.demo.BizType;
import com.example.demo.apiModel.BizTypeEnum;
import com.example.demo.apiModel.ResultModel;
import com.example.demo.service.OutService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    @ApiImplicitParam(name = "routeRule", paramType = "query", allowableValues = "55,98", defaultValue = "55")
    @ApiOperation(value = "出库接单", notes = "多商品，多个，多次出库接单")
    public ResultModel downLoadShipment(
            @ApiParam(value = "商品编号",required = true, defaultValue = "100391") @RequestParam(name = "goodId") String goodNo,
            @ApiParam(value = "商品数量",required = true, defaultValue = "1") @RequestParam(name = "goodNum") String goodNum,
            @ApiParam(value = "接口执行次数",required = true, example = "1") @RequestParam(name = "excuteCount") Integer excuteCount,
            @ApiParam(value = "sendPay",required = true, defaultValue = "1000000020000000000000000200110003300010000000000010000000000103000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000") @RequestParam(name = "sendPay") String sendPay,
            @RequestParam("routeRule")String routeRule){
        BizType bizType = BizType.builder()
                .bizType(BizTypeEnum.DOWNLOAD_SHIPMENT.getBizType())
                .uuid(BizTypeEnum.DOWNLOAD_SHIPMENT.getUuid())
                .callCode(BizTypeEnum.DOWNLOAD_SHIPMENT.getCallCode())
                .url(BizTypeEnum.DOWNLOAD_SHIPMENT.getUrl())
                .routeRule(routeRule)
                .build();

        return outService.downLoadShipment(goodNo, goodNum, excuteCount, sendPay, routeRule, bizType);
    }


}
