package com.mole9630;

public class Circle {
    private final double PI = Math.PI;
    private double r;

    // 构造方法
    public Circle() {
    }
    public Circle(double r) {
        this.r = r;
    }

    // 圆的周长
    public Circle circumference(Double r) {
        double circumference = 2 * this.PI * this.r;
        return new Circle(circumference);
    }

    // 圆的面积
    public Circle area(Double r) {
        double area = PI * Math.pow(this.r, 2);
        return new Circle(area);
    }

    // Getter & Setter
    public double getPI() {
        return PI;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
}
