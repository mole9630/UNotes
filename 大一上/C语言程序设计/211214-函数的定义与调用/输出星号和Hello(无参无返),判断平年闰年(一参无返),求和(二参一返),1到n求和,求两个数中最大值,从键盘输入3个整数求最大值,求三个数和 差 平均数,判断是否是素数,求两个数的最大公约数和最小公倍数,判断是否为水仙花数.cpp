#include<stdio.h>

//1 ����Ǻź�Hello(�޲��޷���ֵ)
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
	

//2 �ж������ƽ������(һ�������޷���ֵ)
void judge_year(int y)//�������� ��ʽ����(�β�)
{
	if(y%4==0 && y%100!=0 || y%400==0)
	{
		printf("%d������",y);
	} 
	else
	{
		printf("%d��ƽ��",y);
	}
} 
int main()
{
	int year;
	printf("������һ�����:");
	scanf("%d",&year);
	judge_year(year);//�������� ʵ�ʲ���(ʵ��) 
} 


//3 ���(��������һ������ֵ)
int add(int x,int y)
{
	int sum;
	sum = x + y;
	return sum;
}
int main()
{
	int x,y;
	printf("�������һ��Ҫ�������:");
	scanf("%d",&x);
	printf("������ڶ���Ҫ�������:");
	scanf("%d",&y);
	printf("%d + %d = %d\n",x,y,add(x,y));
} 

	
//4 �ú���ʵ��1��n��ͣ�n�ɼ����������������롣
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
	printf("������n��ֵ:");
	scanf("%d",&n);
	printf("1 �� %d ����ͽ��Ϊ:%d\n",n,add_n(n));
}


//5 ��д�������������ֵ�ĺ���������main�����е���
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
	printf("�������һ��Ҫ�жϴ�С����:");
	scanf("%d",&x);
	printf("������ڶ���Ҫ�жϴ�С����:");
	scanf("%d",&y);
	printf("\"%d\"��\"%d\"�����ֵΪ:%d",x,y,max(x,y));
}


//6 �Ӽ�������3���������������е�����ߣ��ú�������ʵ�֡�
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
	printf("�������һ��Ҫ�жϴ�С����:");
	scanf("%d",&x);
	printf("������ڶ���Ҫ�жϴ�С����:");
	scanf("%d",&y);
	printf("�����������Ҫ�жϴ�С����:");
	scanf("%d",&z);
	printf("\"%d\",\"%d\"��\"%d\"�����ֵΪ:%d",x,y,z,max(x,y,z));
} 


//7 ��д���������͡��ƽ�������������������������е��ò�������ǡ�
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
	printf("�������һ��Ҫ�������:");
	scanf("%d",&x);
	printf("������ڶ���Ҫ�������:");
	scanf("%d",&y);
	printf("�����������Ҫ�������:");
	scanf("%d",&z);
	printf("\"%d\",\"%d\"��\"%d\"�к�Ϊ:%d\n",x,y,z,add(x,y,z));
	printf("\"%d\",\"%d\"��\"%d\"�в�Ϊ:%d\n",x,y,z,from(x,y,z));
	printf("\"%d\",\"%d\"��\"%d\"�в�Ϊ:%d\n",x,y,z,average(x,y,z));
}


//8 ��дһ���ж�ĳ�����Ƿ��������ĺ�����Ҫ����������������һ��������������Ƿ�����������Ϣ��
void judge_prime(int x)
{
	int i;
    if(x<=1)
		printf("\"%d\"��������\n",x);
    else
    {
        for (i=2;i<x;i++)
		{
        	if(x%i==0)
			break;
		}
		if(i>=x)
	    	printf("\"%d\"������\n",x);
        else
	    	printf("\"%d\"��������\n",x);
	}
}
int main()
{
	int x;
	printf("������һ��Ҫ�ж��Ƿ�Ϊ��������:");
	scanf("%d",&x);
	judge_prime(x);
}


//9 �ú���ʵ���������������Լ������С�����������������������������롣
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
    printf("\"%d\"��\"%d\"�����Լ����:%d\n",x,y,_y);
    printf("\"%d\"��\"%d\"����С��������:%d\n",x,y,n/_y);
}
int main()
{
	int x,y;
	printf("�������һ��Ҫ�жϵ���:");
	scanf("%d",&x);
	printf("������ڶ���Ҫ�жϵ���:");
	scanf("%d",&y);
	judge(x,y);
}


//10 �ж�һ�����Ƿ�Ϊˮ�ɻ���(Narcissistic number)
void narcissistic_number(int n)
{
	int a,b,c;//a��λ bʮλ c��λ
	a = n/100;
	b = n/10%10;
	c = n%10;
	if(n==a*a*a+b*b*b+c*c*c)
	{
		printf("\"%d\"��ˮ�ɻ���\n",n);
	}
	else
	{
		printf("\"%d\"����ˮ�ɻ���\n",n);
	}
}
int main()
{
	int x;
	printf("������һ����:");
	scanf("%d",&x);
	narcissistic_number(x);
}
