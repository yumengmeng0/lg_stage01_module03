package p04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: ymm
 * @date: 2022/4/12
 * @version: 1.0.0
 * @description:
 */
public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        System.out.println("queue = " + queue);

        Object poll = queue.poll();
        System.out.println("poll = " + poll);

        System.out.println("queue = " + queue);

    }
}
