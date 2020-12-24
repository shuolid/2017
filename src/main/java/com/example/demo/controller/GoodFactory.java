package com.example.demo.controller;


import com.example.demo.apiModel.GoodEnum;
import com.example.demo.service.GoodService;
import com.example.demo.service.impl.BatchGoodServiceImpl;
import com.example.demo.service.impl.OrdinaryGoodServiceImpl;
import com.example.demo.service.impl.ShelfGoodServiceImpl;
import com.example.demo.util.SpringContextUtil;

public class GoodFactory {
    public GoodService getGoodService(GoodEnum goodEnum){
        switch (goodEnum){
            case ORDINARY_GOOD:
                return SpringContextUtil.getBean(OrdinaryGoodServiceImpl.class);
            case SHELF_GOOD:
                return SpringContextUtil.getBean(ShelfGoodServiceImpl.class);
            case BATCH_GOOD:
                return SpringContextUtil.getBean(BatchGoodServiceImpl.class);
        }
        return null;
    }
}
