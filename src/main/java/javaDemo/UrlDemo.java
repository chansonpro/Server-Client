package main.java.javaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-20 21:07
 * Description: url demo，通过url获取输入流内容
 */
public class UrlDemo {
    public static void main(String[] args) throws IOException {
        // 创建url类的实例
        try {
            URL baidu = new URL("http://www.baidu.com");
            // ？后表示参数，#后面表示锚点
            URL url = new URL(baidu,"/fsg.html?username=tom#test");
            System.out.println("协议："+ url.getProtocol());
            System.out.println("主机："+url.getHost());
            // 如果未指定端口号，则默认返回-1；
            System.out.println("端口号："+ url.getPort());
            System.out.println("请求参数："+url.getQuery());
            System.out.println("相对路径："+url.getRef());
            System.out.println("路径：" + url.getPath());
            System.out.println("文件名："+url.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // 获取url输入流内容
        try {
            URL url = new URL("http://www.baidu.com");
            // 通过openStream（）方法获取url对象所表示的资源的字节输入流
            InputStream inputStream = url.openStream();
            // 将字节输入流转换成 字符输入流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
            // 为字符输入流添加缓冲
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String data = bufferedReader.readLine();//逐行读取字符数据
            while (data !=null){//循环读取数据
                System.out.println(data);
                data = bufferedReader.readLine();
            }
            bufferedReader.close();//关闭缓冲
            inputStreamReader.close();// 关闭转换
            inputStream.close();//关闭字节输入流
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
