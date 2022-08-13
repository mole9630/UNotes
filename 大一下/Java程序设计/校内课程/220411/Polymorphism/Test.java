package Polymorphism;
/**
 * 多态的意义在于:可以屏蔽不同子类的差异性编写通用代码,从而产生不同的效果
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Student("张三",19,"220411");
        System.out.println("**** println ****");
//        System.out.println("姓名:" + p.getName() + "\n年龄:" + p.getAge() + "\n学号:" + p.getSno()); //对于指向子类对象的父类来说,在编译期间只能调用父类方法,不能直接调用子类的方法
        System.out.println("姓名:" + p.getName() + "\n年龄:" + p.getAge());
        System.out.println("\n**** showInfo ****");
        p.showInfo(); //对于父子类都有非静态方法来说,最终调用子类的重写版本
        System.out.println("\n**** staticShowInfo ****");
        p.staticShowInfo(); //对于父子类都有的静态方法来说,最终调用父类中的版本,与指向的对象无关
    }
}
