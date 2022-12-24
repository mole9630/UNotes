# 03-REST风格

## 01-REST风格简介
### REST简介
- REST(Representational State Transfer), 表现形式状态转换
  - 传统风格资源描述形式
    - http://localhost/user/getById?id=1
    - http://localhost/user/saveUser
  - REST风格描述形式
    - http://localhost/user/1
    - http://localhost/user
- 优点:
  - 隐藏资源的访问行为, 无法通过地址得知对资源是何种操作
  - 书写简化

## 02-RESTful入门案例
### @RequestBody @RequestParam @PathVariable
- 区别
  - @RequestParam用于接收ur1地址传参或表单传参
  - @RequestBody用于接收json数据
  - @PathVariable用于接收路径参数, 使用{参数名称}描述路径参数
- 应用
  - 后期开发中, 发送请求参数超过1个时, 以json格式为主, @RequestBody应用较广
  - 如果发送非json格式数据, 选用@RequestParam接收请求参数
  - 采用RESTful进行开发, 当参数数量较少时, 例如1个, 可以采用@PathVariable接收请求路径变量, 通常用于传递id值