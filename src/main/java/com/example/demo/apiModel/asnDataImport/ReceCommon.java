package com.example.demo.apiModel.asnDataImport;

/**
 * Created by IntelliJ IDEA.
 * User: sunxiaomei
 * Date: 2012-11-2
 * Time: 16:03:47
 * 杂项常量
 */                 
public interface ReceCommon {
    public static String ERP_USER="FromERP";//ERP创建人
    public static String MODULE_NAME ="receScheduling";//本模块名称
    public static String DEFAULT_WEIGHT_UNIT ="千克";//默认重量单位
    public static String DEFAULT_PACKING_UNIT ="each";//默认包装单位
    public static int DEFAULT_PACKING_QTY =1;//默认包装数量
    public static String UNKNOW ="未知";//未知
    public static String ARGU_NULL_TIP ="参数为空!";//参数为空提示
    public static int PURCHASE_TRANS_FLAG=1;//大仓采配标识
    public static int PURCHASE_TRANS_YD_FLAG=2;//移动采配标识
}
