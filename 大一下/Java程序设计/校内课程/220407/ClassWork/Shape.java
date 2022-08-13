package Temp;

public abstract class Shape {
    abstract double circleArea(); //定义抽象方法area
    abstract double circlePerimeter(); //定义抽象方法area
    abstract double rectangleArea();
    abstract double rectanglePerimeter();

    public static void main(String[] args) {
        Shape circle = new Calculate(3); //圆形
        System.out.println("圆的面积：" + circle.circleArea());
        System.out.println("圆的周长：" + circle.circlePerimeter());
        Shape rectangle = new Calculate(10.5,20.6); //矩形
        System.out.println("矩形的面积：" + rectangle.rectangleArea());
        System.out.println("矩形周长：" + rectangle.rectanglePerimeter());
    }
}
