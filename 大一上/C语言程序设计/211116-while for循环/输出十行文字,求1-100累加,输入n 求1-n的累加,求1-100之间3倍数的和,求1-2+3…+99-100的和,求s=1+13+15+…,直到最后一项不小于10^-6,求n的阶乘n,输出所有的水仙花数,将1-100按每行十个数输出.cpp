#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1�����10��hello��world
	int i;
	i = 0;
	while(i<=10)
	{
		printf("Hello World\n");
		i++;
	}


	//1.1 ��дforѭ��
	int i;
	for(i=1;i<=10;i++)
	{
		printf("Hello World\n");
	}


	//2����while������1��100�ۼӺ�
	int i,sum;
	i = 0;sum = 0;
	while(i<=100)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
		i++;
	}
	
	//2.1 ��дforѭ��
	int i,sum;
	for(i=0,sum=0;i<=100;i++)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
	}


	//3���û��Ӽ�������n,��while������1��n�ۼӺ�
	int n,i,sum;
	i = 0;sum=0;
	printf("����������һ������");
	scanf("%d",&n);
	while(i<=n)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
		i++;
	}

	//3.1 ��дforѭ��
	int n,i,sum;
	printf("����������һ������");
	scanf("%d",&n);
	for(i=0,sum=0;i<=n;i++)
	{
		sum += i;//sum = sum + i
		printf("i=\"%d\",sum=\"%d\"\n",i,sum);
	}


	//4����1---100֮������3�ı����ĺ�
	int i,sum;
	i = 0;sum = 0;
	while(i<=100)
	{
		if(i%3==0)
		sum += i;//sum = sum + i
		i++;
	}
	printf("***** sum=\"%d\" *****\n",sum);
	
	//4.1 ��дforѭ��
	int i,sum;
	for(i=0,sum=0;i<=100;i++)
	{
		if(i%3==0)
		sum += i;//sum = sum + i
	}
	printf("***** sum=\"%d\" *****\n",sum);


	//5����1-2+3-4+5��.+99-100�ĺ�
		//5.1 ����1
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

		//5.5.1 ��дforѭ��
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

		//5.2 ����2
		int i,flag,sum;
		i = 1;flag = 1;sum = 0;
		while(i<=100);
		{
			sum=sum + flag *i;
			i++;
			flag = -flag;
		}
		printf("***** sum=\"%d\" *****\n",sum);
		
		//5.2.1 ��дforѭ��
		int i,flag,sum;
		for(i=1,flag=1,sum=0;i<=100;i++)
		{
			sum=sum + flag *i;
			flag = -flag;
		}
		printf("***** sum=\"%d\" *****\n",sum);


	//6����s=1+1/3+1/5+��,ֱ�����һ�С��10^-6
	int i;
	float sum;
	i = 1;sum = 0;
	while(1.0/i>=1.0e-6)
	{
		sum += 1.0 / i;//sum = sum + 1.0 / i
		i = i + 2;
	}
	printf("*****i=\"%d\" sum=\"%.2f\" *****\n",i-2,sum);//i��Ҫ-2���ܵõ�������i
	
	//6.1 ��дforѭ��
	int i;
	float sum;
	for(i=1,sum=0;1.0/i>=1.0e-6;i=i+2)
	{
		sum += 1.0 / i;//sum = sum + 1.0 / i
	}
	printf("*****i=\"%d\" sum=\"%.2f\" *****\n",i,sum);//i��Ҫ-2���ܵõ�������i


	//7����n�Ľ׳�n!(����5��=5*4*3*2*1)
	//��֪bug:������nƫ�����
	int n,sum;
	sum = 1;
	printf("����������һ������");
	scanf("%d",&n);
	while(n>=1)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);
		n--;
	}
	
	//7.1 ��дforѭ��
	int n,sum;
	printf("����������һ������");
	scanf("%d",&n);
	for(sum=1;n>=1;n--)
	{
		sum = sum * n;
		printf("i=\"%d\",sum=\"%d\"\n",n,sum);
	}


	//8��������е�ˮ�ɻ���(100-999)(ָһ����λ�����λ���ֵ������͵��ڸ������� �磺1^3 + 5^3+ 3^3 = 153)
	int i,g,s,b;//g=��λ s=ʮλ b=��λ
	i = 100;
	while(i<=999)
	{
		b = i / 100;
		s = i / 10 % 10;//i % 100 / 10
		g = i % 10;
		if(i == b*b*b + s*s*s + g*g*g)
			printf("\"%d\"��ˮ�ɻ���\n",i);
		i++;
	}
	
	//8.1 ��дforѭ��
	int i,g,s,b;//g=��λ s=ʮλ b=��λ
	for(i=100;i<=999;i++)
	{
		b = i / 100;
		s = i / 10 % 10;//i % 100 / 10
		g = i % 10;
		if(i == b*b*b + s*s*s + g*g*g)
			printf("\"%d\"��ˮ�ɻ���\n",i);
	}


	//9.��1-100��ÿ��10���������
	int i;
	i = 1;
	while(i<=100)
	{
		printf("%-4d",i);
		if(i%10==0)
			putchar('\n');
		i++;
	}

	//9.1 ��дforѭ��
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