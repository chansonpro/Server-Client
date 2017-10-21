package main.java.javaDemo.ServerClient;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-20 21:59
 * Description: serverSocket
 */
public class Server {
    public static void main(String[] args) {
        try {
            //1.先创建一个serverSocket
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = null;
            //2.开启监听功能，等待客户端连接
            //记录客户端的数量
            int count = 0;
            System.out.println("***服务端正在启动，等待客户端连接***");
            //循环监听等待客户端的连接
            while (true) {
                //调用accept()方法开始监听，等待客户端的连接
                socket = serverSocket.accept();
                //创建一个新的线程
                ServerThread serverThread = new ServerThread(socket);
                // 启动线程
                serverThread.start();
                count++;//统计客户端的数量
                System.out.println("客户端连接server的数量为：" + count);
                //统计客户端的IP地址：
                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("客户端的IP地址为：" + inetAddress.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
