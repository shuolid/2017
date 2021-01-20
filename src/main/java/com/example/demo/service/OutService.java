package com.example.demo.service;

import com.example.demo.BizType;
import com.example.demo.apiModel.ResultModel;

public interface OutService {

    ResultModel downLoadShipment(String goodNo, String goodNum, Integer excuteCount, String sendPay, String routeRule, BizType bizType);

    ResultModel packageSwitch(String packageSwitch);
}
