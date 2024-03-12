#include "stdio.h"

int main() {
    int num, correctNumber;
    int count, maxCount;
    count = 0;

    printf("请输入正确数字和最大猜测次数:");
    scanf("%d%d", &correctNumber, &maxCount);

    printf("开始猜数:");
    while (true) {
        scanf("%d", &num);
        count++;

        if (num < 0 || count == maxCount) { //负数游戏结束
            printf("Game Over!");
            break;
        }

        if (num > correctNumber) {
            printf("Too big\n");
        } else if (num < correctNumber) {
            printf("Too big\n");
        } else {
            if (count == 1) {
                printf("Bingo!");
                break;
            } else if (count <= 3) {
                printf("Lucky You!");
                break;
            } else {
                printf("Good Guess!");
                break;
            }
        }
    }
}