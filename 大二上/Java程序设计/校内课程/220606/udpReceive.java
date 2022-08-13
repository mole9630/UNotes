package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpReceive {
    public static void main(String[] args) {
        while (true)
        {
            DatagramSocket ds = null;
            DatagramPacket dp = null;

            byte[] bt_msg = new byte[1024];
            dp = new DatagramPacket(bt_msg,0,bt_msg.length);
            try {
                ds = new DatagramSocket(9630);
                ds.receive(dp);
                String msg = new String(dp.getData(),0,dp.getLength());
                System.out.println("发送者:" + dp.getAddress());
                System.out.println("消息:" + msg);
                System.out.println("****************");
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
