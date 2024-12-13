#include <iomanip>
#include<iostream>
using namespace std;
#define N 16

typedef struct {
    int key;
    int num;
} HTable[N];

void init(HTable &ht) {
    for (int i = 0; i < N; i++) {
        ht[i].key = -1;
        ht[i].num = 0;
    }
}

int H(int n) {
    return n % 13;
}

void insert(HTable &ht, int key) {
    int add = H(key);
    int n = 1;
    while (ht[add].key != -1) {
        add = (add + 1) % 16;
        n++;
    }
    ht[add].key = key;
    ht[add].num = n;
}

int Search(HTable ht, int key) {
    int H0, H1;
    H0 = H(key);
    if (ht[H0].key == -1)
        return -1;
    else if (ht[H0].key == key)
        return H0;
    else {
        for (int i = 1; i < N; i++) {
            H1 = (H0 + i) % N;
            if (ht[H1].key == -1)
                return -1;
            else if (ht[H1].key == key)
                return H1;
        }
    }
}

void printHashTable(const HTable &ht) {
    cout << left << setw(20) << "地址" << setw(20) << "关键字" << setw(20) << "搜索长度" << endl;
    for (int i = 0; i < N; ++i) {
        cout << left << setw(20) << i
                << setw(20) << ht[i].key
                << setw(20) << ht[i].num << endl;
    }
}

void printLine() {
    cout << "--------------------------------------------------------" << endl;
}

int main() {
    // 以表格的形式输出哈希表
    HTable ht;
    int a[12] = {19, 14, 23, 1, 68, 20, 84, 27, 55, 11, 10, 79};
    int i, m;
    init(ht);

    for (i = 0; i < 12; i++)
        insert(ht, a[i]);

    printHashTable(ht);
    printLine();

    cout << "输入要查找的关键字：";
    cin >> m;
    printLine();

    cout << "关键字[" << m << "]在哈希表中的位置是：" << Search(ht, m) << endl;
    cout << "关键字[" << 1 << "]在哈希表中的位置是：" << Search(ht, 1) << endl;
    cout << "关键字[" << 2 << "]在哈希表中的位置是：" << Search(ht, 2) << endl;
    return 0;
}
