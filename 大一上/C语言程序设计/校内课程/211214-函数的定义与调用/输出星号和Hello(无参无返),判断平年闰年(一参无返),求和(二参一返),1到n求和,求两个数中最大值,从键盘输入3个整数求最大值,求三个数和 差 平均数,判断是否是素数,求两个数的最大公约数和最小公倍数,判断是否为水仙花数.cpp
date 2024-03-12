#include<stdio.h>

//1 输出星号和Hello(无参无返回值)
void prtStar()
{
	printf("*******\n");
}
void prtHello()
{
	printf("Hello\n");
}
int main()
{
	prtStar(); 
	prtHello();
	prtStar();
} 
	

//2 判断年份是平年闰年(一个参数无返回值)
void judge_year(int y)//函数定义 形式参数(形参)
{
	if(y%4==0 && y%100!=0 || y%400==0)
	{
		printf("%d是闰年",y);
	} 
	else
	{
		printf("%d是平年",y);
	}
} 
int main()
{
	int year;
	printf("请输入一个年份:");
	scanf("%d",&year);
	judge_year(year);//函数调用 实际参数(实参) 
} 


//3 求和(二个参数一个返回值)
int add(int x,int y)
{
	int sum;
	sum = x + y;
	return sum;
}
int main()
{
	int x,y;
	printf("请输入第一个要计算的数:");
	scanf("%d",&x);
	printf("请输入第二个要计算的数:");
	scanf("%d",&y);
	printf("%d + %d = %d\n",x,y,add(x,y));
} 

	
//4 用函数实现1到n求和，n由键盘在主函数中输入。
int add_n(int n)
{
	int i,sum=0;
	for(i=0;i<=n;i++)
	{
		sum += i;
	}
	return sum;
} 
int main()
{
	int n;
	printf("请输入n的值:");
	scanf("%d",&n);
	printf("1 到 %d 的求和结果为:%d\n",n,add_n(n));
}


//5 编写求两个数中最大值的函数，并在main函数中调用
int max(int x,int y)
{
	int max;
	if(x>y)
	{
		max = x;
	}
	else
	{
		max = y;
	}
	return max;
}
int main()
{
	int x,y;
	printf("请输入第一个要判断大小的数:");
	scanf("%d",&x);
	printf("请输入第二个要判断大小的数:");
	scanf("%d",&y);
	printf("\"%d\"与\"%d\"中最大值为:%d",x,y,max(x,y));
}


//6 从键盘输入3个整数，求他们中的最大者，用函数调用实现。
int max(int x,int y,int z)
{
	int max;
	max = x;
	if(max<y)
	{
		max = y;
	}
	if(max<z)
	{
		max = z;
	}
	return max;
}
int main()
{
	int x,y,z;
	printf("请输入第一个要判断大小的数:");
	scanf("%d",&x);
	printf("请输入第二个要判断大小的数:");
	scanf("%d",&y);
	printf("请输入第三个要判断大小的数:");
	scanf("%d",&z);
	printf("\"%d\",\"%d\"与\"%d\"中最大值为:%d",x,y,z,max(x,y,z));
} 


//7 编写求三个数和、差、平均数的三个函数，在主函数中调用并输出他们。
int add(int x,int y,int z)
{
	int sum=0;
	sum = x + y + z;
	return sum;//return x+y+z
}
int from(int x,int y,int z)
{
	int from=0;
	from = x - y - z;
	return from;//return x-y-z
}
int average(int x,int y,int z)
{
	int average;
	average = (x + y + z) / 3;
	return average;//return (x+y+z)/3
}
int main()
{
	int x,y,z;
	printf("请输入第一个要计算的数:");
	scanf("%d",&x);
	printf("请输入第二个要计算的数:");
	scanf("%d",&y);
	printf("请输入第三个要计算的数:");
	scanf("%d",&z);
	printf("\"%d\",\"%d\"与\"%d\"中和为:%d\n",x,y,z,add(x,y,z));
	printf("\"%d\",\"%d\"与\"%d\"中差为:%d\n",x,y,z,from(x,y,z));
	printf("\"%d\",\"%d\"与\"%d\"中差为:%d\n",x,y,z,average(x,y,z));
}


//8 编写一个判断某个数是否是素数的函数，要求在主函数中输入一个整数，并输出是否是素数的信息。
void judge_prime(int x)
{
	int i;
    if(x<=1)
		printf("\"%d\"不是素数\n",x);
    else
    {
        for (i=2;i<x;i++)
		{
        	if(x%i==0)
			break;
		}
		if(i>=x)
	    	printf("\"%d\"是素数\n",x);
        else
	    	printf("\"%d\"不是素数\n",x);
	}
}
int main()
{
	int x;
	printf("请输入一个要判断是否为素数的数:");
	scanf("%d",&x);
	judge_prime(x);
}


//9 用函数实现求两个数的最大公约数和最小公倍数，这两个数在主程序中输入。
void judge(int x,int y)
{
	int _x,_y,t,r,n;
	_x = x;
	_y = y;
    if(_x<_y)
    {
		t = _y;
		_y = _x;
		_x = t;
	}
    r = _x%_y;
    n = _x*_y;
    while(r!=0)
    {
        _x = _y;
        _y = r;
        r = _x%_y;
    }
    printf("\"%d\"与\"%d\"中最大公约数是:%d\n",x,y,_y);
    printf("\"%d\"与\"%d\"中最小公倍数是:%d\n",x,y,n/_y);
}
int main()
{
	int x,y;
	printf("请输入第一个要判断的数:");
	scanf("%d",&x);
	printf("请输入第二个要判断的数:");
	scanf("%d",&y);
	judge(x,y);
}


//10 判断一个数是否为水仙花数(Narcissistic number)
void narcissistic_number(int n)
{
	int a,b,c;//a百位 b十位 c个位
	a = n/100;
	b = n/10%10;
	c = n%10;
	if(n==a*a*a+b*b*b+c*c*c)
	{
		printf("\"%d\"是水仙花数\n",n);
	}
	else
	{
		printf("\"%d\"不是水仙花数\n",n);
	}
}
int main()
{
	int x;
	printf("请输入一个数:");
	scanf("%d",&x);
	narcissistic_number(x);
}
