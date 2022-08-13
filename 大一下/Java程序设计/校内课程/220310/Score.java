package mole;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        //判断成绩的等级
        Scanner in = new Scanner(System.in);
        System.out.println("请输入成绩:");
        short s = in.nextShort();
        System.out.println("**** 方法1 ****");
        System.out.println("成绩为:" + s);
        /**
         * 如果输入的成绩小于0或大于100,提示非法输入
         * 如果成绩合法,给出等级提示
         */
        if (s < 0 || s >100)
        {
            System.out.println("非法输入");
        }
        else if (s < 60)
        {
            System.out.println("评级为:不及格 成绩为:" + s);
        }
        else if (s>=60 && s<80)
        {
            System.out.println("评级为:良好 成绩为:" + s);
        }
        else
        {
            System.out.println("评级为:优秀 成绩为:" + s);
        }


        //或者
        System.out.println("\n**** 方法2 ****");
        s = in.nextShort();
        while (s<0 || s>100)
        {
            System.out.println("非法输入,请重新输入成绩(0~100):");
            s = in.nextShort();
        }
        if (s < 60)
        {
            System.out.println("评级为:不及格 成绩为:" + s);
        }
        else if (s>=60 && s<80)
        {
            System.out.println("评级为:良好 成绩为:" + s);
        }
        else
        {
            System.out.println("评级为:优秀 成绩为:" + s);
        }
    }
}
