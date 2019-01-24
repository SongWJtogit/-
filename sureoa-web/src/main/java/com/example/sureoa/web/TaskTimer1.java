package com.example.sureoa.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TaskTimer1 {
 private static Timer timer =new Timer(true);
 static int  i=0;
 static public class MyTask extends TimerTask{
     @Override
     public void run() {
         System.out.println("测试一下哦"+"  "+new Date().toLocaleString()+"   "+ ++i+"次");
         timer.cancel();
     }
 }

    public static void main(String[] args) {

        MyTask task = new MyTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2018-12-24 11:27:00";
        Timer timer = new Timer();
        try {
            Date dateRef = sdf.parse(dateString);
      //
            System.out.println("现在时间是:"+new Date().toLocaleString());
            //timer.schedule(task,3000);
            timer.schedule(task,2000);
      //  }
      //  System.out.println("结束了,现在是:"+new Date());
    } catch (ParseException e) {
            e.printStackTrace();
        }
}
}
