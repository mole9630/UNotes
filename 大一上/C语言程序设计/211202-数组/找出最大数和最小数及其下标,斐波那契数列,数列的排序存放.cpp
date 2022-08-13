#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

int main()
{
	//1 找出最大数和最小数及其下标
	///*
	int a[10],i,max,min,m,n,t;//m,n最大数和最小数的下标
	for(i=0;i<10;i++)
	{
		printf("请输入第%d个数:",i+1);
		scanf("%d",&a[i]);	
	}
	printf("原始值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	max = min = a[0];
	m = n = 0;
	for(i=0;i<10;i++)
	{
		if(max<a[i])//求最大值
		{
			max = a[i];
			m = i;
		}
		if(min>a[i])//求最小值
		{
			min = a[i];
			n = i;
		}
	}
	printf("最大值为:%d 最小值为:%d\n",max,min);
	t = a[m];
	a[m] = a[n];
	a[n] = t;
	printf("改变后的值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	//*/


	//2.斐波那契数列(Fibonacci sequence)
	///*
	int a[20]={1,1},i;
	for(i=2;i<20;i++)
	{
		a[i] = a[i-1] + a[i-2];
	}
	for(i=2;i<20;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	//*/


	//3 数列的排序存放
	//3.1 解题思路
	int a[10],i,j,t;
	///*
	for(i=0;i<10;i++)
	{
		printf("请输入第%d个数:",i+1);
		scanf("%d",&a[i]);	
	}
	//*/
	printf("原始值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	for(i=1;i<10;i++)
	{
		if(a[0]>a[i])
		{
			t = a[0];
			a[0] = a[i];
			a[i] = t;
		}
	}
	for(i=2;i<10;i++)
	{
		if(a[1]>a[i])
		{
			t = a[1];
			a[1] = a[i];
			a[i] = t;
		}
	}
	for(i=3;i<10;i++)
	{
		if(a[2]>a[i])
		{
			t = a[2];
			a[2] = a[i];
			a[i] = t;
		}
	}
	for(i=4;i<10;i++)
	{
		if(a[3]>a[i])
		{
			t = a[3];
			a[3] = a[i];
			a[i] = t;
		}
	}
	for(i=5;i<10;i++)
	{
		if(a[4]>a[i])
		{
			t = a[4];
			a[4] = a[i];
			a[i] = t;
		}
	}
	for(i=6;i<10;i++)
	{
		if(a[5]>a[i])
		{
			t = a[5];
			a[5] = a[i];
			a[i] = t;
		}
	}
	for(i=7;i<10;i++)
	{
		if(a[6]>a[i])
		{
			t = a[6];
			a[6] = a[i];
			a[i] = t;
		}
	}
	for(i=8;i<10;i++)
	{
		if(a[7]>a[i])
		{
			t = a[7];
			a[7] = a[i];
			a[i] = t;
		}
	}
	for(i=9;i<10;i++)
	{
		if(a[8]>a[i])
		{
			t = a[8];
			a[8] = a[i];
			a[i] = t;
		}
	}
	printf("排序后的值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");


	//3.2 编程
	int a[10],i,j,t;
	///*
	for(i=0;i<10;i++)
	{
		printf("请输入第%d个数:",i+1);
		scanf("%d",&a[i]);	
	}
	//*/
	printf("原始值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");

	for(i=0;i<9;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(a[i]>a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	}

	printf("排序后的值为:");
	for(i=0;i<10;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");



	system("pause");
}