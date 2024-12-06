#include <iostream>
using namespace std;
#define N 100

typedef struct {
    int num[N];
    int length;
} SStable;

void init(SStable &S, int a[], int n) {
    S.length = 0;
    for (int i = 0; i < n; i++) {
        S.num[i + 1] = a[i];
        S.length++;
    }
}

// 顺序查找
int sequentialSearch(SStable &S, int key) {
    S.num[0] = key; // 哨兵
    int i = S.length;
    for (; S.num[i] != key; i--);
    return i;
}

// 折半查找
int binarySearch(SStable &S, int key) {
    int low = 1, high = S.length, mid;
    while (low <= high) {
        mid = (low + high) / 2;
        if (S.num[mid] == key) {
            return mid;
        } else if (S.num[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1; // 如果未找到，返回-1
}

int main() {
    SStable ST1, ST2;
    int a[10] = {3, 6, 2, 10, 1, 8, 5, 7, 4, 9};
    int b[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // 初始化顺序表
    init(ST1, a, 10);
    init(ST2, b, 10);

    // 顺序查找
    int seqPosition = sequentialSearch(ST1, 5);
    if (seqPosition != 0) {
        cout << "关键字 5 在顺序表（3, 6, 2, 10, 1, 8, 5, 7, 4, 9）中的位置是: " << seqPosition << endl;
    } else {
        cout << "关键字 5 未找到" << endl;
    }

    // 折半查找
    int binPosition = binarySearch(ST2, 9);
    if (binPosition != -1) {
        cout << "关键字 9 在顺序表（1, 2, 3, 4, 5, 6, 7, 8, 9, 10）中的位置是: " << binPosition << endl;
    } else {
        cout << "关键字 9 未找到" << endl;
    }

    return 0;
}
