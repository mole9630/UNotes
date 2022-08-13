#include"stdafx.h"
#include<stdlib.h>
#include<stdio.h>

int main()
{
	char ch;
	ch = getchar();
	putchar(ch);

	printf("%8s%8s\n","姓名","年龄");
	printf("%8s%8d\n","张三",20);
	printf("%8s%8d\n","王小二",19);

	float x = 2.5;
	printf("%f\n",x);

	//精度
	printf("%s\n","Hello World!");
	printf("%.5s\n","Hello World!");
	
	//
	int a,b;
	char c,d;
	scanf("%d%c%d%c",&a,&c,&b,&d);
	printf("%d,%d\n",a,b);
	printf("%c,%c\n",c,d);


	//1.为使得a=1,b=2,c=‘A’,d=5.5,在键盘上如何输入？
	int a,b;
	float d;
	char c;
	scanf("%d%d%f%c%c",&a,&b,&d,&c,&c);
	printf("a=%d,b=%d,c=%c,d=%f\n",a,b,c,d);


	//编程，要求从键盘输入数据，使得整型变量a=20，b=18；字符变量c1=‘N’，c2=‘n’；实型变量x=13.21,y=65.534。按下面输出格式进行输出（即显示的结果如下）：
	//int a=20,b=18
	//char c1=N,c2=n
	//float x=13.21,y=64.534.
	int a,b;
	float x,y;
	char c1,c2;
	scanf("%d%d%f%f%c%c",&a,&b,&x,&y,&c1,&c2);
	printf("int a=%d,b=%d\nfloat x=%.2f,y=%.2f\nchar c1=%c,c2=%c\n",a,b,x,y,c1,c2);


	//编程:读入三个双精度数,求它们的平均值并保留此平均数小数点最后一位数,对小数点后第二位数进行四舍五入，最后输出结果。
	double x,y,z;
	double ave;
	scanf("%lf%lf%lf",&x,&y,&z);
	ave = (x + y + z)/3;
	ave = (ave*10+0.5)/10;
	printf("它们的平均值为:%.1lf",ave);


	//输入三个同学的姓名(宽度8)，性别(宽度3)，家庭地址(宽度20)，联系方式(宽度15)
	printf("%8s%8s%20s%15s\n","姓名","性别","家庭住址","联系方式");
	printf("%8s%8s%20s%15s\n","王二","女","上海市静安区","13800000000");
	printf("%8s%8s%20s%15s\n","张三","男","北京市朝阳区","13800000001");
	printf("%8s%8s%20s%15s\n","李四","女","重庆市渝中区","13800000002");


	//判断用户输入的数是否为正数
	float x;
	printf("请输入任意一个数:");
	scanf("%f",&x);
	if(x>0)
		printf("\"%f\"为正数\n",x);
	else
		printf("\"%f\"为负数\n",x);


	//判断用户输入的数是否是7的倍数
	int x;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	if(x%7==0)
		printf("\"%d\"是7的倍数\n",x);
	else
		printf("\"%d\"不是7的倍数\n",x);


	//判断用户从键盘输入的数是奇数还是偶数
	int x;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	if(x%2==0)
		printf("\"%d\"是偶数\n",x);
	else
		printf("\"%d\"是奇数\n",x);


	//判断用户从键盘上输入的数是否是5和3的倍数
	int x;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	if(x%3==0 && x%5==0)
		printf("\"%d\"是3和5的倍数\n",x);
	else
		printf("\"%d\"不是3和5的倍数\n",x);


	//判断用户从键盘上输入的字母是否是大写字母
	char x,_x;
	printf("请输入任意一个字母:");
	scanf("%c",&x);
	if(x>=65 && x<=90)
		printf("\"%c\"是大写字母\n",x);
	else
	{
		_x = x + 32;
		printf("\"%c\"不是大写字母,且大写字母为\"%c\"\n",x,_x);
	}


	//判断用户输入的是否是水仙花数。  如： 153==1*1*1+5*5*5+3*3*3
	int x,a,b,c;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	a = x /100;//百位
	b = x /10 % 10;//十位
	c = x % 10;//个位
	if(x==a*a*a+b*b*b+c*c*c)
	{
		printf("\"%d\"是水仙花数\n",x);
	}
	else
	{
		printf("\"%d\"不是水仙花数\n",x);
	}


	//用户从键盘输入两个数，输出其中的大数
	int x,y;
	printf("请输入任意两个数:\n");
	scanf("%d%d",&x,&y);
	if(x>y)
		printf("\"%d\"为大数\n",x);
	else
		printf("\"%d\"为大数\n",y);


	//用户从键盘输入身高和体重,计算BMI的值(体质指数(BMI)=体重(kg)/身高 (m)^2)，如果BMI的值在18.5－23.9 之间，输出BMI值正常，否则输出BMI值不正常
	float h,w,bmi;
	printf("请输入分别输入身高(m)和体重(kg):\n");
	scanf("%f%f",&h,&w);
	bmi = w / (h * h);
	if(bmi>=18.5 && bmi<=23.9)
		printf("你的BMI至为:\"%.2f\",BMI正常\n",bmi);
	else
		printf("你的BMI至为:\"%.2f\",BMI不正常\n",bmi);
	

	//判断用户输入的年份是闰年还是平年（能够被4整除并且不能被100整除或者能够被400整除）
	int year;
	printf("请输入任意一个年份:");
	scanf("%d",&year);
	if(year%4==0 && year%100!=0 || year%400==0)
		printf("\"%d\"是闰年\n",year);
	else
		printf("\"%d\"是平年\n",year);


	//如果用户输入的是大写字母将其转换为小写字母输出；如果用户输入的是小写字母将其转换为大写字母输出
	char x,_x;
	printf("请输入任意一个字母:");
	scanf("%c",&x);
	if(x>=65 && x<=90)
	{
		_x = x + 32;
		printf("\"%c\"是大写字母,且小写字母为\"%c\"\n",x,_x);
	}
	if(x>=97 && x<=122)
	{
		_x = x - 32;
		printf("\"%c\"是小写字母,且大写字母为\"%c\"\n",x,_x);
	}

	system("pause");
}