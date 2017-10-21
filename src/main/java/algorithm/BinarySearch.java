package main.java.algorithm;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-14 21:44
 * Description:
 */
public class BinarySearch {
    private static int binarySearch(int[] array,int aim) {
        int size = array.length;
        int start =0;
        int end = size-1;
        int middle;
        int index = -1;
        while (start <= end) {
            middle = (start + end)/2;
            if(aim == array[middle]) {
                index = middle +1;
                break;
            }
            if (aim > array[middle]) {
                start = middle + 1;
            }
            if (aim < array[middle]) {
                end = middle -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] array = {1,3,6,9,10,13,15,17,19};
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要查找的数字");
        int aim = scanner.nextInt();*/

        int index = BinarySearch.binarySearch(array,199);
        System.out.println(index);
    }

}
