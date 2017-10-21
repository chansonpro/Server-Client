package main.java.algorithm;

import java.util.Arrays;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 22:28
 * Description:快排思想参照头条视频，优化过程参考《大话数据结构》，
 * 序列个数少时用插入排序，多时用快排。
 * 【1】优化枢轴pivotKey;【2】优化递归操作
 */
public class QiuckSort {
    public static void main(String[] args) {
        int[] array = {7,23,50,79,21,35,12,31,54,67,87,64};
        int lenth = array.length;
        qSort(array,0,lenth-1);
        System.out.println(Arrays.toString(array));

    }
    private static void swap(int[] array,int low,int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
    private static int choosePivot(int[] array,int low, int high) {
        // 三个数取中数放在最左端
        int middle = (low + high)/2;
        if (array[low] > array[high]) {
            swap(array,low,high);
        }
        if (array[middle] > array[high]) {
            swap(array,low,high);
        }
        if (array[middle] > array[low]) {
            swap(array,low,high);
        }
        return array[low];// 将三者的中数作为pivot
    }
    private static int partition(int[] array,int low, int high) {
        //int pivotKey = choosePivot(array,low,high);// 三数取中（array[low]）作为枢轴
        int pivotKey = array[low];
        int tmp= pivotKey;// 将枢轴关键字存到array[0]位置，免去主程序中不必要的swap
        while (low<high) {
            while (low<high && array[high]>=pivotKey){
                high--;
            }
            //Swap(arr, low, high);//交换
            array[low] = array[high];//采用替换而不是交换的方式进行操作
            while (low<high && array[low]<=pivotKey) {
                low++;
            }
            //Swap(arr, low, high);//交换
            array[high] = array[low];//采用替换而不是交换的方式进行操作
        }
        array[low] = tmp;// 将枢轴数值替换回array[low];
        return low;
    }
    private static void qSort(int[] array, int low, int high) {
        int pivotKey;
            while (low<high) {
                pivotKey = partition(array,low,high);// 将数组一分为二，算出pivot位置
                qSort(array,low,pivotKey-1);// 对低子表递归排序
                low = pivotKey + 1;//尾递归
            }
        }
}
