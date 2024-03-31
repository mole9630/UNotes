#include "stdio.h"

int main() {
    int arr[] = {9, 1, 5, 6, 3, 2, 7, 0, 8, 4};
    int i, j, temp;
    int arrSize = sizeof(arr) / sizeof(arr[0]);

    // 开始排序
    for (i=0; i<arrSize-1; i++) {
        for (j=0; j<arrSize-i-1; j++) {
            // 判断前一个是否比后一个大
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    // 输出结果数组
    for (int i=0; i < arrSize; ++i) {
        printf("%d ", arr[i]);
    }
    return 0;
}