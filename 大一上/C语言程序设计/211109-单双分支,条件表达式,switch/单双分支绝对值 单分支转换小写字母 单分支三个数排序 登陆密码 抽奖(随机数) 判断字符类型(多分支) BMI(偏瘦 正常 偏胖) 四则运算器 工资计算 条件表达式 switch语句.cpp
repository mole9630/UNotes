#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.双分支绝对值
	int x,abs;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	if(x>=0)
	{
		abs = x;
	}
	else
	{
		abs = -x;
	}
	printf("\"%d\"的绝对值是\"%d\"\n",x,abs);


	//2.单分支求绝对值
	int x,abs;
	printf("请输入任意一个数:");
	scanf("%d",&x);
	abs = x;
	if(x<=0)//单分支
	{
		abs = -x;
	}
	printf("\"%d\"的绝对值是\"%d\"\n",x,abs);
	

	//3.单分支转换小写字母
	char w,sw;
	printf("请输入任意一个字母：");
	scanf("%c",&w);
	sw = w;
	if(w>=65 && w<=90)//(ch>='A' && ch<='Z')
	{
	sw = w + 32;
	}
	printf("\"%c\"的小写字母为\"%c\"\n",w,sw);


	//单分支三个数排序
	int a,b,c,t;//输入的三个数
	printf("请输入任意第一个数:");
	scanf("%d",&a);
	printf("请输入任意第二个数:");
	scanf("%d",&b);
	printf("请输入任意第三个数:");
	scanf("%d",&c);
	printf("这三个数为:%d %d %d\n",a,b,c);
	if(a>b)//让a中存放的是a,b中最小的数
	{
		t = a;
		a = b;
		b = t;
	}
	if(a>c)//让a中存放的是a,b,c中最小的数
	{
		t = a;
		a = c;
		c = t;
	}
	if(b>c)//让b中存放的是b,c中最小的数
	{
		t = b;
		b = c;
		c = t;
	}
	printf("这三个数的排序为:%d>%d>%d\n",a,b,c);


	//4.登陆密码
	int x = 123321;//正确密码
	int y;
	printf("请输入密码:");
	scanf("%d",&y);
	if(x==y)
	{
		printf("密码正确!\n");
	}
	else
	{
		printf("密码错误!\n");
	}


	//5.抽奖(1-10)(随机数知识点)
	int x,y,z,sum;
	x = rand()%10;
	y = rand()%10;
	z = rand()%10;
	sum = x + y + z;
	printf("抽中的号码为:%d,%d,%d\n",x,y,z);
	if(sum<=5)
	{
		printf("恭喜抽中一等奖\n");
	}
	if(sum>5 && sum<=15)
	{
		printf("恭喜抽中二等奖\n");
	}
	if(sum>15 && sum<=30)
	{
		printf("未中奖\n");
	}


	//6.判断字符类型(多分支)
	char c;
	printf("请输入任意一个字符：");
	scanf("%c",&c);	
	if(c>='A' && c<='Z')
	{
		printf("\"%c\"为大写字母\n",c);
	}
	else if(c>='a' && c<='z')
	{
		printf("\"%c\"为小写字母\n",c);
	}
	else if(c>='0' && c<='9')
	{
		printf("\"%c\"为数字类型\n",c);
	}
	else
	{
		printf("\"%c\"为其他字符类型\n",c);
	}


	//7.BMI(偏瘦 正常 偏胖)(<18偏瘦 18-23.5正常 >23.5偏胖)
	float h,w,bmi;
	printf("请输入分别输入身高(m)和体重(kg):\n");
	scanf("%f%f",&h,&w);
	bmi = w / (h * h);
	if(bmi<=18)
	{
		printf("你的BMI至为:\"%.2f\",体型偏瘦\n",bmi);
	}
	else if(bmi>18 && bmi<23.5)
	{
		printf("你的BMI至为:\"%.2f\",体型正常\n",bmi);
	}
	else if(bmi>=23.5)
	{
		printf("你的BMI至为:\"%.2f\",体型偏胖\n",bmi);
	}
	else
	{
		printf("你的BMI至为:\"%.2f\",体型无法判断\n",bmi);
	}


	//四则运算器(用户输入:运算数运算符运算数)
	float num1,num2;
	char c;
	printf("*****欢迎使用四则运算计算器*****\n");
	printf("请输入一个四则运算式:");
	scanf("%f%c%f",&num1,&c,&num2);
	//printf("num1=%.2f,num2=%.2f,c=%c\n",num1,num2,c);//调试项
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
		printf("%.2f×%.2f=%.2f\n",num1,num2,num1+num2);
	}
	else if(c=='/')
	{
		printf("%.2f÷%.2f=%.2f\n",num1,num2,num1/num2);
	}
	else
	{
		printf("输入有误，请重试！\n");
	}


	//如果x>0 y=1;如果x=0 y=0;如果x<0 y=-1
	int x,y;
	printf("请输入任意一个数:");
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


	//工资=基本工资+提成
	float sale,s,d;
	s = 1000;//基本工资
	printf("请输入销售额:");
	scanf("%f",&sale);
	if(sale<10000)
	{
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale>=20000)
	{
		d = (sale - 10000) * 0.05;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale<=50000 && sale>20000)
	{
		d = (sale - 20000) * 0.06;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale<=100000 && sale>50000)
	{
		d = (sale - 50000) * 0.07;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else
	{
		d = (sale - 100000) * 0.08;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}


	//条件表达式 例1
	int x,abs;
	scanf("%d",&x);
	abs = x >0 ?x : -x;//条件表达式(表达式1 ? 表达式2 : 表达式3 (简便的双分支)(表达式1满足 则 表达式2 否则 表达式3))
	printf("\"%d\"的绝对值是\"%d\"\n",x,abs);


	//条件表达式 例2
	int x,y,max;
	scanf("%d%d",&x,&y);
	max = x>y ? x :y;
	printf("\"%d\"和\"%d\"的最大值是\"%d\"\n",x,y,max);


	//switch语句 P73
	float num1,num2;
	char c;
	printf("*****欢迎使用四则运算计算器*****\n");
	printf("请输入一个四则运算式:");
	scanf("%f%c%f",&num1,&c,&num2);
	//printf("num1=%.2f,num2=%.2f,c=%c\n",num1,num2,c);//调试项
	switch(c)
	{
	case '+':printf("%.2f+%.2f=%.2f\n",num1,num2,num1+num2);break;
	case '-':printf("%.2f-%.2f=%.2f\n",num1,num2,num1-num2);break;
	case '*':printf("%.2f×%.2f=%.2f\n",num1,num2,num1*num2);break;
	case '/':printf("%.2f÷%.2f=%.2f\n",num1,num2,num1/num2);break;
	default:printf("输入有误，请重试！\n");break;
	}

	system("pause");
}