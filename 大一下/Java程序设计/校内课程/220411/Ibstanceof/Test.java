package Ibstanceof;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("red");

        Bird b = new Bird("blue","张三");

//        Bird b1 = (Bird)a; //编译无误,运行出错 -父类对象不能转换为子类对象

        Animal a1 = new Bird();
        Bird b2 = (Bird)a1;
        b2.show();
    }
}
