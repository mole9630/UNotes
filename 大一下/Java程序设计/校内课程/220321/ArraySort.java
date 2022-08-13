package com;

public class ArraySort {
    public static void arraySort(int []arr){
        //排序操作
        int temp,j,n;
        for (j=0;j<arr.length-1;j++)
        {
            for (n=0;n<arr.length-1-j;n++)
            {
                if (arr[n]>arr[n+1]) //交换
                {
                    temp = arr[n];
                    arr[n] = arr[n+1];
                    arr[n+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr= {3,1,6,2,9,0,7,4,5,8};
        int i;
        System.out.print("排序前:");
        for (i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }

        //调用排序方法
        arraySort(arr); //地址传递(直接修改参数值)

        System.out.print("\n排序后:");
        for (i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
