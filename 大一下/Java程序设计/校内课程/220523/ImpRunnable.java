package com;
//实现Runnable接口的类
public class ImpRunnable implements Runnable {
    String id;
    //构造方法
    public ImpRunnable(String id) {
        this.id = id;
    }

    //实现Runnable接口,重写run方法
    @Override
    public void run() {
        System.out.println("子线程的开始:"+id);
        for (int i=0;i<5;i++) {
            System.out.println("子线程的运行:"+id+" | "+i);
            System.out.println("子线程的运行:"+id+" | "+i);
        }
        System.out.println("子线程的结束:"+id);
    }

    public static void main(String[] args) {
        //创建线程对象
        ImpRunnable ir1 = new ImpRunnable("线程1");
        ImpRunnable ir2 = new ImpRunnable("线程2");
        ImpRunnable ir3 = new ImpRunnable("线程3");
        //创建Thread实例
        Thread t1 = new Thread(ir1);
        Thread t2 = new Thread(ir2);
        Thread t3 = new Thread(ir3);
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.NORM_PRIORITY); //缺省优先级:5
        System.out.println(t3.getPriority()); //获取优先级
    }
}
