package com.wzj.test.algorithm;

import java.util.Arrays;

public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        int cursor = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] != 0) {
               nums[cursor++] = nums[i];
           }
        }
        while (cursor < nums.length) {
            nums[cursor++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes_283 instance = new MoveZeroes_283();

        int[] nums = new int[]{1, 0, 1, 0, 0};
        instance.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
