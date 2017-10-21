package main.java.javaDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-18 22:13
 * Description:
 */
public class CllectionGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<String> stringList = new ArrayList<>();
        Class c1 = list.getClass();
        Class c2 = stringList.getClass();
        System.out.println(c1 == c2);
        //反射的操作都是编译之后的操作
        /*
		 * c1==c2结果返回true说明编译之后集合的泛型是去泛型化的
		 * Java中集合的泛型，是防止错误输入的，只在编译阶段有效，
		 * 绕过编译就无效了
		 * 验证：我们可以通过方法的反射来操作，绕过编译
		 */
        try {
            Method method = c2.getMethod("add",Object.class);
            method.invoke(list,20);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
