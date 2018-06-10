package com.wzj.test.thread;

/**
 * Created by wangzhijiang on 08/04/2017.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("haha");
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
