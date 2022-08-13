/**
 * 对于成员方法来说,this关键字代表当前正在调用的对象
 * 当我们形参变量名和成员变量名相同的时候,在我们方法体的内部会优先选择变量使用
 * 此时就需要使用this的方式明确使用的成员变量而不是形参变量,如this.name = name
 *
 * 对于构造方法来说,this关键字代表当前正在构造的对象,在外面构造方法的第一行使用this()的方式可以调用本类中其他构造方法
 */

package com;

public class TestThis {
    String name;
    int age;

    TestThis()
    {
        System.out.println(this);
    }
    void show()
    {
        System.out.println(this);
    }
    void showinfo()
    {
        System.out.print(this.name + " " + this.age);
    }
    TestThis(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        TestThis ts = new TestThis(); //com.TestThis@1b6d3586 -内存地址
        ts.show(); //com.TestThis@1b6d3586
        System.out.println(ts); //com.TestThis@1b6d3586
        //this代表当前活动对象(ts)--内存地址
        TestThis ts2 = new TestThis("张三",18);
        ts2.show(); //com.TestThis@4554617c
        ts2.showinfo(); //张三 18
    }
}
