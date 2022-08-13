// 计用218-54.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include<stdio.h>
#include"stdlib.h"
#define PI 3.1415926535 //定义符合常量

int main()
{
	/*1.符号常量
	int r;
	float zc,mj; //实数(带小数点)
	printf("请输入半径：");
	scanf("%d",&r);
	zc = 2 * PI * r;
	mj = PI * r * r;
	printf("半径=%d 周长=%f 面积=%f\n",r,zc,mj);
	*/

	/*2.求BMI的值-用户从键盘输入身高和体重算出偏胖还是偏瘦 BMI=体重(kg)/身高(m)平方 
	float sg,tz,bmi;
	printf("请输入身高：");
	scanf("%f",&sg);
	printf("请输入体重：");
	scanf("%f",&tz);
	bmi = tz / ( sg * sg );
	printf("身高为：%f(m) 体重为：%f(kg) BMI值为:%f\n",sg,tz,bmi);
	if(bmi<20)//不准确
		printf("BMI:偏胖\n");
	else
		printf("BMI:偏瘦\n");
		*/

	/*整型 实型 数据型
	int x = 10;//十进制
	int y = 012;//八进制
	int z = 0xA;//十六进制
	printf("x=%d(十进制) y=%d(八进制) z=%d(十六进制)\n",x,y,z);
	printf("x=%d(十进制) y=%o(八进制) z=%x(十六进制)\n",x,y,z);
	*/

	/*实型数据
	float x = 1.5;
	float y = 1.5e-2;//0.015 指数必须是整数
	double z = 2.5;//了解即可
	printf("x=%f y=%f z=%lf\n",x,y,z);
	printf("x=%d y=%d z=%d\n",sizeof(x),sizeof(y),sizeof(z));//"sizeof()"查询占用多少字节
	printf("f=%f e=%e g=%g\n",x,x,x);//不同的形式输出
	*/

	/*字符型
	char chA = 'A';
	printf("chA=%c\n",chA);//二进制(01000001)
	printf("chA=%d\n",chA);//ASCII(65)
	char cha = 'a';
	printf("cha=%c\n",cha);//二进制()
	printf("cha=%d\n",cha);//ASCII(97)
	int x = 1;
	printf("x=%c\n",x);//输出笑脸
	printf("x=%d\n",x);
	*/

	/*用户从键盘输入的小写字母改成大写字母输出
	char wordx,wordd;
	printf("请输入任意小写字母：");
	scanf("%c",&wordx);
	wordd = wordx - 32;//wordx - 'a' - 'A';
	printf("%c 的大写字母为：%c\n",wordx,wordd);
	/*

	/*用户从键盘输入的小写给字母改成大写字母输出，反之相反 (未解出)
	char sr;
	char sc;
	printf("请输入任意字母：");
	scanf("%c",&sr);
	*/

	/*转义字符 P28
	printf("\101\n");//通过八进制转为"A"(ASCII码)
	printf("\x41\n");//"/x"代表过十六进制转为"A"(ASCII码)

	char b,c,d,e;
	b =  '\43';//通过八进制转为"#"(ASCII码)
	c = '\103';//通过八进制转为"C"(ASCII码)
	d = '\x2a';//通过十六进制转为"*"(ASCII码)
	e= '\x41';//通过十六进制转为"A"(ASCII码)
	printf("b=%c c=%c d=%c e=%c\n",b,c,d,e);
	printf("\"good\40morning!\b\"!\n");
	printf("\123456\n");
	*/

	/*...*/


	system("pause");
	return 0;
}

