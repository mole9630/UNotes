#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1、输出10行hello　world
	int i;
	i = 0;
	while(i<=10)
	{
		printf("Hello World\n");
		i++;
	}


	//1.1 改写for循环
	int i;
	for(i=1;i<=10;i++)
	{
		printf("Hello World\n");
	}


	//2、用while语句求解1～100累加和
	int i,sum;
	i = 0;sum = 0;
	while(i<=100)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
		i++;
	}
	
	//2.1 改写for循环
	int i,sum;
	for(i=0,sum=0;i<=100;i++)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
	}


	//3、用户从键盘输入n,用while语句求解1～n累加和
	int n,i,sum;
	i = 0;sum=0;
	printf("请输入任意一个数：");
	scanf("%d",&n);
	while(i<=n)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
		i++;
	}

	//3.1 改写for循环
	int n,i,sum;
	printf("请输入任意一个数：");
	scanf("%d",&n);
	for(i=0,sum=0;i<=n;i++)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
	}


	//4、求1---100之间所有3的倍数的和
	int i,sum;
	i = 0;sum = 0;
	while(i<=100)
	{
		if(i%3==0)
		sum += i;//sum = sum + i
		i++;
	}
	printf("***** sum=\"%d\" *****\n",sum);
	
	//4.1 改写for循环
	int i,sum;
	for(i=0,sum=0;i<=100;i++)
	{
		if(i%3==0)
		sum += i;//sum = sum + i
	}
	printf("***** sum=\"%d\" *****\n",sum);


	//5、求1-2+3-4+5….+99-100的和
		//5.1 方法1
		int i,sum;
		i = 0;sum = 0;
		while(i<=100)
		{
			if(i%2==0)
			{	
				sum -= i;//sum = sum - i
				printf("i=\"%d\",sum=\"%d\"\n",i,sum);
				i++;
			}
			else
			{
				sum += i;//sum = sum + i
				printf("i=\"%d\",sum=\"%d\"\n",i,sum);
				i++;
			}
		}
		printf("***** sum=\"%d\" *****\n",sum);

		//5.5.1 改写for循环
			int i,sum;
			for(i=0,sum=0;i<=100;i++)
			{
				if(i%2==0)
				{	
					sum -= i;//sum = sum - i
					printf("i=\"%d\",sum=\"%d\"\n",i,sum);
				}
				else
				{
					sum += i;//sum = sum + i
					printf("i=\"%d\",sum=\"%d\"\n",i,sum);
				}
			}
			printf("***** sum=\"%d\" *****\n",sum);

		//5.2 方法2
		int i,flag,sum;
		i = 1;flag = 1;sum = 0;
		while(i<=100);
		{
			sum=sum + flag *i;
			i++;
			flag = -flag;
		}
		printf("***** sum=\"%d\" *****\n",sum);
		
		//5.2.1 改写for循环
		int i,flag,sum;
		for(i=1,flag=1,sum=0;i<=100;i++)
		{
			sum=sum + flag *i;
			flag = -flag;
		}
		printf("***** sum=\"%d\" *****\n",sum);


	//6、求s=1+1/3+1/5+…,直到最后一项不小于10^-6
	int i;
	float sum;
	i = 1;sum = 0;
	while(1.0/i>=1.0e-6)
	{
		sum += 1.0 / i;//sum = sum + 1.0 / i
		i = i + 2;
	}
	printf("*****i=\"%d\" sum=\"%.2f\" *****\n",i-2,sum);//i需要-2才能得到真正的i
	
	//6.1 改写for循环
	int i;
	float sum;
	for(i=1,sum=0;1.0/i>=1.0e-6;i=i+2)
	{
		sum += 1.0 / i;//sum = sum + 1.0 / i
	}
	printf("*****i=\"%d\" sum=\"%.2f\" *****\n",i,sum);//i需要-2才能得到真正的i


	//7、求n的阶乘n!(例：5！=5*4*3*2*1)
	//已知bug:不适用n偏大的数
	int n,sum;
	sum = 1;
	printf("请输入任意一个数：");
	scanf("%d",&n);
	while(n>=1)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);
		n--;
	}
	
	//7.1 改写for循环
	int n,sum;
	printf("请输入任意一个数：");
	scanf("%d",&n);
	for(sum=1;n>=1;n--)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);
	}


	//8、输出所有的水仙花数(100-999)(指一个三位数其各位数字的立方和等于该数本身 如：1^3 + 5^3+ 3^3 = 153)
	int i,g,s,b;//g=个位 s=十位 b=百位
	i = 100;
	while(i<=999)
	{
		b = i / 100;
		s = i / 10 % 10;//i % 100 / 10
		g = i % 10;
		if(i == b*b*b + s*s*s + g*g*g)
			printf("\"%d\"是水仙花数\n",i);
		i++;
	}
	
	//8.1 改写for循环
	int i,g,s,b;//g=个位 s=十位 b=百位
	for(i=100;i<=999;i++)
	{
		b = i / 100;
		s = i / 10 % 10;//i % 100 / 10
		g = i % 10;
		if(i == b*b*b + s*s*s + g*g*g)
			printf("\"%d\"是水仙花数\n",i);
	}


	//9.将1-100按每行10个数输出。
	int i;
	i = 1;
	while(i<=100)
	{
		printf("%-4d",i);
		if(i%10==0)
			putchar('\n');
		i++;
	}

	//9.1 改写for循环
	int i;
	for(i=1;i<=100;i++)
	{
		printf("%-4d",i);
		if(i%10==0)
			putchar('\n');
	}


	system("pause");
	return 0;
}