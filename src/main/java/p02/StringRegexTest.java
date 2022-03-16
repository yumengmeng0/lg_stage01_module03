package p02;

/**
 * @author: ymm
 * @date: 2022/3/16
 * @version: 1.0.0
 * @description: 正则表达式
 */
public class StringRegexTest {

    public static void main(String[] args) {
        // 6位数字
        String regex = "^[0-9]{6}$";
        String regex1 = "[0-9]{6}.";  // 前六位是数字
        String regex2 = "\\d{6}";
        String password = "123456";
        System.out.println("password.matches(regex) = " + password.matches(regex));
        System.out.println("password.matches(regex1) = " + password.matches(regex1));
        System.out.println("password.matches(regex2) = " + password.matches(regex2));
        System.out.println(" ================= ");
        
        // QQ号码的正则表达式，由非0开头的5-15位数字组成
        
        
        String qqRegex = "[^0]\\d{5,15}";
        String qqRegex1 = "[1-9]\\d{4,14}";
        String qq = "1236";
        System.out.println("qq.matches(qqRegex) = " + qq.matches(qqRegex));
        System.out.println(" ================= ");
        // 手机号码：1开头，第二位3、4、5、7、8中的一位，总共11位
        String phoneRegex = "1[3,4,5,7,8]\\d{9}";
        String phone = "12078587303";
        System.out.println("phone.matches(phoneRegex) = " + phone.matches(phoneRegex));
        System.out.println(" ================= ");

        // 身份证号：总共18位，前6位代表地区。4位代表年，2位数字代表月，2位代表日，3位代表个人，最后就一位可能是数字也可能是X
        String idRegex = "\\d{6}\\d{4}\\d{2}\\d{2}\\d{3}[\\d,X]";
        String idRegex1 = "\\d{6}\\d{4}\\d{2}\\d{2}\\d{3}[\\d|X]";
        String id = "411528199205171930";
        System.out.println("id.matches(idRegex) = " + id.matches(idRegex));
        System.out.println("id.matches(idRegex) = " + id.matches(idRegex1));

        System.out.println(" ================= ");

    }
}
