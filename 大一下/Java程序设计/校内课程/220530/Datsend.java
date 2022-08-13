package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Datsend {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        while (true) {
            try {
                ds = new DatagramSocket();
                Scanner in = new Scanner(System.in);
                String msg = in.next();
                if (msg.trim().equals("quit")) {
                    break;
                }
                byte[] dat = msg.getBytes(); //把字符串转换为字节数组
                InetAddress it = InetAddress.getLocalHost(); //获取本机的ip地址
                InetAddress it1 = InetAddress.getByName("172.16.63.100");
                DatagramPacket dp = new DatagramPacket(dat, 0, dat.length, it, 9090);
                ds.send(dp);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (ds != null)
                {
                    ds.close();
                }
            }
        }
    }
}
