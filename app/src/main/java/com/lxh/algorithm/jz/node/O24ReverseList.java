package com.lxh.algorithm.jz.node;

import com.lxh.algorithm.Utils;
import com.lxh.algorithm.bean.ListNode;

public class O24ReverseList {
    private static int[] nums = new int[]{
            1, 2, 3
    };

    public static void main(String[] args) {
        ListNode listNode = reverseList(Utils.arrayToListNode(nums));
        Utils.printListNode(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
