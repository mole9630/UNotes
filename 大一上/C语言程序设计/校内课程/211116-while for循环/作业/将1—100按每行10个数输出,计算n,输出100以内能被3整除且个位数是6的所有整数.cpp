#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.��1��100��ÿ��10���������
	int i;
	for(i=1;i<=100;i++)
	{
		printf("%-4d",i);
			if(i%10==0)
				putchar('\n');
	}


	//2.����n(�����������ڻ����10000ʱֹͣ�������ʽ��  ����8��=40320)
	int n,sum;
	for(n=1,sum=1;sum<10000;n++)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);

	}


	//3. ���100���ڣ�����100���ܱ�3�����Ҹ�λ����6����������
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