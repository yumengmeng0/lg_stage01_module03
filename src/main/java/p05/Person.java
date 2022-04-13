package p05;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description: 自定义Person类其中，T相当于形式参数占位，具体数值由实参决定
 *
 * @param <T> 看作一种名字为T的类型
 */
public class Person<T> {
    private String name;
    private int age;

    private T gender;

    public Person() {
    }

    public Person(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getGender() {
        return gender;
    }


    // 不是泛型方法，该方法不能用static修饰，T在new对象时才能确定
    public void setGender(T gender) {
        this.gender = gender;
    }

    // 自定义方法实现将参数指定数组中所有元素打印出来
    public static  <T1> void printArray(T1[] arr) {
        for (T1 t1 : arr) {
            System.out.println("t1 = " + t1);
        }
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
