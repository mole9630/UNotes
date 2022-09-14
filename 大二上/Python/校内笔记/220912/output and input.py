# 输入输出函数
# 输入函数print(),作用是将变量和字符串进行组合,按照一定的格式输出组合后的字符串
money_all = 156.28
print("购物的总金额为:", money_all)  # 用逗号连接默认空格分隔
print("购物的总金额为:", money_all, sep="")  # 内置函数sep设置分隔方式

money_all_string = str(money_all)
print("购物的总金额为:", money_all_string)  # 购物的总金额为: 156.28
print("购物的总金额为:" + money_all_string)  # 购物的总金额为:156.28 +号为字符串连接符号且+号两边仅能为字符串

# 输入函数input(),所有从键盘输入的内容以字符串的形式保存
a = input("该段为提示文字:")  # 也可为空
print(a)
a = input()
b = input()
print(a + b)  # 字符串的连接
print(int(a) + int(b))  # 整型相加
a, b = '1', '2'
print(eval(a) + eval(b))  # 3
print(eval(a + b))  # 12 字符串的连接
print(eval('1+2'))  # 可以直接处理数学表达式

# 练习一:从键盘输入姓名,身高,体重,输出"[姓名], [身高值], [体重值]"
name = input("请输入姓名:")
height = eval(input("请输入身高(m):"))
weight = eval(input("请输入体重(kg):"))
print(name, "的身高为:", height, "米,体重为:", weight, "千克", sep="")
# 格式模板:print("模板" % 变量)
print("%s的身高为:%.2f米,体重为:%.2f千克" % (name, height, weight))  # %为占位符

# 保留小数
a = 3.1415926535
print(round(a, 2))  # 3.14 可以快速的保留两位小数,有四舍五入
print(round(a))  # 3

# 练习二:将输入的摄氏度转换成华氏度,公式:摄氏度*1.8+32=华氏度
celsius = float(input("请输入摄氏度(℃):"))
fahrenheit = celsius * 1.8 + 32
print("%.1f℃=%.1fF" % (celsius, fahrenheit))

# 练习三:从键盘输入一个整数,转换成其他进制,格式:十进制数:[数字] 转换 二进制数:[数字]
num = int(input("请输入一个整数:"))
print("十进制数:%d 转换 二进制数:%s" % (num, bin(num)))  # bin有返回值可以直接使用

# 练习四:比较正余弦大小
import math
reg = int(input("请输入任意角度:"))
radian = math.radians(reg)
sin = math.sin(radian)
cos = math.cos(radian)
print(reg, "度角的", "弧度:", radian, "正弦:", sin, "余弦:", cos)
if sin > cos:
    print("sin%d° > cos%d°" % (reg, reg))
elif sin < cos:
    print("sin%d° < cos%d°" % (reg, reg))
else:
    print("sin%d° = cos%d°" % (reg, reg))