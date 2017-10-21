package main.java.javaDemo;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-18 22:52
 * Description:
 */
//饿汉模式
public class SingleTon {
    private SingleTon(){

    }
    private  static SingleTon singleTon  = new SingleTon();
    private static SingleTon getInstance(){
        return singleTon;
    }
}
//懒汉模式
class SingleTon2{
    private SingleTon2() {
    }
    private static SingleTon2 singleTon2 = new SingleTon2();
    private static synchronized SingleTon2 getInstance(){
        if (singleTon2 == null){
            singleTon2 = new SingleTon2();
        }
        return singleTon2;
    }
}
