#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//��λ���� �����λʮλ��λ
	/*
	int x,a,b,c;
	printf("������3λ������");
	scanf("%d",&x);
	a = x / 100;
	b = x / 10 % 10;
	c = x % 10;
	printf("����%d�İ�λΪ:%d,ʮλΪ:%d,��λΪ:%d\n",x,a,b,c);
	*/

	//410���� ���xСʱx����
	/*
	int x,h,m;
	printf("�������������");
	scanf("%d",&x);
	h = x / 60;
	m = x % 60;
	printf("%d����=%dСʱ%d����\n",x,h,m);
	*/

	//��������
	/*
	int x=9,y=6,z;
	z = x;
	x = y;
	y = z;
	printf("x=%d,y=%d\n",x,y);
	*/

	//���ű��ʽ
	/*
	int x,i;
	x = (i=4,i+5,i+2);
	printf("x=%d\n",x);
	*/

	//����ת��(�Զ�ת��)
	/*
	int x = 5;
	float y = 1.2;
	char z = 'A';
	float sum;
	sum = x + y + z;//A=65
	printf("�ܺ͵���:%f\n",sum);
	*/
	
	//ǿ��ת��
	/*
	float x = 2.55;
	printf("x=%d\n",(int)x);//(int)xǿ������ת��
	*/

	//��ϵ����(>,>=,<,<=,==,!=)
	/*
	printf("%d\n",3<5);//1��ʾ��
	printf("%d\n",3==5);//0��ʾ��
	printf("%d\n",3!=5);//1��ʾ��
	*/

	//�ж�ƽ������
	/*
	int year;
	printf("���������:");
	scanf("%d",&year);
	if(year%4==0 && year%100!=0 || year%400==0)//"!"��,"&&"��,"||"��.
    printf("%d��������\n",year);
	else
    printf("%d����ƽ��\n",year);
	*/

	//�ж���ż�����ó�����ֵ
	int number,_number;
	printf("������һ������:");
	scanf("%d",&number);
	_number = number * -1;//number = 0 - number / -number / if(x>0);
	if(number%2==0)
		printf("%d��ż��,�����ֵΪ:%d\n",number,_number);
	else
		printf("%d������,�����ֵΪ:%d\n",number,_number);


	system("pause");
	return 0;
}