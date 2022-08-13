#include<stdio.h>

//1 指针
//不带*代表地址 带*代表地址里的值 
//*
int main()
{
	int x=5;
	int *p;//定义指针变量
	p = &x;
	printf("x=%d\n",*p);//"*"为指针运算符
	printf("x=%d\n",*&x);//"*"取&x地址里的值
	
	*p = 6; 
	printf("x=%d\n",x);
}
//*/


//2 通过指针和值实现两数交换
//函数的参数传递分为:值传递 地址传递 
	//2.1 值传递 
	//*
	void swap(int,int);//函数的声明/函数原型 
	
	int main()
	{
		int x=5,y=10;
		swap(x,y);//函数的调用
		printf("x=%d y=%d\n",x,y); 
	}
	void swap(int x,int y)//函数的定义 
	{
		int t;
		t = x;
		x = y;
		y = t;
	}
	//*/
	
	//2.2 地址传递
	//*
	void swap(int*,int*);//函数的声明/函数原型 
	
	int main()
	{
		int x=5,y=10;
		swap(&x,&y);//函数的调用
		printf("x=%d y=%d\n",x,y); 
	}
	void swap(int *x,int *y)//函数的定义 
	{
		int t;
		t = *x;
		*x = *y;
		*y = t;
	}
	//*/


//3 数组的排序(地址调用) 
//*
void sort(int*,int);

int main()
{
	int a[10]={2,8,5,1,7,9,3,6,4,0},i;
	sort(a,10);//10指十个数 
	for(i=0;i<10;i++)
	{
		printf("%d\n",a[i]);
	} 
}
void sort(int a[],int n)
{
	int i,j,t;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	} 
}
//*/


//4 用指针输出所有数组
//*
int main()
{
	int a[10]={0,1,2,3,4,5,6,7,8,9},i;
	int *p;
	p = a;
	printf("%d\n",*p);
	printf("%d\n",*(p+1));
	for(i=2;i<10;i++)
	{
		printf("%d\n",*(p+i));
		//printf("%d\n",*p++);//p++则改变了p的值 
	}
}
//*/


//5 求n的阶乘(n!:5!=5*4*3*2*1)(函数的递归调用(调用函数本身))
//*
int fact(int n)
{
	int s;
	if(n==1)
	{
		s = 1;
	}
	else
	{
		s = n * fact(n-1);
		//5*(5-1)
		//5*4*(4-1)
		//5*4*3*(3-1)
		//5*4*3*2*(2-1)
		//5*4*3*2*1(n=1结束循环)
	}
}
int main()
{
	int n;
	printf("请输入一个数:");
	scanf("%d",&n);
	printf("%d!=%d\n",n,fact(n));
}
//*/


//6 n的求和(5=5+4+3+2+1)(函数的递归调用(调用函数本身))
//*
int add(int n)
{
	int s;
	if(n==1)//如果n<3也可写成n==3,s=6. 
	{
		s = 1;
	}
	else
	{
		s = n + add(n-1);
		//5+(5-1)
		//5+4+(4-1)
		//5+4+3+(3-1)
		//5+4+3+2+(2-1)
		//5+4+3+2+1(n=1结束循环)
	}
}
int main()
{
	int n;
	printf("请输入一个数:");
	scanf("%d",&n);
	printf("%d的求和为:%d\n",n,add(n));
}
//*/


//7 猴子吃桃(每天吃一半多一个,第十天剩1个)
//*
int judge_number(int n)
{
	int s;
	if(n==10)
	{
		s = 1;
	}
	else
	{
		s = (judge_number(n+1) + 1) * 2;
	}
	return s; 
}
int main()
{
	int n;
	printf("共%d个桃子\n",judge_number(1));
}
//*/


	//7.1 猴子吃桃(每天吃一半多一个,延伸) 
	//*
	int judge_number(int n)
	{
		int s;
		if(n==10)
		{
			s = 1;
		}
		else
		{
			s = (judge_number(n+1) + 1) * 2;
		}
		return s; 
	}
	int main()
	{
		int n,d;
		printf("***请输入第几天还剩几个桃子***\n");
		printf("请输入天数:");
		scanf("%d",&d);
		printf("请输入第%d天剩下几个桃子:",d);
		scanf("%d",&n);
		printf("共%d个桃子\n",judge_number(n));
	}
	//*/


//创建头文件-求最大公约数与最小公倍数 
//*
#include "test_number.h"

int main()
{
	int x,y;
	printf("请输入第一个数:");
	scanf("%d",&x);
	printf("请输入第二个数:");
	scanf("%d",&y);
	printf("%d和%d的最大公约数是%d\n",x,y,zdgys(x,y));
	printf("%d和%d的最小公倍数是%d\n",x,y,zxgbs(x,y));
}
//*/
