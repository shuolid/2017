package com.example.demo.service;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;

public interface OutService {

    ResultModel downLoadShipment(String goodNo, String goodNum, Integer excuteCount, String sendPay, String routeRule, BizType bizType, String profitLossId);

    ResultModel packageSwitch(String packageSwitch);

    ResultModel receivedOwnerShipmentService(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String profitLossId);

    ResultModel receivedScrapShipment(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String profitLossId);

    ResultModel receiveOrder(String goodNo, String goodNum, Integer excuteCount, String routeRule, BizType bizType, String profitLossId);
}
