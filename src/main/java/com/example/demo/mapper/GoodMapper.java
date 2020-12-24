package com.example.demo.mapper;

import com.example.demo.entity.BsItembase;
import com.example.demo.entity.BsItembaseDto;
import org.mapstruct.Mapper;

@Mapper
public interface GoodMapper extends tk.mybatis.mapper.common.Mapper<BsItembase> {
    void addBsItembase(BsItembaseDto bsItembase);
    void addBsItembaseAttr(BsItembaseDto bsItembase);
    void addBsBarcodePool(BsItembaseDto bsItembase);
    void addStockM(BsItembaseDto bsItembase);
    void addZoneRef(BsItembaseDto bsItembase);
    void addBoxRuleDef(BsItembaseDto bsItembase);
    void addBsPack(BsItembaseDto bsItembase);
    void addBsLotAttr(BsItembaseDto bsItembase);
    void addBsShelflife(BsItembaseDto bsItembase);
}
