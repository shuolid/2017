package com.example.demo.util;

import com.example.demo.BizType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class XmlUtil {
    private static Logger log = LoggerFactory.getLogger(XmlUtil.class);

    @Resource
    private RestTemplate restTemplate;

    private static RestTemplate staticRestTemplate;

    @PostConstruct
    public void init(){
        this.staticRestTemplate = restTemplate;
    }

    public static String getStringResponse(BizType bizType, Object data){
        ObjectMapper objectMapper = new ObjectMapper();

        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.setContentType(MediaType.APPLICATION_XML);
        requestHeader.set("routerule","6,6,"+ bizType.getRouteRule());
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlBuilder.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wms3=\"http://wms3.360buy.com\">");
        xmlBuilder.append("<soapenv:Header/>");
        xmlBuilder.append("<soapenv:Body>");
        xmlBuilder.append("<wms3:queryWs>");
        xmlBuilder.append("<arg0>");

        try {
            xmlBuilder.append(objectMapper.writeValueAsString(bizType));

            xmlBuilder.append("</arg0>");
            xmlBuilder.append("<arg1>");

            xmlBuilder.append(objectMapper.writeValueAsString(data));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        xmlBuilder.append("</arg1>");
        xmlBuilder.append("</wms3:queryWs>");
        xmlBuilder.append("</soapenv:Body>");
        xmlBuilder.append("</soapenv:Envelope>");

        log.info("{}接口请求参数：{}",bizType.getBizType(),xmlBuilder.toString());
        HttpEntity<String> requestEntity = new HttpEntity<>(xmlBuilder.toString(), requestHeader);
        ResponseEntity responseEntity = staticRestTemplate.postForEntity(bizType.getUrl(), requestEntity, String.class);
        log.info("{}接口响应结果：{}",bizType.getBizType(),responseEntity.getBody().toString());
        return  responseEntity.getBody().toString();
    }

}
