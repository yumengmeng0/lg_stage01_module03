package p02;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class StringByteCharTest {

    public static void main(String[] args) {
        String str1 = "hello";

        // 将String类型转换为字节数组（ascii值）
        byte[] bytes = str1.getBytes();
        for (byte aByte : bytes) {
            System.out.println("aByte = " + aByte);
        }

        String s = new String(bytes);
        System.out.println("s = " + s);

        // 将字符串转换为char数组
        char[] chars = str1.toCharArray();
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }

        String s1 = new String(chars);
        System.out.println("s1 = " + s1);



    }
}
