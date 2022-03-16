package p02;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description: 判断字符串是否为回文
 */
public class StringJudgeTest {
    public static void main(String[] args) {
        String str1 = new String("上海自来水来自海上");
        String str2 = new String("上海自来水来自海上1");

        System.out.println(isPlalindrome(str1));
        System.out.println(isPlalindrome(str2));

    }


    /**
     * 判断字符串是否为回文
     * @param s
     * @return
     */
    public static boolean isPlalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
