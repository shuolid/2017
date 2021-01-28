package com.example.demo.apiModel.asnDataImport;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by chenhaifeng1 on 2018/5/17.
 */

public enum KaAsnMarkEnum {

    POS1_BOOKING_BATCH(1,"1","预约分批次"),
    POS2_TRAY(2,"1","按托收货"),
    POS3_BACK_SERIAL_ECLP(3, "0", "回传序列号"),
    POS3_NO_BACK_SERIAL_ECLP(3, "1", "不回传序列号"),
    POS4_VALUE_ADDED_TAOTAOQI_SERVICES(4, "1","淘气集约仓增值服务"),
    POS4_VALUE_DEFALUT(4, "0","非增值服务"),
    POS5_COLLECT_TEMPERATURE_TAG(5, "1","采集温度标识"),
    ;


    private final int index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    KaAsnMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    public static String genDefaultType() {
        return StringUtils.repeat("0", 30);
    }

    public String create() {
        return appendMark(genDefaultType());
    }

    //在已有标记串设置标记位
    public String appendMark(String receiveMark) {
        if(StringUtils.isBlank(receiveMark)){
            receiveMark = genDefaultType();
        }
        StringBuilder sb = new StringBuilder(receiveMark);
        int start = sb.length() - index;
        return sb.replace(start, start + value.length(), getValue()).toString();
    }

    public boolean contains(String receiveMark) {
        if (StringUtils.isBlank(receiveMark) || receiveMark.length() < index || index < value.length()) {
            return false;
        }
        int beginIndex = receiveMark.length() - index;
        return value.equals(receiveMark.substring(beginIndex, beginIndex + value.length()));
    }

    public String getMarkValue(String receiveMark) {
        int index1 = this.index;
        if (StringUtils.isBlank(receiveMark)) {
            return null;
        }
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
