package main.java.javaDemo.ServerClient;

import java.io.IOException;
import java.net.*;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-21 10:22
 * Description: 基于多线程的TCP通讯
 */
public class UDPClient {

    public static void main(String[] args) throws IOException {
        /**
         * 向server发送信息
         */
        // 1.定义服务器的地址、端口号、数据
        InetAddress inetAddress = InetAddress.getByName("localhost");
        int port = 8800;
        // 要发送的信息，由字符串转化成字节码
        byte[] data = "用户名：admin，密码：123".getBytes();
        // 2.将要发送的数据以数据报的形式发送
        DatagramPacket datagramPacket = new DatagramPacket(data,0,data.length,inetAddress,port);
        // 3.创建DatagramSocket对象，
        DatagramSocket socket = new DatagramSocket();
        // 4.通过DatagramSocket实现数据的发送
        socket.send(datagramPacket);
        /**
         * 接收server信息
         */
        // 1.创建数据报，保存从server接收到的mess
        byte[] data2 = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data2,data2.length);
        // 2.接受server的响应
        socket.receive(dp);
        // 3.接受data，并转成string类型
        String dataString = new String(data2,0,dp.getLength());
        System.out.println("I am client ,server say:" + dataString);
        // 4.关闭资源
        socket.close();

    }

}
