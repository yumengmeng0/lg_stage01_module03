package p05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description:
 */
public class GenericTest {

    public static void main(String[] args) {

        List<Animal> list1 = new ArrayList<>();
        List<Dog> list2 = new ArrayList<>();

        /**
         * Animal 和 Dog 是父子关系
         * 但 List<Animal> 和 List<Dog> 不是父子关系
         */
        //  list1 = list2; // 报错


        // 使用通配符作为泛型类型的公共父类
        List<?> list3 = new ArrayList<>();

        list3 = list1; // List<Animal>可以转换为List<？>
        list3 = list2; // List<Dog>可以转换为List<？>

        // 不支持元素的添加操作
//        list3.add(new Animal()); // 不能存放Animal
//        list3.add(new Dog()); // capture of ?， 不能存放Dog

        Object o = list3.get(0);// 支持元素的获取，全部当作Object；

        System.out.println(" ============ ");

        List<? extends Animal> list4 = new ArrayList<>();

//        list4.add(new Animal()); // 不支持元素的添加操作
        Animal animal = list4.get(0);


        System.out.println(" ============ ");
        List<? super Animal> list5 = new ArrayList<>();

        list5.add(new Animal());
        list5.add(new Dog());

//        list5.add(new Object()); // 错误，超过了Animal的范围

        Object object = list5.get(0);

    }


}
