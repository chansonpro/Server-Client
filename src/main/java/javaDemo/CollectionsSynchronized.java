package main.java.javaDemo;

import java.util.*;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 20:22
 * Description:
 */
public class CollectionsSynchronized {
    public static void main(String[] args) {
        // 创建线程安全的集合对象方法
        //Collections c = Collections.synchronizedCollection(new ArrayList<T>());
        List  list = Collections.synchronizedList(new ArrayList<>());
        Map   map  = Collections.synchronizedMap(new HashMap<>());
        Set   set  = Collections.synchronizedSet(new HashSet<>());
    }

}
