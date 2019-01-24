package com.example.sureoa;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("我的线程！");

    }

    public static class Run{
        public static void main(String[] args) {
//            MyThread myThread = new MyThread();
//            myThread.start();
//            System.out.println("nahe");
            Runnable runnable = new imrunnable();
            Thread thread = new Thread(runnable);
            thread.start();

        }
    }
    public static class imrunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("我的二代线程！");
        }
    }
}
