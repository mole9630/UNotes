package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatReceiver {
    public static void main(String[] args) {
        byte[] buf = new byte[1024];
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9090);
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str);
            System.out.println(dp.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
