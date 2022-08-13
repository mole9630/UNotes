package com;

public class Girl {
    //成员变量
    /**
     * 封装:
     * 1.私有化成员变量(定义前加private)
     */
    private String name;
    private int age;
    private boolean flag;


    //get和set方法
    public String getName() //返回成员变量name的值
    {
        return name;
    }
    public void setName(String name) //设置(修改)成员变量name的值
    {
        this.name = name;
    }
    public int getAge() //返回成员变量age的值
    {
        return age;
    }
    public void setAge(int age) //设置(修改)成员变量age的值
    {
        this.age = age;
    }
    public boolean isFlag() ///idea软件通过右键空白->生成->Getter和Setter可自动生成
    {
        return flag;
    }
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }


    //构造方法
    public Girl() //缺省构造方法,如果类中如果没有定义构造方法,编译器会自动调用缺省构造方法,方法名和类名相同,没有参数也没有方法体
    {
    }

    Girl(String name,int age,boolean flag) //能够进行初始化的构造方法，成员变量名和形式参数名相同,故不可以省去前面的this
    {
        this.name = name; //左侧是当前活动对象的成员变量,右侧为形式参数
        this.age = age; //this代表一个引用,指向正在调用该方法的当前对象
        this.flag = flag;
    }
    Girl(int a,String n) //成员变量名和形式参数名不同,故可以省去前面的this
    {
        name = n;
        age = a;
    }


    //创建一个显示信息的方法
    public void show()
    {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("是否入住:" + (flag?"已入住":"未入住"));
    }

}
