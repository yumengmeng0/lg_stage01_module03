package p02;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class StringTest {
    public static void main(String[] args) {

        // 1.使用无参方式构造对象
        String s1 = new String();
        System.out.println("s1 = " + s1);
        // 2.使用参数指定的byte数组来构造对象
        byte[] bytes = {97, 98, 99, 100, 101}; // abcd

        String s2 = new String(bytes, 1, 3);
        System.out.println("s2 = " + s2);

        // 3.使用字符数组构造字符串
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars, 1, 3);
        System.out.println("s3 = " + s3);

        // 4.使用字符串构造对象
        String my = new String("my");
        System.out.println("my = " + my);


        // 5.考点
        // 5.1 下面代码会创建几个对象？分别存放在什么地方？
        // String str1 = "hello"; // 1个对象，常量池

        String hello = new String("hello"); // 2个，一个在常量池，一个在堆区


        // 5.2 常量池和堆区对象的比较
        String str1 = "hello"; // 常量池
        String str2 = "hello"; // 常量池
        String str3 = new String("hello"); // 堆区
        String str4 = new String("hello"); // 堆区

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true
        System.out.println(str2.equals(str4)); // false

        // 3.常量优化
        String str5 = "abcd";
        String str6 = "ab" + "cd"; // 常量优化机制
        System.out.println("(str5==str6 = " + (str5 == str6)); // 比较地址 true

        String str7 = "ab";
        String str8 = str7 + "cd";
        System.out.println("(str8==str5) = " + (str8 == str5)); // 比较地址 false

        System.out.println(" ============== ");

        String s = new String(" Hello World! ");
        boolean b1 = s.contains("he");
        System.out.println("b1 = " + b1);
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());


    }
}
