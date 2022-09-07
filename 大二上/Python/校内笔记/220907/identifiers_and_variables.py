# 保留字
import keyword

print(keyword.kwlist)  # 显示Python内的保留字
false = "Hello World"
print(false)  # 保留字大小写敏感,大小写不同可正常使用
# False = "Hello World"  # 报错(SyntaxError)

# 标识符
# 由字母,数字,下划线(_)组成,且第一个不能是数字
# 不能使用Python中的保留字
_ = "_"
print("_:", _)

# 变量
# 变量同样大小写敏感
# 不建议使用大写的"o"(O),小写的"L"(l)以及中文
# 不建议使用以下划线开头的变量
# 建议使用全小写在表示变量,用大写表示常量
number = 1
Number = 2
O_0 = 3  # 首字母为大写的O
l_0 = 3  # 首字母为小写的l
名字 = "张三"
print(number, " | ", Number, " | ", 名字)

print(type(number))  # <class 'int'>
print(type(名字))  # <class 'str'>

# 变量的交换(变量无需声明,Python是一种动态语言)
a, b = 1, 2  # 同时赋值(关联到不同对象,变量和对象数量要对应,不能多/少)
c = a
a = b
b = c
print("a:", a, "b:", b, "c:", c)

a = 1
b = a
# ↑等价于 a = b = 1 (链式赋值(关联到同一对象))
print("a:", id(a), "b:", id(b))
