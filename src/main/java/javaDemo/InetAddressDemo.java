package main.java.javaDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-20 19:55
 * Description: java socket通讯
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机的InetAddress实例
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("当前计算机名称："+ inetAddress.getHostName());
        System.out.println("当前计算机ip地址："+ inetAddress.getHostAddress());
        byte[] bytes = inetAddress.getAddress();// 字节数组形式的IP地址
        System.out.println("字节数组形式的IP地址："+ Arrays.toString(bytes));
        // 根据计算机名称获取实例
       // InetAddress inetAddress1 = InetAddress.getByName("chansonpro");
        // 根据IP地址获取实例
        InetAddress inetAddress2 = InetAddress.getByName("192.168.199.239");
        System.out.println("当前计算机名称："+ inetAddress2.getHostName());
        System.out.println("当前计算机ip地址："+ inetAddress2.getHostAddress());

    }


}
