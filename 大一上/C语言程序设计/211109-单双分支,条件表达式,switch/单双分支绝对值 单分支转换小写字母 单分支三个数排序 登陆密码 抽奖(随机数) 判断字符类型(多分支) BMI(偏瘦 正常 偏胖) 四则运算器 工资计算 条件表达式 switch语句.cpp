#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.˫��֧����ֵ
	int x,abs;
	printf("����������һ����:");
	scanf("%d",&x);
	if(x>=0)
	{
		abs = x;
	}
	else
	{
		abs = -x;
	}
	printf("\"%d\"�ľ���ֵ��\"%d\"\n",x,abs);


	//2.����֧�����ֵ
	int x,abs;
	printf("����������һ����:");
	scanf("%d",&x);
	abs = x;
	if(x<=0)//����֧
	{
		abs = -x;
	}
	printf("\"%d\"�ľ���ֵ��\"%d\"\n",x,abs);
	

	//3.����֧ת��Сд��ĸ
	char w,sw;
	printf("����������һ����ĸ��");
	scanf("%c",&w);
	sw = w;
	if(w>=65 && w<=90)//(ch>='A' && ch<='Z')
	{
	sw = w + 32;
	}
	printf("\"%c\"��Сд��ĸΪ\"%c\"\n",w,sw);


	//����֧����������
	int a,b,c,t;//�����������
	printf("�����������һ����:");
	scanf("%d",&a);
	printf("����������ڶ�����:");
	scanf("%d",&b);
	printf("�����������������:");
	scanf("%d",&c);
	printf("��������Ϊ:%d %d %d\n",a,b,c);
	if(a>b)//��a�д�ŵ���a,b����С����
	{
		t = a;
		a = b;
		b = t;
	}
	if(a>c)//��a�д�ŵ���a,b,c����С����
	{
		t = a;
		a = c;
		c = t;
	}
	if(b>c)//��b�д�ŵ���b,c����С����
	{
		t = b;
		b = c;
		c = t;
	}
	printf("��������������Ϊ:%d>%d>%d\n",a,b,c);


	//4.��½����
	int x = 123321;//��ȷ����
	int y;
	printf("����������:");
	scanf("%d",&y);
	if(x==y)
	{
		printf("������ȷ!\n");
	}
	else
	{
		printf("�������!\n");
	}


	//5.�齱(1-10)(�����֪ʶ��)
	int x,y,z,sum;
	x = rand()%10;
	y = rand()%10;
	z = rand()%10;
	sum = x + y + z;
	printf("���еĺ���Ϊ:%d,%d,%d\n",x,y,z);
	if(sum<=5)
	{
		printf("��ϲ����һ�Ƚ�\n");
	}
	if(sum>5 && sum<=15)
	{
		printf("��ϲ���ж��Ƚ�\n");
	}
	if(sum>15 && sum<=30)
	{
		printf("δ�н�\n");
	}


	//6.�ж��ַ�����(���֧)
	char c;
	printf("����������һ���ַ���");
	scanf("%c",&c);	
	if(c>='A' && c<='Z')
	{
		printf("\"%c\"Ϊ��д��ĸ\n",c);
	}
	else if(c>='a' && c<='z')
	{
		printf("\"%c\"ΪСд��ĸ\n",c);
	}
	else if(c>='0' && c<='9')
	{
		printf("\"%c\"Ϊ��������\n",c);
	}
	else
	{
		printf("\"%c\"Ϊ�����ַ�����\n",c);
	}


	//7.BMI(ƫ�� ���� ƫ��)(<18ƫ�� 18-23.5���� >23.5ƫ��)
	float h,w,bmi;
	printf("������ֱ��������(m)������(kg):\n");
	scanf("%f%f",&h,&w);
	bmi = w / (h * h);
	if(bmi<=18)
	{
		printf("���BMI��Ϊ:\"%.2f\",����ƫ��\n",bmi);
	}
	else if(bmi>18 && bmi<23.5)
	{
		printf("���BMI��Ϊ:\"%.2f\",��������\n",bmi);
	}
	else if(bmi>=23.5)
	{
		printf("���BMI��Ϊ:\"%.2f\",����ƫ��\n",bmi);
	}
	else
	{
		printf("���BMI��Ϊ:\"%.2f\",�����޷��ж�\n",bmi);
	}


	//����������(�û�����:�����������������)
	float num1,num2;
	char c;
	printf("*****��ӭʹ���������������*****\n");
	printf("������һ����������ʽ:");
	scanf("%f%c%f",&num1,&c,&num2);
	//printf("num1=%.2f,num2=%.2f,c=%c\n",num1,num2,c);//������
	if(c=='+')
	{
		printf("%.2f+%.2f=%.2f\n",num1,num2,num1+num2);
	}
	else if(c=='-')
	{
		printf("%.2f-%.2f=%.2f\n",num1,num2,num1-num2);
	}
	else if(c=='*')
	{
		printf("%.2f��%.2f=%.2f\n",num1,num2,num1+num2);
	}
	else if(c=='/')
	{
		printf("%.2f��%.2f=%.2f\n",num1,num2,num1/num2);
	}
	else
	{
		printf("�������������ԣ�\n");
	}


	//���x>0 y=1;���x=0 y=0;���x<0 y=-1
	int x,y;
	printf("����������һ����:");
	scanf("%d",&x);
	if(x>0)
	{
		y=1;
	}
	else if(x=0)
	{
		y=0;
	}
	else if(x<0)
	{
		y=-1;
	}
	printf("x=%d y=%d\n",x,y);


	//����=��������+���
	float sale,s,d;
	s = 1000;//��������
	printf("���������۶�:");
	scanf("%f",&sale);
	if(sale<10000)
	{
		printf("���Ĺ���Ϊ:%.2f ���Ϊ:%.2f ���۶�:%.2f\n",s+d,d,sale);
	}
	else if(sale>=20000)
	{
		d = (sale - 10000) * 0.05;
		printf("���Ĺ���Ϊ:%.2f ���Ϊ:%.2f ���۶�:%.2f\n",s+d,d,sale);
	}
	else if(sale<=50000 && sale>20000)
	{
		d = (sale - 20000) * 0.06;
		printf("���Ĺ���Ϊ:%.2f ���Ϊ:%.2f ���۶�:%.2f\n",s+d,d,sale);
	}
	else if(sale<=100000 && sale>50000)
	{
		d = (sale - 50000) * 0.07;
		printf("���Ĺ���Ϊ:%.2f ���Ϊ:%.2f ���۶�:%.2f\n",s+d,d,sale);
	}
	else
	{
		d = (sale - 100000) * 0.08;
		printf("���Ĺ���Ϊ:%.2f ���Ϊ:%.2f ���۶�:%.2f\n",s+d,d,sale);
	}


	//�������ʽ ��1
	int x,abs;
	scanf("%d",&x);
	abs = x >0 ?x : -x;//�������ʽ(���ʽ1 ? ���ʽ2 : ���ʽ3 (����˫��֧)(���ʽ1���� �� ���ʽ2 ���� ���ʽ3))
	printf("\"%d\"�ľ���ֵ��\"%d\"\n",x,abs);


	//�������ʽ ��2
	int x,y,max;
	scanf("%d%d",&x,&y);
	max = x>y ? x :y;
	printf("\"%d\"��\"%d\"�����ֵ��\"%d\"\n",x,y,max);


	//switch��� P73
	float num1,num2;
	char c;
	printf("*****��ӭʹ���������������*****\n");
	printf("������һ����������ʽ:");
	scanf("%f%c%f",&num1,&c,&num2);
	//printf("num1=%.2f,num2=%.2f,c=%c\n",num1,num2,c);//������
	switch(c)
	{
	case '+':printf("%.2f+%.2f=%.2f\n",num1,num2,num1+num2);break;
	case '-':printf("%.2f-%.2f=%.2f\n",num1,num2,num1-num2);break;
	case '*':printf("%.2f��%.2f=%.2f\n",num1,num2,num1*num2);break;
	case '/':printf("%.2f��%.2f=%.2f\n",num1,num2,num1/num2);break;
	default:printf("�������������ԣ�\n");break;
	}

	system("pause");
}