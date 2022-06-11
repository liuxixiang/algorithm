package com.lxh.algorithm.sort;

import com.lxh.algorithm.Utils;

public class InsetSort {
    private static int[] arrays = {8, 7, 3, 9, 2, 0, 6, 1};

    public static void main(String[] args) {
        insetSort1();
        Utils.print(arrays);
    }

    private static void insetSort() {
        for (int begin = 1; begin < arrays.length; begin++) {
            inset(begin, search(begin));
        }
    }

    /**
     * 将source位置元素插入到dest位置
     *
     * @param source
     * @param dest
     */
    private static void inset(int source, int dest) {
        int v = arrays[source];
        for (int i = source; i > dest; i--) {
            //挪动
            arrays[i] = arrays[i - 1];
        }
        arrays[dest] = v;
    }

    /**
     * 利用二分搜索找到index 位置元素的待插入位置
     * 已经排好序数组的区间范围是【0，index】
     *
     * @param index
     */
    private static int search(int index) {
        int begin = 0, end = index;
        while (begin < end) {
            int mid = (begin + end) >> 1;
            if (arrays[index] < arrays[mid]) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return begin;
    }

    private static void insetSort1() {
        for (int begin = 1; begin < arrays.length; begin++) {
            inset1(begin, search1(begin));
        }
    }

    private static void inset1(int source, int dest) {
        int v = arrays[source];
        for (int i = source; i > dest ; i--) {
            arrays[i] = arrays[i-1];
        }
        arrays[dest] = v;
    }

    private static int search1(int index) {
        int begin = 0, end = index;
        while (begin < end) {
            int mid = (begin + end) >> 1;
            if (arrays[index] < arrays[mid]) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return begin;
    }


}
