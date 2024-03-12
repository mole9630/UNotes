#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.将1—100按每行10个数输出。
	int i;
	for(i=1;i<=100;i++)
	{
		printf("%-4d",i);
			if(i%10==0)
				putchar('\n');
	}


	//2.计算n(当计算结果大于或等于10000时停止。输出形式：  例如8！=40320)
	int n,sum;
	for(n=1,sum=1;sum<10000;n++)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);

	}


	//3. 输出100以内（不含100）能被3整除且个位数是6的所有整数
	int i,_i;
	for(i=1;i<100;i++)
	{
		_i = i%10;
		if(i%3==0 && _i==6)
		{
			printf("%d\n",i);
		}

	}

	system("pause");
}