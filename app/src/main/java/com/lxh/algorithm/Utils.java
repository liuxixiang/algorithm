package com.lxh.algorithm;

import com.lxh.algorithm.bean.ListNode;

public class Utils {
    public static ListNode arrayToListNode(int[] arrays) {
        ListNode root = new ListNode(arrays[0]);
        ListNode other = root;
        for (int i = 1; i < arrays.length; i++) {
            ListNode temp = new ListNode(arrays[i]);
            other.next = temp;
            other = temp;
        }
        return root;
    }

    /**
     * 遍历一个链表
     */
    public static void printListNode(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
}
