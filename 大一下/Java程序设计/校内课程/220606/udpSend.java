package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpSend {
    public static void main(String[] args) {
        while (true)
        {
            DatagramPacket dp = null;
            DatagramSocket ds = null;

            Scanner in = new Scanner(System.in);
            System.out.println("请输入要发送的内容");
            String msg = in.next();
            byte[] bt_msg = msg.getBytes();

            try {
                ds = new DatagramSocket();
                InetAddress ita = InetAddress.getByName("172.16.63.14"); //输入接收方的IP地址
                dp = new DatagramPacket(bt_msg,0,bt_msg.length,ita,9630);
                ds.send(dp);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(ds != null)
                {
                    ds.close();
                }
            }
        }
    }
}
