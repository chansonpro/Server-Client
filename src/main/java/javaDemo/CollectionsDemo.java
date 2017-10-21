package main.java.javaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 20:13
 * Description:
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("lisi");
        list.add("zsong");
        list.add("tom");
        list.add("boy");
        list.add("girl");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println();
        System.out.println(list);
        System.out.println();
        Collections.swap(list,1,2);
        System.out.println(list);
    }

}
