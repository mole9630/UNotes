package com;

public class Prime {
    public static void main(String[] args) {
        int i,g,s,b;//g=个位 s=十位 b=百位
        i = 100;
        while(i<1000)
        {
            b = i / 100;
            s = i / 10 % 10;//i % 100 / 10
            g = i % 10;
            if(i == b*b*b + s*s*s + g*g*g)
                System.out.println(i + "是水仙花数");
            i++;
        }
    }
}