package com;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class tcpClient {
    public static void main(String[] args) {
        while (true)
        {
            OutputStream ops = null;
            Socket st = null;
            //1 创建Socket,指定服务端的IP地址和端口号
            try {
                InetAddress ita = InetAddress.getByName("172.16.63.14");
                st = new Socket(ita,9630);

                //2 打开连接到Socket的输入输出流
                ops = st.getOutputStream();

                //3 按照一定的协议对Socket进行读写操作
                Scanner in = new Scanner(System.in);
                System.out.println("请输入要发送的内容");
                String msg = in.next();
                ops.write(msg.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ops != null)
                    {
                        ops.close();
                    }
                    if (st != null)
                    {
                        st.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
