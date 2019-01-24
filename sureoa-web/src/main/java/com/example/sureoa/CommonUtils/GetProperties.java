package com.example.sureoa.CommonUtils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class GetProperties {
    /**
     * 功能：从application.properties文件中读取出一个key对应的value
     * @param
     * @return 返回value值
     */
    public static String getValue(String keyName){
        String value = "";
        Properties p = new Properties();
        try {
            //读取jdbc.properties文件,使用InputStreamReader字符流防止文件中出现中文导致乱码
            p.load(new InputStreamReader(new FileInputStream("WebRoot/WEB-INF/classes/artifacts/sureoa/WEB-INF/classes/application.properties"),"UTF-8"));
            value = p.getProperty(keyName,"获取失败");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
    private static Logger logger = LoggerFactory.getLogger(GetProperties.class);

    private static Properties props;

    static {
        String fileName = "application.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(GetProperties.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        } catch (IOException e) {
            logger.error("配置文件读取异常",e);
        }
    }

    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key, String defaultValue){

        String value = props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value.trim();
    }

    

}
