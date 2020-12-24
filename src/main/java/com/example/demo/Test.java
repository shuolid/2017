package com.example.demo;

public class Test {
    public static void main(String[] args) {
        String xml = "<soap:Envelope\n" +
                "    xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soap:Body>\n" +
                "        <ns2:queryWsResponse\n" +
                "            xmlns:ns2=\"http://wms3.360buy.com\">\n" +
                "            <return>\n" +
                "                <resultCode>1</resultCode>\n" +
                "                <resultMessage>调用成功</resultMessage>\n" +
                "                <resultValue>0</resultValue>\n" +
                "            </return>\n" +
                "        </ns2:queryWsResponse>\n" +
                "    </soap:Body>\n" +
                "</soap:Envelope>";


    }
}
