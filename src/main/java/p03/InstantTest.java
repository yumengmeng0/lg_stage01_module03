package p03;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class InstantTest {

    public static void main(String[] args) {
        // 从系统时钟上获取当前时间，不是当前系统默认时区，本初子午线差8小时，东八区
        Instant now = Instant.now();
        System.out.println("now = " + now);

        // 加上时区偏移
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("offsetDateTime = " + offsetDateTime);

        System.out.println(" ===========");

        // 当前调用对象距离标准基准时间的毫秒数
        long l = now.toEpochMilli();
        System.out.println("l = " + l);

        // 根据指定的毫秒数来构造对象
        Instant instant = Instant.ofEpochMilli(l);
        System.out.println("instant = " + instant);
    }
}
