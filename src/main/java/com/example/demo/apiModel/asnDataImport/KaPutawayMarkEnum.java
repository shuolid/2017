package com.example.demo.apiModel.asnDataImport;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by liuzicheng on 2016/10/9.
 */
public enum KaPutawayMarkEnum {
    POS1_DEFAULT(1,"0","默认"),
    POS2_NOT_IS_MASTER_CONTAINER(2, "1", "非master中容器验收"),
    POS3_DEFAULT(3, "0", "拆箱上架"),
    POS3_BOX_PUTAWAY(3, "1", "不拆箱上架"),
    POS3_ANY_PUTAWAY(3, "2", "不拆箱/拆箱"),
    POS3_RANDOMBOX_PUTAWAY(3, "4", "随机箱码上架"),
    POS4_PUTAWAY_METHOD_DEFAULT(4,"0","无上架方式,还未上架"),
    POS4_PUTAWAY_METHOD_NORMAL(4,"1","非整箱上架方式"),
    POS4_PUTAWAY_METHOD_BOX(4,"2","整箱上架方式"),
    POS4_PUTAWAY_CODE_BOX(4,"3","整箱上架方式"),
    POS5_SPLIT_BOX(5,"1","拆箱上架"),
    POS6_SMART_MOVE(6,"1","智能搬仓"),
    POS7_SKIP(7,"1","越库"),
    POS8_NO_LOSS_GOODS(8,"0","非库内少货"),
    POS8_LOSS_GOODS(8,"1","库内少货"),
    ;
    private final int index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    KaPutawayMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    private static String genDefaultType() {
        return StringUtils.repeat("0", 30);
    }

    public String create() {
        return appendMark(genDefaultType());
    }
    //在已有标记串设置标记位
    public static String appendReceiveMark(PutawayMarkEnum typeEnum, String receiveMark){
        StringBuffer sb = new StringBuffer(receiveMark);
        return  sb.replace(sb.length()-typeEnum.getIndex(),sb.length()-typeEnum.getIndex()+typeEnum.getValue().length(),typeEnum.getValue()).toString();
    }

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

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
