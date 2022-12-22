# 01-入门案例

## 01-SpringMVC入门案例
### 注解
- @Controller
  - 类型:类注解
  - 位置:SpringMVC控制器类定义上方
  - 作用:设定SpringMVC的核心控制器bean
- @RequestMapping
  - 类型:方法注解
  - 位置:SpringMVC控制器方法定义上方
  - 作用:设置当前控制器方法请求访问路径
- @ResponseBody
  - 类型:方法注解
  - 位置:SpringMVC控制器方法定义上方
  - 作用:设置当前控制器方法响应内容为当前返回值, 无需解析

## 02-入门案例工作流程
- 启动服务器初始化过程
  1. 服务器启动, 执行ServletContainersInitConfig类, 初始化web容器
  2. 执行createServletApplicationContext方法, 创建了WebApplicationContext对象
  3. 加载SpringMvcConfig
  4. 执行@ComponentScan加载对应的bean
  5. 加载UserController, 每个@RequestMapping的名称对应一个具体的方法
  6. 执行getServletMappings方法, 定义所有的请求都通过SpringMVC
- 单次请求过程
  1. 发送请求localhost/save
  2. web容器发现所有 请求都经过SpringMVC, 将请求交给SpringMVC处理
  3. 解析请求路径/save
  4. 由/save匹配执行对应的方法save()
  5. 执行save()
  6. 检测到有@ResponseBody直接将save()方法的返回值作为响应求体返回给请求方

## 03-bean加载控制
### Controller加载控制与业务bean加载控制
- SpringMVC相关bean(表现层bean)
- Spring控制的bean
  - 业务bean(Service)
  - 功能bean(DataSource等)
- SpringMVC相关bean加载控制
  - SpringMVC加载的bean对应的包均在com.itheima.controller包内
- Spring相关bean加载控制
  - 方式一:.Spring加载的bean设定扫描范围为com.itheima, 排除掉controller包内的bean
  - 方式二:Spring加载的bean设定扫描范围为精准范围, 例如service包、dao包等