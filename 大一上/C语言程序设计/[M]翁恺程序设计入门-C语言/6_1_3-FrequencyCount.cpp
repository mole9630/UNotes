#include "stdio.h"

int main() {
    int count[10] = {0};
    int input, index, i;

    while (true) {
        scanf("%d", &input);
        if (input == -1) {
            break;
        } else if (input > 9 || input < 0) {
            printf("输入不合法, 请重新输入\n");
            continue;
        }
        index = input;
        count[index]++;
    }

    for (i=0; i<=9; i++) {
        printf("%d共出现%d次\n", i, count[i]);
    }
}