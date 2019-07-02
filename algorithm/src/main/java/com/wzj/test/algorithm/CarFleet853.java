package com.wzj.test.algorithm;

import java.util.TreeMap;

public class CarFleet853 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 0.01);
        treeMap.put(2, 0.02);
        treeMap.put(3, 0.03);
        treeMap.put(4, 0.04);

        for (Double d : treeMap.values()) {
            System.out.println(d.toString());
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        for (int i = 0; i < position.length; i++) {
            treeMap.put(target - position[i], (double)(target - position[i]) / speed[i]);
        }
        int result = 0; double cur = 0;
        for (double d : treeMap.values()) {
            if (d > cur) {
                cur = d;
                result++;
            }
        }
        return result;
    }
}
