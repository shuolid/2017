package com.example.demo.apiModel.asnDataImport;


public enum AsnType {
    it01, it02, it03, it04, it05;

    public static AsnType getAsnType(String asnType) {
        for (AsnType value : AsnType.values()) {
            if (asnType.equals(value.name())) {
                return value;
            }
        }

        return null;
    }
}
