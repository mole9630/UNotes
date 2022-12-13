# 一、文件读操作
"""
    1.read():读取指定字节数据,将读取的内容以字符串形式返回
        格式:对象名([size])  -size可以省略,用于设定读取数据的字节数
    2.readline():可以从文件中读取一行数据
    3.readlines():读取所有行并以列表形式返回
"""
# 二、文件写操作
"""
    1.write():将字符串写入文件中
    2.writelines():将一个列表写入文件中
"""

# 1.read():读取指定字节数据,将读取的内容以字符串形式返回
with open('test.txt', 'r', encoding='utf-8') as file:
    print(file.read(1))
    print(file.read(2))
    print(file.read())

# 2.readline():可以从文件中读取一行数据
with open('test.txt', 'r', encoding='utf-8') as file:
    print(file.readline())
    print(file.readline())

# 3.readlines():读取所有行并以列表形式返回
with open('test.txt', 'r', encoding='utf-8') as file:
    print(file.readlines())

# 1.write():将字符串写入文件中
with open('test2.txt', 'w', encoding='utf-8') as file2:
    file2.write('测试写入文件\n')
    file2.write('# author:mole9630\n')
    file2.write('# date:2022/11/30')

# 2.writelines():将一个列表写入文件中
with open('test3.txt', 'w', encoding='utf-8') as file3:
    text = ['测试写入文件\n', '# author:mole9630\n', '# date:2022/11/30']
    file3.writelines(text)