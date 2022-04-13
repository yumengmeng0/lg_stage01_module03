package p05;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description:
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("zhangsan", 11, "男");

        System.out.println("person = " + person);

        System.out.println(" =========== ");

        // 创建对象时指定数据类型，用于给T进行初始化

        Person<String> person1 = new Person<>();
        person1.setGender("女");
        System.out.println("person1 = " + person1);

        Person<Boolean> person2 = new Person<>();
        person2.setGender(true);
        System.out.println("person2 = " + person2);


        System.out.println(" = ");

        Integer[] arr = {11, 22, 33};

        // 调用泛型方法
        Person.printArray(arr);

    }

}
