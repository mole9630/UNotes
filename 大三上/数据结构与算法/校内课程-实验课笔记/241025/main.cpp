#include <iostream>
using namespace std;

#define ERROR 0
#define OK 1
#define OVERFLOW -2
#define MAXSIZE 100

typedef int Status;
typedef char SElemType;

// 顺序栈的存储结构
typedef struct {
    SElemType *base; //栈顶指针
    SElemType *top; //栈底指针
    int stackSize; //栈可用的最大容量
} SqStack;

// 顺序栈的初始化
Status InitStack(SqStack &S) {
    S.base = new SElemType[MAXSIZE];
    if (!S.base) return OVERFLOW;
    S.top = S.base;
    S.stackSize = MAXSIZE;
    return OK;
}

// 顺序栈的入栈
Status Push(SqStack &S, SElemType e) {
    if (S.top - S.base == S.stackSize) return ERROR;
    // *S.top = e;
    *S.top ++= e;
    cout << e << " -> 已入栈" << endl;
    return OK;
}


// 顺序栈的出栈
Status Pop(SqStack &S, SElemType &e) {
    if (S.top == S.base) return ERROR;
    // S.top--;
    e =*--S.top;
    cout << e << " <- 已出栈" << endl;
    return OK;
}

// 遍历输出顺序栈
Status StackTraverse(SqStack S) {
    if (S.top == S.base) return ERROR;
    // SElemType *p;
    // p = S.top;
    // while (p > S.base) {
    //     cout << *p << " ";
    //     p--;
    // }
    // cout << endl;
    // return OK;

    SElemType *p = S.base;
    cout << "栈内元素（从栈底到栈顶）：" << endl;
    while (p != S.top) {
        cout << *p << ' ';
        p++;
    }
    cout << endl;
}


int main() {
    SqStack S;
    SElemType e;

    // 初始化顺序栈
    InitStack(S);


    // 顺序栈入栈
    cout << "输入入栈元素(以!为结尾)：";
    cin >> e;
    while (e != '!') {
        Push(S, e);
        cin >> e;
    }
    cout << endl;

    // 顺序栈出栈
    Pop(S, e);

    // 遍历栈
    StackTraverse(S);
}
