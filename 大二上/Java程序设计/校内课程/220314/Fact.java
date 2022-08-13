package mole;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        //n!==1*2*3*4*…*(n-1)*n
        int f = 1,n,i,j,sum=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i=1;i<=n;i++)
        {
            f *= i;
            sum += f;
        }
        System.out.println(n + "!=" + f);
        System.out.println("1!+2!+…+n!=" + sum);
        f = 1;
        sum = 0;

        //改写while
        System.out.println("\n**********");
        i = 1;
        while(i<=n)
        {
            f *= i;
            sum += f;
            i++;
        }
        System.out.println(n + "!=" + f);
        System.out.println("1!+2!+…+n!=" + sum);
        f = 1;
        sum = 0;

        //改写do while
        System.out.println("\n**********");
        i = 1;
        do
        {
            f *= i;
            sum += f;
            i++;
        } while (i<=n);
        System.out.println(n + "!=" + f);
        System.out.println("1!+2!+…+n!=" + sum);
        f = 1;
        sum = 0;
    }
}