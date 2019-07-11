package com.wzj.test.algorithm;

public class NumberOfEnclaves_1020 {
    public int numEnclaves(int[][] A) {
        // 1 进行深度优先遍历四个边界上的1元素，且置为0
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == 0 || i == A.length - 1
                    || j == 0 || j == A[i].length - 1) {
                    if (A[i][j] == 1) {
                        depthFirstSearch(A, i, j);
                    }
                }
            }
        }

        int result = 0;
        for (int i = 1; i < A.length - 1; i++) {
            for (int j = 1; j < A[i].length - 1; j++) {
                if (A[i][j] == 1) {
                    result++;
                }
            }
        }

        return result;
    }

    private void depthFirstSearch(int[][] intArray, int i, int j) {
        if (i < 0 || i > intArray.length - 1
                || j < 0 || j > intArray[i].length - 1
                || intArray[i][j] == 0) {
            return;
        }
        intArray[i][j] = 0;

        depthFirstSearch(intArray, i, j + 1);
        depthFirstSearch(intArray, i, j - 1);
        depthFirstSearch(intArray, i + 1, j);
        depthFirstSearch(intArray, i - 1, j);
    }
}
