package com.example.sureoa;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.ftp.Ftp;
import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import org.junit.Test;

import java.io.IOException;

public class UploadTest {

    @Test
    public void test() throws IOException {
        Sftp sftp= JschUtil.createSftp("10.1.1.208", 7002, "Administrator", "ut2017.com");
        sftp.cd("/upload/jicha");
        sftp.put("E:/TEST.jpg", "/upload/jicha");
        //关闭连接
        sftp.close();
        System.out.println(sftp);


    }

}
