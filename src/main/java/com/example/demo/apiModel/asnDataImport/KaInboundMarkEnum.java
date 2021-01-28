package com.example.demo.apiModel.asnDataImport;


import org.apache.commons.lang3.StringUtils;

/**
 * 对应inbound_mark字段
 */
public enum KaInboundMarkEnum {
    POS1_DEFAULT(1, "0", "无序列号类型"),
    POS1_MANUAL_SN(1, "1", "手动采集序列号"),
    POS1_AUTOMATIC_IMEI(1, "2", "自动采集序列号"),
    POS2_PULL_FROM_DMS(2, "0", "第二位只用于客退入库"),
    POS2_PUSH_BY_DMS(2, "1", "非补发消息客退入库"),
    POS3_NOT_SECOND_HAND(3, "0", "非二手"),
    POS3_IS_SECOND_HAND(3, "1", "二手"),
    POS4_DEFAULT(4, "0", "不允许序列号二次入库"),
    POS4_SN_TWICE(4, "1", "允许序列号二次入库"),
    POS5_DEFAULT(5, "0", "未提供序列号清单"),
    POS5_SN_LIST(5, "1", "有序列号清单"),
    POS6_NOT_BACK_BY_CONTAINER(6, "0", "非按板回传"),
    POS6_IS_BACK_BY_CONTAINER(6, "1", "按板回传"),
    POS7_DEFAULT(7, "0", "非整箱验收"),
    POS7_BOX_RECEIVING(7, "1", "整箱验收"),
    POS7_POPULAR_RECEIVING(7, "2", "零散/整箱验收"),
    RETURNS_B2C(8, "0", "客退B2C业务"),
    RETURNS_B2B(8, "1", "客退B2B业务"),
    RETURNS_B2B2C(8, "2", "客退B2B2C业务"),
    DISALLOW_DEFECTIVE_OVERDUE_INBOUND(9, "0", "客退禁止残品过期入库"),
    ALLOW_DEFECTIVE_OVERDUE_INBOUND(9, "1", "客退允许残品过期入库"),
    POS10_SHOP(10,"1","是否门店标示"),
    POS13_HAND_OVER(13,"1","信任交接标示"),
    POS14_DEFAULT(14,"0","默认方式验收"),
    POS14_PRECHECK_METHOD(14,"1","预检方式验收"),
    POS14_BOX_METHOD(14,"2","整箱方式验收"),
    POS15_NEED_VALID_SHELF(15,"1","不校验保质期"),
    POS16_BOX_RETURN_ECLP(16,"1","箱报文校验回传"),
    POS18_BATCHES(18,"1","分批次收货"),
    POS19_DEFAULT(19, "0", "不能缺量入库"),
    POS19_SHORTAGE(19, "1", "支持缺量入库"),
    POS20_DEFAULT(20, "0", "客退卡宾标示"),
    POS20_KABIN(20, "1", "客退卡宾标示"),
    POS21_NOT_SMART_MOVEWARE(21, "0", "非智能搬仓"),
    POS21_SMART_MOVEWARE(21, "1", "智能搬仓"),
    POS24_MERGE_ASN_FLAG(24,"1","合并采购单验收单据"),
    POS24_MERGE_RETURN_ASN_FLAG(24,"2","合并客退入库验收单据"),
    POS22_DEFAULT(22, "0", "非锁库存客退单"),
    POS22_STOCKlOCK(22, "1", "锁库存客退单"),
    POS25_CHECK_SN_BYGOODSNO(25, "0", "SKU维度校验序列号"),
    POS25_CHECK_SN_BYORDER(25, "1", "单维度校验序列号"),
    POS26_NOT_SKIP_STORE(26, "0", "非越库标示"),
    POS26_SKIP_STORE(26, "1", "越库标示"),
    POS27_VALUE_ADDED_SERVICES(27, "1","需要增值服务"),
    POS29_BACK_SERIAL_ECLP(29, "0", "回传序列号"),
    POS29_NO_BACK_SERIAL_ECLP(29, "1", "不回传序列号"),
    IS_NO_SALE(30,"1","eclp下批次解锁"),
    POS31_VALUE_ADDED_TAOTAOQI_SERVICES(31,"1","淘气集约仓增值服务"),
    POS32_COLLECT_TEMPERATURE_TAG(32,"1","采集温度标识增值服务"),
    ;

    private final int index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    KaInboundMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    private static String genDefaultType() {
        return StringUtils.repeat("0", 126);
    }

    public String create() {
        return appendMark(genDefaultType());
    }

    //在已有标记串设置标记位
    public String appendMark(String receiveMark) {
        StringBuilder sb = new StringBuilder(receiveMark);
        int start = sb.length() - index;
        return sb.replace(start, start + value.length(), getValue()).toString();
    }

    public boolean contains(String receiveMark) {
        if (StringUtils.isBlank(receiveMark) || receiveMark.length() < index || index < value.length())
            return false;
        int beginIndex = receiveMark.length() - index;
        return value.equals(receiveMark.substring(beginIndex, beginIndex + value.length()));
    }

    public String getMarkValue(String receiveMark) {
        int index1 = this.index;
        if (StringUtils.isBlank(receiveMark))
            return null;
        return receiveMark.substring(receiveMark.length() - index1, receiveMark.length() - index1 + this.value.length());
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
