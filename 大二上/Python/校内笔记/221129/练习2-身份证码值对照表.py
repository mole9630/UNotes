def function():
    try:
        with open("身份证码值对照表.txt", "r", encoding="utf-8") as file:
            print("--- 输入身份证号码前六位输出对应城市 ---")
            dict = eval(file.read())
            str = input("请输入身份证号码前六位:")

            if str in dict.keys():  # 判断输入的是否在字典的键中
                print(f"\"{str}\"对应的城市为:{dict[str]}")
            else:
                print("非法输入!")
    except Exception as e:
        print("[ERROR] ", e)


if __name__ == "__main__":
    function()
