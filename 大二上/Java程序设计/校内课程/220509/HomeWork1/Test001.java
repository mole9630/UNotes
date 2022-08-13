package HomeWork;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Test001.java - This is the java homework for May 10th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top
 */
public class Test001 {
    public static void main(String[] args) {
        try {
            newex(); //此处抛出异常
            System.out.println('a'); //此处不会执行
        } catch (Exception e) { //此处捕获异常
            System.out.print('b');
        } finally { //此句必执行
            System.out.print('c');
        }
        System.out.print('d'); //按顺序执行,该句正常执行
    }

    public static void newex() throws Exception {
        throw new Exception();
    }
}
