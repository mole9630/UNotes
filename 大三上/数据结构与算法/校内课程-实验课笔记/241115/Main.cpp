#include <iostream>
#include <string>
#include <iomanip>

#define MAXINT 32767

using namespace std;


typedef struct {
    string data;
    int weight;
    int parent, lchild, rchild;
} HTNode, *HuffmanTree;

void Select(HuffmanTree HT, int k, int &s1, int &s2) {
    int i, min1 = MAXINT, min2 = MAXINT;
    for (i = 1; i <= k; i++) {
        if (HT[i].parent == 0) {
            if (HT[i].weight < min1) {
                min1 = HT[i].weight;
                s1 = i;
            }
        }
    }
    for (i = 1; i <= k; i++) {
        if (HT[i].parent == 0 && i != s1) {
            if (HT[i].weight < min2) {
                min2 = HT[i].weight;
                s2 = i;
            }
        }
    }
}

void CreateHuffmanTree(HuffmanTree &HT, string *strs, int *w, int n) {
    if (n <= 1) return;
    int m = 2 * n - 1;
    HT = new HTNode[m + 1];
    int i;
    for (i = 1; i <= m; ++i) {
        HT[i].parent = 0;
        HT[i].lchild = 0;
        HT[i].rchild = 0;
    }
    for (i = 1; i <= n; ++i) {
        HT[i].data = strs[i - 1];
        HT[i].weight = w[i - 1];
    }
    for (i = n + 1; i <= m; ++i) {
        int s1, s2;
        Select(HT, i - 1, s1, s2);
        HT[s1].parent = i;
        HT[s2].parent = i;
        HT[i].lchild = s1;
        HT[i].rchild = s2;
        HT[i].weight = HT[s1].weight + HT[s2].weight;
    }
}

int main() {
    string strs[] = {"The", "of", "a", "to", "and", "in", "that", "he", "is", "at", "on", "for", "His", "are", "be"};
    int w[] = {1192, 677, 541, 518, 462, 450, 242, 195, 190, 181, 174, 157, 138, 124, 123};
    int n = 15;
    HuffmanTree HT;
    CreateHuffmanTree(HT, strs, w, n);

    // 定义列宽
    const int col1Width = 15; // 序号
    const int col2Width = 10; // 单词
    const int col3Width = 15; // 出现频度
    const int col4Width = 15; // 双亲节点号
    const int col5Width = 15; // 左孩子号
    const int col6Width = 15; // 右孩子号

    // 输出表头
    cout << left << setw(col1Width) << "序号"
            << setw(col2Width) << "单词"
            << setw(col3Width) << "出现频度"
            << setw(col4Width) << "双亲节点"
            << setw(col5Width) << "左孩子"
            << setw(col6Width) << "右孩子" << endl;

    // 输出数据
    for (int i = 1; i <= 2 * n - 1; ++i) {
        cout << left << setw(10) << i
                << setw(15) << HT[i].data
                << setw(15) << HT[i].weight
                << setw(15) << HT[i].parent
                << setw(15) << HT[i].lchild
                << setw(15) << HT[i].rchild << endl;
    }

    delete[] HT;

    return 0;
}
