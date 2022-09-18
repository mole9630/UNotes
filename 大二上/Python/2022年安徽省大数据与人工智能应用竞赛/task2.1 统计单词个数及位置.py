open_file = open("material/task2_1.txt")  # 打开txt文件
message = open_file.read()  # 读取txt文件内容并赋值到message
message = message.lower().replace(',', ' ').replace('.', ' ').replace('!',
                                                                      ' ')  # 先用lower函数将所有字母转换为小写,在用replace函数替换所有特殊字符转为空格
list_message = message.split()  # 用split方法以缺省的空字符分割每个字符串
count_1, count_2 = 0, 0  # 定义计数函数,并赋初始值为0
judge_1 = "is"  # 需要判断的单词
judge_2 = "a"  # 需要判断的单词
location = 0  # 定义索引位置计数变量,并赋初始值为0
location_set1, location_set2 = [], []  # 储存位置的列表
for i in list_message:  # 遍历list_message列表
    location += 1  # 如果是则加1
    if i == judge_1:  # 判断列表中的每个值是否等于需要判断的字符
        count_1 += 1  # 如果是则加1
        location_set1.append(location)  # 如果是则记录索引下标
    if i == judge_2:  # 判断列表中的每个值是否等于需要判断的字符
        count_2 += 1  # 如果是则加1
        location_set2.append(location)  # 如果是则记录索引下标
print("\"%s\" 在该文章中有 %d 个" % (judge_1, count_1))  # 最终输出计数结果
print("\"%s\" 在该文章中有 %d 个" % (judge_2, count_2))  # 最终输出计数结果
print(location_set1)
print(location_set2)
