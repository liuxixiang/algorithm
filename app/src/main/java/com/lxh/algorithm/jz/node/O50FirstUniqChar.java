package com.lxh.algorithm.jz.node;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入：s = "abaccdeff"
 * 输出：'b'
 * 示例 2:
 * <p>
 * 输入：s = ""
 * 输出：' '
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class O50FirstUniqChar {
    public static void main(String[] args) {
        System.out.println("args = " + firstUniqChar("abaccdeff"));
    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : s.toCharArray()) {
           if(map.get(c)) {
               return c;
           }
        }
        return ' ';
    }
}
