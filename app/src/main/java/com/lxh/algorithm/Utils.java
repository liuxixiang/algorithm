package com.lxh.algorithm;

import com.lxh.algorithm.bean.ListNode;

import java.util.Arrays;

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

    public static void swap(int[] arrays, int begin, int end) {
        int temp = arrays[begin];
        arrays[begin] = arrays[end];
        arrays[end] = temp;
    }

    public static void print(int[] arrays) {
        System.out.println(Arrays.toString(arrays));
    }
}

