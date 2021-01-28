package com.example.demo.apiModel.asnDataImport;


import java.text.MessageFormat;

public enum AsnStatus implements EnumDictionary {
    NOT_INIT(-1, "未初始化", false),
    NOT_BOOKING(0, "未预约", false),
    BOOKED(1, "已预约", true),
    SIGN_IN(2, "已签到", true),
    ABANDON(3, "预约取消", true),
    NOT_NEED(9, "禁止预约", true);

    private final int key;
    private final String name;
    private final boolean ready;

    AsnStatus(int key, String name, boolean ready) {
        this.key = key;
        this.name = name;
        this.ready = ready;
    }

    public static AsnStatus valueOfInt(Integer inboundStatus) {
        if (inboundStatus == null) {
            return null;
        }
        for (AsnStatus status : values()) {
            if (status.key == inboundStatus) {
                return status;
            }
        }

        throw new RuntimeException("没有找到对应的装态：" + inboundStatus);
    }

    public int getKey() {
        return key;
    }

    public String getName(){
        return name;
    }
    public boolean isReady() {
        return ready;
    }

    @Override
    public String toString() {
        return MessageFormat.format(TO_STRING_FORMAT, key, name);
    }
}
