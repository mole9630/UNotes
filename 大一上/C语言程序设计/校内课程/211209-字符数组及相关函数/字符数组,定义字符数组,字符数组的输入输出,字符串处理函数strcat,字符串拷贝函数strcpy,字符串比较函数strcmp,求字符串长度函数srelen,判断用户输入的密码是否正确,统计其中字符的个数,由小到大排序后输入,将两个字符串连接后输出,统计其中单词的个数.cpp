#include <stdio.h>
#include "string.h"//strcat

int main()
{
	//1 字符数组
	//*
	char ch[10]={'a','b','c','d'},i;
	for(i=0;i<4;i++)
	{
		printf("%c ",ch[i]);
	}
	printf("\n");
	//*/


	//2 定义字符数组
	//*
	int i;
	char ch[]="abcd";
	for(i=0;i<4;i++)
	{
		printf("%c ",ch[i]);
	}
	printf("\n");
	//*/


	//3 字符数组的输入输出
	//3.1 scanf & printf
	//*
	char ch1[10],ch2[10];
	printf("请输入一串字符串:"); 
	scanf("%s",ch1);//数组名称表示数组的首地址
	printf("%s\n",ch1);
	//*/
	
	//3.2 gets & puts
	//*
	char ch1[10],ch2[10];
	puts("请输入一串字符串:");
	gets(ch2);//ch = getchar();
	puts(ch2);
	//*/

	
	//4 字符串处理函数strcat
	//* 
	char ch1[20]="abc",ch2[10]="hello";
	strcat(ch1,ch2);//ch2的字符串连接到ch1的字符串的后面
	puts(ch1); 
	//*/
	
	
	//5 字符串拷贝函数strcpy
	//* 
	char ch1[20]="abcdefghijklmn",ch2[10]="hello";
	strcpy(ch1,ch2);//把ch2赋值给ch1(替换原来全部的字符) 
	puts(ch1); 
	//*/ 
	
	
	//6 字符串比较函数strcmp
	//* 
	char ch1[20]="abc",ch2[10]="hello";
	printf("%d\n",strcmp(ch1,ch2));//小于返回-1 等于返回0 大于返回1  
	//if(strcmp(ch1,ch2)==0)//即字符串相等 
	//*/ 
	
	
	//7 求字符串长度函数srelen
	//*
	char ch1[20]="abc",ch2[10]="hello";
	printf("%d\n",strlen(ch1)); 
	printf("%d\n",sizeof(ch1));
	//*/
	
	
	//8 判断用户输入的密码是否正确
	//*
	char password[20]="test123",_password[20]; 
	puts("请输入密码:");
	gets(_password);
	if(strcmp(_password,password)==0)
	{
		puts("密码正确"); 
	} 
	else
	{
		puts("密码错误");
	}
	//*/
	
	
	//9 输入一串字符,统计其中字符的个数
	//*
	char ch[20];
	gets(ch);
	printf("%d\n",strlen(ch));
	//*/
	
	
	//10 输入三个字符,由小到大排序后输入
	//*
	char ch1[20],ch2[20],ch3[20],t[20];
	puts("请输入字符:");
	gets(ch1);
	puts("请输入字符:");
	gets(ch2);
	puts("请输入字符:");
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
	printf("排序为:%s > %s > %s",ch1,ch2,ch3);
	//*/
	
	
	//11 输入两串字符,将两个字符串连接后输出
	//*
	char ch1[20],ch2[20];
	puts("请输入字符:");
	gets(ch1);
	puts("请输入字符:");
	gets(ch2);
	strcat(ch1,ch2);
	puts(ch1);
	//*/
	
	
	//12 输入一串字符,统计其中单词的个数
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
	printf("单词的个数有%d个\n",c+1); 
	//*/ 
	}
