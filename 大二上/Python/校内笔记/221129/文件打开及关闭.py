# 一、文件的打开
"""
    1.使用内置的open()函数打开文件,如果打开成功返回一个文件对象
        格式:open("文件名/文件路径"[,"访问模式","编码格式"])
            编码格式:utf-8,GBK(微软标准),cp936,GB18030(中国国家标准)
            访问模式:默认'r'只读模式
                'r'只读模式
                    1)只可以读不能写
                    2)如果文件不存在则报错
                    3)如果文件存在,打开文件,光标至于文件开头
                'w'只写模式
                    1)只可以写不能读
                    2)如果文件不存在则创建新文件
                    3)如果文件存在,则打开文件,清空原内容,并将光标至于文件开头写入数据
                'a'追加模式
                    1)只可以写不能读
                    2)如果文件不存在则创建新文件
                    3)如果文件存在,则打开文件,不会清空原内容,并将光标至于文件末尾写入数据
    2.另外一种文件打开方式,上下文管理语句with,好处是可以自动调用close()方法
"""


# 1.使用内置的open()函数打开文件,如果打开成功返回一个文件对象

def functionRead():
    print("--- functionRead ---")
    try:
        file = open("test.txt", "r")
        print(file.read())
        file.write("test python write")
        file.close()  # 关闭文件
        print(file.closed)  # 如果文件关闭成功返回true否则返回false
    except Exception as e:
        print("[ERROR] ", e)
    print("--- functionRead-END ---\n")


def functionWrite():
    print("--- functionWrite ---")
    try:
        file = open("test1.txt", "w", encoding="utf-8")
        file.write("test python write")
        print(file.read())
        file.close()  # 关闭文件
    except Exception as e:
        print("[ERROR] ", e)
    print("--- functionWrite-END ---\n")


def functionA():
    print("--- functionA ---")
    try:
        file = open("test2.txt", "a", encoding="utf-8")
        file.write(" test python write |")
        print(file.read())
        file.close()  # 关闭文件
    except Exception as e:
        print("[ERROR] ", e)
    print("--- functioA-END ---\n")


if __name__ == "__main__":
    functionRead()
    functionWrite()
    functionA()

# 2.另外一种文件打开方式,上下文管理语句with,好处是可以自动调用close()方法
with open('test.txt', 'r', encoding="utf-8") as file:
    print(file.read())
    print(file.read())
    print(file.closed)  # False 在with语句内测试文件是否关闭
print(file.closed)  # True 在with语句内测试文件是否关闭
