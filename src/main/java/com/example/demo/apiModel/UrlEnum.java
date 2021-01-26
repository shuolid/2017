package com.example.demo.apiModel;



@SuppressWarnings("unused")
public enum UrlEnum {
    MERGE_URL("55", "http://merge.wms5.jd.test/pickingplan/services/waveWS"),
    PRE_URL("980", "http://wms5bjtest1.jd.com/pickingplan/services/waveWS");


    private String key;
    private String url;

    UrlEnum(String key, String url) {
        this.key = key;
        this.url = url;
    }

    public static UrlEnum getEnumByKey(String key) {
        for (UrlEnum c : UrlEnum.values()) {
            if(c.getKey().equals(key)){
                return c;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
