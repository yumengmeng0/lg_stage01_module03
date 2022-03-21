package p03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: ymm
 * @date: 2022/3/21
 * @version: 1.0.0
 * @description:
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) {

        // 1.获取当前系统时间
        Date date = new Date();
        System.out.println("date = " + date);

        // 2.构造SimpleDateFormat类对象并指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        // 3.实现日期类型向文本类型的转换
        String format = sdf.format(date);
        System.out.println("转换后日期：" + format);

        // 4.实现文本类型向日期类型的转换
        Date parse = null;
        try {
            parse = sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("parse = " + parse);
    }
}
