package com.lxh.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *  
 * <p>
 * 说明：
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Intersection {
    static int[] nums1 = new int[]{1, 2, 2, 1};
    static int[] nums2 = new int[]{2, 2};

    public static void main(String[] args) {
//        int[] intersections = intersection(nums1, nums2);
        int[] intersections = intersection1(nums1, nums2);
        for (int intersection : intersections) {
            System.out.println(intersection);
        }

    }

    /**
     * hash
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet();
        HashSet<Integer> hashSet2 = new HashSet();
        for (int num : nums1) {
            hashSet1.add(num);
        }
        for (int num : nums2) {
            if (hashSet1.contains(num)) {
                hashSet2.add(num);
            }
        }
        int[] array = new int[hashSet2.size()];
        Object[] objects = hashSet2.toArray();
        for (int i = 0; i < objects.length; i++) {
            array[i] = (int) objects[i];
        }
        return array;

    }

    /**
     * 双指针
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] array = new int[set.size()];
        Object[] objects = set.toArray();
        for (int i1 = 0; i1 < objects.length; i1++) {
            array[i1] = (int) objects[i1];
        }
        return array;
    }


}
