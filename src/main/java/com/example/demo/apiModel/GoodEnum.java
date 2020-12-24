package com.example.demo.apiModel;



@SuppressWarnings("unused")
public enum GoodEnum {
    ORDINARY_GOOD("LS001", "普通商品"),
    SHELF_GOOD("LS003", "保质期商品"),
    BATCH_GOOD("LS004", "批次商品");


    private String goodId;
    private String goodName;

    GoodEnum(String goodId, String goodName) {
        this.goodId = goodId;
        this.goodName = goodName;
    }

    public static GoodEnum getGoodEnumbyGoodId(String goodId) {
        for (GoodEnum c : GoodEnum.values()) {
            if(c.getGoodId().equals(goodId)){
                return c;
            }
        }
        return null;
    }
    public static GoodEnum getGoodEnumbyGoodName(String goodName) {
        for (GoodEnum c : GoodEnum.values()) {
            if(c.getGoodName().equals(goodName)){
                return c;
            }
        }
        return null;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
}
