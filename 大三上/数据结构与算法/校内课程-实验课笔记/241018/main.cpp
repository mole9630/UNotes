#include<iostream>

using namespace std;
#define OK 1
#define OVERFLOW -2
#define ERROR 0
#define MAXSIZE 100
typedef int Elemtype;
typedef int Status;

// 定义单链表
typedef struct LNode {
    Elemtype data;
    struct LNode *next;
} LNode, *LinkList;

// 初始化单链表
Status InitList(LinkList &L) {
    L = new LNode;
    L->next = NULL;
    return OK;
}

// 单链表插入(尾插法)
Status CreateList_R(LinkList &L, int i) {
    LNode *p, *r;
    r = L;
    cout << "输入单链表的数据：";
    for (int t = 0; t < i; t++) {
        p = new LNode;
        cin >> p->data;
        r->next = p;
        r = p;
    }
    return OK;
}

// 删除单链表
Status ListDelete(LinkList &L, int i) {
    LNode *p, *q;
    p = L;
    int j = 0;
    while (p->next && j < i - 1) {
        p = p->next;
        ++j;
    }
    if (!(p->next) || j > i - 1) {
        return ERROR;
    }
    q = p->next;
    p->next = q->next;
    delete q;
    return OK;
}

// 打印单链表
Status printLinklist(LinkList L) {
    LNode *p;
    p = L->next;
    cout << "元素为：";
    while (p != NULL) {
        cout << p->data << " ";
        p = p->next;
    }
    cout << endl;
    return OK;
}

int main() {
    int a, b;
    LinkList LA;
    InitList(LA);

    cout << "输入创建单链表的长度：";
    cin >> a;
    CreateList_R(LA, a);
    printLinklist(LA);

    cout << "输入删除的位置：";
    cin >> b;

    if (ListDelete(LA, b) == 1) {
        cout << "删除成功" << endl;
    } else {
        cout << "删除失败" << endl;
    }

    printLinklist(LA);
    return 0;
}
