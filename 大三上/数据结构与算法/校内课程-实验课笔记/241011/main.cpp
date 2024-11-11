#include<iostream>
using namespace std;
#define OK 1
#define OVERFLOW -2
#define ERROR 0
#define MAXSIZE 100
typedef int Elemtype;
typedef int Status;

// 顺序表的存储结构，结构体类型
typedef struct Sqlist
{
int* elem; // 指针，用来指向数组的首地址
int length; // 当前顺序表的长度
}Sqlist; // 顺序表结构类型为Sqlist

 
Status Initlist(Sqlist& L) // 初始化顺序表
{
	L.elem = new Elemtype[MAXSIZE]; // 为顺序表分配一个数组空间
	if (!L.elem) exit(OVERFLOW); // 0或非0
	L.length = 0;
	return OK;
}

Status Createlist(Sqlist& L, int n) // 创建顺序表
{
	Elemtype e;
	cout << "输入顺序表的数据：";
	for (int i = 0; i < n; i++)
	{
		cin >> e;
		L.elem[i] = e;
		L.length++;
	}
	cout << "创建顺序表成功。" << endl;
	return OK;
}

 Status ListInsert(Sqlist &L, int i, Elemtype e){
 
    if (i < 1 || i > L.length + 1) return ERROR;       // 判断i值是否合法
    if (L.length == MAXSIZE) return ERROR;             // 当前存储空间已满
    for (int j = L.length -1 ; j >= i -1 ; --j) {
        L.elem[j+1] = L.elem[j];                       // 插入位置及之后的元素后移
    }
    L.elem[i-1] = e;                                   // 将新元素e放入第i个位置
    L.length++;                                        // 表长+1
    return OK;
}

// 顺序表的删除
Status ListDelete(Sqlist &L, int i) {
	// 在顺序表L中删除第i个元素，i值的合法范围是1<=i<=L.length
	if((i<1) || (i>L.length)) return ERROR; // 判断i值是否合法
	for(int j=i; j<=L.length-1 ; j++){
		L.elem[j-1] = L.elem[j]; // 被删除元素之后的元素前移
	}
	--L.length; // 表长-1
	return OK;
}

// 顺序表的取值
Status GetElem(Sqlist &L, int i, Elemtype &e) {
	if((i<1) || (i>L.length)) return ERROR; // 判断i值是否合法
	e = L.elem[i-1];
	return OK;
}

// 顺序表的查找
int LocateElem(Sqlist L, Elemtype &e) {
	for(int i=0; i<L.length; i++)
		if(L.elem[i]==e) return i+1;
	return 0;
}

Status Printlist(Sqlist L)// 顺序表打印
{
	cout << "顺序表的值顺序输出为：";
	for (int i = 0; i < L.length; i++)
	cout << L.elem[i] << " ";
	return OK;
	}

int main()
{
	Sqlist LA;
	Initlist(LA);
	
	int a,b;
	Elemtype c;
	
	// 创建数据表
	cout << "输入创建顺序表LA的长度：";
	cin >> a;
	Createlist(LA, a);//函数调用
	Printlist(LA);
	cout<<endl;

	// 数据表插入
	cout << "输入插入的位置：";
    cin >> b;
	cout << "输入插入的数值：";
    cin >> c;
	if(ListInsert(LA, b,c)==1) 
    	{
		cout << "插入成功"<<endl;
		Printlist(LA);
    	}
    else
       {cout << "插入失败"<<endl;} 
	
	//数据表删除
	cout << endl << "输入删除的位置：";
	cin >> a;
	if(ListDelete(LA, a) == 1) {
		cout << "删除成功" << endl;
	}
	Printlist(LA);
	
	// 数据表的取值
	cout << endl << "输入取值的位置：";
	cin >> a;
	if(GetElem(LA, a, c) == ERROR) {
		cout << "取值内容不合法" << endl;
	} else {
        cout << "位置为\"" << a << "\"的值是：" << c << endl;
	}
	
	// 数据表的查找
	cout << "输入查找的值：";
	cin >> c;
	int value = LocateElem(LA, c);
	if(value == 0) {
		cout << "查找内容不合法" << endl;
	} else {
		cout << "值为\"" << c << "\"的位置是：" << value << endl;
	}

	return 0;
}
