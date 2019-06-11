package com.example.httpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class ServerDemo {

    public static void main(String[] args) {
        {
            try {
                //设置端口号
                ServerSocket serverSocket = new ServerSocket(8888);
                System.out.println("等待连接中");
                //设置监听
                Socket accept = serverSocket.accept();
                //获取请求
                InputStream inputStream = accept.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String str=null;
                while ((str=bufferedReader.readLine())!=null){
                    System.out.println("ServerSocket"+str);
                }
                accept.shutdownInput();//关闭 输入 流
                //4.关闭资源
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
                accept.close();
                serverSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }



        }
    }
}
