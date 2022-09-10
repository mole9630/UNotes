package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入元素的个数:");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("\n请输入数字,以空格隔开:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
