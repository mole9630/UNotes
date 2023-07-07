import requests

url = r'http://img.netbian.com/file/2023/0702/171216oXbbd.jpg'
header = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36'}

req = requests.get(url, header)

with open(r'./pic.jpg', 'wb') as file:
    file.write(req.content)