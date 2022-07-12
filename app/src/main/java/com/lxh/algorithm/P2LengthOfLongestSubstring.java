package com.lxh.algorithm;

import com.lxh.algorithm.bean.ListNode;

import java.util.HashMap;
import java.util.Map;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 
//
//示例 1:
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//示例 2:
//
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//示例 3:
//
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
//提示：
//
//0 <= s.length <= 5 * 104
//s 由英文字母、数字、符号和空格组成
//
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class P2LengthOfLongestSubstring {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int end = 0, start = 0; end < s.length(); end++) {
            char temp = s.charAt(end);
            if (map.containsKey(temp)) {
                start = Math.max(map.get(temp), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(temp, end + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int ans = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            while (map.containsKey(rightChar)) {
                map.remove(s.charAt(left));
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            map.put(rightChar, right);
            right++;
        }
        return ans;
    }

}
