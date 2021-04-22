package com.lxh.algorithm.sort;

import java.util.Arrays;

public class Sort {
    private static int[] arrays = {8, 7, 3, 9, 2, 5, 4, 0, 6, 9, 7, 5, 6, 1};

    public static void main(String[] args) {
        print(bubbleSort(arrays));
        print(bubbleSort(selectSort(arrays)));
    }

    /**
     * 冒泡排序 稳定
     *
     * @param arrays
     * @return
     */
    public static int[] bubbleSort(int[] arrays) {
        for (int end = arrays.length - 1; end > 0; end--) {
            int sortIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if (arrays[begin] < arrays[begin - 1]) {
                    swap(arrays, begin, begin - 1);
                    sortIndex = begin;
                }
            }
            end = sortIndex;

        }
        return arrays;
    }

    /**
     * 选择排序
     *
     * @param arrays
     * @return
     */
    public static int[] selectSort(int[] arrays) {
        for (int end = arrays.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if (arrays[maxIndex] < arrays[begin]) {
                    maxIndex = begin;
                }
            }
            swap(arrays, maxIndex, end);
        }
        return arrays;
    }


    public static void swap(int[] arrays, int begin, int end) {
        int temp = arrays[begin];
        arrays[begin] = arrays[end];
        arrays[end] = temp;
    }

    public static void print(int[] arrays) {
        System.out.println(Arrays.toString(arrays));
    }
}
