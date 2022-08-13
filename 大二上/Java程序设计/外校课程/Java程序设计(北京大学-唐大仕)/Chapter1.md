### 1.1 Java历史与发展
**Java三大平台**
- Java SE标准版
- Java EE企业版
- Java ME微型版

**Java的开发工具包:JDK**

**Java发展历程**
- 1995 JDK1.0 初创
- 1998 JDK1.2 Java2
- 2000 JDK1.3 改进
- 2002 JDK1.4 稳定
- 2004 JDK1.5 语法增加
- 2006 JDK1.6 广泛
- 2010 Oracle并购Sun
- 2011 JDK1.7 改进
- 2014 JDK1.8 前进大步

### 1.2 Java语言的特点:C++--
**Java首先是一种编程语言**
- 它是面向对象的编程语言(OOP)
- 它的语法结构与C和C++语言极为相似
- Java所用的语法十分简单

**Java的特点**
- 简单易学
- 面向对象
- 平台无关性
- 安全稳定
- 支持多线程

**Java能做什么**
- 面向对象的应用开发
- 各类网络应用程序的开发
- 计算过程的可视化
- 动态画面/交互操作
- Internet的系统管理
- 数据库操作等

**Java是C++--**
- 无直接指针操作
- 自动内存管理
- 数据类型长度固定
- 不用头文件
- 不包含结构和联合
- 不支持宏
- 不用多重继承
- 无类外全局变量
- 无GOTO

### 1.3 Java运行机制:跨平台的原因
**Java三种核心机制**
- Java虚拟机(Java Virtual Machine)
- 代码安全性检测(Code Security)
- 垃圾收集机制(Garbage collection)

**Java程序的编译与运行**

`Source.java`源程序 -编译javac-> `Source.class`字节码(bytecode)平台无关 -运行java ->

**Java虚拟机(Java Virtual Machine)**
- 在一台计算机上由软件或硬件模拟的计算机
- Java虚拟机(JVM)读取并处理经编译过的字节码class文件
  - Java虚拟机规范定义了:
    - 指令集
    - 寄存器集
    - 类文件结构
    - 堆栈
    - 垃圾收集堆
    - 内存区域

**Java运行环境(JRE)**
- JRE(The Java Runtime Environment)
  - JRE = JVM + API(Lib)
- JRE运行程序时的三项主要功能:
  - 加载代码:由`class loader`完成
  - 校验代码:由`bytecode verifier`完成
  - 执行代码:由`runtime interpreter`完成
- 理解
  - 为什么Java是跨平台的
    - 字节码文件与平台无关,不同的系统都有不同的虚拟机,故可跨平台
  - 为什么Java是安全的
    - 里有代码的校验过程

**JDK(Java开发工具包)**
- JDK = JRE + Tools
- JRE = JVM + API
- 提供的工具
  - `javac.exe`:java编译器
  - `java.exe`:java执行器
  - `javadoc.exe`文档生成器
  - `jar.exe`:java打包器
  - `jdb.exe`:java调试器

### 2.1 面向对象程序设计
**对象**
-在现实世界中:
  - 对象是客观世界中的一个实体
- 在计算机世界中:
  - 对象是一个可标识的存储区域


**类**
- 类:具有共同属性和行为的对象集合
  - 属性:变量(字段field)
  - 行为:函数(方法method)
- 类与对象的关系
  - 类是对象的抽象(模板)
  - 对象是类的实例
    - 注:类和对象都统称"对象",为了明确起见,后者称为"对象实例"

**面向对象的三大特征**
- 封装性
  - 模块化:将属性和行为封装在类中,程序定义很多类
  - 信息屏蔽:将类的细节部分隐藏起来,用户只通过受保护的接口访问某个类
- 继承性
  - 父类和字类之间共享数据和方法
  - 继承的好处
    - 更好地进行抽象与分类
    - 增强代码的重用率
    - 提高可维护性
- 多态性
  - 不同的对象收到同一个消息(调用方法)可产生完全不同的效果
  - 实现的细节则由接收对象自行决定
  - eg
    - `foo(Person p){p.sayHello();}`
    - `foo(new Student());`
    - `foo(new Teacher());`

**面向对象设计思想的要点**
- 认为客观世界由