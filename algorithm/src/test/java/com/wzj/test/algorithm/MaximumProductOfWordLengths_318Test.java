package com.wzj.test.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfWordLengths_318Test {
    private MaximumProductOfWordLengths_318 instance = new MaximumProductOfWordLengths_318();

    @Test
    public void tt() {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        Assert.assertEquals(16, instance.maxProduct(words));
        words = new String[]{"a","ab","abc","d","cd","bcd","abcd"};
        Assert.assertEquals(4, instance.maxProduct(words));
        words = new String[]{"a","aa","aaa","aaaa"};
        Assert.assertEquals(0, instance.maxProduct(words));
    }
}
