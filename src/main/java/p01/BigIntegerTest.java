package p01;

import java.math.BigInteger;

/**
 * @author: ymm
 * @date: 2022/3/15
 * @version: 1.0.0
 * @description:
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("20");
        BigInteger bi2 = new BigInteger("8");

        System.out.println("bi1.add(bi2) = " + bi1.add(bi2));
        System.out.println("bi1.remainder(8) = " + bi1.remainder(bi2));// 取余

        // 一次性获得商和余数
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        for (BigInteger bigInteger : arr) {
            System.out.println("bigInteger = " + bigInteger);
        }
    }
}
