package p04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/3/23
 * @version: 1.0.0
 * @description:
 */
public class CollectionTest {

    public static void main(String[] args) {
        Collection list = new ArrayList<>();
        // 默认打印格式：[元素1,元素2...]
        System.out.println("list = " + list); // []

        boolean add = list.add(Integer.valueOf(2));
        System.out.println("add = " + add);
        System.out.println("list = " + list); // [2]

        boolean one = list.add(new String("one"));
        System.out.println("one = " + one);
        System.out.println("list = " + list); // [2, one]
        boolean wangwu = list.add(new Person("wangwu", 18));
        System.out.println("wangwu = " + wangwu);
        System.out.println("list = " + list);


        Collection list1 = new ArrayList<>();
        list1.add("two");
        list1.add(4);
        System.out.println("list1 = " + list1);

//        list.add(list1); // 将list1作为一个元素放到list中
        list.addAll(list1);  // 将list1中的元素添加到list中
        System.out.println("list = " + list);


        System.out.println(" ====================== ");

        // contains()方法工作原理是Objects.equals(Object o, Object e)
        boolean contains = list.contains(4);
        System.out.println("contains = " + contains);


        System.out.println("=============");
        // 判断当前集合中是否包含参数指定集合的所有元素
        System.out.println("list = " + list); // [2, one, Person{name='wangwu', age=18}, two, 4]

        Collection list2 = new ArrayList<>();
        list2.add(4);

        System.out.println("list.containsAll(list2) = " + list.containsAll(list2)); // true
        list2.add(5);
        System.out.println("list.containsAll(list2) = " + list.containsAll(list2)); // false

        System.out.println("=============");

        // 计算两个集合中的交集，保存到当前集合中
        Collection c1 = new ArrayList<>();
        Collection c2 = new ArrayList<>();

        c1.add(1);
        c1.add(2);
        c1.add(3);

        System.out.println("c1 = " + c1);

        c2.add(2);
        c2.add(3);
        c2.add(4);
        System.out.println("c2 = " + c2);

        boolean b = c1.retainAll(c2); // 取交集，保存到c1集合中
        System.out.println("b = " + b); // true 集合中的元素发生改变
        System.out.println("c1 = " + c1);


        System.out.println("=============");

        // 集合中单个元素和所有元素的删除操作

        Collection c3 = new ArrayList<>();
        Collection c4 = new ArrayList<>();

        c3.add(1);
        c3.add(2);
        c3.add(3);

        System.out.println("c3 = " + c3); // [1, 2, 3]

        c4.add(2);
        c4.add(3);
        c4.add(4);
        System.out.println("c4 = " + c4); // [2, 3, 4]


        c3.removeAll(c4);

        System.out.println("c3 = " + c3); // [1]

        System.out.println("=============");
        System.out.println("c1 = " + c1);  // [2, 3]
        System.out.println("c1.size() = " + c1.size());
        c1.clear();
        System.out.println("c1.size() = " + c1.size());
        System.out.println("c1.isEmpty() = " + c1.isEmpty());
        System.out.println("=============");


        // 元素顺序不同的集合不相等
        Collection list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        Collection list4 = new ArrayList<>();
        list4.add(2);
        list4.add(1);

        System.out.println("list4.equals(list3) = " + list4.equals(list3));

        System.out.println("=============");

        // 集合转换称数组
        Object[] objects = list3.toArray(); // 集合转数组

        System.out.println("objects = " + Arrays.toString(objects));
        List<Object> objects1 = Arrays.asList(objects); // 数组转集合
        System.out.println("objects1 = " + objects1);

        System.out.println("=============");

    }
}
