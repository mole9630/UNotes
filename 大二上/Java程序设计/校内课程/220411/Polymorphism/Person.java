package Polymorphism;

public class Person {
    //封装--成员变量
    private String name;
    private int age;

    //构造方法
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //打印信息的方法
    public void showInfo()
    {
        System.out.println("\n姓名" + this.getName() + "\n年龄:" + this.getAge());
    }

    //打印信息的静态方法
    public static void staticShowInfo()
    {
        System.out.println("姓名:张静态" + "\n年龄:19");
    }
}
