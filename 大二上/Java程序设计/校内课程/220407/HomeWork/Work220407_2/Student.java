package Work220407_2;
/**
@ THIS FILE IS PART OF mole9630 PROJECT
@ Student.java - This is the java homework for April 8th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top

* 定义类Person，含有两个私有成员变量name和age；
* 含有两个重载的构造方法Person()和Person(String name,int age);
* 含有四个公共访问权限的方法：getName()\setName()\getAge()\setAge()
* 定义类Student，作为Person的直接子类，含有一个私有成员变量sno;其他代码请按下面要求给出。
* 要求：根据实际情况对Student进行构造方法的定义，并在测试类中对Student的对象s进行赋值和输出。
* 输出样式： 1001   Tom   20
*/
public class Student extends Person {
    private String sno;

    //无参构造方法
    public Student() {
    }
    //有参构造方法
    public Student(String sno,String name, int age) {
        super(name, age);
        this.sno = sno;
    }

    //getter与setter
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }

    //打印信息
    public void showInfo()
    {
        System.out.println("学号:" + sno + "\n姓名:" + getName() + "\n年龄:" + getAge());
    }
    //@
}
