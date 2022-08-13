package com;

public interface Pig<T> {
    public abstract void show(T t);
}

class Pig1<T> implements Pig<T> {
    public void show(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Pig1 p1 = new Pig1();
        Pig1<String> p2 = new Pig1(); //表示只输出字符串
        p1.show("hang~hang~hang~");
        p1.show(2333);
    }
}