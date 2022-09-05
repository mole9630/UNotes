symbol = input('请输入要兑换的货币符号(￥/$):')
money = float(input('请输入要换算的金额:'))
if symbol == '￥':
    USD = money * 0.1440
    print(money, '元美元可以兑换', USD, '元人民币')
if symbol == '$':
    CNY = money * 6.94
    print(money, '元美元可以兑换', CNY,'元人民币')
print('汇率随时变动,请以实际为准!')