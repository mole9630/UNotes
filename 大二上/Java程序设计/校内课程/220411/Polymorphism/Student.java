package Polymorphism;

public class Student extends Person{
    //新增一个成员变量
    private String sno;

    //构造方法
    public Student()
    {
    }
    public Student(String name,int age,String sno)
    {
        super(name, age);
        this.sno = sno;
    }

    //getter


    public String getSno() {
        return sno;
    }

    //打印信息的方法
    public void showInfo()
    {
        System.out.println("学号:" + sno + "\n姓名:" + this.getName() + "\n年龄:" + this.getAge());
    }

    //打印信息的静态方法
    public static void staticShowInfo()
    {
        System.out.println("学号:220411" + "\n姓名:张静态" + "\n年龄:19");
    }
}
