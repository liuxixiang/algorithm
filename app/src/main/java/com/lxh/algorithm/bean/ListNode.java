package com.lxh.algorithm.bean;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode random;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
