package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressUtil {

    private static Logger log = LoggerFactory.getLogger(CompressUtil.class);

    public static String uncompress(String str) throws IOException {
        GZIPInputStream gin = null;
        StringWriter writer = null;
        InputStreamReader reader = null;

        try {
            if (!str.isEmpty()) {
                new ByteArrayOutputStream();
                InputStream is = new ByteArrayInputStream((new BASE64Decoder()).decodeBuffer(str));
                gin = new GZIPInputStream(is);
                reader = new InputStreamReader(gin, "UTF-8");
                writer = new StringWriter();
                char[] buffer = new char[10240];

                int length;
                while((length = reader.read(buffer)) > 0) {
                    writer.write(buffer, 0, length);
                }
            }
        } catch (Exception e) {
            log.error("解密异常",e);
        } finally {
            writer.close();
            reader.close();
            gin.close();
        }

        return writer.toString();
    }

    public static String compress(String str) throws IOException {
        if (str != null && str.length() != 0) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(out);
            gzip.write(str.getBytes("UTF-8"));
            gzip.close();
            return (new BASE64Encoder()).encode(out.toByteArray());
        }
        return str;
    }

}
