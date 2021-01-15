package com.example.demo.in;

import com.example.demo.apiModel.GoodModel;
import com.example.demo.service.UpdateConfigService;
import com.example.demo.util.XmlUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jd.msp.rpc.TimlineSenderJsf;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/in")
@Api(tags = "入库接口")
public class InController {

    @Resource
    private TimlineSenderJsf timlineSenderJsf;
    @Resource
    private ObjectMapper mapper;

    @Resource
    private UpdateConfigService updateConfigService;

    @PostMapping("/b")
    @ApiImplicitParam(name = "type", value = "商品类型",paramType = "query", allowableValues = "普通商品,批次商品,保质期商品", defaultValue = "普通商品", required = true)
    @ApiOperation(value = "添加商品", notes = "添加不同类型的商品")
    public String post1(@ApiParam(value = "商品编号",required = true) @RequestParam(name = "goodNo") String goodNo,
                       @ApiParam(value = "商品名称",required = true) @RequestParam(name = "goodName") String goodName,
                       @RequestParam(name = "type") String type
                       ){
        return goodNo + goodName + type;
    }

    @PostMapping("/a")
    @ApiImplicitParam(name = "type", value = "商品类型",paramType = "query", allowableValues = "普通商品,批次商品,保质期商品", defaultValue = "普通商品", required = true)
    @ApiOperation(value = "添加商品2", notes = "添加不同类型的商品2")
    public String post2(@RequestBody GoodModel goodModel){
        try {
//            String receivers = "lishuo46，qiaojie7";
//            String title = "测试";
//            String content = "测试一下";
//            Set<String> pins = new HashSet<String>(Arrays.asList(receivers.split(",")));
//
//            String accessId = UUID.randomUUID().toString();
//            AccessSignature as = new AccessSignature("wms.master.test",accessId,"2C1C7A30A1F150A63C449BC40BC6F71E", "");
//            TimlineSendResult result = timlineSenderJsf.send(as,pins,title,content);
//            if(result.getCode() == 230070){
//                System.out.println((String.format("succ to TimLine message. Receviers:【%s】, Title:【%s】",receivers, title)));
//            }else{
//                System.out.println((String.format("error to TimLine message. Receviers:【%s】, Title:【%s】,Error:%s", receivers, title,result.getErrmsg())));
//            }

            String content = updateConfigService.updateConfig();
            if(StringUtils.isNotEmpty(content)){
                // 接口文档：https://cf.jd.com/pages/viewpage.action?pageId=127796301
                List<String> erps  = new ArrayList<>();
                erps.add("lishuo46");
//            erps.add("qiaojie7");
                Map<String,Object> requestMap = new HashMap<>();
                requestMap.put("to_erp", erps);
                requestMap.put("subject", "test");
                requestMap.put("text", content);
                XmlUtil.standardPostRequest("http://alt.jd.local/sendtimline/?token=ICVAD5NXCTSDLWMOAC4NORW7PK7JI5W5&erp=lishuo46", requestMap);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return goodModel.getGoodNo() + goodModel.getGoodName() + goodModel.getType();
    }

    @PostMapping("/c")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "商品类型",paramType = "query", allowableValues = "普通商品,批次商品,保质期商品", defaultValue = "普通商品", required = true),
            @ApiImplicitParam(name = "goodNo", value = "商品编号",paramType = "query", required = true,example = "LS001"),
            @ApiImplicitParam(name = "goodName", value = "商品名称",paramType = "query", required = true)
    })
    @ApiOperation(value = "添加商品3", notes = "添加不同类型的商品3")
    public String post3(@RequestParam(name = "goodNo") String goodNo,
                       @RequestParam(name = "goodName") String goodName,
                       @RequestParam(name = "type") String type
    ){
        return goodNo + goodName + type;
    }
}
