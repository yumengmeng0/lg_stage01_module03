package p03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now); // 2022-03-21
        LocalTime now1 = LocalTime.now();
        System.out.println("now1 = " + now1); // 14:46:58.930685
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("now2 = " + now2); // 2022-03-21T14:46:58.931682700

        System.out.println(" =================");
        LocalDateTime of = LocalDateTime.of(2008, 8, 8, 8, 8, 8);
        System.out.println("of = " + of);

    }
}
