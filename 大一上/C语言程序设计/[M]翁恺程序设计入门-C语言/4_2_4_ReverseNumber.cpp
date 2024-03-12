#include "stdio.h"

int main() {
    int num, digit, ret;
    ret = 0;

    printf("请输入需要逆序的数字:");
    scanf("%d", &num);

    while (num != 0) {
        digit = num % 10;
        num /= 10;
        printf("%d", digit);
        ret = ret * 10 + digit;
    }
    printf("\n逆序后数字为:%d", ret);
}