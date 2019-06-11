package com.example.httpClient;

import java.io.*;
import java.net.Socket;

/**
 * 客户端
 */
public class ThreadClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("洛水三千?");
            printWriter.flush();
            socket.shutdownOutput();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println("获取数据:" + str);
            }
            socket.shutdownInput();
            socket.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
