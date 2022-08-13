#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//三位整数 输出百位十位个位
	/*
	int x,a,b,c;
	printf("请输入3位整数：");
	scanf("%d",&x);
	a = x / 100;
	b = x / 10 % 10;
	c = x % 10;
	printf("数字%d的百位为:%d,十位为:%d,个位为:%d\n",x,a,b,c);
	*/

	//410分钟 输出x小时x分钟
	/*
	int x,h,m;
	printf("请输入分钟数：");
	scanf("%d",&x);
	h = x / 60;
	m = x % 60;
	printf("%d分钟=%d小时%d分钟\n",x,h,m);
	*/

	//两数交换
	/*
	int x=9,y=6,z;
	z = x;
	x = y;
	y = z;
	printf("x=%d,y=%d\n",x,y);
	*/

	//逗号表达式
	/*
	int x,i;
	x = (i=4,i+5,i+2);
	printf("x=%d\n",x);
	*/

	//数制转换(自动转换)
	/*
	int x = 5;
	float y = 1.2;
	char z = 'A';
	float sum;
	sum = x + y + z;//A=65
	printf("总和等于:%f\n",sum);
	*/
	
	//强制转换
	/*
	float x = 2.55;
	printf("x=%d\n",(int)x);//(int)x强制类型转换
	*/

	//关系运算(>,>=,<,<=,==,!=)
	/*
	printf("%d\n",3<5);//1表示真
	printf("%d\n",3==5);//0表示假
	printf("%d\n",3!=5);//1表示真
	*/

	//判断平年闰年
	/*
	int year;
	printf("请输入年份:");
	scanf("%d",&year);
	if(year%4==0 && year%100!=0 || year%400==0)//"!"非,"&&"与,"||"非.
    printf("%d年是闰年\n",year);
	else
    printf("%d年是平年\n",year);
	*/

	//判断奇偶数并得出绝对值
	int number,_number;
	printf("请输入一个数字:");
	scanf("%d",&number);
	_number = number * -1;//number = 0 - number / -number / if(x>0);
	if(number%2==0)
		printf("%d是偶数,其绝对值为:%d\n",number,_number);
	else
		printf("%d是奇数,其绝对值为:%d\n",number,_number);


	system("pause");
	return 0;
}