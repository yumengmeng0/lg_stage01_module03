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
public class ListGenericTest {

    public static void main(String[] args) {
        List<String>list = new LinkedList<String>();

        list.add("hello");

        System.out.println("list = " + list);

        LinkedList<Integer> integers = new LinkedList<>();
    
        integers.add(1);
        integers.add(2);
        System.out.println("integers = " + integers);

        // Java7开始新特性：棱形特性（后面<>的数据类型可不写）
        List<Double> list2 = new LinkedList<>();



        
        

    }
}
