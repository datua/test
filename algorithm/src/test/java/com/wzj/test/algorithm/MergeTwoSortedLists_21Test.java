package com.wzj.test.algorithm;

import org.junit.Test;

public class MergeTwoSortedLists_21Test {
    private MergeTwoSortedLists_21 instance = new MergeTwoSortedLists_21();

    @Test
    public void tt() {
        MergeTwoSortedLists_21.ListNode l1 = new MergeTwoSortedLists_21.ListNode(1);
        l1.next = new MergeTwoSortedLists_21.ListNode(2);
        l1.next.next = new MergeTwoSortedLists_21.ListNode(4);
        MergeTwoSortedLists_21.ListNode l2 = new MergeTwoSortedLists_21.ListNode(1);
        l2.next = new MergeTwoSortedLists_21.ListNode(3);
        l2.next.next = new MergeTwoSortedLists_21.ListNode(4);

        MergeTwoSortedLists_21.ListNode result = instance.mergeTwoLists(l1, l2);
        while (null != result.next) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
