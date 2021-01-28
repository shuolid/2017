package com.example.demo.apiModel.asnDataImport;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by baizhihong on 2019/11/28.
 */
public enum ConflictMarkEnum {
    /**
     * 验收
     */
    POS_SMART_MOVEWARE(InboundMarkEnum.POS20_SMART_MOVEWARE, KaInboundMarkEnum.POS21_SMART_MOVEWARE, "智能搬仓", ModuleEnums.RECEIVING),
    POS_NOT_SMART_MOVEWARE(InboundMarkEnum.POS20_NOT_SMART_MOVEWARE, KaInboundMarkEnum.POS21_NOT_SMART_MOVEWARE, "非智能搬仓", ModuleEnums.RECEIVING),
    POS_BACK_SERIAL_ECLP_RECEIVING(InboundMarkEnum.POS29_BACK_SERIAL_ECLP, KaInboundMarkEnum.POS29_BACK_SERIAL_ECLP, "回传序列号", ModuleEnums.RECEIVING),
    POS_NOT_BACK_SERIAL_ECLP_RECEIVING(InboundMarkEnum.POS29_NOT_BACK_SERIAL_ECLP, KaInboundMarkEnum.POS29_NO_BACK_SERIAL_ECLP, "非智能搬仓", ModuleEnums.RECEIVING),
    POS_IS_APPRECIATION_SERVE_TRUE(InboundMarkEnum.POS33_IS_APPRECIATION_SERVE_TRUE, KaInboundMarkEnum.POS27_VALUE_ADDED_SERVICES, "有增值服务单", ModuleEnums.RECEIVING),
    POS_ALLOW_EXCEED_RECEIVING(InboundMarkEnum.POS38_ALLOW_EXCEED_RECEIVING, KaInboundMarkEnum.POS15_NEED_VALID_SHELF, "不校验保质期", ModuleEnums.RECEIVING),
    IS_NO_SALE(InboundMarkEnum.IS_NO_SALE, KaInboundMarkEnum.IS_NO_SALE, "eclp下批次解锁", ModuleEnums.RECEIVING),
    POS_STOCKlOCK(InboundMarkEnum.POS72_STOCKlOCK, KaInboundMarkEnum.POS22_STOCKlOCK, "锁库存客退单", ModuleEnums.RECEIVING),
    POS_BOX_RETURN_ECLP(InboundMarkEnum.POS66_BOX_RETURN_ECLP, KaInboundMarkEnum.POS16_BOX_RETURN_ECLP, "箱报文校验回传", ModuleEnums.RECEIVING),
    POS_CHECK_SN_BYGOODSNO(InboundMarkEnum.POS75_CHECK_SN_BYGOODSNO, KaInboundMarkEnum.POS25_CHECK_SN_BYGOODSNO, "SKU维度校验序列号", ModuleEnums.RECEIVING),
    POS_CHECK_SN_BYORDER(InboundMarkEnum.POS75_CHECK_SN_BYORDER, KaInboundMarkEnum.POS25_CHECK_SN_BYORDER, "单维度校验序列号", ModuleEnums.RECEIVING),
    POS_DEFAULT(InboundMarkEnum.POS70_DEFAULT, KaInboundMarkEnum.POS20_DEFAULT, "客退卡宾标示", ModuleEnums.RECEIVING),
    POS_KABIN(InboundMarkEnum.POS70_KABIN, KaInboundMarkEnum.POS20_KABIN, "客退卡宾标示", ModuleEnums.RECEIVING),
    POS_NOT_SKIP_STORE(InboundMarkEnum.POS76_NOT_SKIP_STORE, KaInboundMarkEnum.POS26_NOT_SKIP_STORE, "非越库标示", ModuleEnums.RECEIVING),
    POS_SKIP_STORE(InboundMarkEnum.POS76_SKIP_STORE, KaInboundMarkEnum.POS26_SKIP_STORE, "越库标示", ModuleEnums.RECEIVING),
    POS_VALUE_ADDED_TAOTAOQI_SERVICES_RECEIVING(InboundMarkEnum.POS81_VALUE_ADDED_TAOTAOQI_SERVICES, KaInboundMarkEnum.POS31_VALUE_ADDED_TAOTAOQI_SERVICES, "淘气集约仓增值服务", ModuleEnums.RECEIVING),
    POS_COLLECT_TEMPERATURE_TAG_RECEIVING(InboundMarkEnum.POS82_COLLECT_TEMPERATURE_TAG, KaInboundMarkEnum.POS32_COLLECT_TEMPERATURE_TAG, "采集温度标识增值服务", ModuleEnums.RECEIVING),

