package main.java.algorithm;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-14 21:17
 * Description:
 */
public class MaxMinNumber {

    public static void main(String[] args) {
        int[] array = {10,20,30,15,65,43,};
        int size = array.length;
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
    }

}
