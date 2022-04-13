package p05;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description:
 */
public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("liubei", 22));
        treeSet.add(new Student("zhangfei", 11));

        System.out.println("treeSet = " + treeSet);

        System.out.println("==============");

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) { // o1新增加的对象，o2集合已有对象
                return o1.getAge() - o2.getAge();
            }
        };

        TreeSet<Student> objects = new TreeSet<>(comparator);

        objects.add(new Student("liubei", 1));
        objects.add(new Student("zhangfei", 11));
        System.out.println("objects = " + objects);


    }
}
