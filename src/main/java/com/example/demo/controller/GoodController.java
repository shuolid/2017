package com.example.demo.controller;


import com.example.demo.apiModel.GoodEnum;
import com.example.demo.apiModel.ResultModel;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master")
public class GoodController {

    @GetMapping("/add/good")
    @ApiImplicitParam(name = "goodCategory", value = "商品类型",paramType = "query", allowableValues = "普通商品,批次商品,保质期商品", defaultValue = "普通商品", required = true)
    @ApiOperation(value = "添加商品", notes = "添加不同类型的商品")
    public ResultModel addGood(@ApiParam(value = "商品编号",required = true) @RequestParam(name = "goodId") String goodNo,
                             @ApiParam(value = "商品名称",required = true) @RequestParam(name = "goodName") String goodName,
                             @RequestParam(name = "goodCategory") String goodCategory
    ){
        GoodFactory goodFactory =  new GoodFactory();
        GoodEnum goodEnum = GoodEnum.getGoodEnumbyGoodName(goodCategory);
        return goodFactory.getGoodService(goodEnum).addGood(goodNo,goodName,goodEnum.getGoodId());

    }
}
