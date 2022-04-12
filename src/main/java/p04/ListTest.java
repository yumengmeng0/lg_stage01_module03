package p04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/4/12
 * @version: 1.0.0
 * @description:
 */
public class ListTest {

    public static void main(String[] args) {

        // 由源码可知：当new对象时并没有申请数组的内存空间
        List list = new ArrayList<>();

        // 调用add方法添加数组时申请长度为10的数组，扩容时是原始长度的1.5倍
        list.add("one");

        System.out.println("list = " + list);
    }
}
