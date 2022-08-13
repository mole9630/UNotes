package com;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddress {
    public static void main(String[] args) {
        try {
            InetAddress it1 = InetAddress.getByName("172.16.63.100");
            System.out.println(it1);
            InetAddress it2 = InetAddress.getByName("www.github.com");
            System.out.println(it2);
            InetAddress it3 = InetAddress.getLocalHost(); //获取本机的IP地址
            System.out.println(it3); //输出本机名/IP地址
            System.out.println(it3.getHostName()); //获取本机的主机名
            System.out.println(it3.getHostAddress()); //获取本机的IP地址

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
