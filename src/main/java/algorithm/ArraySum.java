package main.java.algorithm;

import java.lang.reflect.Array;

/**
 * User: chanson-pro
 * Date-Time: 2017-11-1 15:35
 * Description:通过递归方式求数组之和
 */
public class ArraySum {
    private static int arraySum(int[] arr,int size){
        if (size == 0){
            return 0;
        }
        return arr[size-1] + arraySum(arr,size-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int size = arr.length;
        int result = arraySum(arr,size);
        System.out.println(result);
    }

}
