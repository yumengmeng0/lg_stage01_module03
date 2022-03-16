# String类

## 1. String类的概念
* java.lang.String类用于描述字符串，Java程序中所有的字符串字面值都可以使用该类的对象加以描述。
* 由final关键字修饰，不能被继承
* 从jdk9开始底层不使用char[]来存储数据，改成byte[]加上编码标记，节约空间
* String类描述的字符串是个常量，不可以更改，因此可以被共享使用。
    
 ## 2. 常量池的概念
 * 由于String类型描述的字符串内容是常量不可改变，因此虚拟机将首次出现的字符串放入常量池中，若后续代码中出现了相同字符串则直接使用池中已有的字符串对象，
    而无需申请内存及创建对象，从而提高性能
   
## 3. 常用构造方法

| 方法声明 | 功能介绍 |
| --- | --- |
| String() | 无参方式构造对象得到空字符序列 |
| String(byte[] bytes, int offset, int length) | |
| String(byte[] bytes) | |
| String(char[] value, int offset, int length) | |
| String(char[] value) | |
| String(String original) | 根据参数指定的字符串内容来构造对象，新创建对象为参数对象的副本 |

## 4. 常用成员方法

| 方法声明 | 功能介绍 |
| --- | --- |
| String toString() | 返回字符串本身 |
| byte[] getBytes() | 将当前字符串内容转换为byte数组并返回 |
| char[] toCharArray() | 将字符串转换为char数组并返回 |
| char charAt(int index) | 返回字符串指定位置的字符 |
| int length() |  |
| boolean isEmpty() |  |
| String concat(String s) | 字符串拼接 |
| boolean contains(CharSequence s) | 判断当前字符串是否包含参数指定内容 |
| String toLowerCase(String s) | 小写 |
| String toUpperCase(String s) | 大写 |
| String trim() | 返回去掉前导和后继空白的字符串 |
| boolean startsWith(String prefix) | 判断字符串是否以参数字符串开头 |
| boolean startsWith(String prefix, int toffset) | 从指定位置开始是否以参数字符串开头 |
| boolean endWith(String suffix) |  |
| boolean equals(Object anObject) | 比较字符串是否相等并返回 |
| boolean hashCode() |  |
| int indexOf(int ch) | 返回当前字符串中参数ch指定的字符第一次出现的下标 |
| int indexOf(int ch, int fromIndex) | 从fromIndex位置开始查找ch指定的字符 |
| int indexOf(String s) | |
| int indexOf(String s, int fromIndex) | |
| int lastIndexOf(int ch) | 返回当前字符串中参数ch指定的字符第一次出现的下标 |
| int lastIndexOf(int ch, int fromIndex) | 从fromIndex位置开始查找ch指定的字符 |
| int lastIndexOf(String s) | 返回字符串s最后一次出现的下标 |
| int lastIndexOf(String s, int fromIndex) | |
| String subString(String s) |  |
| String subString(int beginIndex, int endIndex) |  |
| String subString(int beginIndex) |  |


## 5. 正则表达式
| 正则表达式 | 说明 |
| --- | --- |
| ^ | 开头 |
| [abc] | 可出现a、b、c任意一个字符 |
| [^abc] | 可出现任意非a、b、c字符 |
| [a-z] | 可以出现a-z中任意一个字符 |
| [a-zA-z0-9] | 可以出现a-z、A-Z、0-9中任意一个字符 |
| . | 任意一个字符  |
| \d | 任意一个数字字符，即[0-9]  |
| \D | 任意一个非数字字符  |
| \s | 空白字符，即[\t\n\x0b\f\r]  |
| \S | 非空白字符  |
| \w | 任意一个单词字符，即[a-zA-z0-9]  |
| \W | 任意一个非单词字符  |
| X? | X可以出现1次或0次  |
| X* | X可以出现0次或多次  |
| X+ | X可以出现1次或多次  |
| X{n} | X可以出现n次  |
| X{n,} | X可以至少出现n次  |
| X{n,m} | X可以出现n到m次  |

## 6. 正则表达式相关方法

| 方法名称 | 说明 |
| --- | --- |
| boolean matches(String regex) | 判断当前正在调用的字符串是否匹配参数指定的正则表达式规则 |
| String replace(char oldChar, char newChar) |  |
| String replaceFirst(String regex, String replacement) | 替换此字符串匹配给定的正则表达式的第一个子字符串 |
| String replaceAll(String regex, String replacement) | 将正则表达式regex的字符串替换成replacement |
