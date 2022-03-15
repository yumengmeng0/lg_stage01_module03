package p01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.1");
        BigDecimal b2 = new BigDecimal("2.2");
        System.out.println("b1.add(b2) = " + b1.add(b2));
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        System.out.println("b1.divide(b2) = " + b1.divide(b2));

        System.out.println(" =============================== ");

        // 实现精确运算
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        BigDecimal b3 = new BigDecimal(0.1);
        BigDecimal b4 = new BigDecimal(0.3);
        System.out.println(b3.add(b4)); // 0.3999999999999999944488848768742172978818416595458984375

        // 构造函数使用基本数据类型和字符串有差别
        BigDecimal b5 = new BigDecimal("0.1");
        BigDecimal b6 = new BigDecimal("0.3");
        System.out.println(b5.add(b6)); // 0.4
        System.out.println(" =============================== ");

        BigDecimal b7 = new BigDecimal("0.1");
        BigDecimal b8 = new BigDecimal("0.3");
//        System.out.println(b7.divide(b8)); // ArithmeticException
        System.out.println(b7.divide(b8, RoundingMode.HALF_UP)); // 0.3


    }
}
