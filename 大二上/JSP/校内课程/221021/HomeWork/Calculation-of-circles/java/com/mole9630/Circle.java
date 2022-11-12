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
    public Double circumference(Double r) {
        return 2 * this.PI * this.r;
    }

    // 圆的面积
    public Double area(Double r) {
        return PI * Math.pow(this.r, 2);
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
