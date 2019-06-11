package com.example.httpClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一对多 服务端
 */
public class ThreadServer {
    public static void main(String[] args) {
        Boolean connectionFlag = true;
        int count = 0;

        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (connectionFlag) {
                Socket accept = serverSocket.accept();
                MultiThreadServer multiThreadServer = new MultiThreadServer(accept);
                multiThreadServer.start();
                count++;
                System.out.println("所连接的客户端数" + count);
                System.out.println("你是第" + count + "个连接的");
                //连接人的地址
                InetAddress inetAddress = accept.getInetAddress();
                System.out.println("连接主机地址" + inetAddress.getHostAddress());
                System.out.println("连接主机名称" + inetAddress.getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
