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
    private static SingleTon2 singleTon2 = null;
    private static synchronized SingleTon2 getInstance(){
        if (singleTon2 == null){
            singleTon2 = new SingleTon2();
        }
        return singleTon2;
    }
}
// 懒汉模式升级版
class SingleTon3{
    private static SingleTon3 singleTon3 = null;

    private SingleTon3() {
    }
    private static SingleTon3 getSingleTon3(){
        if (singleTon3 == null){
            synchronized (SingleTon3.class){
                if (singleTon3 == null ){
                    singleTon3 = new SingleTon3();
                }
            }
        }// end if
        return singleTon3;
    }
}
