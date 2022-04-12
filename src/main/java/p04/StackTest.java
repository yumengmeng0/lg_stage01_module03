package p04;

import java.util.Stack;

/**
 * @author: ymm
 * @date: 2022/4/12
 * @version: 1.0.0
 * @description:
 */
public class StackTest {

    public static void main(String[] args) {

        String s = "hello";
        Stack stack = new Stack<>();
        stack.push(s);
        s = "world";
        stack.push(s);

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(33);
        stack.push(44);

        Object pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println("stack = " + stack);

    }
}
