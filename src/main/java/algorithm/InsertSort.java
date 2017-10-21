package main.java.algorithm;

import java.util.Arrays;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 12:41
 * Description: 插入排序：把数组第一个位置之后的数都当成是要插入的数。
 */
public class InsertSort {

    public static void insertSort(int[] array) {
        int size = array.length; // 数组长度
        for (int i = 1; i <size ; i++) {
            int temp = array[i];//从数组的第2个元素开始循环将数组中的元素插入
            int j =i;// 保存索引
            while (j >0 && temp<array[j-1]) {
                // 前面的数往后移
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {21,12,3,4,7,2,1};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }

}
