package com.example.demo.in;

import com.example.demo.apiModel.GoodModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/in")
@Api(tags = "入库接口")
public class InController {

    @Resource
    private ObjectMapper mapper;

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
