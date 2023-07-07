import os

import requests
from lxml import etree

if not os.path.exists('./output'):
    os.mkdir('./output')

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36 Edg/116.0.0.0'
}
count = 0

for i in range(1, 6):
    if i == 1:
        url = 'http://www.netbian.com/'
    else:
        url = f'http://www.netbian.com/index_{i}.htm'

    req = requests.get(url, headers=headers)
    text = req.text

    html = etree.HTML(text)
    src_list = html.xpath('//div[@class="list"]/ul/li/a/img/@src')  # //表从任意位置开始
    title_list = html.xpath('//div[@class="list"]/ul/li/a/b/text()')  # //表从任意位置开始
    # 解决乱码
    title_list = [title.encode('iso-8859-1').decode('gbk') for title in title_list]

    # print(len(src_list))
    # print(len(title_list))

    if len(src_list) != len(title_list):
        print('图片名及图片数量不匹配, 请重试')
    else:
        for index, text in enumerate(src_list):
            name = str(title_list[index]).replace('|', '')  # 处理文件名中的特殊字符
            file_name = r'./output/' + name + '.jpg'
            with open(file_name, 'wb') as f:
                f.write(requests.get(text).content)
                count += 1
                print(f'{count}、{title_list[index]} | 已完成')