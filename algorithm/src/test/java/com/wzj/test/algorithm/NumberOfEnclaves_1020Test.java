package com.wzj.test.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfEnclaves_1020Test {

    private NumberOfEnclaves_1020 instance = new NumberOfEnclaves_1020();

    @Test
    public void numEnclavesTest() {
       int[][] A = new int[][]{{0,0,0,0}, {1,0,1,0}, {0,1,1,0}, {0,0,0,0}};
        Assert.assertEquals(3, instance.numEnclaves(A));

        A = new int[][]{{0,1,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,0,0}};
        Assert.assertEquals(0, instance.numEnclaves(A));
    }
}
