package com.wzj.test.algorithm;

public class RemoveDuplicatesFromSortedListII_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result;
        ListNode cur = head;
        while (null != cur) {
            while (null != cur.next && cur.val == cur.next.val) {
                cur = cur.next;
            }
            // 没有重复的
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                // 有重复的，把中间重复的跳过去
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return result.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
