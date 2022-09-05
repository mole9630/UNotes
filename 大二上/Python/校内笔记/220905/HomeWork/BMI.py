w = float(input('请输入体重(kg):'))
h = float(input('请输入身高(m):'))
BMI = w / (h * h)
if BMI < 18.5:
    print('身高为:', h, '体重为:', w, 'BMI指数为:', BMI, '您当前过轻')
if BMI > 25:
    print('身高为:', h, '体重为:', w, 'BMI指数为:', BMI, '您当前正常')
if BMI > 28:
    print('身高为:', h, '体重为:', w, 'BMI指数为:', BMI, '您当前过重')
if BMI > 32:
    print('身高为:', h, '体重为:', w, 'BMI指数为:', BMI, '您当前肥胖')
else:
    print('身高为:', h, '体重为:', w, 'BMI指数为:', BMI, '您当前严重肥胖')