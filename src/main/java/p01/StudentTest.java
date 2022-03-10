package p01;

/**
 * @author: ymm
 * @date: 2022/3/10
 * @version: 1.0.0
 * @description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "张三");
        Student s2 = new Student(1002, "李四");
        Student s3 = new Student(1001, "张三");

        System.out.println("(s2==s1) = " + (s2 == s1)); // 比较对象地址
        // Object类继承下来的equals方法默认比较两个对象的地址，查看源码验证
        System.out.println("s2.equals(s1) = " + s2.equals(s1));
        s2 = s1;
        System.out.println("(s2==s1) = " + (s2 == s1));

        System.out.println("*******************");

        System.out.println("(s2==s3) = " + (s2 == s3)); // false 对象地址不同
        System.out.println("(s2==s3) = " + (s2.equals(s3))); // true 重写equals方法后，学号姓名相同则相等。
        System.out.println("*******************");

        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("*******************");
        System.out.println("s3 = " + s3); // s3 = Student{id=1001, name='张三'}
    }
}

