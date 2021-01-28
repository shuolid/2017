package com.example.demo.apiModel.asnDataImport;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * 对应ib_receiving_task_m.inbound_mark字段
 */
public enum InboundMarkEnum {
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
    POS5_SN_LIST_OR_NOT(5, "2", "有序列号清单可不依赖"),
    POS6_NOT_MARK(6, "0", "rep、eclp历史数据"),
    POS6_NOT_BACK_BY_CONTAINER(6, "2", "非按板回传"),
    POS6_IS_BACK_BY_CONTAINER(6, "1", "按板回传"),
    POS6_IS_BACK_BY_CONTAINER_RETURN(6, "3", "客退按板回传"),
    POS7_DEFAULT(7, "0", "非整箱验收"),
    POS7_BOX_RECEIVING(7, "1", "整箱验收"),
    POS7_POPULAR_RECEIVING(7, "2", "零散/整箱验收"),
    RETURNS_B2C(8, "0", "客退B2C业务"),
    RETURNS_B2B(8, "1", "客退B2B业务"),
    RETURNS_B2B2C(8, "2", "客退B2B2C业务"),
    RETURNS_DMS_REFUSE(8, "3", "一键代发拒收客退业务"),
    DISALLOW_DEFECTIVE_OVERDUE_INBOUND(9, "0", "客退禁止残品过期入库"),
    ALLOW_DEFECTIVE_OVERDUE_INBOUND(9, "1", "客退允许残品过期入库"),
    POS10_SHOP(10, "1", "是否门店标示"),
    POS11_NEED_BOOKING(11, "1", "需要预约"),
    POS11_NOT_NEED_BOOKING(11, "2", "不需要预约"),
    POS12_LOGISTICS_PARK(12, "1", "园区化"),
    POS12_NOT_LOGISTICS_PARK(12, "2", "非园区化"),
    POS13_HAND_OVER(13, "1", "信任交接标示"),
    POS14_DEFAULT(14, "0", "默认方式验收"),
    //验收完毕后添加
    POS14_PRECHECK_METHOD(14, "1", "预检方式验收"),
    POS14_BOX_METHOD(14, "2", "整箱方式验收"),
    POS15_NOT_TC(15, "0", "非TC"),
    POS15_IS_TC(15, "1", "TC"),//改这个标的位置，需要改sql
    POS16_DETAIL_TC(16, "1", "验明细"),
    POS16_DBB_TC(16, "2", "点大包"),
    POS17_NOCLOSE_INBOUND(17, "0", "未接收到TC下发的可关单指令"),
    POS17_CLOSE_INBOUND(17, "1", "接收到TC下发的可关单指令"),
    POS18_BATCHES(18, "1", "分批次收货"),
    POS19_DEFAULT(19, "0", "不能缺量入库"),
    POS19_SHORTAGE(19, "1", "支持缺量入库"),
    POS20_NOT_SMART_MOVEWARE(20, "0", "非智能搬仓"),
    POS20_SMART_MOVEWARE(20, "1", "智能搬仓"),
    PURCHASETRANS_NOT(22, "0", "非采配"),
    PURCHASETRANS_GENERAL(22, "1", "大仓采配"),
    PURCHASETRANS_MOVEWARE(22, "2", "移动仓采配"),
    POS23_COMPLETE_ASN_BACK(23, "1", "整单完验时回传"),
    POS24_MERGE_ASN_FLAG(24, "1", "合并采购单验收单据"),
    POS24_MERGE_RETURN_ASN_FLAG(24, "2", "合并客退入库验收单据"),
    POS25_IS_ASN_FALSE(25, "0", "采购单"),
    POS25_IS_ASN_TRUE(25, "1", "ASN单"),
    POS28_NOT_DAIBAN_TRANSPORT(28, "0", "非带板运输"),
    POS28_DAIBAN_TRANSPORT(28, "1", "带板运输"),
    POS29_BACK_SERIAL_ECLP(29, "1", "5.0回传序列号"),
    POS29_KA_BACK_SERIAL_ECLP(29, "0", "KA回传序列号"),
    POS29_NOT_BACK_SERIAL_ECLP(29, "2", "不回传序列号"),
    POS30_OWN_OUT(30, "0", "京仓订单客退到京仓"),
    //不需要校验源出库信息和源出库序列号信息
    POS30_NOT_OWN_OUT(30, "1", "非京仓订单客退到京仓"),
    POS31_INSTORE_FLOW_TRIGGER_POINT_ZERO(31, "0", "容器完验之后跑流向"),
    POS31_INSTORE_FLOW_TRIGGER_POINT_ONE(31, "1", "合单验收开始前跑流向"),
    POS31_INSTORE_FLOW_TRIGGER_POINT_TWO(31, "2", "验收开始前签到跑流向"),
    POS31_INSTORE_FLOW_TRIGGER_POINT_THREE(31, "3", "验收开始前跑流向整箱流向不一致无流向"),
    POS32_FLOW_TYPE_ONE(32, "0", "普通流向策略"),
    POS32_FLOW_TYPE_TWO(32, "2", "人机混合流向策略"),
    POS32_FLOW_TYPE_THREE(32, "3", "智能存储流向策略"),
    POS32_FLOW_TYPE_FOUR(32, "4", "广州图书流向策略"),
    POS33_IS_APPRECIATION_SERVE_FALSE(33, "0", "无增值服务单"),
    POS33_IS_APPRECIATION_SERVE_TRUE(33, "1", "有增值服务单"),
    POS35_CAN_LESS_GOODS(35, "0", "上架异常允许操作验收少货"),
    POS35_NOT_CAN_LESS_GOODS(35, "1", "上架异常不允许操作验收少货"),
    POS36_IS_CROSS_DOCKING_CLOSE(36, "0", "关闭内配越库生产模式"),
    POS36_IS_CROSS_DOCKING_OPEN(36, "1", "开启内配越库生产模式"),
    POS37_NOT_FRESH_SHORT_SAFE_FLAG(37, "0", "不显示优先收货标识"),
    POS37_FRESH_SHORT_SAFE_FLAG(37, "1", "显示优先收货标识"),
    POS38_NOT_ALLOW_EXCEED_RECEIVING(38, "0", "ECLP不允许超期入库"),
    POS38_ALLOW_EXCEED_RECEIVING(38, "1", "ECLP允许超期入库"),
	POS39_NOT_TC_ASN(39, "0", "非TC采购单"),
    POS39_TC_ASN(39, "1", "TC采购单"),
    POS40_NOT_SUPPLIER_ELECTRONIC_RECEIPT(40, "0", "供应商未开启电子回执单"),
    POS40_OPEN_SUPPLIER_ELECTRONIC_RECEIPT(40, "1", "供应商开启电子回执单"),
    POS41_RECEIPT_NOT_COMPLETE_SIGN(41, "0", "回执单待签署"),
    POS41_RECEIPT_COMPLETE_SIGN(41, "1", "回执单已签署"),//改这个标的位置，需要改sql,有作为条件查询
    POS42_NOT_MARK_FLAG(42, "0", "不需要贴码"),
    POS42_MARK_FLAG(42, "1", "需要贴码"),
    POS43_ECLP_CROSS_DOCKING(43,"1","ECLP采购入内配越库"),

