package com.example.demo.apiModel.asnDataImport;

import java.text.MessageFormat;

public enum CallStatus implements EnumDictionary {
    WAITING(0, "等待"),
    CONFIRM(1, "确认月台"),
    QUEUE(2, "排队"),
    CALLING(3, "叫号"),
    RECEIVING(4, "验收"),
    LEAVE(9, "离开月台"),
    /**园区化二期新增状态标识*/
    WAITINGCALL(10, "签到"),
    ALREADYCALL(11, "已叫号"),
    PASSCALL(12, "过号"),
    ONRECEIVING(13, "验收中"),
    CANCELCALLING(14,"取消签到"),
    NOUSE(999, "无用");

    private int key;
    private String name;

    CallStatus(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public boolean isCanPub() {
        //兼容园区化二期和非园区化
        return ONRECEIVING == this || RECEIVING == this;
    }

    public boolean isCanRelease() {
        return WAITING != this && LEAVE != this;
    }

    public boolean isCanAddWorkerInSupplement() {
        return WAITING != this && LEAVE != this;
    }

    @Override
    public String toString() {
        return MessageFormat.format(TO_STRING_FORMAT, key, name);
    }
}
