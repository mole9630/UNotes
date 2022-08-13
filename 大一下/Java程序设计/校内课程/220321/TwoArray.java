package com;

public class TwoArray {
    public static void main(String[] args) {
        int i,j;
        int[][] a={{1,2},{3,4},{5,6,7},{8,9,10,11}}; //声明一个二维数组a
        int b[][] = new int[2][]; //动态初始化
        b[0] = new int[1];
        b[1] = new int[2];

        //二维数组的赋值
        int[][] d = new int[2][];
        d[0] = new int[3];
        d[1] = new int[5];
        for (i=0;i<d[0].length;i++)
        {
            d[0][i] = i;
            System.out.printf("%d ",d[0][i]);
        }
        System.out.println();
        for (i=0;i<d[1].length;i++)
        {
            d[1][i] = i;
            System.out.printf("%d ",d[1][i]);
        }

        //遍历二维数组
        System.out.println("\n\n**** 遍历二维数组 ****");
        System.out.println("数组a的长度:" + a.length); //a.length表示数组a的长度,即数组中的行数
        for (i=0;i<a.length;i++)//控制行数
        {
            for (j=0;j<a[i].length;j++) //c[i].length表示二维数组的第i+1行元素个数--长度
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //增强for循环foreach遍历
        int[][] c=
                {
                        {1,2},
                        {3,4},
                        {5,6,7},
                        {1,2,3,4,5,6}
                };
        System.out.println("\n**** 增强for循环foreach遍历 ****");
        for (int[] c1: c) //依次取二维数组c中的每个元素,并分别赋值给c1
            //第一次取{1,2}这个元素给c1,这时c1就是一个一维数组{1,2}
        {
            for (int m: c1)//依次取一维数组c1中的每个元素,并分别赋值给m
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
