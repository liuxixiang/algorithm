package com.lxh.algorithm;

public class P04FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean numberIn2DArray = findNumberIn2DArray(matrix, 26);
        System.out.println(numberIn2DArray);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if ((matrix == null || matrix.length == 0) || (matrix.length == 1 && matrix[0].length == 0)) {
            return false;
        }
        int i = 0, j = matrix.length - 1;
        while (i <= matrix.length - 1 && j >= 0) {
            if (target == matrix[i][j]) return true;
            if (target > matrix[i][j]) i++;
            else j--;

        }
        return false;
    }
}
