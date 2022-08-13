package com;

public class Array {
    public static void main(String[] args) {
        //动态方式定义
        int []arr1=new int[10]; //动态方式定义:整形数组,长度为18 推荐使用该方式
        int arr2[]=new int[10]; //和上条一致 但不推荐使用此种方式
        int []arr3; //只声明,但未初始化(即未分配存储空间)
        arr3 = new int[10]; //分配存储空间
        //静态方式定义-根据给出元素个数计算数组的长度
        int []arr4=new int[]{1,2,3,4,5};
//        int []arr4=new int[5]{1,2,3,4,5}; //不能在右侧的中括号内指定长度
        int []arr5={1,2,3,4,5};
//        arr5 = {1,2}; //不允许声明后再赋值
//        int [5]arr6; //非法的(Java语言声明数组的时候不能指定其长度)

        //数组的操作
        //遍历数组(访问数组的每个元素)
        //数组下标取值范围[0,数组长度-1],数组长度用数组的length属性获取.
        for (int i=0;i<arr4.length;i++)
        {
            System.out.printf("%d ",arr4[i]);
        }
    }
}