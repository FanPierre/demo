package com.example.httpClient;

import com.sun.jndi.toolkit.url.Uri;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 使用HttpUrlConnection 创建连接 JAVA原生连接方式
 */
public class HttpUrlConnectionDemo {
    public static void main(String[] args) {
   //     String s = doGet("https://www.baidu.com/");
        String s1 = doPOST("https://www.baidu.com/", "");


        System.out.println(s1);
    }


    public static String doGet(String httpuUrl) {
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String request = null;
        try {
            URL url = new URL(httpuUrl);
            //创建一个连接
            httpURLConnection = (HttpURLConnection) url.openConnection();
            //设置使用方法
            httpURLConnection.setRequestMethod("GET");
            //设置连接时间
            httpURLConnection.setConnectTimeout(15000);
            //设置读取数据时间
            httpURLConnection.setReadTimeout(30000);
            //连接
            httpURLConnection.connect();
            //
            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
                //转成字节流，并拼接一起
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                StringBuffer buffer = new StringBuffer();
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    buffer.append(str).append("\r\n");
                }
                request = buffer.toString();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bufferedReader) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭连接
            httpURLConnection.disconnect();
        }
        return request;

    }

    //POST请求
    public static String doPOST(String requestUrl, String param) {
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String request = null;

        try {
            URL url = new URL(requestUrl);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            //设置连接方式
            httpURLConnection.setRequestMethod("POST");
            //设置连接主机服务器时间
            httpURLConnection.setConnectTimeout(15000);
            //设置读取主机服务器数据及返回时间
            httpURLConnection.setReadTimeout(60000);
            //设置提交数据
            httpURLConnection.setDoOutput(true);
            //设置获取数据
            httpURLConnection.setDoInput(true);
            //设置请求格式
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            //设置鉴权信息
            //

            //通过一个连接对象获取一个输出流
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(param.getBytes("UTF-8"));
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
                //转成字节流，并拼接一起
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                StringBuffer buffer = new StringBuffer();
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    buffer.append(str).append("\r\n");
                }
                request = buffer.toString();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                //关闭流
                if (null != inputStream) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (null != bufferedReader) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                //关闭连接
                httpURLConnection.disconnect();

        }


        return null;
    }

    private static HttpURLConnection setHttpConnectionPost(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        //设置连接方式
        httpURLConnection.setRequestMethod("POST");
        //设置连接主机服务器时间
        httpURLConnection.setConnectTimeout(15000);
        //设置读取主机服务器数据及返回时间
        httpURLConnection.setReadTimeout(60000);
        //设置提交数据
        httpURLConnection.setDoOutput(true);
        //设置获取数据
        httpURLConnection.setDoInput(true);
        //设置请求格式
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        return httpURLConnection;

    }


}
