for i in range(10, 1, -1):
    print(i, end=" ")  # 10 9 8 7 6 5 4 3 2
print()

# 模拟抛硬币
import random

count1, count2 = 0, 0  # 统计正反面向上的次数
count = int(input("请输入抛硬币的次数:"))
for i in range(count):
    if random.randint(0, 1) == 0:
        count1 += 1
    else:
        count2 += 1
    # print("当前抛第 %d 次硬币, 正面朝上的次数为 %d 次, 反面朝上的次数为 %d 次, 正面朝上的概率为: %.2f%% , 反面朝上的概率为: %.2f%%" % (i, count1, count2, count1/count * 100, count2/count * 100))
print("抛 %d 次硬币, 正面朝上的次数为 %d 次, 反面朝上的次数为 %d 次, 正面朝上的概率为: %.2f%% , 反面朝上的概率为: %.2f%%" % (count, count1, count2, count1/count*100, count2/count*100))

# 模拟圆周率, 假设边长为2的正方形, 内切圆半径为1
import math
num = 0  # 统计落入圆内的次数
total = int(input("请输入试验次数:"))
for i in range(total):
    x, y = random.uniform(-1, 1), random.uniform(-1, 1)  # 生成坐标, uniform随机生成一个(a, b)的随机数, 不一定是整数
    if math.sqrt(x**2 + y**2) <= 1:  # 坐标点到圆心的距离比半径小
        num += 1
print("试验 %d 次, π= %.5f" % (total, 4 * num / total))

# 循环的嵌套
for i in "abc":  # 外层执行一次, 外层全部执行完, 整个循环结束
    for j in "123":  # 内层执行全部
        print(i + j, end=" ")  # a1 a2 a3 b1 b2 b3 c1 c2 c3
    print()  # 换行

# 输出*填充的正方形
# for循环方法
for i in range(5):
    for j in range(5):
        print("*", end=" ")
    print()

# while循环方法
i = 0
while i < 5:
    i += 1
    j = 0
    while j < 5:
        print("*", end=" ")
        j += 1
    print()

# 由数字组成的矩形(临时变量可以作为输出内容)
for i in range(5):
    for j in range(5):
        print(j + 1, end=" ")
    print()

# 由数字组成的矩形(临时变量可以作为输出内容)
for i in range(5):  # range(1, 6)
    for j in range(5):  # range(i, i+5)
        print(i + j + 1, end=" ")
    print()

# 鸡兔同笼:有35个头,94只脚,求鸡兔各几只
head, foot = 35, 94
for chicken in range(1, head + 1):
    for rabbit in range(1, head + 1):
        chicken_foot = chicken * 2
        rabbit_foot = rabbit * 4
        if chicken_foot + rabbit_foot == foot and chicken + rabbit == head:
            print("鸡共%d只,兔子共%d只" % (chicken, rabbit))

# 百钱买白鸡:公鸡5元1只, 母鸡3元1只, 小鸡1元3只, 鸡的总数要求为100只, 预算仅100元
chicken, money = 100, 100
for rooster in range(101):
    for hen in range(101):
        # for chick in range(101):
        chick = chicken - rooster - hen
        if rooster + hen + chick == chicken and 5*rooster + 3*hen + chick//3 == money:
            print("公鸡共%d只, 母鸡共%d只, 小鸡共%d只" % (rooster, hen, chick))

# 五角星画三角形
for i in range(6):
    for j in range(i):
        print("*", end=" ")
    print()