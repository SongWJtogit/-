package com.example.sureoa;

import com.example.sureoa.dao.entity.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SureoaWebApplicationTests {

	@Test
	public void contextLoads() throws Exception {
			Double i = 500.5;
			Double j = 29.0;
		BigDecimal b   =   new   BigDecimal(j/i);
		double result =  b.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(result);
	}
	@Test
	public void nioCopyFile(String resource,String destination){
		resource="D:\\test.java";
		destination="C:\\";
		try {

			FileInputStream inputStream = new FileInputStream(resource);
			FileOutputStream outputStream = new FileOutputStream(destination);
			FileChannel readChannel = inputStream.getChannel(); //读文件
			FileChannel writeChannel= outputStream.getChannel();//写文件
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			while (true){
				buffer.clear();
				int len = readChannel.read(buffer);
				if (len==-1){
					break;
				}
				buffer.flip();
				writeChannel.write(buffer);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("您的报错为"+e);
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("您的报错为"+e1);
		}finally {

		}
	}

	public class test11{

	}



}


