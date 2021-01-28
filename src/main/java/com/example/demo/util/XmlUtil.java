package com.example.demo.util;

import com.example.demo.BizType;
import com.example.demo.apiModel.Return;
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
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import java.io.StringReader;
import java.io.StringWriter;

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

    public static Return getStringResponse(BizType bizType, Object data){
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
            if(data instanceof String){
                xmlBuilder.append("<![CDATA[").append(data).append("]]>");
            }else {
                xmlBuilder.append(objectMapper.writeValueAsString(data));
            }
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
        String xmlResult = responseEntity.getBody().toString();
        log.info("{}接口响应结果：{}",bizType.getBizType(),xmlResult);
        return XmlUtil.convertToJava(xmlResult.substring(xmlResult.indexOf("return") - 1,xmlResult.lastIndexOf("return") + 7),Return.class);
    }


    public static String standardPostRequest(String url, Object data){
        ObjectMapper objectMapper = new ObjectMapper();
        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "";
        try {
            requestBody = objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        log.info("post请求url：{},参数：{}",url,requestBody);
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, requestHeader);
        ResponseEntity responseEntity = staticRestTemplate.postForEntity(url, requestEntity, String.class);
        log.info("post响应结果：{}",responseEntity.getBody().toString());
        return  responseEntity.getBody().toString();
    }



    public static String convertToXml(Object obj) {
        // 创建输出流
        StringWriter sw = new StringWriter();
        try {
            // 利用jdk中自带的转换类实现
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            // 格式化xml输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            // 将对象转换成输出流形式的xml
            marshaller.marshal(obj, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return sw.toString();
    }


    public static <T> T convertToJava(String xml, Class<T> c) {
        if (xml == null || xml.equals(""))
            return null;
        T t = null;
        StringReader reader = null;
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            reader = new StringReader(xml);
//            t = (T) unmarshaller.unmarshal(reader);
            //忽略命名空间
            SAXParserFactory sax = SAXParserFactory.newInstance();
            sax.setNamespaceAware(false);
            XMLReader xmlReader = sax.newSAXParser().getXMLReader();
            Source source = new SAXSource(xmlReader,new InputSource(reader));
            t = (T) unmarshaller.unmarshal(source);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
                reader.close();
        }
        return t;
    }

}
