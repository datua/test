package com.wzj.test.algorithm;

/**
 * 2019-03-20
 */
public class CustomSortString791 {
    public String customSortString(String S, String T) {
        int[] intArrayS = new int[26];
        int[] intArrayT = new int[26];

        for (char c : S.toCharArray()) {
            intArrayS[c - 'a'] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (intArrayS[c - 'a'] == 1) {
                intArrayT[c - 'a']++;
            } else {
                sb.append(c);
            }
        }
        for (char c : S.toCharArray()) {
            while (intArrayT[c - 'a']-- > 0) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CustomSortString791 instance = new CustomSortString791();

        System.out.println(instance.customSortString("wang", "abcdefghijklmnwww"));
    }
}
