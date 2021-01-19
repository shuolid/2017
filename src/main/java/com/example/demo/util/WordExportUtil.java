package com.example.demo.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordExportUtil {
    private static Logger LOGGER = LoggerFactory.getLogger(WordExportUtil.class);

    private static WordExportUtil service = null;

    private WordExportUtil() {
        super();
    }

    public static WordExportUtil getInstance() {
        if(service == null) {
            synchronized(WordExportUtil.class){
                if(service == null) {
                    service = new WordExportUtil();
                }
            }
        }
        return service;
    }



    /**
     *
     * @param templateFilePath  eg: /template/test/test.ftl
     * @param dataMap
     * @param exportFilePath  eg: /tmp/test/test123.doc
     * @param loadType  设置路径加载方式。1-绝对路径，2-项目相对路径
     * @return
     * @throws Exception
     */
    public File createDocFile(String templateFilePath,Map<String, Object> dataMap, String exportFilePath, int loadType) throws Exception {
        Template t = null;
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("UTF-8");
        try {
            templateFilePath = pathReplace(templateFilePath);
            String ftlPath = templateFilePath.substring(0, templateFilePath.lastIndexOf("/"));
            if(loadType == 1) {
                configuration.setDirectoryForTemplateLoading(new File(ftlPath)); // FTL文件所存在的位置
            }else {
                configuration.setClassForTemplateLoading(this.getClass(), ftlPath);//以类加载的方式查找模版文件路径
            }


            String ftlFile = templateFilePath.substring(templateFilePath.lastIndexOf("/")+1);
            t = configuration.getTemplate(ftlFile); // 模板文件名

            File outFile = new File(exportFilePath);
            Writer out = null;

            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)));

            t.process(dataMap, out);
        } catch (Exception e) {
            LOGGER.error("导出word文档出错", e);
            throw e;
        }

        return null;
    }

    /**
     *  把路径的\替换成/
     * @param path
     * @return
     */
    private String pathReplace(String path) {
        while(path != null && path.contains("\\")) {
            path = path.replace("\\", "/");
        }
        return path;
    }

    public static void main(String[] args) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        getData(dataMap);
        String templateFile = "D:\\test\\test.ftl";
        String exportFile = "D:\\test\\test1.doc";

        try {
            WordExportUtil.getInstance().createDocFile(templateFile, dataMap, exportFile, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试用的
     * @param dataMap
     */
    public static void getData(Map<String, Object> dataMap) {
        dataMap.put("cs", "shuolid");
        dataMap.put("csyx", "2021");
        dataMap.put("csyxx", "测试一下");
        dataMap.put("cscs", "0.00001");
    }
}
