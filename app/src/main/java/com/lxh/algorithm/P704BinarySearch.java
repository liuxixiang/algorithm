package com.lxh.algorithm;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class P704BinarySearch {
    private static int[] nums = new int[]{
            -1, 0, 3, 5, 9, 12
    };

    public static void main(String[] args) {
        int search = search1(nums, 9);
        System.out.println(search);
    }

    public static int search(int[] arrays, int target) {
        if (arrays == null || arrays.length == 0) {
            return -1;
        }
        int begin = 0, end = arrays.length;
        while (begin < end) {
            int mid = (begin + end) >> 1;
            if (target < arrays[mid]) {
                end = mid;
            } else if (target > arrays[mid]) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int search1(int[] arrays, int target) {
        if(arrays == null || arrays.length == 0) return -1;
        int begin = 0,end = arrays.length;
        while (begin <end) {
            int mid = (begin+end)>>1;
            if(target > arrays[mid]) {
                begin = mid+1;
            }else if(target < arrays[mid])  {
                end = mid;
            }else {
                return mid;
            }
        }
        return -1;

    }

}
