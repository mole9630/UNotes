# for 临时变量 in 可迭代对象: 循环体  for循环又称遍历循环
"""
    1.临时变量可以为任意变量名
    2.可迭代对象能够一次返回其中一个成员的对象,eg:列表 字符串 字典等
    3.for循环常与range()函数搭配使用
        range()参数:range(start, end, step) 开始, 截止, 步长
        常用写法:
            range(start, end, step)  # 左闭右开
            range(start, end)  # step缺省为1
            range(end)  # start缺省为0
"""
for i in [1, 3, 2]:
    print(i)  # 1 3 2

for i in "Hello World":
    print(i)  # Hello World

# for循环常与range()函数搭配使用
for i in range(1, 10, 1):
    print(i)  # 1 2 3 4 5 6 7 8 9
for i in range(1, 10):
    print(i)  # 1 2 3 4 5 6 7 8 9
for i in range(10):
    print(i)  # 0 1 2 3 4 5 6 7 8 9

# 1~100累加和
sum = 0
for i in range(101):
    sum += i
print("1~100的累加和为:", sum)

# 1~100偶数累加和
sum = 0
# for i in range(0, 101, 2):  # 控制步长法
for i in range(101):
    if i % 2 == 0:  # 判断奇偶法
        sum += i
print("1~100的偶数累加和为:", sum)

# 1~100奇数累加和
sum = 0
for i in range(101):
    if i % 2 != 0:
        sum += i
print("1~100的奇数累加和为:", sum)

# 求5的阶乘
sum = 1
for i in range(1, 6):
    sum *= i
print("5的阶乘为:", sum)

# 求100以内能被7或7整除,但不能同时被3和7整除的数
for i in range(101):
    if (i % 3 == 0 or i % 7 == 0) and not (i % 3 == 0 and i % 7 == 0):
        print(i)
    i += 1

# 鸡兔同笼:有35个头,94只脚,求鸡兔各几只
head, foot = 35, 94
for chicken in range(1, head + 1):
    rabbit = head - chicken
    chicken_foot = chicken * 2
    rabbit_foot = rabbit * 4
    if chicken_foot + rabbit_foot == foot:
        print("鸡共%d只,兔子共%d只" % (chicken, rabbit))
        break

# 求2000-2100之间所有闰年输出
import calendar
count = 0  # 统计输出次数
for year in range(2000,2101):
    if calendar.isleap(year):
        print(year, end=" ")  # 用空格代替换行
        count += 1
        if count % 5 == 0:
            print("")