package com.wzj.test.json;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by wangzhijiang on 16/6/24.
 */
public class StringTest {

    @Test
    public void strTest() {
        System.out.println(null + "");

        StringBuilder s = new StringBuilder(null);
        s.append("hah");
    }


    @Test
    public void test() {
        BigDecimal b = new BigDecimal("18.00");

        System.out.println(b.stripTrailingZeros().toPlainString());
    }

}
