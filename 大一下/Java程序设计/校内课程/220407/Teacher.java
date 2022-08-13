package com;

public abstract class Teacher extends Person {
    //如果一个类继承了抽象类,那么子类如果没有实现父类中抽象方法,必须把子类变成抽象类
    @Override
    public void play() {
    }

    public static void main(String[] args) {
//        Teacher t = new Teacher(); //抽象类不能实例化
        Teacher t = new Teacher() {
            @Override
            public void play() {
                super.play();
            }
        };
    }
}
