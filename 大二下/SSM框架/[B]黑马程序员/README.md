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
  - 05-案例-数据源对象管理(druid, c3p0)
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