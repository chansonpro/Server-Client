package main.java.javaDemo.ServerClient;

import java.io.*;
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
            //2.开启监听功能，等待客户端连接
            System.out.println("***服务端正在启动，等待客户端连接***");
            Socket socket = serverSocket.accept();
            // 3.获取输入流，获取客户端发送的信息
            InputStream inputStream = socket.getInputStream();//字节输入流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//转换成字符输入流
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//添加缓冲
            String data = bufferedReader.readLine();// 逐行读取
            while(data !=null){
                System.out.println("我是server，client的info为：" +data);
                data = bufferedReader.readLine();
            }
            socket.shutdownInput();//关闭来自client的输入流
            // 4.server发送mess到client
            OutputStream outputStream = socket.getOutputStream();//获取字节输出流
            PrintWriter printWriter = new PrintWriter(outputStream);// 包装成打印流
            printWriter.write("欢迎来到北京！");
            printWriter.flush();
            //5.关闭资源
            inputStream.close();//关闭输入流
            outputStream.close();//关闭输出流
            printWriter.close();// 关闭打印流
            inputStreamReader.close();//关闭转换
            bufferedReader.close();//关闭缓冲
            socket.close();// 关闭client
            serverSocket.close();//关闭serverSocket
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
