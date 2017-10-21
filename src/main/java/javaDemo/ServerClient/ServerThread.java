package main.java.javaDemo.ServerClient;

import java.io.*;
import java.net.Socket;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-21 10:36
 * Description: 基于多线程，继承thread类，重写run（）方法
 */
public class ServerThread extends Thread {

    Socket socket;
    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;//字节输入流
        InputStreamReader inputStreamReader =null;//字节转换成字符
        BufferedReader bufferedReader = null;//缓冲
        OutputStream outputStream = null;//字节输出流
        PrintWriter printWriter = null;//打印流
        try {
            //获取输入流，并读取客户端信息
            inputStream = socket.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);//转换成字符输入流
            bufferedReader = new BufferedReader(inputStreamReader);//添加缓冲
            String data = bufferedReader.readLine();// 逐行读取
            while(data !=null){
                System.out.println("我是server，client的info为：" +data);
                data = bufferedReader.readLine();
            }
            socket.shutdownInput();//关闭来自client的输入流
            //获取输出流，响应客户端的请求
            outputStream = socket.getOutputStream();//获取字节输出流
            printWriter = new PrintWriter(outputStream);// 包装成打印流
            printWriter.write("欢迎来到北京！");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //5.关闭资源
            try {
                if (inputStream != null){
                    inputStream.close();//关闭输入流
                }
                if (outputStream != null){
                    outputStream.close();//关闭输出流
                }
                if (printWriter != null) {
                    printWriter.close();// 关闭打印流
                }
                if (inputStreamReader !=null) {
                    inputStreamReader.close();//关闭转换
                }
                if (bufferedReader != null){
                    bufferedReader.close();//关闭缓冲
                }
                if (socket !=null){
                    socket.close(); // 关闭socket
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
