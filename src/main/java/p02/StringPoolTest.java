package p02;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description: 验证常量池的存在
 */
public class StringPoolTest {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2);  //true
    }
}
