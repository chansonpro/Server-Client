package main.java.javaDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 19:42
 * Description:
 */
public class AccountStringNumber {
    public static void main(String[] args) {
        String[] array = {"zhangsan","lisi","zhangsan","lisiwei","gaosong","liuxiaoqiang"};
        Map<String,Integer> map = AccountString.accountNumber(array);
        AccountString.printMess(map);

    }

}
class AccountString{
    public static Map<String,Integer> accountNumber(String[] array) {
        Map<String,Integer> map = new HashMap<>();
        int size = array.length;
        for (int i=0; i<size;i++) {
            String str = array[i];
            if (map.get(str) == null) {
                map.put(str,1);
            } else {
                map.put(str,map.get(str) + 1);
            }
        }
        return map;
    }
    public static void printMess(Map<String,Integer> map) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entr:entrySet) {
            System.out.println(entr.getKey()+ " " + entr.getValue());
        }

    }
}