package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpServer {
    public static void main(String[] args) {
        while (true)
        {
            InputStream is = null;
            ByteArrayOutputStream bos = null;
            Socket sk = null;
            ServerSocket ss = null;
            try {
                //1 创建ServerSocket
                ss = new ServerSocket(9630);
                //2 调用accept(),监听连接请求
                sk = ss.accept();
                //3 调用该Socket类对象getInputStream()和
                is = sk.getInputStream(); //获取输入流
                //4 关闭ServerSocket和Socket对象
                byte[] bt = new byte[100];
                int len;
                bos = new ByteArrayOutputStream();
                while ((len = is.read(bt)) != -1)
                {
                    bos.write(bt);
                }
                System.out.println("发送者:" + sk.getInetAddress().getHostAddress());
                System.out.println("消息:" + bos.toString());
                System.out.println("****************");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bos != null)
                    {
                        bos.close();
                    }
                    if (is != null)
                    {
                        is.close();
                    }
                    if (ss != null)
                    {
                        ss.close();
                    }
                    if (sk != null)
                    {
                        sk.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
