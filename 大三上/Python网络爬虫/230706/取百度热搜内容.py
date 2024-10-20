import requests
from lxml import etree

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36 Edg/116.0.0.0'
}
url = 'https://www.baidu.com/'

req = requests.get(url, headers=headers)
text = req.text

html = etree.HTML(text)
# req_list = html.xpath('//ul[@id="hotsearch-content-wrapper"]/li/a/span[@class="title-content-title"]/text()')  # //表从任意位置开始
req_list = html.xpath('//ul[@id="hotsearch-content-wrapper"]//span[@class="title-content-title"]/text()')  # //表从任意位置开始
for index, text in enumerate(req_list):
    print(f'{index + 1}、{text}')