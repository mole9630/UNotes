#include <stdio.h>
#include "string.h"//strcat

int main()
{
	//1 �ַ�����
	//*
	char ch[10]={'a','b','c','d'},i;
	for(i=0;i<4;i++)
	{
		printf("%c ",ch[i]);
	}
	printf("\n");
	//*/


	//2 �����ַ�����
	//*
	int i;
	char ch[]="abcd";
	for(i=0;i<4;i++)
	{
		printf("%c ",ch[i]);
	}
	printf("\n");
	//*/


	//3 �ַ�������������
	//3.1 scanf & printf
	//*
	char ch1[10],ch2[10];
	printf("������һ���ַ���:"); 
	scanf("%s",ch1);//�������Ʊ�ʾ������׵�ַ
	printf("%s\n",ch1);
	//*/
	
	//3.2 gets & puts
	//*
	char ch1[10],ch2[10];
	puts("������һ���ַ���:");
	gets(ch2);//ch = getchar();
	puts(ch2);
	//*/

	
	//4 �ַ���������strcat
	//* 
	char ch1[20]="abc",ch2[10]="hello";
	strcat(ch1,ch2);//ch2���ַ������ӵ�ch1���ַ����ĺ���
	puts(ch1); 
	//*/
	
	
	//5 �ַ�����������strcpy
	//* 
	char ch1[20]="abcdefghijklmn",ch2[10]="hello";
	strcpy(ch1,ch2);//��ch2��ֵ��ch1(�滻ԭ��ȫ�����ַ�) 
	puts(ch1); 
	//*/ 
	
	
	//6 �ַ����ȽϺ���strcmp
	//* 
	char ch1[20]="abc",ch2[10]="hello";
	printf("%d\n",strcmp(ch1,ch2));//С�ڷ���-1 ���ڷ���0 ���ڷ���1  
	//if(strcmp(ch1,ch2)==0)//���ַ������ 
	//*/ 
	
	
	//7 ���ַ������Ⱥ���srelen
	//*
	char ch1[20]="abc",ch2[10]="hello";
	printf("%d\n",strlen(ch1)); 
	printf("%d\n",sizeof(ch1));
	//*/
	
	
	//8 �ж��û�����������Ƿ���ȷ
	//*
	char password[20]="test123",_password[20]; 
	puts("����������:");
	gets(_password);
	if(strcmp(_password,password)==0)
	{
		puts("������ȷ"); 
	} 
	else
	{
		puts("�������");
	}
	//*/
	
	
	//9 ����һ���ַ�,ͳ�������ַ��ĸ���
	//*
	char ch[20];
	gets(ch);
	printf("%d\n",strlen(ch));
	//*/
	
	
	//10 ���������ַ�,��С�������������
	//*
	char ch1[20],ch2[20],ch3[20],t[20];
	puts("�������ַ�:");
	gets(ch1);
	puts("�������ַ�:");
	gets(ch2);
	puts("�������ַ�:");
	gets(ch3);
	if(strcmp(ch1,ch2)>0)
	{
		strcpy(t,ch1);
		strcpy(ch1,ch2);
		strcpy(ch2,t);
	}
	if(strcmp(ch1,ch3)>0)
	{
		strcpy(t,ch1);
		strcpy(ch1,ch3);
		strcpy(ch3,t);
	}
	if(strcmp(ch2,ch3)>0)
	{
		strcpy(t,ch2);
		strcpy(ch2,ch3);
		strcpy(ch3,t);
	}
	//puts(ch1);
	//puts(ch2);
	//puts(ch3);
	printf("����Ϊ:%s > %s > %s",ch1,ch2,ch3);
	//*/
	
	
	//11 ���������ַ�,�������ַ������Ӻ����
	//*
	char ch1[20],ch2[20];
	puts("�������ַ�:");
	gets(ch1);
	puts("�������ַ�:");
	gets(ch2);
	strcat(ch1,ch2);
	puts(ch1);
	//*/
	
	
	//12 ����һ���ַ�,ͳ�����е��ʵĸ���
	//*
	char ch[20],i=0,c=0;
	gets(ch);
	while(ch[i]!='\0')
	{
		if(ch[i]==' ')
		{
			c++;
			i++;
		}
	}
	printf("���ʵĸ�����%d��\n",c+1); 
	//*/ 
	}
