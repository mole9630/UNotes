#include<stdio.h>

 
//1 �ú���ʵ��1-n���(��������) 
//*
int add(int m,int n);//-1 ����������(������洢�ռ�)
void prtStar();//-1 ����������(������洢�ռ�) 

int main()
{
	printf("%d\n",add(3,5));
	prtStar(); 
	return 0;
}
int add(int m,int n)//��ʱ����洢�ռ� 
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


//2 �ж�һ�����Ƿ�Ϊˮ�ɻ���
//*
void judge_prime(int x);//���������� 

int main()
{
	int x;
	printf("������һ����:");
	scanf("%d",&x);
	judge_prime(x);//�����ĵ��� 
}
void judge_prime(int x)//�����Ķ��� 
{
	int i;
	for(i=2;i<x;i++)
		if(x%i==0)
		{
			break;
		}
		if(i==x)
		{
			printf("\"%d\"������",x);
		}
		else
		{
			printf("\"%d\"��������",x);
		}
}
//*/


//3 �ж�������Ǵ�д��ĸ����Сд��ĸ
//* 
void judge_letter(char);

int main()
{
	char c;
	printf("����������һ����ĸ:");
	scanf("%c",&c);
	judge_letter(c);
}
void judge_letter(char x)
{
	if(x>='A' && x<='Z')
	{
		printf("\"%c\"Ϊ��д��ĸ\n",x);
	}
	else if(x>='a' && x<='z')
	{
		printf("\"%c\"ΪСд��ĸ\n",x);
	}
	else
	{
		printf("�Ƿ�����");
	} 
}
//*/


//4 �ú������������ĺ� ƽ����(������Ƕ�׵���)
//* 
int add(int,int,int);
float ave(int,int,int);

int main()
{
	int x,y,z;
	printf("�������һ����:"); 
	scanf("%d",&x);
	printf("������ڶ�����:"); 
	scanf("%d",&y);
	printf("�������������:"); 
	scanf("%d",&z);
	printf("%d,%d,%d�ĺ���:%d\n",x,y,z,add(x,y,z));
	printf("%d,%d,%d��ƽ������:%.2f\n",x,y,z,ave(x,y,z));
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
	ave = add(x,y,z) / 3.0;//������Ƕ�׵��� 
	return ave;
}
//*/


//5 1!+0!+3!+n!�׳����(Ƕ�׵���)
//*
int add(int);//����� 
int fun(int);//��׳� 

int main()
{
	int n,sum;
	printf("������һ����:"); 
	scanf("%d",&n);
	sum = add(n);
	printf("1-%d�Ľ׳�Ϊ:%d\n",n,sum);
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


//6 �������Լ������С������
//���Ʒ 
//*
int zdgys(int,int);
int zxgbs(int,int);

int main()
{
	int x,y;
	printf("�������һ����:"); 
	scanf("%d",&x);
	printf("������ڶ�����:"); 
	scanf("%d",&y);
	printf("%d,%d�����Լ����:%d\n",x,y,zdgys(x,y));
	printf("%d,%d����С��������:%d\n",x,y,zxgbs(x,y));
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
	return x * y / (zdgys(x,y));//������Ƕ�׵��� 
}
//*/ 
