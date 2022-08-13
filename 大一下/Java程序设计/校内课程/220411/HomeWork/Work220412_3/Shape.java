package Study.Work220412_3;
/**
@ THIS FILE IS PART OF mole9630 PROJECT
@ Shape.java - This is the java homework for April 12th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top

* 设计一个Shape接口和它的两个实现类Square和Circle，要求如下：
* 1 Shape接口中有一个抽象方法area()，方法接收有一个double类型的参数，返回一个double类型的结果
* 2 Square和Circle中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回。
* 3 在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积。
*/
public interface Shape {
    public double area(); //面积方法
    public double perimeter(); //周长方法
}
