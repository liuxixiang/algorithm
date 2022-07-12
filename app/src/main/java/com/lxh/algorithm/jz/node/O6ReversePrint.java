package com.lxh.algorithm.jz.node;

import com.lxh.algorithm.Utils;
import com.lxh.algorithm.bean.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
//         
//
//        示例 1：
//
//        输入：head = [1,3,2]
//        输出：[2,3,1]
//         
//
//        限制：
//
//        0 <= 链表长度 <= 10000
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class O6ReversePrint {
    public static void main(String[] args) {

        Utils.print(reversePrint1(Utils.arrayToListNode(new int[]{
                1, 2, 3, 4, 5
        })));
    }

    public static int[] reversePrint(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    public static int[] reversePrint1(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
