package p02;

/**
 * @author: ymm
 * @date: 2022/3/16
 * @version: 1.0.0
 * @description:
 */
public class StringRegexMethodTest {

    public static void main(String[] args) {

        String str = "1001,zhangfei,30";

        // 字符串切割
        String[] split = str.split(",");
//        s = 1001
//        s = zhangfei
//        s = 30
        for (String s : split) {
            System.out.println("s = " + s);
        }

        // 替换字符
        String replace = str.replace(',', '.');
        System.out.println("replace = " + replace); // 1001.zhangfei.30

        // 替换子串

        String a = str.replaceFirst(",", "a");
        System.out.println("a = " + a); // 1001azhangfei,30
        String all = str.replaceAll(",", "a");

        System.out.println("all = " + all); // 1001azhangfeia30


    }
}
