package p05;

import java.util.HashSet;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description:
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();

        hashSet.add("three");
        hashSet.add("two");
        hashSet.add("one");

        System.out.println("hashSet = " + hashSet);

    }
}
