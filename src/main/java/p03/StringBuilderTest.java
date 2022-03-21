package p03;

/**
 * @author: ymm
 * @date: 2022/3/17
 * @version: 1.0.0
 * @description:
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println("容量：" + sb.capacity()); // 21 = 16 + 5
        System.out.println("长度：" + sb.length()); // 5
        StringBuilder sb1 = new StringBuilder(55);
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 55

        // 插入
        StringBuilder world = sb.insert(0, "world");
        System.out.println("world = " + world); // worldhello
        StringBuilder world1 = sb.append("world"); // 返回的是调用对象自己的引用
        System.out.println("world1 = " + world1);

    }
}
