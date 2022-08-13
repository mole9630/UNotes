// 123.cpp : 定义控制台应用程序的入口点。
//
#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>
#define PI 3.1415926535 //2．已知圆半径为5，编程输出圆的周长与面积。

int main()
{
//1．编程求任意三个整数之和。
	int a,b,c,d;
	printf("请输入第一个数字：");
		scanf("%d",&a);
	printf("请输入第二个数字：");
		scanf("%d",&b);
	printf("请输入第三个数字：");
		scanf("%d",&c);
	d = a + b + c;
	printf("%d+%d+%d=%d",a,b,c,d);

//2．已知圆半径为5，编程输出圆的周长与面积。
	int r = 5;
	float zc,mj;
		zc = 2 * PI * r;
		mj = PI * r * r;
	printf("半径=%d 周长=%f 面积=%f\n",r,zc,mj);

//3.从键盘输入一个大写字母，输出对应的小写字母。
	char wordd,wordx;
	printf("请输入一个大写字母：");
		scanf("%c",&wordd);
	wordd =32 + wordx;
	printf("%c 的小写字母为：%c\n",wordd,wordx);

	system("pause");
}
