package com;

public class MethodThread extends Thread {
    String id;
    public MethodThread(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("子线程的开始:"+id);
        for (int i=0;i<5;i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程的运行:"+id+" | "+i);
        }
        System.out.println("子线程的结束:"+id);
    }

    public static void main(String[] args) {
        MethodThread mt1 = new MethodThread("线程1");
        MethodThread mt2 = new MethodThread("线程2");
        mt1.start();
        try {
            mt1.join(); //当前线程(mt2)放到mt1的尾部
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mt2.start();
    }
}
