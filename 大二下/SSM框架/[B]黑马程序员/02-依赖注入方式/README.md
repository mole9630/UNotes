# 02-依赖注入方式

## TIPS
### 依赖注入方式选择
1.强制依赖使用构造器进行, 使用setter注入有概率不进行注入导致nul1对象出现
2.可选依赖使用setter注入进行, 灵活性强
3.Spring框架倡导使用构造器, 第三方框架内部大多数采用构造器注入的形式进行数据初始化, 相对严谨
4.如果有必要可以两者同时使用, 使用构造器注入完成强制依赖的注入, 使用setter注入完成可选依赖的注入
5.实际开发过程中还要根据实际情况分析, 如果受控对象没有提供setter方法就必须使用构造器注入
6.**自己开发的模块推荐使用setter注入**

### 依赖自动装配特征
1.自动装配用于引用类型依赖注入, 不能对简单类型进行操作
2.使用按类型装配时(byType)必须保障容器中相同类型的bean唯一, 推荐使用
3.使用按名称装配时(byName)必须保障容器中具有指定名称的bean, 因变量名与配置耦合, 不推荐使用
4.自动装配优先级低于setter注入与构造器注入, 同时出现时自动装配配置失效

## 08-核心容器总结
### 容器相关
- BeanFactory是IoC容器的顶层接口, 初始化BeanFactory对象时, 加载的bean延迟加载
- ApplicationContext接口是Spring容器的核心接口, 初始化时bean立即加载
- ApplicationContext接口提供基础的bean操作相关方法, 通过其他接口扩展其功能
- ApplicationContext接口常用初始化类
    - ClassPathXmlApplicationContext
    - FileSystemXmlApplicationContext

### Bean相关
`<bean`
    `id=" bookDao"` | bean的Id
    `name="dao bookDaoImpl daoImpl"` | bean别名
    `class="com.itheima.dao.impl.BookDaoImpl"` | bean类型,静态工厂类, FactoryBean类
    `scope="singleton"` | 控制bean的实例数量
    `init-method="init"` | 生命周期初始化方法
    `destroy- method="destory"` | 生命周期销毁方法
    `autowire= "byType'` | 自动装配类型
    `factory - method= "getInstance"` | bean工厂方法,应用于静态工厂或实例工厂
    `factory- bean="com.itheima.factory.BookDaoFactory"` | 实例工厂bean
    `lazy-init= "true"` | 控制bean延迟加载
`/>`

### 依赖注入相关
`<bean id="bookService" class=" com.itheima.service.impl.BookServiceImpl">`
`<constructor-arg name="bookDao" ref= "bookDao"/>`
`<constructor-arg name="userDao" ref="userDao"/>` | 构造器注入引用类型
`<constructor-arg name="msg" value= "WARN"/>` | 构造器注入简单类型
`<constructor-arg type="java.lang.String" index="3" value= "WARN"/>` | 类型匹配与索引匹配
`<property name="bookDao" ref= "bookDao"/>` | setter注入引用类型
`<property name="userDao" ref="userDao"/>`
`<property name="msg" value= "WARN"/>` | setter注入简单类型
`<property name="names">` | setter注入集合类型
`<list>` | list集合
`<value>itcast</value>` | 集合注入简单类型
`<ref bean="dataSource"/>` | 集合注入引用类型
`</list>`
`</property>`
`</bean>`