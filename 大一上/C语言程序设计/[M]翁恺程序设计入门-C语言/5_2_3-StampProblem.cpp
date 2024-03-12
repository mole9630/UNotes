#include "stdio.h"

int main() {
    int a, b, c;
    float num;

    printf("请输入邮费(元):");
    scanf("%f", &num);
    printf("邮费为%.2f元的邮票方案有:\n", num);
    num *= 100;

    for (a=0; a<num/80; a++) { //80分邮票
        for (b=0; b<num/120; b++) { //120分邮票
            for (c=0; c<num/150; c++) { //150邮票
                if (num == a*80 + b*120 + c*150) {
                    printf("%d张80分邮票, %d张120分邮票, %d张150分邮票\n", a, b, c);
                }
            }
        }
    }
}