package com.example.demo.apiModel.asnDataImport;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * ib_booking_asn_m表asn_mark枚举
 * created by zhangyaping
 * 20171115
 */
public enum AsnMarkEnum {
    POS1_DEFAULT(1, "0", "TC非分批次"),
    POS1_BOOKING_BATCH(1, "1", "KA预约分批次"),
    POS2_TC_BATCH_DEFAULT(2, "0", "非TC"),
    POS2_TC_BATCH_DBB(2, "1", "TC点大包"),
    POS2_TC_BATCH_DETAIL(2, "2", "TC验明细"),
    POS3_COMPLETE_ASN_BACK(3, "1", "整单完验时回传"),
    POS4_IS_ASN_FALSE(4, "1", "采购单"),
    POS4_IS_ASN_TRUE(4, "2", "ASN单"),
    POS5_TENCENT_BOX_REGULATIONS_SERIAL(5,"1","腾讯箱规序列号"),
    POS6_BOOKING_BATCH(6, "1", "预约分批次"),
    POS2_TRAY(8, "1", "按托收货"),
    POS9_BACK_SERIAL_ECLP(9, "1", "回传序列号"),
    POS9_NOT_BACK_SERIAL_ECLP(9, "2", "不回传序列号"),
    POS10_IS_APPRECIATION_SERVE_FALSE(10, "0", "无增值服务单"),
    POS10_IS_APPRECIATION_SERVE_TRUE(10, "1", "有增值服务单"),
    POS11_NOT_CAN_LESS_GOODS(11, "1", "上架异常不允许操作验收少货"),
    POS11_CAN_LESS_GOODS(11, "0", "上架异常允许操作验收少货"),
    POS12_ALLOW_EXCEED_RECEIVING(12, "1", "ECLP允许超期入库"),
    POS13_NOT_FRESH_SHORT_SAFE_FLAG(13, "0", "不显示优先收货标识"),
    POS13_FRESH_SHORT_SAFE_FLAG(13, "1", "显示优先收货标识"),
    POS14_NOT_TC_ASN(14, "0", "非TC采购单"),
    POS14_TC_ASN(14, "1", "TC采购单"),
    IS_NO_SALE(15, "1", "eclp下批次解锁"),
    POS16_BOX_RETURN_ECLP(16, "1", "箱报文校验回传"),
    POS16_CHECK_SN_BYGOODSNO(16, "0", "KA-SKU维度校验序列号"),
    POS16_CHECK_SN_BYORDER(16, "1", "KA-单维度校验序列号"),
    POS17_VALUE_ADDED_TAOTAOQI_SERVICES(17, "1", "淘气集约仓增值服务"),
    POS18_COLLECT_TEMPERATURE_TAG(18, "1", "采集温度标识"),
    POS19_BOX_SERVICES(19, "1", "供应链增值服务，按箱计费"),
    POS19_EACH_SERVICES(19, "2", "供应链增值服务，按件计费"),
    POS19_BOX_PIECE_MIN_SERVICES(19, "3", "供应链增值服务，箱件最低"),
    POS19_EACH_AND_BOX(19, "4", "供应链增值服务，箱件并存"),
    POS19_EACH_OR_BOX(19, "5", "供应链增值服务，可箱可件"),
    POS20_DEFAULT(20, "0", "TC非分批次"),
    POS20_IS_BATCH(20, "1", "TC分批次"),
	POS21_NEED_BOOKING(21, "1", "需要预约"),
    POS21_NOT_NEED_BOOKING(21, "2", "不需要预约"),
    POS22_LOGISTICS_PARK(22, "1", "园区化"),
    POS22_NOT_LOGISTICS_PARK(22, "2", "非园区化"),
    POS23_NOT_ParkCallThird(23, "0", "非园区化3.0"),
    POS23_ParkCallThird(23, "1", "园区化3.0"),
    POS24_PURCHASE_ORDER_INSPECTION(24,"1","采购单质检"),
    POS21_NOT_MARK_FLAG(25, "0", "不需要贴码"),
    POS21_MARK_FLAG(25, "1", "需要贴码"),
    POS26_ECLP_CROSS_DOCKING(26,"1","ECLP采购入内配越库"),
    /**
     * 云箱带板入库需求
     */
    POS26_DEFAULT(26, "0", "非整板验收"),
    POS26_PLATE_FLAG(26, "1", "整板验收"),
    POS30_IS_NEW_DATA(31, "1", "BC融合新数据");

    private static AsnMarkEnum[][] ASN_MARK_ENUMS = {
            {},
            {POS20_DEFAULT, POS20_IS_BATCH,},
            {POS2_TC_BATCH_DEFAULT, POS2_TC_BATCH_DBB, POS2_TC_BATCH_DETAIL}
    };

    private final int index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    AsnMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    public static String genDefaultType() {
        if (KaFlag.isKaInbound) {
            return "1" + StringUtils.repeat("0", 30);
        }else {
            return StringUtils.repeat("0", 30);
        }
    }

    public static String create(AsnMarkEnum... markEnums) {
        EnumSet<AsnMarkEnum> enums = EnumSet.noneOf(AsnMarkEnum.class);
        enums.addAll(Arrays.asList(markEnums));
        return create(enums);
    }

    public static String create(Set<AsnMarkEnum> markEnums) {
        String s = genDefaultType();
        if (markEnums.isEmpty()) {
            return s;
        }

        for (AsnMarkEnum markEnum : markEnums) {
            s = markEnum.appendMark(s);
        }
        return s;
    }

    public String create() {
        return appendMark(genDefaultType());
    }

    //在已有标记串设置标记位
    public String appendMark(String receiveMark) {
        if (StringUtils.isBlank(receiveMark)) {
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

    /**
     * 通过mark字符串，获得枚举
     *
     * @param receiveMark mark字符串
     * @return 枚举
     */
    public AsnMarkEnum getAsnMarkEnum(String receiveMark) {
        String value = getMarkValue(receiveMark);
        return valueOfFor(value);
    }

    /**
     * 查找指定mark枚举
     *
     * @param value 枚举中value的值
     * @return 枚举
     */
    public AsnMarkEnum valueOfFor(String value) {
        for (AsnMarkEnum markEnum : ASN_MARK_ENUMS[this.index]) {
            if (markEnum.index == this.index && markEnum.value.equals(value)) {
                return markEnum;
            }
        }
        return null;
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
