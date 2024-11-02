#include <iostream>
using namespace std;

#define ERROR 0
#define OK 1
#define OVERFLOW -2
#define MAXSIZE 100

typedef int Status; // 定义状态类型
typedef int QElemType; // 定义队列元素类型

// 循环队列结构体定义
typedef struct {
    QElemType *base; // 指向队列数组的指针
    int front; // 队头指针
    int rear; // 队尾指针
} SqQueue;

// 循环队列初始化
Status InitQueue(SqQueue &Q) {
    Q.base = new QElemType[MAXSIZE]; // 分配内存
    if (!Q.base) return ERROR; // 内存分配失败返回错误
    Q.front = Q.rear = 0; // 初始化队头和队尾指针
    return OK;
}

// 循环队列入队操作
Status EnQueue(SqQueue &Q, QElemType e) {
    if ((Q.rear + 1) % MAXSIZE == Q.front) { // 判断队列是否已满
        return ERROR; // 队列已满返回错误
    }
    Q.base[Q.rear] = e; // 将元素放入队尾
    Q.rear = (Q.rear + 1) % MAXSIZE; // 更新队尾指针
    return OK;
}

// 循环队列出队操作
Status DeQueue(SqQueue &Q, QElemType &e) {
    if (Q.rear == Q.front) { // 判断队列是否为空
        return ERROR; // 队列为空返回错误
    }
    e = Q.base[Q.front]; // 取出队头元素
    Q.front = (Q.front + 1) % MAXSIZE; // 更新队头指针
    cout << e << " <- 已出队" << endl;
    return OK;
}

// 遍历循环队列
Status StackTraverse(SqQueue Q) {
    if (Q.rear == Q.front) { // 判断队列是否为空
        return ERROR;
    }

    cout << "循环队列中的元素为：";
    int i = Q.front; // 从队头开始遍历
    while (i != Q.rear) { // 遍历到队尾停止
        cout << Q.base[i] << " ";
        i = (i + 1) % MAXSIZE; // 计算下一个元素的位置
    }
    cout << endl;
    return OK;
}

int main() {
    SqQueue Q;
    QElemType e;
    int num; // 定义输入元素个数

    // 初始化循环队列
    InitQueue(Q);

    // 循环队列入队
    cout << "输入要入队的元素个数：";
    cin >> num;
    cout << "输入要入队的元素：";
    for (int i = 0; i < num; i++) {
        cin >> e;
        EnQueue(Q, e); // 元素入队
    }
    cout << endl;

    // 循环队列出队
    DeQueue(Q, e); // 元素出队
    cout << endl;

    // 遍历循环队列
    StackTraverse(Q); // 遍历队列并输出所有元素
    return 0;
}
