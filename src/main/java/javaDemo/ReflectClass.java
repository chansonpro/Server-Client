package main.java.javaDemo;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-17 22:03
 * Description:万物皆对象
 */
public class ReflectClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //Foo的实例对象如何表示
        Foo foo1 = new Foo();
        //Foo这个类 也是一个实例对象，Class类的实例对象,如何表示呢
        Class c1 = Foo.class;
        Class c2 = foo1.getClass();
        //不管c1  or c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);
        Class c3=null;
        c3 = Class.forName("main.java.javaDemo.Foo");
        //我们完全可以通过类的类类型创建该类的对象实例---->通过c1 or c2 or c3创建Foo的实例对象
        try {
            Foo foo = (Foo) c1.newInstance();
            foo.print();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class Foo{
    void print(){
        System.out.println("你好foo");
    }
}
