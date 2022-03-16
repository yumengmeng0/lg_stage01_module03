package p02;

/**
 * @author: ymm
 * @date: 2022/3/16
 * @version: 1.0.0
 * @description:
 */
public class SubStringTest {

    public static void main(String[] args) {
        String s = new String("hello world");
        System.out.println("s.substring(5) = " + s.substring(5));

        // 整数到字符串的转换
        String s1 = "" + 123;
        String s2 = String.valueOf(123);
    }
}
