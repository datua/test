package com.wzj.test.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by wangzhijiang on 7/12/15.
 */
public class StringTest {
    @Test
    public void test() throws UnsupportedEncodingException {
        String s = "a中";
        byte[] bytes = s.getBytes("gb2312");
        for (byte b : bytes) {
            System.out.println(Byte.valueOf(b).toString());
        }

        System.out.println("char length: " + s.length());
        System.out.println("byte length: " + s.getBytes().length);
        System.out.println(System.getProperty("file.encoding"));
    }

    @Test
    public void tt() {
        System.out.println(System.currentTimeMillis() / 1000);
    }
}