    POS44_NOT_ParkCallThird(44, "0", "非园区化3.0"),
    POS44_ParkCallThird(44, "1", "园区化3.0"),
    /**
     * 云箱带板入库需求
     */
    POS45_DEFAULT(45, "0", "非整板验收"),
    POS45_PLATE_FLAG(45, "1", "整板验收"),
    POS46_NO_GROUP_PURCHASE_FLAG(46, "0", "非社区团购单"),
    POS46_GROUP_PURCHASE_FLAG(46, "1", "社区团购单"),
    //---------------KA新加
    IS_NO_SALE(80, "1", "eclp下批次解锁"),
    POS72_DEFAULT(72, "0", "非锁库存客退单"),
    POS72_STOCKlOCK(72, "1", "锁库存客退单"),
    POS66_BOX_RETURN_ECLP(66, "1", "箱报文校验回传"),
    POS75_CHECK_SN_BYGOODSNO(75, "0", "KA-SKU维度校验序列号"),
    POS75_CHECK_SN_BYORDER(75, "1", "KA-单维度校验序列号"),
    POS70_DEFAULT(70, "0", "客退卡宾标示"),
    POS70_KABIN(70, "1", "客退卡宾标示"),
    POS76_NOT_SKIP_STORE(76, "0", "非越库标示"),
    POS76_SKIP_STORE(76, "1", "越库标示"),
    POS81_VALUE_ADDED_TAOTAOQI_SERVICES(81,"1","淘气集约仓增值服务"),
    POS82_COLLECT_TEMPERATURE_TAG(82,"1","采集温度标识增值服务"),
    POS83_BOX_SERVICES(83,"1","供应链增值服务，按箱计费"),
    POS83_EACH_SERVICES(83,"2","供应链增值服务，按件计费"),
    POS83_BOX_PIECE_MIN_SERVICES(83,"3","供应链增值服务，箱件最低"),
    POS83_EACH_AND_BOX(83,"4","供应链增值服务，箱件并存"),
    POS83_EACH_OR_BOX(83,"5","供应链增值服务，可箱可件"),
    POS84_RANDOMBOXNO(84,"1","随机箱码"),
    POS85_TENCENT_BOX_REGULATIONS_SERIAL(85,"1","腾讯箱规序列号"),
    POS86_PURCHASE_ORDER_INSPECTION(86,"1","采购单质检"),
    POS87_NEED_BACK_SKECHERS(87,"1","斯凯奇验收回传结果"),
    POS126_IS_NEW_DATA(127,"1","BC融合新数据")
    ;

