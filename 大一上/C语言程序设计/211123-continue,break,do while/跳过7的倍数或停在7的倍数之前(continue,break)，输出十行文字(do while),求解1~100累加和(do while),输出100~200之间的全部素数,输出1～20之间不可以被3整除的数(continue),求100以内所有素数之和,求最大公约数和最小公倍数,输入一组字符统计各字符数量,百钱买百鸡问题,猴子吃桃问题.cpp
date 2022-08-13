#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.跳过7的倍数或停在7的倍数之前(continue,break知识点)
	int i;
	for(i=1;i<=100;i++)
	{
		if(i%7==0)
		{
			continue;//结束本次循环
			break;//跳出循环
		}	
		printf("%d\n",i);
	}


	//2.输出十行hello world(do while知识点)
	int i;
	i = 1;
	do
	{
		printf("Hello World!\n");
		i++;
	}
	while(i<=10);


	//3.用do while循环求解1~100累加和
	int i,sum;
	i = 1;sum = 0;
	do
	{
		sum += i;
		i++;
	}
	while(i<=100);
	printf("\"%d\"的累加和为\"%d\".\n",i,sum);


	//4.输出100~200之间的全部素数
	int i,s;
	for(i=100;i<=200;i++)
	{
		for(s=2;s<i;s++)
		{
			if(i%s==0)
			{
				break;
			}
		}
		if(s==i)
		{
			printf("\"%d\"为素数\n",i);
		}
	}


	//5.编程序输出1～20之间不可以被3整除的数(用continue语句实现)
	int i;
	for(i=1;i<=20;i++)
	{
		if(i%3==0)
		{
			continue;
		}
		printf("%d\n",i);
	}


	//6.求100以内所有素数之和
	int i,s,sum=0;
	for(i=1;i<=100;i++)
	{
		for(s=2;s<i;s++)
		{
			if(i%s==0)
			{
				break;
			}
		}
		if(s==i)
		{
			sum += i;
		}
	}
	printf("所有素数累加和为\"%d\"\n",sum);


	//7.输入两个正整数,求其最大公约数和最小公倍数
	int a,b,r;
	printf("请输入第一个数：");
	scanf("%d",&a);
	printf("请输入第二个数：");
	scanf("%d",&b);
	r = a%b;//45 15
	while(r!=0)
	{
		a = b;
		b = r;
		r = a%b;
	}
	printf("最大公约数为\"%d\"\n",b);


	//8.用户从键盘输入一组字符，输出＃时结束，统计大写字母.小写字母.数字及其他字符的个数。
	char c;
	int dw=0,xw=0,n=0,o=0;
	printf("请输入一个字符串：");
	while((c=getchar()!='#'))
	{

		if(c>='A' && c<='Z')
		{
			dw++;
		}
		else if(c>='a' && c<='z')
		{
			xw++;
		}
		else if(c>='0' && c<='9')
		{
			n++;
		}
		else
		{
			o++;
		}
	}
	printf("大写字母有%d个 小写字母有%d个 数字有%d个 其他字符有%d个\n",dw,xw,n,o);
	
	
	//9.百钱买百鸡问题：公鸡每只5元，母鸡每只3元，小鸡一元3只，求出公鸡.母鸡.小鸡各多少只？
	int g,m,x;
	for(g=0;g<=20;g++)
	{
		for(m=0;m<=33;m++)
		{
			for(x=0;x<=300;x++)
			{
				if(5*g + 3*m + 1.0/3*x == 100)
				{
					printf("公鸡共\"%d\"只 母鸡共\"%d\" 小鸡共\"%d\"\n",g,m,x);
				}
			}
		}
	}
	
	
	//10.用1.2.3.4组成各位不相同的三位数。
	///*
	int a,b,c,i;
	for(i=1;i<=4;i++)
	{
		for(a=1;a<=4;a++)
		{
			for(b=1;b<=4;b++)
			{
				if(i!=a && i!=b && a!=b)
				{
					printf("%d%d%d\n",i,a,b);
				}
			}
		}
	}
	//*/
	
	
	//11.猴子吃桃问题：猴子第一天摘下若干桃子，吃了一半多一个，以后每天都吃前一天剩下的多一个，到第10天时，只剩下1个桃子。问：第一天摘了多少桃子？
	///*
	int last=1,day=10;
	while(day>1)
	{
		day--;
		last = (last+1)*2;
		printf("第%d天 还剩余%d个桃子\n",day,last);
	}
	//*/


	system("pause");
}