package com.lxh.algorithm.jz;

import java.util.Arrays;

public class O04FindNumberIn2DArray {
    public static void main(String[] args) {
        System.out.println("args = " + findNumberIn2DArray(new int[][]{
                {1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {
                3, 6, 9, 16, 22
        }, {
                10, 13, 14, 17, 24
        }, {
                18, 21, 23, 26, 30
        }
        }, 5));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
