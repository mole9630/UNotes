#include "stdio.h"

int main() {
    int arr[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int temp;
    int j = (sizeof(arr) / sizeof(arr[0])) - 1;
    int arrSize = sizeof(arr) / sizeof(arr[0]);

    // 分别交换顺序
    for (int i=0; i<=j; i++, j--) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 输出数组
    for (int i=0; i < arrSize; ++i) {
        printf("%d ", arr[i]);
    }

    return 0;
}