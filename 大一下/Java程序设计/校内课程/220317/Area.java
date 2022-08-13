package com;

import javax.swing.*; //引用的类

public class Area {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hello World!"); //弹出一个对话框
        String s1,s2; //字符串
        s1 = JOptionPane.showInputDialog("请输入第一个操作数:");
        s2 = JOptionPane.showInputDialog("请输入第二个操作数:");
        int t1,t2;
        t1 = Integer.parseInt(s1); //把字符串转换为整型
        t2 = Integer.parseInt(s2); //把字符串转换为整型
        JOptionPane.showMessageDialog(null,"t1=" + t1 + ", t2=" + t2 + ", t1+t2=" + t1 + t2); //弹出一个对话框

    }
}
