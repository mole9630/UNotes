package com;
//构建Thread类的子类，继承Thread类
public class SubThread extends Thread {
    String id;
    public SubThread() {
    }
    public SubThread(String id) {
        this.id = id;
    }

    //重写run()方法
    public void run() {
        System.out.println("子线程的开始:"+id);
        for (int i=0;i<5;i++) {
            System.out.println("子线程的运行:"+id+" | "+i);
        }
        System.out.println("子线程的结束:"+id);
    }

    //创建线程对象
    public static void main(String[] args) {
        SubThread st1 = new SubThread("线程1"); //创建线程对象 处于新建状态
        SubThread st2 = new SubThread("线程2"); //创建线程对象 处于新建状态
        //启动线程
        st1.start(); //线程1处于运行状态
        st2.start(); //线程2处于运行状态
    }
}
