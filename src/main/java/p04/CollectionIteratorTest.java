package p04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: ymm
 * @date: 2022/3/24
 * @version: 1.0.0
 * @description:
 */
public class CollectionIteratorTest {

    public static void main(String[] args) {
        Collection c1 = new ArrayList<>();

        c1.add("one");
        c1.add("two");
        c1.add("three");

        System.out.println("c1 = " + c1);

        Iterator iterator = c1.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }

        System.out.println("collectionToString(c1) = " + collectionToString(c1));

        System.out.println("=====================");

        // 迭代过程中删除元素

        Iterator iterator1 = c1.iterator();

        System.out.println("c1 = " + c1);

        while (iterator1.hasNext()){
            Object next = iterator1.next();

            if ("two".equals(next)){
//                iterator1.remove();
                c1.remove(next);
            }
        }

        System.out.println("c1 = " + c1);

        System.out.println("=====================");


        Collection c2 = new ArrayList<>();

        c2.add("one");
        c2.add("two");
        c2.add("three");

        System.out.println("c2 = " + c2);

        //使用for each结构实现集合数组中元素的遍历
        // 由源码可知，迭代器的简化版

        for (Object o : c2) {
            System.out.println("o = " + o);
        }



    }


    /**
     * 使用迭代器模拟集合toString方法
     * @param c
     * @return
     */
    public static String collectionToString(Collection c) {

        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = c.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (iterator.hasNext()) {
                stringBuilder.append(next).append(", ");
            }else {
                stringBuilder.append(next).append("]");
            }
        }

        return stringBuilder.toString();
    }
}


