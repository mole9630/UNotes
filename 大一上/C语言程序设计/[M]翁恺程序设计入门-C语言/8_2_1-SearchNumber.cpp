#include "stdio.h"

int search(int all[], int size, int num);

int main() {
    int all[] = {4, 7, 5, 6, 2, 14, 19, 17, 13, 18, 8, 0, 16, 9, 10, 12, 1, 11, 3, 15};
    int let, input;
    printf("请输入要找的数字:");
    scanf("%d", &input);
    let = search(all, sizeof(all)/4, input);
    if (let != -1) {
        printf("%d在数组的第%d位", input, let);
    } else {
        printf("没有找到数字:%d", input);
    }
}

int search(int all[], int size, int num) {
    int i, ret;
    ret = -1;

    for (i=0; i<size; i++) {
        if (all[i] == num) {
            ret = i + 1;
            break;
        }
    }

    return ret;
}