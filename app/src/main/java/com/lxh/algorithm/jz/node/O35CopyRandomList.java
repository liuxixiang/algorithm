package com.lxh.algorithm.jz.node;

import com.lxh.algorithm.bean.ListNode;

import java.util.HashMap;
import java.util.Map;

public class O35CopyRandomList {
    Map<ListNode, ListNode> cachedNode = new HashMap<>();

    public static void main(String[] args) {

    }

    public ListNode copyRandomList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            ListNode newHead = new ListNode(head.val);
            cachedNode.put(head, newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
