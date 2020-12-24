package com.example.demo.service.impl;

import com.example.demo.apiModel.ResultModel;
import com.example.demo.entity.BsItembase;
import com.example.demo.entity.BsItembaseDto;
import com.example.demo.mapper.GoodMapper;
import com.example.demo.service.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.text.MessageFormat;
import java.util.List;

@Service
public class ShelfGoodServiceImpl implements GoodService {
    private  Logger log = LoggerFactory.getLogger(ShelfGoodServiceImpl.class);
    @Autowired
    private GoodMapper goodMapper;
    @Override
    @Transactional
    public ResultModel addGood(String goodNo, String goodName, String goodId) {
        ResultModel resultModel  =  new ResultModel();
        resultModel.setCode(0);
        resultModel.setMessage("成功");
        try {
            Example example = new Example(BsItembase.class);
            example.createCriteria().andEqualTo("goodsNo",goodNo);
            List<BsItembase> list  = goodMapper.selectByExample(example);
            if(!CollectionUtils.isEmpty(list)){
                log.info(MessageFormat.format("{0}-商品已经存在",goodNo));
                resultModel.setCode(1);
                resultModel.setMessage(MessageFormat.format("{0}-商品已经存在",goodNo));
                return resultModel;
            }

            BsItembaseDto bsItembase =  new BsItembaseDto();
            bsItembase.setGoodsNo(goodNo);
            bsItembase.setName(goodName);
            bsItembase.setCreateUser("swagger");
            bsItembase.setGoodId(goodId);

            goodMapper.addBsItembase(bsItembase);//添加商品表
            goodMapper.addBsItembaseAttr(bsItembase);//添加商品扩展表
            goodMapper.addBsBarcodePool(bsItembase);//添加商品条码表
            goodMapper.addStockM(bsItembase);//添加库存表
            goodMapper.addZoneRef(bsItembase);//添加商品储区对照
            goodMapper.addBoxRuleDef(bsItembase);//添加箱规属性
            goodMapper.addBsPack(bsItembase);//添加包装规格
            goodMapper.addBsLotAttr(bsItembase);//添加批属性定义
            goodMapper.addBsShelflife(bsItembase);//添加保质期天数

        } catch (Exception e) {
            resultModel.setCode(1);
            resultModel.setMessage(e.getMessage());
            log.error("异常：", e);
            throw new RuntimeException("异常");
        }
        return resultModel;
    }
}
