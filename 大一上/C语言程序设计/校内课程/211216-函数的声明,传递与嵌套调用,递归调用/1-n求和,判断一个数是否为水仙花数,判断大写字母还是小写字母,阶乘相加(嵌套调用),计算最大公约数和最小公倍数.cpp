#include<stdio.h>

 
//1 用函数实现1-n求和(函数声明) 
//*
int add(int m,int n);//-1 函数的声明(不分配存储空间)
void prtStar();//-1 函数的声明(不分配存储空间) 

int main()
{
	printf("%d\n",add(3,5));
	prtStar(); 
	return 0;
}
int add(int m,int n)//此时分配存储空间 
{
	int s;
	s = m + n;
	return s;
}
void prtStar()
{
	printf("******\n");
}
//*/


//2 判断一个数是否为水仙花数
//*
void judge_prime(int x);//函数的声明 

int main()
{
	int x;
	printf("请输入一个数:");
	scanf("%d",&x);
	judge_prime(x);//函数的调用 
}
void judge_prime(int x)//函数的定义 
{
	int i;
	for(i=2;i<x;i++)
		if(x%i==0)
		{
			break;
		}
		if(i==x)
		{
			printf("\"%d\"是素数",x);
		}
		else
		{
			printf("\"%d\"不是素数",x);
		}
}
//*/


//3 判断输入的是大写字母还是小写字母
//* 
void judge_letter(char);

int main()
{
	char c;
	printf("请输入任意一个字母:");
	scanf("%c",&c);
	judge_letter(c);
}
void judge_letter(char x)
{
	if(x>='A' && x<='Z')
	{
		printf("\"%c\"为大写字母\n",x);
	}
	else if(x>='a' && x<='z')
	{
		printf("\"%c\"为小写字母\n",x);
	}
	else
	{
		printf("非法输入");
	} 
}
//*/


//4 用函数求三个数的和 平均数(函数的嵌套调用)
//* 
int add(int,int,int);
float ave(int,int,int);

int main()
{
	int x,y,z;
	printf("请输入第一个数:"); 
	scanf("%d",&x);
	printf("请输入第二个数:"); 
	scanf("%d",&y);
	printf("请输入第三个数:"); 
	scanf("%d",&z);
	printf("%d,%d,%d的和是:%d\n",x,y,z,add(x,y,z));
	printf("%d,%d,%d的平均数是:%.2f\n",x,y,z,ave(x,y,z));
}
int add(int x,int y,int z)
{
	int add;
	add = x + y + z;
	return add;
}
float ave(int x,int y,int z)
{
	float ave;
	ave = add(x,y,z) / 3.0;//函数的嵌套调用 
	return ave;
}
//*/


//5 1!+0!+3!+n!阶乘相加(嵌套调用)
//*
int add(int);//求相加 
int fun(int);//求阶乘 

int main()
{
	int n,sum;
	printf("请输入一个数:"); 
	scanf("%d",&n);
	sum = add(n);
	printf("1-%d的阶乘为:%d\n",n,sum);
}
int add(int n)
{
	int i,sum=0;
	for(i=1;i<=n;i++)
	{
		sum += fun(i);
	}
	return sum;
}
int fun(int n)
{
	int sum_=1,i;
	for(i=1;i<=n;i++)
	{
		sum_ *= i; 
	}
	return sum_; 
}
//*/


//6 计算最大公约数和最小公倍数
//半成品 
//*
int zdgys(int,int);
int zxgbs(int,int);

int main()
{
	int x,y;
	printf("请输入第一个数:"); 
	scanf("%d",&x);
	printf("请输入第二个数:"); 
	scanf("%d",&y);
	printf("%d,%d的最大公约数是:%d\n",x,y,zdgys(x,y));
	printf("%d,%d的最小公倍数是:%d\n",x,y,zxgbs(x,y));
}
int zdgys(int x,int y)
{
	int r;
	r = x%y;
	while(r!=0)
	{
		x = y;
		y = r;
		r = x%y; 
	}
	return y;
}
int zxgbs(int x,int y)
{
	return x * y / (zdgys(x,y));//函数的嵌套调用 
}
//*/ 
