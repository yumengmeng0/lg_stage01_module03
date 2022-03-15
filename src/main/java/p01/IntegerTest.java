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
        // 使用valueOf代替，从int类型到Integer类型的转换，装箱
        Integer i2 = Integer.valueOf(123);
        // 从String类型到Integer类型的转换
        Integer i3 = Integer.valueOf("123");
        
        // 获取调用对象中的整数值
        // 从Integer到int类型的转换，拆箱
        int i = i3.intValue();
        System.out.println("i = " + i);

        System.out.println("********************");
        // 从Java5开始增加了自动装箱和拆箱的机制
        Integer integer = 100; // 直接通过赋值运算实现自动装箱
        int i4 = integer;  // 直接通过赋值运算实现自动拆箱
        System.out.println("********************");
        // 装箱和拆箱的笔试考点
        Integer i5 = 128;
        Integer i6 = 128;
        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);


        System.out.println("(i5==i6) = " + (i5==i6)); // 比较地址 false
        System.out.println("(i5.equals(i6)) = " + (i5.equals(i6))); // 比较内容 true
        System.out.println("(i7==i8) = " + (i7==i8));
        System.out.println("(i7equals(i8)) = " + (i7.equals(i8)));

        // 自动装箱池-128~127整数已经装箱完毕，提高效率
        Integer i9 = 127;
        Integer i10 = 127;
        System.out.println("(i9==i10) = " + (i9 == i10)); // true

        System.out.println("********************");

        // 静态方法的调用
        int ip1 = Integer.parseInt("100");



    }
}
