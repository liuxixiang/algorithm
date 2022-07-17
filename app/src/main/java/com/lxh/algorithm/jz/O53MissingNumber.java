package com.lxh.algorithm.jz;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [0,1,3]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *  
 * <p>
 * 限制：
 * <p>
 * 1 <= 数组长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class O53MissingNumber {
    public static void main(String[] args) {
        System.out.println("O53MissingNumber.main:"+ missingNumber(new int[] {0,1,2,3,4,5,6,7,9}));
    }

    public static int missingNumber(int[] nums) {
        int begin = 0, end = nums.length-1;
        while (begin <= end) {
            int mid = (begin + end) >> 1;
            if (nums[mid] == mid) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }
}
