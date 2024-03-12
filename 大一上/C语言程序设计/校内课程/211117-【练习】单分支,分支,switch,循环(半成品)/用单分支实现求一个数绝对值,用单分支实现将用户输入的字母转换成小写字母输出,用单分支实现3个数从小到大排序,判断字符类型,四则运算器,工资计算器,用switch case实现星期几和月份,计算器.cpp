#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	//1.用单分支实现求一个数绝对值
	int x,_x;
	printf("请输入任意一个数：");
	scanf("%d",&x);
	_x = -x;
	if(x>0)
	{
		_x = x;
	}
	printf("\"%d\"的绝对值为\"%d\"\n",x,_x);


	//2.用单分支实现将用户输入的字母转换成小写字母输出
	char c,_c;//c原始字母 _c小写字母
	printf("请输入任意一个字母：");
	scanf("%c",&c);
	_c = c;
	if(c>='A' && c<='Z');
	{
		_c = c + 32;
	}
	printf("\"%c\"的小写字母为\"%c\"\n",c,_c);


	//3.用单分支实现3个数从小到大排序 
	int a,b,c,x;
	printf("请输入任意第一个数:");
	scanf("%d",&a);
	printf("请输入任意第二个数:");
	scanf("%d",&b);
	printf("请输入任意第三个数:");
	scanf("%d",&c);
	printf("这三个数为:%d %d %d\n",a,b,c);
	if(a<b)
	{
		x = b;
		b = a;
		a = x;
	}
	if(a<c)
	{
		x = c;
		c = a;
		a = x;
	}
	if(b<c)
	{
		x = c;
		c = b;
		b = x;
	}
	printf("这三个数的排序为:%d>%d>%d\n",a,b,c);


	//4.大写 小写 数字 其他字符
	char x;
	printf("请输入任意一个字符：");
	scanf("%c",&x);
	if(x>='A' && x<='Z')
	{
		printf("\"%c\"为大写字母\n",x);
	}
	else if(x>='a' && x<='z')
	{
		printf("\"%c\"为小写字母\n",x);
	}
	else if(x>='0' && x<='9')
	{
		printf("\"%c\"为数字\n",x);
	}
	else
		printf("\"%c\"为其他字符\n",x);
	

	//5.四则运算器
	float a,b,d;
	char c;
	printf("请输入一个四则运算：");
	scanf("%f%c%f",&a,&c,&b);
	if(c=='+')
	{
		d = a + b;
		printf("%.2f + %.2f = %.2f\n",a,b,d);
	}
	else if(c=='-')
	{
		d = a - b;
		printf("%.2f - %.2f = %.2f\n",a,b,d);
	}
	else if(c=='*')
	{
		d = a * b;
		printf("%.2f × %.2f = %.2f\n",a,b,d);
	}
	else if(c=='/')
	{
		d = a / b;
		printf("%.2f ÷ %.2f = %.2f\n",a,b,d);
	}
	else
	{
		printf("非法输入\n");
	}


	//6.工资=基本工资+提成
	float sale,s,d;//sale销售额 s工资 d提成
	s = 1000,d = 0;
	printf("请输入一个销售额：");
	scanf("%f",&sale);
	if(sale<10000)
	{
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale<=10000 && sale>=20000)
	{
		d = (sale - 10000) * 0.05;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale>20000 && sale<=50000)
	{
		d = (sale - 20000) * 0.06;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale>50000 && sale<=100000)
	{
		d = (sale - 50000) * 0.07;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}
	else if(sale>100000)
	{
		d = (sale - 100000) * 0.08;
		printf("您的工资为:%.2f 提成为:%.2f 销售额:%.2f\n",s+d,d,sale);
	}


	//7.用switch case实现以下内容
		//7.1 1-7对应星期几
		char x;
		printf("请输入任意一个1-7的数字：");
		scanf("%c",&x);
		switch(x)
		{
		case '1':printf("\"%c\"为星期一\n",x);break;
		case '2':printf("\"%c\"为星期二\n",x);break;
		case '3':printf("\"%c\"为星期三\n",x);break;
		case '4':printf("\"%c\"为星期四\n",x);break;
		case '5':printf("\"%c\"为星期五\n",x);break;
		case '6':printf("\"%c\"为星期六\n",x);break;
		case '7':printf("\"%c\"为星期日\n",x);break;
		default:printf("非法输入！\n");break;
		}

		//7.2 1-12对应几月份
		int x;
		printf("请输入任意一个1-12的数字：");
		scanf("%d",&x);
		switch(x)
		{
		case 1:printf("\"%d\"为1月\n",x);break;
		case 2:printf("\"%d\"为2月\n",x);break;
		case 3:printf("\"%d\"为3月\n",x);break;
		case 4:printf("\"%d\"为4月\n",x);break;
		case 5:printf("\"%d\"为5月\n",x);break;
		case 6:printf("\"%d\"为6月\n",x);break;
		case 7:printf("\"%d\"为7月\n",x);break;
		case 8:printf("\"%d\"为8月\n",x);break;
		case 9:printf("\"%d\"为9月\n",x);break;
		case 10:printf("\"%d\"为10月\n",x);break;
		case 11:printf("\"%d\"为11月\n",x);break;
		case 12:printf("\"%d\"为12月\n",x);break;
		default:printf("非法输入！\n");break;
		}

		//7.3 计算器功能
		float a,b,d;
		char c;
		printf("请输入一个四则运算：");
		scanf("%f%c%f",&a,&c,&b);
		switch(c)
		case +
		{
			d = a + b;
			printf("%.2f + %.2f = %.2f\n",a,b,d);
		}
		else if(c=='-')
		{
			d = a - b;
			printf("%.2f - %.2f = %.2f\n",a,b,d);
		}
		else if(c=='*')
		{
			d = a * b;
			printf("%.2f × %.2f = %.2f\n",a,b,d);
		}
		else if(c=='/')
		{
			d = a / b;
			printf("%.2f ÷ %.2f = %.2f\n",a,b,d);
		}
		else
		{
			printf("非法输入\n");
		}

		
		//7.4 百分制与等级制的转换(优良中及格不及格)


	system("pause");
}