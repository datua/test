package com.wzj.test.algorithm;

public class MaximumProductOfWordLengths_318 {
    public int maxProduct(String[] words) {
        int result = 0;
        if (null == words || 0 == words.length) {
            return result;
        }

        int[] values = new int[words.length];
        int count = 0;
        for (String word : words) {
            int value = 0;
            for (int i = 0; i < word.length(); i++) {
                value |= 1 << (word.charAt(i) - 'a');
            }
            values[count] = value;
            count++;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j <words.length; j++) {
                if ((values[i] & values[j]) == 0 && (words[i].length() * words[j].length() > result)) {
                    result = words[i].length() * words[j].length();
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        // 16
        System.out.println(new MaximumProductOfWordLengths_318().maxProduct(words));
        words = new String[]{"a","ab","abc","d","cd","bcd","abcd"};
        // 4
        System.out.println(new MaximumProductOfWordLengths_318().maxProduct(words));
        words = new String[]{"a","aa","aaa","aaaa"};
        // 0
        System.out.println(new MaximumProductOfWordLengths_318().maxProduct(words));
    }
}
