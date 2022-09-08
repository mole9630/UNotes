# 基本数据类型及转换
# 一.数字类型
# 1.整型:整数数值
# 可以表示任意大小整数,不超出内存空间
a = 10  # 十进制
print("a:", a)
b = 0b1010  # 二进制(1010), 0b1010中的b大小写均可
print("b:", b)
c = 0o12
print("c:", c)  # 八进制(12), 0o12中的o大小写均可
d = 0xa  # 十六进制(a), 0xa中的x大小写均可

# 不同进制转换,结果以字符串形式保存
a = bin(10)
b = oct(10)
c = hex(10)
print("a:", a, "b:", b, "c:", c)
print(a + b + c)  # 0b10100o120xa
print(type(a))  # <class 'str'>

# 浮点型:由整数和小数组成
a = 0.1
b = 0.1
c = 0.2
print(a + b)  # 0.2
print(b + c)  # 0.30000000000000004 计算浮点数有一定的误差
print((b + c) > 0.3)  # True
print((b + c) < 0.3)  # False
print((b + c) == 0.3)  # False

# 科学计数法:<实数>e<整数>,整数指10的x次方
print(0.314e1)  # 3.14
print(31.4e-1)  # 3.14
print(1.25e4)  # 12500.0

# 复数
# 由实部(real)和虚部(imag)组成
a = 1 + 2j
print(a)  # (1+2j)
b = complex(1, 2)
print(b)  # (1+2j) 等同于上方的"a"
print(type(a.real))  # <class 'float'> 查看实部类型
print(type(a.imag))  # <class 'float'> 查看虚部类型

# 布尔类型:False(0),True(1)
# 非零即真
# 为假的常见值:None False 0(整数) 0.0(浮点数) 0+0j(复数) ''(空字符串) [](空列表) {}(空字典)
a = bool(12)
c = bool("Hello World")
b = bool("")  # 等价于bool()
d = bool(" ")
e = bool(None)
print("a:", a, "b:", b, "c:", c, "d:", d, "e:", e)  # a: True b: False c: True d: True e: False

# 字符串:是连续的字符序列,可以是计算机所能表示的一切字符的集合
# 由""(双引号),''(单引号)或三对单/双引号构成
# 在引号中,不能出现与最外侧相同的引号
a = "12'a'3"
print(a)

# 转义字符
print("Python是一种面向对象的\n解释型高级程序设计语言")  # \n表示换行符
print("Python是一种面向对象的\t解释型高级程序设计语言")  # \t表示水平制表符(TAB)
print("\"Python\"是一种面向对象的解释型高级程序设计语言")  # \"表示双引号,单引号同理
print(r"\"Python\"是一种面向对象的解释型高级程序设计语言")  # 开头加上 r/R 表示原样输出,不进行转义

# 二.数据类型的转换
# 1.其他类型转换为整型
print(int(3.14))  # 3 完全舍去小数部分,并不是四舍五入
print(int(True))  # 1
c = int("123")
print(c, type(c))  # 123 <class 'int'>
# print(int("12a3"))  # 字符串必须是类似数字规范的字符串,若有其他符号或字母,则无法转换(ValueError)

# 2.其他类型转换为浮点型
# 字符串必须是类似数字规范的字符串,若有其他符号(小数点除外)或字母,则无法转换(ValueError)
print(float(3))  # 3.0
print(float(True))  # 1.0
a = float("123")
print(a, type(a))  # 123.0 <class 'float'>
print(float("1.23"))  # 1.23

# 3.其他类型转换为布尔型
print(bool(3))  # True
print(bool(3.14))  # True
print(bool(""))  # False

# 4.其他类型转换为字符串
print(str(3.14))  # 3.14
print(str(10))  # 10
print(str(False))  # False
