#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>
#define PI 3.1415926535

int main()
{
	//1．编程求任意三个整数之和。
	/*
	int a,b,c;
	printf("请输入第一个数：");
	scanf("%d",&a);
	printf("请输入第二个数：");
	scanf("%d",&b);
	printf("请输入第三个数：");
	scanf("%d",&c);
	printf("%d+%d+%d=%d/n",a,b,c,a+b+c);
	*/

	//2．已知圆半径为5，编程输出圆的周长与面积。
	/*
	float r;
	printf("请输入圆的半径：");
	scanf("%f",&r);
	printf("半径为%f的圆的周长为:%f,面积为:%f\n",r,2*PI*r,PI*r*r);
	*/

	//3．从键盘输入一个大写字母，输出对应的小写字母。
	/*
	char wordd,wordx;
	printf("请输入任意一个大写字母：");
	scanf("%c",&wordd);
	wordx = wordd + 32;
	printf("大写字母\"%c\"的小写字母为\"%c\"\n",wordd,wordx);
	*/

	//4．用户从键盘输入摄氏度，输出对应的华氏度值
	float c,f;
	printf("请输入摄氏度(℃)：");
	scanf("%f",&c);
	f = 32 + c * 1.8;
	printf("摄氏度%f℃对应的华氏度为:%f",c,f);

	system("pause");
}