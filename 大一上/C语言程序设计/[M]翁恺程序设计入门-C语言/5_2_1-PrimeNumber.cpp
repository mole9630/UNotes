#include "stdio.h"

int main() {
    int num, i, j;
    bool flag;
    flag = true;

    printf("请输入需要判断的数:");
    scanf("%d", &num);

    for (i=2; i<num; i++) {
        if (num%i == 0) {
            flag = false;
            break;
        }
    }

    if (flag) {
        printf("%d是素数", num);
    } else {
        printf("%d不是素数, 例如可以被%d整除", num, i);
    }

    printf("\n===== 100以内的素数 =====");
    printf("\n100以内的素数有:");
    for (i=2; i<=100; i++) {
        flag = true;

        for (j=2; j<i; j++) {
            if (i%j == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            printf("%d ", i);
        }
    }
}