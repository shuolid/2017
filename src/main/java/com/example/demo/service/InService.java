package com.example.demo.service;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;

public interface InService {
    ResultModel asnDataImport(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String asnType, String profitLossId, String profitLossType, String profitLossQty);
}
