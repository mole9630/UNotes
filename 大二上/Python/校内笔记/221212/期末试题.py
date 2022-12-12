class Student:
    def __init__(self, name, age, sex):
        self.Age = age
        self.Name = name
        self.Sex = sex

    def display(self):
        print("姓名：{0:s}".format(self.Name))
        print("年龄：{0:d}".format(self.Age))
        print("性别：{0:s}".format(self.Sex))


if __name__ == "__main__":
    stu = Student('李明', 18, "男")  # 传递时, 按照顺序传递
    stu.display()


# 已知定义一个Person类如下代码所示
class Person():
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def say_hi(self):
        print("I'am {0:s},{1:d} years old.".format(self.name, self.age))
# 请编写一个继承自Person类的子类Child，重写__init__()方法，实现对name，age# 的初始化，并实例化一个name = ‘xiaoming’、age=6的Child类对象
# 调用# say_hi()方法，输出如下所示内容： I'am xiaoming,6 years old.