    /**
     * 与ka标位冲突，但ka没用此业务，直接赋值为null返回false
     */
    POS15_NOT_TC(InboundMarkEnum.POS15_NOT_TC, null, "非TC", ModuleEnums.RECEIVING),
    POS15_IS_TC(InboundMarkEnum.POS15_IS_TC, null, "TC", ModuleEnums.RECEIVING),
    POS16_DETAIL_TC(InboundMarkEnum.POS16_DETAIL_TC, null, "验明细", ModuleEnums.RECEIVING),
    POS16_DBB_TC(InboundMarkEnum.POS16_DBB_TC, null, "点大包", ModuleEnums.RECEIVING),
    PURCHASETRANS_NOT(InboundMarkEnum.PURCHASETRANS_NOT, null, "非采配", ModuleEnums.RECEIVING),
    PURCHASETRANS_GENERAL(InboundMarkEnum.PURCHASETRANS_GENERAL, null, "大仓采配", ModuleEnums.RECEIVING),
    PURCHASETRANS_MOVEWARE(InboundMarkEnum.PURCHASETRANS_MOVEWARE, null, "移动仓采配", ModuleEnums.RECEIVING),
    POS25_IS_ASN_FALSE(InboundMarkEnum.POS25_IS_ASN_FALSE, null, "采购单", ModuleEnums.RECEIVING),
    POS25_IS_ASN_TRUE(InboundMarkEnum.POS25_IS_ASN_TRUE, null, "ASN单", ModuleEnums.RECEIVING),
    POS30_OWN_OUT(InboundMarkEnum.POS30_OWN_OUT, null, "京仓订单客退到京仓", ModuleEnums.RECEIVING),
    POS30_NOT_OWN_OUT(InboundMarkEnum.POS30_NOT_OWN_OUT, null, "非京仓订单客退到京仓", ModuleEnums.RECEIVING),
    POS31_INSTORE_FLOW_TRIGGER_POINT_ONE(InboundMarkEnum.POS31_INSTORE_FLOW_TRIGGER_POINT_ONE, null, "容器完验之后跑流向", ModuleEnums.RECEIVING),
    POS31_INSTORE_FLOW_TRIGGER_POINT_TWO(InboundMarkEnum.POS31_INSTORE_FLOW_TRIGGER_POINT_TWO, null, "验收开始前签到跑流向", ModuleEnums.RECEIVING),
    POS31_INSTORE_FLOW_TRIGGER_POINT_THREE(InboundMarkEnum.POS31_INSTORE_FLOW_TRIGGER_POINT_THREE, null, "验收开始前跑流向整箱流向不一致无流向", ModuleEnums.RECEIVING),
    POS32_FLOW_TYPE_ONE(InboundMarkEnum.POS32_FLOW_TYPE_ONE,  null, "普通流向策略", ModuleEnums.RECEIVING),
    POS32_FLOW_TYPE_TWO(InboundMarkEnum.POS32_FLOW_TYPE_TWO, null, "人机混合流向策略", ModuleEnums.RECEIVING),
    POS32_FLOW_TYPE_THREE(InboundMarkEnum.POS32_FLOW_TYPE_THREE, null, "智能存储流向策略", ModuleEnums.RECEIVING),
    POS32_FLOW_TYPE_FOUR(InboundMarkEnum.POS32_FLOW_TYPE_FOUR, null, "广州图书流向策略", ModuleEnums.RECEIVING),

    /**
     * 预约
     */
    POS_BACK_SERIAL_ECLP(AsnMarkEnum.POS9_BACK_SERIAL_ECLP, KaAsnMarkEnum.POS3_BACK_SERIAL_ECLP, "回传序列号", ModuleEnums.BOOKING),
    POS_NOT_BACK_SERIAL_ECLP(AsnMarkEnum.POS9_NOT_BACK_SERIAL_ECLP, KaAsnMarkEnum.POS3_NO_BACK_SERIAL_ECLP, "不回传序列号", ModuleEnums.BOOKING),
    POS_TRAY(AsnMarkEnum.POS2_TRAY, KaAsnMarkEnum.POS2_TRAY, "按托收货", ModuleEnums.BOOKING),
    POS_VALUE_ADDED_TAOTAOQI_SERVICES(AsnMarkEnum.POS17_VALUE_ADDED_TAOTAOQI_SERVICES, KaAsnMarkEnum.POS4_VALUE_ADDED_TAOTAOQI_SERVICES, "淘气集约仓增值服务", ModuleEnums.BOOKING),
    POS_COLLECT_TEMPERATURE_TAG(AsnMarkEnum.POS18_COLLECT_TEMPERATURE_TAG, KaAsnMarkEnum.POS5_COLLECT_TEMPERATURE_TAG, "采集温度标识", ModuleEnums.BOOKING),

