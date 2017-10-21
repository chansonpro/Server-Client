package main.java.javaDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 13:49
 * Description:
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("zsong");
        stringList.add("zsong2");
        stringList.add(0,"lisi");
        stringList.set(1,"wangwu");
        System.out.println("使用迭代器进行输出");
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String name = stringIterator.next();
            System.out.print(name + " ");

        }
        System.out.println("使用foreach进行输出");
        for (String name:stringList) {
            System.out.print(name + " ");
        }
        System.out.println("#############################");
        System.out.println(stringList.indexOf("wangwu"));
        System.out.println("#############################");
        System.out.println(stringList.get(0));
        System.out.println("#############################");
        System.out.println(stringList.size());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(stringList.contains("zsong2"));
    }

}
