package main.java.Test;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-16 12:33
 * Description: intern 这个方法返回的是 返回字符串对象的规范化表示形式，
 * 当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串
 * （该对象由 equals(Object) 方法确定），则返回池中的字符串。
 * 否则，将此 String 对象添加到池中，并且返回此 String 对象的引用
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s5);//true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s6.intern());// true
        System.out.println(s2 == s2.intern());// false
    }

}
