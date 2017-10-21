package main.java.javaDemo.ServerClient;

import java.io.*;
import java.net.Socket;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-20 22:00
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        try {
            // 1.创建客户端的socket,指定服务器的localhost和IP
            Socket socket = new Socket("localhost",8888);
            // 2.创建字节输出流，向server发送消息
            OutputStream os = socket.getOutputStream(); // 输出流
            PrintWriter pw = new PrintWriter(os);//打印流
            pw.write("用户名为：admin，密码为：123");
            pw.flush();//刷新缓存
            socket.shutdownOutput();//关闭client的输出流
            // 3.client响应server发的消息
            InputStream inputStream = socket.getInputStream();// 字节输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));// 转换成字符流
            String data;
            while ((data = br.readLine())!=null){
                System.out.println("我是client，server的info为："+data);
            }
            // 4.关闭资源
            inputStream.close();// 关闭字节输入流
            os.close();//关闭字节输出流
            pw.close();//关闭打印流
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
