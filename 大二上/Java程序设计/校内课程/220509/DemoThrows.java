package com;

public class DemoThrows {
    public void div(int a, int b) throws Exception { //throws Exception 该方法抛出异常(Exception)
        System.out.println(a / b);
    }

//    public static void main(String[] args) throws Exception { //如果被调用的方法抛出异常,则调用方法要处理异常:继续抛出异常
//        DemoThrows dt = new DemoThrows();
//        dt.div(6, 3);
//        dt.div(6, 0);
//    }

    public static void main(String[] args) throws Exception { //如果被调用的方法抛出异常,则调用方法要处理异常:捕获并处理异常
        DemoThrows dt = new DemoThrows();
        try {
            dt.div(6, 3); //2
            dt.div(6, 0); //捕获异常:/ by zero
        } catch (Exception e) {
            System.out.println("捕获异常:" + e.getMessage());
        }
    }
}