    private static InboundMarkEnum[][] INBOUND_MARK_ENUMS = {
            {},
            {POS1_DEFAULT, POS1_MANUAL_SN, POS1_AUTOMATIC_IMEI},
            {POS2_PULL_FROM_DMS, POS2_PUSH_BY_DMS},
            {POS3_NOT_SECOND_HAND, POS3_IS_SECOND_HAND},
            {POS4_DEFAULT, POS4_SN_TWICE},
            {POS5_DEFAULT, POS5_SN_LIST},
            {POS6_NOT_BACK_BY_CONTAINER, POS6_IS_BACK_BY_CONTAINER},
            {POS7_DEFAULT, POS7_BOX_RECEIVING, POS7_POPULAR_RECEIVING},
            {RETURNS_B2B, RETURNS_B2C, RETURNS_B2B2C},
            {POS10_SHOP},
            {POS13_HAND_OVER},
            {POS14_DEFAULT, POS14_PRECHECK_METHOD, POS14_BOX_METHOD},
            {POS19_DEFAULT, POS19_SHORTAGE},
            {POS20_NOT_SMART_MOVEWARE, POS20_SMART_MOVEWARE},
            {POS40_NOT_SUPPLIER_ELECTRONIC_RECEIPT},
            {POS40_OPEN_SUPPLIER_ELECTRONIC_RECEIPT},
            {POS76_NOT_SKIP_STORE, POS76_SKIP_STORE},
    };
    private final int
            index;//从右往左第index位
    private final String value;//值
    private final String name;//标记位名称


    InboundMarkEnum(int index, String value, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    private static String genDefaultType() {
        if (KaFlag.isKaInbound) {
            return "1" + StringUtils.repeat("0", 126);
        }else {
            return StringUtils.repeat("0", 126);
        }
    }

    public static String create(InboundMarkEnum... markEnums) {
        EnumSet<InboundMarkEnum> enums = EnumSet.noneOf(InboundMarkEnum.class);
        enums.addAll(Arrays.asList(markEnums));
        return create(enums);
    }

    public static String create(Set<InboundMarkEnum> markEnums) {
        String s = genDefaultType();
        if (markEnums.isEmpty()) {
            return s;
        }

        for (InboundMarkEnum markEnum : markEnums) {
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
    public InboundMarkEnum getInboundMarkEnum(String receiveMark) {
        String value = getMarkValue(receiveMark);
        return valueOfFor(value);
    }

    /**
     * 查找指定mark枚举
     *
     * @param value 枚举中value的值
     * @return 枚举
     */
    public InboundMarkEnum valueOfFor(String value) {
        for (InboundMarkEnum markEnum : INBOUND_MARK_ENUMS[this.index]) {
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
