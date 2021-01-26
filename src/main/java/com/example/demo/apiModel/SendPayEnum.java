package com.example.demo.apiModel;



@SuppressWarnings("unused")
public enum SendPayEnum {
    ORDINARY_GOOD("普通C单", "1000000020000000000000000200110003300010000000000010000000000103000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"),
    SHELF_GOOD("直通车订单", "1000000020000000000000000200110003300010000000000010000000000103000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000");


    private String name;
    private String value;

    SendPayEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static SendPayEnum getEnumByName(String name) {
        for (SendPayEnum c : SendPayEnum.values()) {
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}