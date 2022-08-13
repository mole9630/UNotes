package com;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("172.16.63.14");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.github.com");
            System.out.println(inet2);
            //获取本机的域名和IP地址
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);
            //获取InetAddress对象所含域名
            System.out.println(inet2.getHostName());
            //获取InetAddress对象所含IP地址
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
