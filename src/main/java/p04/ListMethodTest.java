package p04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/4/12
 * @version: 1.0.0
 * @description:
 */
public class ListMethodTest {

    public static void main(String[] args) {
        List list1 = new LinkedList();

        list1.add(0, "one");
        // 只能在已有的数组中添加
        // list1.add(2, "two"); // java.lang.IndexOutOfBoundsException: Index: 2, Size: 1

        System.out.println("list1 = " + list1);

        System.out.println(" = ");

        Object o = list1.get(0);
        System.out.println("o = " + o);
        System.out.println(" = ");


        ArrayList<Object> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println("list = " + list); // [one, two, three, four]

        // 子集合
        List<Object> subList = list.subList(1, 3);
        System.out.println("subList = " + subList);  // [two, three]  不包含下标3的元素


    }
}
