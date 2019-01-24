package com.example.sureoa.web;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@RestController
public class BaiDuApi {

    private static final Double PI = Math.PI;
    private static final Double PK = 180 / PI;
    private static final String MAP_URL= "http://api.map.baidu.com/geocoder/v2/?ak=U399AMWiQAsf26w0MRGbqVOHn8tUCnha&output=json&address=";

    public static String connectURL(String dest_url, String commString) {
        String rec_string = "";
        URL url = null;
        HttpURLConnection urlconn = null;
        OutputStream out = null;
        BufferedReader rd = null;
        try {
            url = new URL(dest_url);
            urlconn = (HttpURLConnection) url.openConnection();
            urlconn.setReadTimeout(1000 * 30);
            urlconn.setRequestMethod("POST");
            urlconn.setDoInput(true);
            urlconn.setDoOutput(true);
            out = urlconn.getOutputStream();
            out.write(commString.getBytes("UTF-8"));
            out.flush();
            out.close();
            rd = new BufferedReader(new InputStreamReader(urlconn.getInputStream(),"UTF-8"));
            StringBuffer sb = new StringBuffer();
            int ch;
            while ((ch = rd.read()) > -1)
                sb.append((char) ch);
            rec_string = sb.toString();
        } catch (Exception e) {

            return "";
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (urlconn != null) {
                    urlconn.disconnect();
                }
                if (rd != null) {
                    rd.close();
                }
            } catch (Exception e) {

            }
        }
        return rec_string;
    }

    public static void main(String[] args) {
        String url ="http://api.map.baidu.com/location/?ip=14.153.187.174&ak=U399AMWiQAsf26w0MRGbqVOHn8tUCnha";
       // String url = "http://api.map.baidu.com/direction/v1?mode=driving&origin=清华大学&destination=北京大学&origin_region=北京&destination_region=北京&output=json&ak=您的ak";
        String result = connectURL(url,"");
        System.out.println(result);
    }
}
