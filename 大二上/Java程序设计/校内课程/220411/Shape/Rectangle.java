package Study.Work220412_3;

public class Rectangle implements Shape {
    //成员变量
    double wide; //宽
    double longs; //长

    //构造方法
    public Rectangle() {
    }
    public Rectangle(double wide, double longs) {
        this.wide = wide;
        this.longs = longs;
    }

    //实现接口的方法
    @Override
    public double area() {
        return longs * wide;
    }
    @Override
    public double perimeter() {
        return (longs + wide) * 2;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,15);
        System.out.println("周长为:" + r.perimeter());
        System.out.println("面积为:" + r.area());
    }
}
