package com.example.demo.apiModel.issuedOrders;

/**
 * Created by yangtao6 on 2016/9/8.
 */
public enum Grade {
    ORDER("1", "按单据等级入库"), GOODS("2", "按实物等级入库");

    private final String value;
    private final String name;

    Grade(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
