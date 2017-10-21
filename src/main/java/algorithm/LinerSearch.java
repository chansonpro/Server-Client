package main.java.algorithm;

import java.util.Scanner;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-14 20:59
 * Description:
 */
public class LinerSearch {
    public static void main(String[] args) {
        int[] array = {10,20,30,45,65,43,};
        int size = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int aim = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (aim == array[i]) {
                index = i ;
                break;
            }
        }
        if (index != -1) {
            System.out.println("找到了，与之对应的位置索引是"+index);
        }else {
            System.out.println("找不到");
        }
    }

}
