#include "stdio.h"

int main() {
    int currentTime, minuteTime, endTime;
    int hour, minute;

    printf("请输入起始时间(例:11:06分输入1106):");
    scanf("%d", &currentTime);
    printf("请输入流逝的分钟数:");
    scanf("%d", &minuteTime);

    hour = currentTime / 100;
    minute = currentTime % 100;

//    printf("[debug]hour=%d, minute=%d", hour, minute);
    hour += minuteTime / 60;
    minute += minuteTime % 60;
    endTime = hour * 100 + minute;

    printf("最终时间为:%d", endTime);

    return 0;
}