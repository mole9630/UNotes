# 02-依赖注入方式

## TIPS
### 注解开发定义bean
- Spring提供@Component注解的三个衍生注解
  - @Controller:用于表现层bean的定义
  - @Service:用于业务层bean的定义
  - @Repository:用于数据层bean的定义

## 07-注解开发总结
### XML配置比对注解配置
|功能|XML配置|注解|
|:--:|:--:|:--:|
|**定义bean**|**bean标签**(id属性,class属性)|**@Component**(@Controller,@Service(实用),@Repository), **@ComponentScan(实用)**|
|**设置依赖注入**|**setter注入**(set方法)(引用/简单类型) **构造器注入**(构造方法)(引用/简单类型) **自动装配**|**@Autowired(实用)**(@Qualifier) **@Value**|
|**配置第三方bean**|**bean标签**(静态工厂,实例工厂,FactoryBean)|**@Bean(实用)**|
|**作用范围**|**scope属性**|**@Scope**|
|**生命周期**|**标准接口**(init-method destroy-method)|**@PostConstructor** **@PreDestroy**|