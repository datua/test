package com.wzj.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView_199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        rightView(root, result, 0);
        return result;
    }

    private static void rightView(TreeNode root, List<Integer> result, int curDepth) {
        if (null == root) {
            return;
        }

        if (curDepth == result.size()) {
            result.add(root.val);
        }
        rightView(root.right, result, curDepth + 1);
        rightView(root.left, result, curDepth + 1);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
