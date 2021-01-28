package com.example.demo.apiModel.asnDataImport;


import java.io.FileInputStream;
import java.util.Properties;

public class KaFlag {

    public static boolean isKaInbound;

    static {
        try {
            String propFileNameWithPath = ConflictMarkEnum.class.getResource("/").getPath() + "wms5-inbound.properties";
            //String propFileNameWithPath = "E:\\work\\code\\divBatchOne\\WMS5.2-inbound-javaApp\\wms5-inbound-ws\\src\\main\\resources\\wms5-inbound.properties";
            Properties prop = new Properties();
            prop.load(new FileInputStream(propFileNameWithPath));
            isKaInbound = "true".equals(prop.getProperty("isKaInbound")) ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
