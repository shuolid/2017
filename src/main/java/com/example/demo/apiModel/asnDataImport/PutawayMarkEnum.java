package com.example.demo.apiModel.asnDataImport;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by liuzicheng on 2016/10/9.
 */
public enum PutawayMarkEnum {
    POS1_DEFAULT(1, "0", "默认"),
    POS2_NOT_IS_MASTER_CONTAINER(2, "1", "非master中容器验收"),
    POS3_DEFAULT(3, "0", "拆箱上架"),
    POS3_BOX_PUTAWAY(3, "1", "不拆箱上架"),
    POS3_ANY_PUTAWAY(3, "2", "不拆箱/拆箱"),
    POS3_RANDOMBOX_PUTAWAY(3, "4", "随机箱码上架"),
    POS4_PUTAWAY_METHOD_DEFAULT(4, "0", "无上架方式,还未上架"),
    POS4_PUTAWAY_METHOD_NORMAL(4, "1", "非整箱上架方式"),
    POS4_PUTAWAY_METHOD_BOX(4, "2", "整箱上架方式"),
    POS5_SMART_MOVE(5, "1", "智能搬仓"),
    POS6_PUTAWAY_NOTXV(6, "0", "非立库上架"),
    POS6_PUTAWAY_XV(6, "1", "立库上架"),
    POS7_NOT_CONSUME(9,"0","非耗材"),
    POS7_IS_CONSUME(9,"1","耗材"),
    POS8_NOT_NEED_RELEASE_CONTAINER(10, "1", "不需要释放容器"),
    /**
     * 云箱带板入库需求
     */
    POS11_DEFAULT(11, "0", "非整板验收"),
    POS11_PLATE_FLAG(11, "1", "整板验收"),

    //******************KA****begin*******************
	POS7_SKIP(7,"1","越库"),
    POS8_NO_LOSS_GOODS(8,"0","非库内少货"),
    POS8_LOSS_GOODS(8,"1","库内少货"),
    POS30_IS_NEW_DATA(31,"1","BC融合新数据")
    ;
    private final int index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    PutawayMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    private static String genDefaultType() {
        if (KaFlag.isKaInbound) {
            return "1" + StringUtils.repeat("0", 30);
        }else {
            return StringUtils.repeat("0", 30);
        }
    }

    public static String create(PutawayMarkEnum... markEnums) {
        EnumSet<PutawayMarkEnum> enums = EnumSet.noneOf(PutawayMarkEnum.class);
        enums.addAll(Arrays.asList(markEnums));
        return create(enums);
    }

    public static String create(Set<PutawayMarkEnum> markEnums) {
        String s = genDefaultType();
        if (markEnums.isEmpty()) {
            return s;
        }

        for (PutawayMarkEnum markEnum : markEnums) {
            s = markEnum.appendMark(s);
        }
        return s;
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

    //在已有标记串设置标记位
    public static String appendReceiveMark(PutawayMarkEnum typeEnum, String receiveMark){
        StringBuffer sb = new StringBuffer(receiveMark);
        return  sb.replace(sb.length()-typeEnum.getIndex(),sb.length()-typeEnum.getIndex()+typeEnum.getValue().length(),typeEnum.getValue()).toString();
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

    /**
     * 通过mark字符串，获得枚举
     *
     * @param receiveMark mark字符串
     * @return 枚举
     */
    public PutawayMarkEnum getPutawayMarkEnum(String receiveMark) {
        String value = getMarkValue(receiveMark);
        return valueOfFor(value);
    }

    /**
     * 查找指定mark枚举
     *
     * @param value 枚举中value的值
     * @return 枚举
     */
    public PutawayMarkEnum valueOfFor(String value) {
        for (PutawayMarkEnum markEnum : PutawayMarkEnum.values()) {
            if (markEnum.index == this.index && markEnum.value.equals(value)) {
                return markEnum;
            }
        }
        return null;
    }

    public static boolean isBox(String receiveMark) {
        PutawayMarkEnum markEnum = PutawayMarkEnum.POS3_DEFAULT.getPutawayMarkEnum(receiveMark);
        if (markEnum == null) {
            return false;
        }
        switch (markEnum) {
            case POS3_BOX_PUTAWAY:
                return true;
            case POS3_ANY_PUTAWAY:
                return true;
            case POS3_RANDOMBOX_PUTAWAY: return true;
            default:
                return false;
        }
    }

    public static boolean isBoxValue(String value) {
        PutawayMarkEnum markEnum = PutawayMarkEnum.POS3_DEFAULT.valueOfFor(value);
        if (markEnum == null) {
            return false;
        }
        return isBox(markEnum.create());
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
