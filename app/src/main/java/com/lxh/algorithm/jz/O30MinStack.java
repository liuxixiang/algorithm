package com.lxh.algorithm.jz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
//
//         
//
//        示例:
//
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        minStack.min();   --> 返回 -3.
//        minStack.pop();
//        minStack.top();      --> 返回 0.
//        minStack.min();   --> 返回 -2.
//         
//
//        提示：
//
//        各函数的调用总次数不超过 20000 次
//         
//
//        注意：本题与主站 155 题相同：https://leetcode-cn.com/problems/min-stack/
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class O30MinStack {
    public static void main(String[] args) {
        MinStack1 minStack = new MinStack1();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());

    }

    static class MinStack {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<Integer> minStack = new ArrayDeque<Integer>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(Math.min(x, minStack.peek()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();

        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }

    static class MinStack1 {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();

        public MinStack1() {
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(Math.min(x, minStack.peek()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
