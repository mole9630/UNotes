package com;

import java.util.Arrays;

public class ArrayOperate {
    public static void main(String[] args) {
        int[] a={0,8,2,7,1,4,6,3};
        int[] b=new int[20];
        //数组的拷贝
        System.out.println("**** 数组的拷贝 ****");
        System.arraycopy(a,3,b,0,5); //从a数组的第3个位置往b数组的第0个位置拷贝5个元素(注:下标从0开始)
        for (int m:b)
        {
            System.out.print(m + " "); //7 1 4 6 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        }

        //数组的比较 Arrays.equals
        //数组的填充 Arrays.fill
        //转换字符串 Arrays.toString
        //数组的排序 Arrays.sort
        System.out.println("\n\n**** 数组的排序 ****");
        Arrays.sort(a); //地址传递(直接修改参数值)
        for (int m:a)
        {
            System.out.print(m + " "); //4 5 6 7 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        }
    }
}
