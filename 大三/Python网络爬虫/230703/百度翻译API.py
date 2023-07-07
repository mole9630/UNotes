import requests
import json

search = input("请输入要翻译的内容:")

url = r'https://fanyi.baidu.com/sug'
headers = {
    'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36'
}
data = {'kw': search}

req = requests.post(url, headers, data)

# 保存爬取到的json文件
# file_name = search + '.json'
# file = open(file_name, 'w', encoding='utf-8')
# json = json.dump(req.json(), fp=file, ensure_ascii=False)

json = json.loads(req.text)['data']
for value in json:
    # print('====== 第' + index + '个 ======')
    print(value['v'])
    print('===================')