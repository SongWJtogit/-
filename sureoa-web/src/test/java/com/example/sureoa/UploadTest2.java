package com.example.sureoa;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.ftp.Ftp;
import org.junit.Test;

import java.io.IOException;

public class UploadTest2 {

    @Test
    public void test1() throws IOException {

        //匿名登录（无需帐号密码的FTP服务器）
        Ftp ftp = new Ftp("10.1.1.208");
        //进入远程目录
        ftp.cd("D:/cp_file_upload");
        //上传本地文件
        ftp.upload("D:/cp_file_upload", FileUtil.file("E:/TEST.jpg"));
        //下载远程文件
        //ftp.download("//upload", "TEST.jpg", FileUtil.file("e:/test2.jpg"));
        //关闭连接
        ftp.close();
    }
}
