package com;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (1<100000) //true也同理
        {
            System.out.print(i + " "); //输出不换行 012345
            if (i==5)
            {
                break;
            }
            i++;
        }
        i= 0;
        System.out.println();

        //break和continue的使用
        while (true)
        {
            i++;
            if (i==10)
            {
                break;
            }
            else if (i%2==0)
            {
                continue;
            }
            System.out.print(i + " ");//输出不换行
        }
    }
}
