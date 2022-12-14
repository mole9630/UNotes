# SSM框架-Study-notes
摩尔的SSM框架程序开发学习笔记(SSM框架-Study-notes)

## 课程目录
###
- 01-IoC&DI&Bean
  - 01-IoC入门案例(导入Spring坐标, 配置文件获取bean)
  - 02-DI入门案例
  - 03-Bean的配置(bean基础配置, bean别名配置, bean作用范围配置)
  - 04-Bean的实例化(构造方法(常用), 静态工厂(了解), 实例化工厂(了解)与FactoryBean(实用))
  - 05-Bean的生命周期(初始化容器(创建对象(内存分配), 执行构造方法, 执行属性注入(set操作), 执行bean初始化方法, 使用bean, 关闭/销毁容器)
- 02-依赖注入方式
  - 01-setter注入(简单类型(value), 引用类型(ref))
  - 02-构造器注入(简单类型(value), 引用类型(ref))
  - 03-自动装配(概念, 类型)
  - 04-集合注入(数组, Set, Map, Properties)
  - 05-案例:数据源对象管理(druid, c3p0)
  - 06-加载Properties文件信息(加载Properties文件信息, 开启命名空间方式)
  - 07-容器的创建及获取bean(创建容器(2种), 获取bean(3种), BeanFactory)
  - 08R-核心容器总结(容器相关, Bean相关, 依赖注入相关)
- 03-注解开发
  - 01-注解开发定义bean
  - 02-纯注解开发模式
  - 03-注解开发bean作用范围与生命周期管理(@Scope, @PostConstruct, @PreDestroy)
  - 04-注解开发依赖注入(@Autowired, @Qualifier, @PropertySource, @PropertySource)
  - 05-注解开发管理第三方bean(@bean)
  - 06-注解开发实现为第三方bean注入资源
  - 07R-注解开发总结(XML配置比对注解配置)
- 04-Spring整合第三方
  - 01-Spring整个MyBatis思路分析(原生开发)
  - 02-Spring整合MyBatus
  - 03-Spring整合JUnit(@RunWith, @ContextConfiguration)
- 05-AOP
  - 01R-AOP简介
  - 02-AOP入门案例
  - 03R-AOP工作流程
  - 04R-AOP切入点表达式
  - 05R-AOP通知类型
  - 06-案例:测量业务层接口万次执行效率
  - 07R-AOP通知获取数据
  - 08-案例:网盘密码数据兼容处理(通过AOP去前后空格(trim))
- 06-事务
  - 01R-事务简介(案例:模拟银行账户间转账业务)
  - 02R-事务角色
  - 03R-事务属性(案例:转账业务追加日志, 事务传播行为(propagation))
- 07-SpringMVC
  - 01-入门案例
    - 01-SpringMVC入门案例
    - 02R-入门案例工作流程
    - 03R-bean加载控制
  - 02-请求与响应
    - 01-设置请求映射路径(@RequestMapping)
    - 02-get与post请求发普通参数
    - 03-五种类型参数传递(@RequestParam)
    - 04R-json数据传递参数(@EnableWebMvc, @RequestBody)
    - 05-日期型参数传递(@DateTimeFormat)
    - 06-响应(@ResponseBody)
  - 03-REST风格
    - 01R-REST风格简介
    - 02R-RESTful入门案例(@PathVariable)
    - 03-RESTful快速开发(@RestController,@{method}Mapping)
    - 04-案例:基于RESTful页面数据交互(后台接口开发)
  - 04-SSM整合
    - 01-整合配置
    - 02-功能模块开发
    - 03-接口测试
    - 04-表现层与前端数据传输协议实现
    - 05R-异常处理器(@RestControllerAdvice, @ExceptionHandler)
    - 06R-项目异常处理(异常处理器, 自定义异常, 异常编码, 自定义消息)
    - 07-前后台协议联调(查询列表, 新增功能, 修改功能, 删除功能)
  - 05-拦截器
    - 01R-拦截器简介
    - 02R-入门案例
    - 03R-拦截器参数
    - 04R-拦截器链配置