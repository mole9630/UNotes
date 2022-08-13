package com;

public class Io {
    public void printPyramid(char n){

    }
    public static void main(String[] args) {
        char ch = 'a';
        int i,j;
        char n = 'g';
        n = (char) (n - 'a');
        for (j=0;j<=n;j++)
        {
            for (i=1;i<=n-j;i++)
            {
                System.out.print("  ");
            }
            for (i=0;i<j;i++)
            {
                System.out.printf("%c ",ch+i);
            }
            for (i=j;i>=0;i--)
            {
                System.out.printf("%c ",ch+i);
            }
            System.out.println();
        }
    }
}
