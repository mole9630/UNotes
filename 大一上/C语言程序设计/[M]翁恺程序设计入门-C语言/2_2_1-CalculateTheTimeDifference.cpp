#include "stdio.h"

int main() {
    int hourEnd, hourStart, minuteEnd, minuteStart;
    int resultHour, resultMinute;

    printf("请输入起始时间(格式:2:33):");
    scanf("%d:%d", &hourStart, &minuteStart);
    printf("请输入结束时间(格式:2:33):");
    scanf("%d:%d", &hourEnd, &minuteEnd);

    resultHour = hourEnd - hourStart;
    if (minuteStart > minuteEnd) {
        resultHour -= 1;
        resultMinute = minuteEnd + 60 - minuteStart;
    } else {
        resultMinute = minuteEnd - minuteStart;
    }

    if (resultMinute >= 60) {
        int hour = resultMinute / 60;
        resultMinute -= hour * 60;
        resultHour += hour;
    }

    printf("相差%d小时%d分钟", resultHour, resultMinute);

}