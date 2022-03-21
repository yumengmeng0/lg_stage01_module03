package p03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class CalendarTest {

    public static void main(String[] args) {
        // 1.使用过时的方法设置时间
        Date date = new Date(2008, 8, 8, 8, 8, 8); // 年份-1900，月份-1
        Date date1 = new Date(108, 7, 8, 8, 8, 8); // 年份-1900，月份-1

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println("format = " + format);
        String format1 = sdf.format(date1);
        System.out.println("format1 = " + format1);

        System.out.println(" ==================== ");
        // 2.使用Calendar类指定时间
        // 2.1获取Calndar类的引用
        // note：既Calendar类是抽象类不能创建对象，下面方法获取的是Calendar子类的对象
        Calendar instance = Calendar.getInstance();
        instance.set(2008, 8 - 1, 8, 8, 8, 8);
        Date time = instance.getTime();
        String format2 = sdf.format(time);
        System.out.println("format2 = " + format2);

        System.out.println(" ==================== ");

        // 3.向指定的字段设置或增加值

        instance.set(Calendar.YEAR, 2018);
        Date time1 = instance.getTime();
        String format3 = sdf.format(time1);
        System.out.println("format3 = " + format3);
        instance.add(Calendar.MONTH, 2);
        Date time2 = instance.getTime();
        String format4 = sdf.format(time2);
        System.out.println("format4 = " + format4);
    }
}
