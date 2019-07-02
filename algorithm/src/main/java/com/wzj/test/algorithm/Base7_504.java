package com.wzj.test.algorithm;

public class Base7_504 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public String convertToBase7_2(int num) {
        if (num < 0) {
            return "-" + convertToBase7_2(-num);
        }
        if (num < 7) {
            return "" + num;
        }
        return convertToBase7_2(num / 7) + num % 7;
    }

    public static void main(String[] args) {
        Base7_504 instance = new Base7_504();

        System.out.println(instance.convertToBase7_2(10));
        System.out.println(instance.convertToBase7_2(20));
    }
}
