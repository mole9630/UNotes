# 02-请求与响应

## 04-json数据传递参数
### @RequestParam与@RequestBody区别
- 区别
  - @RequestParam用于接收url地址传参, 表单传参[application/X-WWW-form-urlencoded]
  - @RequestBody用于接收json数据[application/json]
- 应用
  - 后期开发中, 发送json格式数据为主, @RequestBody应用较广
  - 如果发送非json格式数据, 选用@RequestParam接收请求参数