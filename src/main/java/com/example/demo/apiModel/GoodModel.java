package com.example.demo.apiModel;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class GoodModel {
    @NotNull
    @ApiModelProperty(value = "商品编号", position = 2)
    private String goodNo;
    @ApiModelProperty(value = "商品名称", position = 3)
    private String goodName;
    @ApiModelProperty(value = "商品分类", position = 1)
    private String type;
}
