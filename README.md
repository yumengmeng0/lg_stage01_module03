# lg_stage01_module03
阶段1模块3：Java核心类库（上）

##一、常用类的概念和使用

### 1.常用的包
#### 1.1 包名可功能

    * java.lang
    * java.util
    * java.io
    * java.net
    * java.sql
    
#### 2.Object类
* equals()
* hashCode()
* toString()


#### 3.包装类
3.1 包装类的概念
    * 通常情况下基本数据类型的变量不是对象，为了满足万物皆对象的理念，
    需要对基本数据类型的变量进行打包封装处理变成对象，
    而负责这些变量声明为成员变量进行对象化处理的相关类，叫做包装类

3.2 包装类的使用总结
    * 基本数据类型转换为对应包装类的方式：valueOf 装箱
    * 获取包装类中基本数据类型变量数值的方式：xxValue 拆箱
    * 字符串转换为基本数据类型的方式：parseXX 字符串转类型

3.3 Math类

3.4 BigDecimal类（小数）
    * 基本概念：由于float类型和double类型在运算时可能会有误差，若希望实现精确运算则借助java.math.BigDecimal类型加以描述。

3.5 BigInteger类
    * 希望表示比long类型还大的整数，需要java.math.BigInteger类
    












##二、String类的概述和使用
##三、可变字符串类和日期类
##四、集合类库（上）
##五、集合类库（下）