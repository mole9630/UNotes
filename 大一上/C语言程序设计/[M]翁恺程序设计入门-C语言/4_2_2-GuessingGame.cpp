#include "stdio.h"
#include "math.h"
#include "time.h"

int main() {
    int num, inputNum, count;
    count = 0;
    srand(time(NULL));
    num = rand() % 100;
    do {
        printf("请输入您猜测的数字:");
        scanf("%d", &inputNum);
        count++;
        if (inputNum > num) {
            printf("太大了\n");
        } else if (inputNum < num) {
            printf("太小了\n");
        }
    } while (num != inputNum);
    printf("猜中了! 数字为:%d, 共猜测%d次", num, count);
}