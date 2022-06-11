package com.lxh.algorithm.sort;

import com.lxh.algorithm.Utils;

import okhttp3.internal.Util;

public class QuickSort {
    private static int[] arrays = {8, 7, 3, 9, 2, 0, 6, 1};

    public static void main(String[] args) {
        quickSort1(0, arrays.length);
        Utils.print(arrays);
    }

    /**
     * 对【begin,end)范围的元素进行快速排序
     *
     * @param begin
     * @param end
     * @return
     */
    public static void quickSort(int begin, int end) {
        if (end - begin < 2) return;
        int pivotIndex = pivotIndex(begin, end);
        quickSort1(begin, pivotIndex);
        quickSort1(pivotIndex + 1, end);

    }

    /**
     * 构造出【begin，end）范围的轴点
     *
     * @param begin
     * @param end
     * @return 轴点元素的最终位置
     */
    private static int pivotIndex(int begin, int end) {
        //随机选择一个元素跟begin位置进行交换 防止最坏情况【bengin，end）区间
        Utils.swap(arrays, begin, (int) (begin + Math.random() * (end - begin)));
        //备份begin位置的元素
        int pivot = arrays[begin];
        //end 指向最后一个元素
        end--;
        while (begin < end) {
            //右边元素 > 轴点元素
            while (begin < end) {
                if (arrays[end] > pivot) {
                    end--;
                } else { //右边元素 <= 轴点元素
                    arrays[begin++] = arrays[end];
                    break;
                }
            }
            while (begin < end) {
                if (pivot > arrays[begin]) {
                    begin++;
                } else {
                    arrays[end--] = arrays[begin];
                    break;
                }
            }
        }
        //将轴点元素放入最终位置
        arrays[begin] = pivot;
        return begin;
    }

    public static void quickSort1(int begin, int end) {
        if (end - begin < 2) return;
        int pivotIndex = pivotIndex1(begin, end);
        quickSort1(begin, pivotIndex);
        quickSort1(pivotIndex + 1, end);

    }

    private static int pivotIndex1(int begin, int end) {
        Utils.swap(arrays, begin, (int) (begin + Math.random() * (end - begin)));
        int pivod = arrays[begin];
        end--;
        while (begin < end) {
            while (begin < end) {
                if (arrays[end] > pivod) {
                    end--;
                }else  {
                    arrays[begin++] = arrays[end];
                   break;
                }
            }
            while (begin < end) {
                if (arrays[begin] < pivod) {
                    begin++;
                } else {
                    arrays[end--] = arrays[begin];
                    break;
                }
            }
        }
        arrays[begin] = pivod;
        return begin;

    }


}
