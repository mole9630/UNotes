# 01-基础篇

## 课程目录
- 01-QuickStart
   - REST风格
   - RESTful入门案例及快速开发
- 02-BaseConflguration
   - 项目基础配置(3种方法)
   - yml及yaml语法规则
   - yml读取单个数据
- 03-整合第三方技术
   - 01-JUint
   - 02-MyBatis
   - SpringBoot整合MyBatis
   - 03-MyBatis-Plus
   - 04-Druid
- 04-基于SpringBoot的SSMP整合案例
   - 01-实体类及数据层标准开发(实体类快速开发(lombok), 数据层标准开发(基于CRUD), 开启MP运行日志, 分页, 条件查询)
   - 02-业务层标准开发(基于CRUD)
   - 03R-业务层快速开发(基于MyBatisPlus构建)
   - 04-表现层标准开发
   - 05-表现层数据一致性处理(R对象)
   - 06-前后端调用P1(axios发送异步请求, 列表, 添加, 删除, 修改)
   - 07-前后端调用P2(异常消息处理, 分页, 分页BUG处理, 条件查询)
- 05R-基础篇总结

## 05R-基础篇总结
### 基于SpringBoot的SSMP整合案例
1. pom.xml
   - 配置起步依赖
2. application.yml
   - 设置数据源、端口、框架技术相关配置等
3. dao
   - 继承BaseMapper、设置@Mapper
4. dao测试类
5. service
   - 调用数据层接口或MyBatis-Plus提供的接口快速开发
6. service测试类
7. controller
   - 基于Restful开发, 使用Postman测试跑通功能
8. 页面
   - 放置在resources目录下的static目录中