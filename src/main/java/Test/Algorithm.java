package main.java.Test;

import java.lang.annotation.ElementType;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-16 10:34
 * Description:
 */
public class Algorithm {
    // [1] 最大最小值查找
    private static int maxMinNumber(int[] array) {
        int length = array.length;
        int max = array[0];
        int min = array[0];
        for (int i = 1; i <length ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        return max;
    }
    // [2]排序算法-冒泡算法
    private static void bubbleSort(int[] array){
        int size = array.length;
        for (int i = 0; i <size-1 ; i++) {
            boolean flag = false;// 标识是否有数据交换？
            for (int j = 0; j <size-i-1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
    // [3]排序算法-选择排序
    private static void selectSort(int[] array) {
        int size = array.length;
        for (int i = 0; i <size ; i++) {
            int min = i;
            for (int j = i+1; j <size ; j++) {
                if (array[min]>array[j]){
                    min = j;
                }
            }
            if (min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
    // [4]排序算法-插入排序
    private static void insertSort(int[] array) {
        int size = array.length;
        for (int i = 1; i <size ; i++) {
            int temp = array[i];
            int j = i;// 保存索引下标
            while (j>0 && temp<array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }
    // [5]排序算法-快速排序
    private static int partition(int[] array,int low,int high) {
        int pivotKey = array[low];
        int temp = pivotKey;// 定义变量保存枢轴值
        while (low<high){
            while (low<high && array[high]>pivotKey){
                high--;
            }
            array[low] = array[high];
            while (low<high && array[low]<pivotKey){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }
    private static void quickSort(int[] array){


    }
    public static void main(String[] args) {
        System.out.println();

    }

}
