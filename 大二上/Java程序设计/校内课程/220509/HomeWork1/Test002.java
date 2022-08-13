package HomeWork;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Test002.java - This is the java homework for May 10th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top
 */
public class Test002 {
    public static void main(String[] args) {
        int test=test(5,3);
        System.out.println(test);
    }
    public static int test( int x,int y){
        int result=x;
        try {
            if(x<0 || y<0){ //不满足条件,不执行该代码块
                return 0;
            }
            return (x-y);
        }finally { //该句必须执行
            System.out.println(x+y);
        }
    }
}
