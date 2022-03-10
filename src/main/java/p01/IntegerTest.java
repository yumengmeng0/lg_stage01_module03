package p01;

/**
 * @author: ymm
 * @date: 2022/3/10
 * @version: 1.0.0
 * @description:
 */
public class IntegerTest {
    public static void main(String[] args) {
//        最大值Integer.MAX_VALUE = 2147483647
//        最小值Integer.MIN_VALUE = -2147483648
//        二进制位数Integer.SIZE = 32
//        所占字节个数Integer.BYTES = 4
//        Class实例Integer.TYPE = int
        System.out.println("最大值Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("最小值Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("二进制位数Integer.SIZE = " + Integer.SIZE);
        System.out.println("所占字节个数Integer.BYTES = " + Integer.BYTES);
        System.out.println("对应int类Class实例Integer.TYPE = " + Integer.TYPE);

        // 使用构造方法来构造Integer类型对象并打印（过时）
        Integer integer1 = new Integer(123);
        Integer integer2 = new Integer("123");
        int i1 = Integer.parseInt("123");
        // 使用valueOf代替，从int类型到Integer类型的转换
        Integer i2 = Integer.valueOf(123);
        // 从String类型到Integer类型的转换
        Integer i3 = Integer.valueOf("123");
        
        // 获取调用对象中的整数值
        // 从Integer到int类型的转换
        int i = i3.intValue();
        System.out.println("i = " + i);

    }
}
