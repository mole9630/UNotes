import requests
import json

url = r'http://www.xinfadi.com.cn/getCat.html'
headers = {
    'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36'
}
data = {'prodCatid': '1186'}

req = requests.post(url, headers, data)


json = json.loads(req.text)['list']
for value in json:
    print('商品名称:' + value['prodName'])
    print('平均价格:' + value['avgPrice'])
    print('产地:' + value['place'])
    print('===================')