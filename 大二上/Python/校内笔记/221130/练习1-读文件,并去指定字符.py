# 练习1-读取一个文件,打印除了以'#'开头以外的所有行


# text.startswith('#') 判断字符串是否以'#'开头,是返回True,否返回False
# text.endswith('#') 判断字符串是否以'#'结尾,是返回True,否返回False
def function():
    with open('test.txt', 'r', encoding='utf-8') as file:
        return [i for i in file.readlines() if not i.startswith('#') ]

print(function())