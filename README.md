# Maven：将一个项目按需求拆分为多个工程
## 背景
如果一个maven项目过于庞大，这时会出现各种问题，比如：
- 管理复杂，维护成本高
- 开发人员职责模糊，项目熟悉门槛高
- 耦合
- 代码边界模糊
- 等等

这时一个好的解决方案就是：借助maven，将一个庞大且复杂的项目拆分为多个工程。

## 原理：
>维护一个父工程(原工程可以作为父工程)，它引入了所有的外部依赖，是运行的入口。
>把拆分出来的模块作为子工程，各个子工程的之间维持其依赖关系。

## 具体操作
- 建立父工程，并划分子模块
父工程pom中声明子模块：
```
<modules>
        <module>mytest-controller</module>
        <module>mytest-service</module>
        <module>mytest-util</module>
        <module>mytest-dao</module>
        <module>mytest-web</module>
</modules>
```
- 理清模块关系
理清模块间的依赖关系，然后在pom中声明这种依赖。
如父工程依赖于子模块dao
```
        <dependency>
            <groupId>cn.edw</groupId>
            <artifactId>dao</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
```

这里的项目把持久层DAO提取出来了，也可以把其他模块分离出来。



