import requests

search = input("请输入要搜索的内容:")

url = r'https://www.baidu.com/s'
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36'}
params = {'ie': 'UTF-8', 'wd': search}

req = requests.get(url=url, headers=headers, params=params)

file_name = search + '.html'
with open(file_name, 'w', encoding='utf-8') as file:
    file.write(req.text)