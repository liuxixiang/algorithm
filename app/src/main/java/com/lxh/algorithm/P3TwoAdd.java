package com.lxh.algorithm;

import com.lxh.algorithm.bean.ListNode;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//        请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//         
//
//        示例 1：
//
//
//        输入：l1 = [2,4,3], l2 = [5,6,4]
//        输出：[7,0,8]
//        解释：342 + 465 = 807.
//        示例 2：
//
//        输入：l1 = [0], l2 = [0]
//        输出：[0]
//        示例 3：
//
//        输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        输出：[8,9,9,9,0,0,0,1]
//         
//
//        提示：
//
//        每个链表中的节点数在范围 [1, 100] 内
//        0 <= Node.val <= 9
//        题目数据保证列表表示的数字不含前导零
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/add-two-numbers
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class P3TwoAdd {
    private static int[] nums = new int[]{
            9, 9, 9, 9, 9, 9, 9
    };
    private static int[] nums1 = new int[]{
            9, 9, 9, 9
    };

    public static void main(String[] args) {
        ListNode newListNode = addTwoNumbers(Utils.arrayToListNode(nums), Utils.arrayToListNode(nums1));
        Utils.printListNode(newListNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //添加预先指针，用来指向头指针，返回结果
        ListNode prev = new ListNode(0);
        //定义一个可移动的指针，用来指向存储两个数之和的位置
        ListNode cur = prev;
        System.out.println(prev.toString() + ":" + cur.toString());
        ////定义一个进位数的指针，用来存储当两数之和大于10的时候，
        int carry = 0;
        while (l1 != null || l2 != null) {
            //如果l1 不等于null时，就取他的值，等于null时，就赋值0，保持两个链表具有相同的位数
            int x = l1 != null ? l1.val : 0;
            //如果l1 不等于null时，就取他的值，等于null时，就赋值0，保持两个链表具有相同的位数
            int y = l2 != null ? l2.val : 0;
            //将两个链表的值，进行相加，并加上进位数
            int sum = x + y + carry;
            //计算进位数
            carry = sum / 10;
            //计算两个数的和，此时排除超过10的请况（大于10，取余数）
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            //当链表l1不等于null的时候，将l1 的节点后移
            if (l1 != null) {
                l1 = l1.next;
            }
            //当链表l2 不等于null的时候，将l2的节点后移
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //如果最后两个数，相加的时候有进位数的时候，就将进位数，赋予链表的新节点。
        //两数相加最多小于20，所以的的值最大只能时1
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return prev.next;

    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode cur = prev;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum/10;

        }
        return prev.next;
    }
}
