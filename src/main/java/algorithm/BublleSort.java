package main.java.algorithm;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-14 22:40
 * Description:冒泡法，关键是分析好需要比较几轮？每轮比较几次？两两比较小靠前。
 *              试想，如果数组部分数据本身就有序，这么做会有重复，如何优化？
 *              加个标记就好了，相邻两个位置，有数据交换，flag=true,否则为false
 */
public class BublleSort {

    public static void main(String[] args) {
        int[] array = {1,4,2,7,12,0,34,9,5,23};
        int size = array.length;
        // N-1表示比较的轮数
        for (int i = 0; i <size-1 ; i++) {
            // 加个标记，证明每轮相邻之间交换，如果没有交换，
            //  说明原本数据就是排好序的，直接退出
            boolean flag = false;
            // N-1-i表示每轮比较的次数
            for (int j = 0; j < size-1-i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        for (int i = 0; i <size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
