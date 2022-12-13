def function():
    try:
        with open("车牌.txt", "r", encoding="gbk") as file:
            text = file.read()
            # print(type(text))  # <class 'str'>
            list = eval(text)
            # print(type(list))  # <class 'list'>

            print("--- 输入车牌信息输出对应城市 ---")
            str = input("请输入车牌信息(例:皖A):")
            # ---------------------------------------------------
            # if str in list:  # 判断用户输入的是否存在
            #     index = list.index(str)
            #     print(f"车牌{str}对应的城市名为:{list[index+1]}")
            # ---------------------------------------------------
            for index, item in enumerate(list):
                if str == item:
                    print(f"车牌{str}对应的城市名为:{list[index+1]}")
                    break
            # ---------------------------------------------------
            else:
                print("非法输入!")
    except Exception as e:
        print("[ERROR] ", e)


if __name__ == "__main__":
    function()
