#include<stdio.h>

//1 ָ��
//����*�����ַ ��*�����ַ���ֵ 
//*
int main()
{
	int x=5;
	int *p;//����ָ�����
	p = &x;
	printf("x=%d\n",*p);//"*"Ϊָ�������
	printf("x=%d\n",*&x);//"*"ȡ&x��ַ���ֵ
	
	*p = 6; 
	printf("x=%d\n",x);
}
//*/


//2 ͨ��ָ���ֵʵ����������
//�����Ĳ������ݷ�Ϊ:ֵ���� ��ַ���� 
	//2.1 ֵ���� 
	//*
	void swap(int,int);//����������/����ԭ�� 
	
	int main()
	{
		int x=5,y=10;
		swap(x,y);//�����ĵ���
		printf("x=%d y=%d\n",x,y); 
	}
	void swap(int x,int y)//�����Ķ��� 
	{
		int t;
		t = x;
		x = y;
		y = t;
	}
	//*/
	
	//2.2 ��ַ����
	//*
	void swap(int*,int*);//����������/����ԭ�� 
	
	int main()
	{
		int x=5,y=10;
		swap(&x,&y);//�����ĵ���
		printf("x=%d y=%d\n",x,y); 
	}
	void swap(int *x,int *y)//�����Ķ��� 
	{
		int t;
		t = *x;
		*x = *y;
		*y = t;
	}
	//*/


//3 ���������(��ַ����) 
//*
void sort(int*,int);

int main()
{
	int a[10]={2,8,5,1,7,9,3,6,4,0},i;
	sort(a,10);//10ָʮ���� 
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


//4 ��ָ�������������
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
		//printf("%d\n",*p++);//p++��ı���p��ֵ 
	}
}
//*/


//5 ��n�Ľ׳�(n!:5!=5*4*3*2*1)(�����ĵݹ����(���ú�������))
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
		//5*4*3*2*1(n=1����ѭ��)
	}
}
int main()
{
	int n;
	printf("������һ����:");
	scanf("%d",&n);
	printf("%d!=%d\n",n,fact(n));
}
//*/


//6 n�����(5=5+4+3+2+1)(�����ĵݹ����(���ú�������))
//*
int add(int n)
{
	int s;
	if(n==1)//���n<3Ҳ��д��n==3,s=6. 
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
		//5+4+3+2+1(n=1����ѭ��)
	}
}
int main()
{
	int n;
	printf("������һ����:");
	scanf("%d",&n);
	printf("%d�����Ϊ:%d\n",n,add(n));
}
//*/


//7 ���ӳ���(ÿ���һ���һ��,��ʮ��ʣ1��)
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
	printf("��%d������\n",judge_number(1));
}
//*/


	//7.1 ���ӳ���(ÿ���һ���һ��,����) 
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
		printf("***������ڼ��컹ʣ��������***\n");
		printf("����������:");
		scanf("%d",&d);
		printf("�������%d��ʣ�¼�������:",d);
		scanf("%d",&n);
		printf("��%d������\n",judge_number(n));
	}
	//*/


//����ͷ�ļ�-�����Լ������С������ 
//*
#include "test_number.h"

int main()
{
	int x,y;
	printf("�������һ����:");
	scanf("%d",&x);
	printf("������ڶ�����:");
	scanf("%d",&y);
	printf("%d��%d�����Լ����%d\n",x,y,zdgys(x,y));
	printf("%d��%d����С��������%d\n",x,y,zxgbs(x,y));
}
//*/
