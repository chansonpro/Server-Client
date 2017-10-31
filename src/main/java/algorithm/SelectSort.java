package main.java.algorithm;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-14 23:35
 * Description:
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {12,4,3,2,13,5,90,34,79,58,1};
        int size = array.length;
        int min;// 保存最小数的下标
        for (int i = 0; i <size - 1; i++) {
            min = i;
            // 查找最小数在数组中的位置
            for (int j = i+1; j <size; j++) {
                if (array[j]< array[min]) {
                    min = j;
                }
            }
            // 如果min!=i,说明找到了最小值值，此时min为最小值的下表，交换min 和i位置的数值
            if(min != i){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(array[i] +" ");

        }
    }

}
