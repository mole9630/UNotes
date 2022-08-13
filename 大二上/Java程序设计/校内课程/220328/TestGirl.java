package com;

public class TestGirl {
    public static void main(String[] args) {
        Girl g = new Girl(); //使用Girl构造方法创建一个类的对象g
        //如果使用无参数构造方法实例化,且类中定义了有参数的构造方法,那么类中必须定义无参数构造方法
        Girl g1 = new Girl("张三",19,true);
        g1.show();


        System.out.println("\n**** 读与写成员变量 ****");
//        System.out.println(g1.name); //如果成员变量的修饰符缺省,则这个成员变量在包内可以访问

        System.out.println("*** set修改前 ***");
        System.out.println("getName=" + g1.getName()); //读取对象的成员变量name的值
        g1.setName("李四"); //设置(修改)成员变量name的值
        System.out.println("getAge=" + g1.getAge()); //读取对象的成员变量age的值
        g1.setAge(20); //设置(修改)成员变量age的值

        System.out.println("*** 修改后重新输出信息 ***");
        g1.show();
    }
}