    POS3_COMPLETE_ASN_BACK(AsnMarkEnum.POS3_COMPLETE_ASN_BACK, null, "整单完验时回传", ModuleEnums.BOOKING),
    POS4_IS_ASN_FALSE(AsnMarkEnum.POS4_IS_ASN_FALSE, null, "采购单", ModuleEnums.BOOKING),
    POS4_IS_ASN_TRUE(AsnMarkEnum.POS4_IS_ASN_TRUE, null, "ASN单", ModuleEnums.BOOKING),
    POS2_TC_BATCH_DEFAULT(AsnMarkEnum.POS2_TC_BATCH_DEFAULT, null, "非TC", ModuleEnums.BOOKING),
    POS2_TC_BATCH_DBB(AsnMarkEnum.POS2_TC_BATCH_DBB, null, "TC点大包", ModuleEnums.BOOKING),
    POS2_TC_BATCH_DETAIL(AsnMarkEnum.POS2_TC_BATCH_DETAIL, null, "TC验明细", ModuleEnums.BOOKING),

    /**
     * 上架
     */
    POS_SMART_MOVE(PutawayMarkEnum.POS5_SMART_MOVE, KaPutawayMarkEnum.POS6_SMART_MOVE, "智能搬仓", ModuleEnums.PUTAWAY),

    POS6_PUTAWAY_NOTXV(PutawayMarkEnum.POS6_PUTAWAY_NOTXV, null, "非立库上架", ModuleEnums.PUTAWAY),
    POS6_PUTAWAY_XV(PutawayMarkEnum.POS6_PUTAWAY_XV, null, "立库上架", ModuleEnums.PUTAWAY),
    ;

    private InboundMarkEnum inboundMarkEnum = null;
    private KaInboundMarkEnum kaInboundMarkEnum = null;
    private String name;
    private ModuleEnums module;
    private AsnMarkEnum asnMarkEnum = null;
    private KaAsnMarkEnum kaAsnMarkEnum = null;
    private PutawayMarkEnum putawayMarkEnum = null;
    private KaPutawayMarkEnum kaPutawayMarkEnum = null;



    ConflictMarkEnum(InboundMarkEnum inboundMarkEnum, KaInboundMarkEnum kaInboundMarkEnum, String name, ModuleEnums module) {
        this.inboundMarkEnum = inboundMarkEnum;
        this.kaInboundMarkEnum = kaInboundMarkEnum;
        this.name = name;
        this.module = module;
    }

    ConflictMarkEnum(AsnMarkEnum asnMarkEnum, KaAsnMarkEnum kaAsnMarkEnum, String name, ModuleEnums module) {
        this.asnMarkEnum = asnMarkEnum;
        this.kaAsnMarkEnum = kaAsnMarkEnum;
        this.name = name;
        this.module = module;
    }

    ConflictMarkEnum(PutawayMarkEnum putawayMarkEnum, KaPutawayMarkEnum kaPutawayMarkEnum, String name, ModuleEnums module) {
        this.putawayMarkEnum = putawayMarkEnum;
        this.kaPutawayMarkEnum = kaPutawayMarkEnum;
        this.name = name;
        this.module = module;
    }

    public boolean contains(String receiveMark){
        if (StringUtils.isEmpty(receiveMark)){
            return false;
        }
        if (KaFlag.isKaInbound){
            switch (module){
                case BOOKING:
                    return booking(receiveMark);
                case RECEIVING:
                    return receiving(receiveMark);
                case PUTAWAY:
                    return putaway(receiveMark);
            }
            return false;
        }else{
            switch (module){
                case BOOKING:
                    return asnMarkEnum.contains(receiveMark);
                case RECEIVING:
                    return inboundMarkEnum.contains(receiveMark);
                case PUTAWAY:
                    return putawayMarkEnum.contains(receiveMark);
            }
            return false;
        }
    }

    private boolean receiving(String receiveMark){
        if (isNewData(receiveMark)){
            return inboundMarkEnum.contains(receiveMark);
        }else {
            if (kaInboundMarkEnum == null){
                return false;
            }
            return kaInboundMarkEnum.contains(receiveMark);
        }
    }

    private boolean booking(String receiveMark){
        if (isNewData(receiveMark)){
            return asnMarkEnum.contains(receiveMark);
        }else {
            if (kaAsnMarkEnum == null){
                return false;
            }
            return kaAsnMarkEnum.contains(receiveMark);
        }
    }

    private boolean putaway(String receiveMark){
        if (isNewData(receiveMark)){
            return putawayMarkEnum.contains(receiveMark);
        }else {
            if (kaPutawayMarkEnum == null){
                return false;
            }
            return kaPutawayMarkEnum.contains(receiveMark);
        }
    }

    private boolean isNewData(String receiveMark){
        return "1".equals(receiveMark.substring(0, 1));
    }

    public static void main(String[] args){
        Boolean res = ConflictMarkEnum.POS_TRAY.contains("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100002000000000000000000000000200000");
    }
}

