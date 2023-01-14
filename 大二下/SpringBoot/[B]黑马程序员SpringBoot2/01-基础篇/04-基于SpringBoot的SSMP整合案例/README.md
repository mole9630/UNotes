# 04-基于SpringBoot的SSMP整合案例

## 03R-业务层快速开发
### 快速开发方案
- 使用业务层通用接口(ISerivce<T>)快速开发Service
- 使用业务层通用实现类(ServiceImpl<M,T>)快速开发ServiceImpl
- 在通用类基础上做功能重载或功能追加
- 注意重载时不要覆盖原始操作, 避免原始提供的功能丢失