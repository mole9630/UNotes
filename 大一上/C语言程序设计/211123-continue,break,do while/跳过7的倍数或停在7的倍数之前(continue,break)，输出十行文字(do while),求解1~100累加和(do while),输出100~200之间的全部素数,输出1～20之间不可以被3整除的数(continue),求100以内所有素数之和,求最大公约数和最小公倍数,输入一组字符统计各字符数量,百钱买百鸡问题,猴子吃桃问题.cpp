#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.����7�ı�����ͣ��7�ı���֮ǰ(continue,break֪ʶ��)
	int i;
	for(i=1;i<=100;i++)
	{
		if(i%7==0)
		{
			continue;//��������ѭ��
			break;//����ѭ��
		}	
		printf("%d\n",i);
	}


	//2.���ʮ��hello world(do while֪ʶ��)
	int i;
	i = 1;
	do
	{
		printf("Hello World!\n");
		i++;
	}
	while(i<=10);


	//3.��do whileѭ�����1~100�ۼӺ�
	int i,sum;
	i = 1;sum = 0;
	do
	{
		sum += i;
		i++;
	}
	while(i<=100);
	printf("\"%d\"���ۼӺ�Ϊ\"%d\".\n",i,sum);


	//4.���100~200֮���ȫ������
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
			printf("\"%d\"Ϊ����\n",i);
		}
	}


	//5.��������1��20֮�䲻���Ա�3��������(��continue���ʵ��)
	int i;
	for(i=1;i<=20;i++)
	{
		if(i%3==0)
		{
			continue;
		}
		printf("%d\n",i);
	}


	//6.��100������������֮��
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
	printf("���������ۼӺ�Ϊ\"%d\"\n",sum);


	//7.��������������,�������Լ������С������
	int a,b,r;
	printf("�������һ������");
	scanf("%d",&a);
	printf("������ڶ�������");
	scanf("%d",&b);
	r = a%b;//45 15
	while(r!=0)
	{
		a = b;
		b = r;
		r = a%b;
	}
	printf("���Լ��Ϊ\"%d\"\n",b);


	//8.�û��Ӽ�������һ���ַ��������ʱ������ͳ�ƴ�д��ĸ.Сд��ĸ.���ּ������ַ��ĸ�����
	char c;
	int dw=0,xw=0,n=0,o=0;
	printf("������һ���ַ�����");
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
	printf("��д��ĸ��%d�� Сд��ĸ��%d�� ������%d�� �����ַ���%d��\n",dw,xw,n,o);
	
	
	//9.��Ǯ��ټ����⣺����ÿֻ5Ԫ��ĸ��ÿֻ3Ԫ��С��һԪ3ֻ���������.ĸ��.С��������ֻ��
	int g,m,x;
	for(g=0;g<=20;g++)
	{
		for(m=0;m<=33;m++)
		{
			for(x=0;x<=300;x++)
			{
				if(5*g + 3*m + 1.0/3*x == 100)
				{
					printf("������\"%d\"ֻ ĸ����\"%d\" С����\"%d\"\n",g,m,x);
				}
			}
		}
	}
	
	
	//10.��1.2.3.4��ɸ�λ����ͬ����λ����
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
	
	
	//11.���ӳ������⣺���ӵ�һ��ժ���������ӣ�����һ���һ�����Ժ�ÿ�춼��ǰһ��ʣ�µĶ�һ��������10��ʱ��ֻʣ��1�����ӡ��ʣ���һ��ժ�˶������ӣ�
	///*
	int last=1,day=10;
	while(day>1)
	{
		day--;
		last = (last+1)*2;
		printf("��%d�� ��ʣ��%d������\n",day,last);
	}
	//*/


	system("pause");
}