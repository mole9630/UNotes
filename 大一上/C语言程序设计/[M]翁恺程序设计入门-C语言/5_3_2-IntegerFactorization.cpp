#include "stdio.h"

int main() {
    int num, mask, temp, count;
    printf("请输入一个整数:");
    scanf("%d", &num);

    temp = num;
    mask = 1;
    while (temp > 9) {
        mask *= 10;
        temp /= 10;
    }

    while (mask != 0) {
        printf("%d", num / mask);
        num %= mask;
        mask /= 10;
        if (mask != 0) {
            printf(" ");
        }
    }

}