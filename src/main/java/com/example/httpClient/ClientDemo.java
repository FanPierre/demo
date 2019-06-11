package com.example.httpClient;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) {
        try {
            //创建连接
            Socket socket = new Socket("localhost",8888);
            OutputStream inputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(inputStream);
            //传输数据
            printWriter.write("用户名：张三；密码：123");
            //完成写入
            printWriter.flush();
            socket.shutdownOutput();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
