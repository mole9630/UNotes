#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>
#define PI 3.1415926535

int main()
{
	//1�������������������֮�͡�
	/*
	int a,b,c;
	printf("�������һ������");
	scanf("%d",&a);
	printf("������ڶ�������");
	scanf("%d",&b);
	printf("���������������");
	scanf("%d",&c);
	printf("%d+%d+%d=%d/n",a,b,c,a+b+c);
	*/

	//2����֪Բ�뾶Ϊ5��������Բ���ܳ��������
	/*
	float r;
	printf("������Բ�İ뾶��");
	scanf("%f",&r);
	printf("�뾶Ϊ%f��Բ���ܳ�Ϊ:%f,���Ϊ:%f\n",r,2*PI*r,PI*r*r);
	*/

	//3���Ӽ�������һ����д��ĸ�������Ӧ��Сд��ĸ��
	/*
	char wordd,wordx;
	printf("����������һ����д��ĸ��");
	scanf("%c",&wordd);
	wordx = wordd + 32;
	printf("��д��ĸ\"%c\"��Сд��ĸΪ\"%c\"\n",wordd,wordx);
	*/

	//4���û��Ӽ����������϶ȣ������Ӧ�Ļ��϶�ֵ
	float c,f;
	printf("���������϶�(��)��");
	scanf("%f",&c);
	f = 32 + c * 1.8;
	printf("���϶�%f���Ӧ�Ļ��϶�Ϊ:%f",c,f);

	system("pause");
}