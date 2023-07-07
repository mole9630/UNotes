import requests
from lxml import etree

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36 Edg/116.0.0.0'
}
url = 'https://www.baidu.com/'

req = requests.get(url, headers=headers)
text = req.text

html = etree.HTML(text)
req_list = html.xpath('//div[@id="s-top-left"]/a/text()')  # //表从任意位置开始
href_list = html.xpath('//div[@id="s-top-left"]/a/@href')  # @表取属性
for text in req_list:
    print(text)
for href in href_list:
    print(href)