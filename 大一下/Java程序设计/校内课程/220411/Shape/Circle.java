package Study.Work220412_3;

public class Circle implements Shape {
    //成员变量
    double radius;
    //构造方法
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    //实现接口的方法
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    //实例化
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("周长为:" + c.perimeter());
        System.out.println("面积为:" + c.area());
    }
}
