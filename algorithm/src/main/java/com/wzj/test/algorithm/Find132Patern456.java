package com.wzj.test.algorithm;

public class Find132Patern456 {
    public boolean find132pattern(int[] nums) {
        int inti = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            inti = Math.min(nums[j], inti);
            if (inti == nums[j]) {
                continue;
            }
            for (int k = nums.length - 1; k > j; k--) {
                if (nums[k] > inti && nums[k] < nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}