package p03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println("format = " + format);

        TemporalAccessor parse = dateTimeFormatter.parse(format);
        System.out.println("parse = " + parse);

    }
}
