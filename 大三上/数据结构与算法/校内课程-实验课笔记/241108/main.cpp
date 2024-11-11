#include <iostream>
using namespace std;

#define MAXSIZE 100

typedef char TElemType;

typedef TElemType SqBiTree[MAXSIZE];
SqBiTree bt;

typedef struct BiTNode {
    TElemType data;
    struct BiTNode *lchild, *rchild;
} BiTNode, *BiTree;

// 创建二叉树
void CreateBiTree(BiTree &T) {
    TElemType e;
    cin >> e;
    if (e == '#') {
        T = NULL;
    } else {
        T = new BiTNode;
        T->data = e;
        CreateBiTree(T->lchild);
        CreateBiTree(T->rchild);
    }
}

// 遍历二叉树
void OrderTraverse(BiTree T, int type) {
    if (T == NULL) return;

    switch (type) {
        case 1: // 先序遍历
            cout << T->data << " ";
            OrderTraverse(T->lchild, type);
            OrderTraverse(T->rchild, type);
            break;
        case 2: // 中序遍历
            OrderTraverse(T->lchild, type);
            cout << T->data << " ";
            OrderTraverse(T->rchild, type);
            break;
        case 3: // 后序遍历
            OrderTraverse(T->lchild, type);
            OrderTraverse(T->rchild, type);
            cout << T->data << " ";
            break;
        default:
            cout << "非法操作" << endl;
        break;
    }
}

int main() {
    BiTree T = NULL; // 初始化为NULL

    cout << "请输入二叉树的先序遍历序列（用#表示空节点）：" << endl;
    CreateBiTree(T);

    int choice;
    cout << "请选择遍历方式（1-先序，2-中序，3-后序）：";
    cin >> choice;

    cout << "遍历结果：";
    OrderTraverse(T, choice);
    cout << endl;

    return 0;
}