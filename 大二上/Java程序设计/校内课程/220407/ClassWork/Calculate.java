package Temp;

public class Calculate extends Shape {
    private double radius; //半径
    private double wide; //宽
    private double longs; //长
    public Calculate(double radius) { //圆
        this.radius = radius;
    }
    public Calculate(double wide, double longs) { //矩形
        this.wide = wide;
        this.longs = longs;
    }

    @Override
    double circleArea() {
        return Math.PI * radius * radius; //计算圆的面积
    }
    @Override
    double circlePerimeter() {
        return 2 * Math.PI * radius; //计算圆的周长
    }
    @Override
    double rectangleArea() {
        return this.longs * this.wide; //计算矩形的面积
    }
    @Override
    double rectanglePerimeter() {
        return (this.longs + this.wide) * 2; //计算矩形的周长
    }
}
