#include "stdio.h"

int main() {
    // 定义一个数组存储五名学生三门成绩
    int score[5][3] = {
            {67, 97, 45},
            {78, 81, 83},
            {42, 17, 33},
            {89, 92, 95},
            {77, 82, 90}
    };
    int arrSize = sizeof(score) / sizeof(score[0][0]);
    int arrSizeRow = sizeof(score) / sizeof(score[0]);
    int arrSizeCol = sizeof(score[0]) / sizeof(score[0][0]);
    int i, j;
    int sum;

    // 求出每名学生的总成绩平均成绩
    for (i = 0; i < arrSizeRow; ++i) {
        sum = 0;
        for (j = 0; j < arrSizeCol; j++) {
            sum += score[i][j];
        }
        float avg = (float) sum / j + 1;
        printf("第%d个学生的平均成绩为:%.2f\n", i, avg);
    }

    // 求出每门学科的总成绩平均成绩
    printf("---- ----\n");
    for (i = 0; i < arrSizeCol; ++i) {
        sum = 0;
        for (j = 0; j < arrSizeRow; ++j) {
            sum += score[j][i];
        }
        printf("%d, %d", sum, j+1);
        float avg = (float) sum / j;
        printf("第%d门学课平均成绩为:%.2f\n", i + 1, avg);
    }


    return 0;
}