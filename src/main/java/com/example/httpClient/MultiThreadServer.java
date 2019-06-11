package com.example.httpClient;

import java.io.*;
import java.net.Socket;

public class MultiThreadServer extends Thread {
    Socket socket = null;

    public MultiThreadServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        OutputStream outputStream = null;
        try {
            inputStream = socket.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println("接受数据：" + string);
            }
            //关闭输入流
            socket.shutdownInput();
            outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("Server Connection Data :");
            printWriter.flush();
            //关闭输出流
            socket.shutdownOutput();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStreamReader != null){
                    inputStreamReader.close();
                }
                if (bufferedReader != null ){
                    bufferedReader.close();
                }
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
