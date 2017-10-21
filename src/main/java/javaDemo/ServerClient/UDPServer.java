package main.java.javaDemo.ServerClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-21 10:21
 * Description:基于多线程的TCP通讯
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        /**
         * 接收client的mess
         */
        // 1.创建DatagramSocket,指定端口号
        DatagramSocket socket = new DatagramSocket(8800);
        // 2.创建数据包，保存client发来的info
        byte[] data = new byte[1024];//创建字节数组，指定接收数据包的大小
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
        // 3.接收client发来的data
        System.out.println("***服务端正在启动，等待客户端连接***");
        socket.receive(datagramPacket);//此方法在接收到数据包之前回阻塞
        // 4.读取数据
        String info = new String(data,0,datagramPacket.getLength());
        System.out.println("我是server，client发来的info is："+info);
        /**
         * 响应client，向client发送消息
         */
        // 1.获取到client的地址、端口号
        InetAddress clientAddress = datagramPacket.getAddress();
        int port = datagramPacket.getPort();
        // 2.定义要发送的数据，转化成字节码
        byte[] data2 = "hello client，where are you from?".getBytes();
        // 3.将字节码打包成数据报的形式
        DatagramPacket dp = new DatagramPacket(data2,data2.length,clientAddress,port);
        // 4.发送数据报到client
        socket.send(dp);
        // 5.关闭socket
        socket.close();
    }




}
