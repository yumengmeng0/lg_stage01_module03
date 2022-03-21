package p03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date); // 当前系统时间

        Date date1 = new Date(1000); // 使用参数指定毫秒数来构造对象，距离1970年1月1日0:0:0

        System.out.println("date1 = " + date1);

        long time = date1.getTime(); // 调用对象距离1970年的时间
        System.out.println("time = " + time);

        int time1 = 5000;
        date1.setTime(time1); // 设置时间

        System.out.println("time1 = " + date1);

    }
}
