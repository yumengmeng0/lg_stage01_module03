package p02;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class StringIndexTest {
    public static void main(String[] args) {
        String s = new String("Good Good Study, Day Day Up!");
        int g = s.indexOf('g');
        System.out.println("g = " + g);  // -1
        System.out.println(s.indexOf('G'));  // 0

        // 查找所有字符串位置
        int pos = 0;
        while ((pos = s.indexOf("Day", pos)) != -1) {
            System.out.println("pos = " + pos);
            pos += "day".length();
        }
    }
}
