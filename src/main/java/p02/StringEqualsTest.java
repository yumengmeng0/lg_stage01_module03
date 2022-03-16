package p02;

import java.util.Scanner;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class StringEqualsTest {

    public static void main(String[] args) {
        // 1.提示用户从键盘输入用户名和密码
        System.out.println("请输入用户名和密码：");
        // 2.判断用户名和密码是否为admin和123456
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        String password = scanner.next();

        if ("admin".equals(userName) && "123456".equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

    }
}
