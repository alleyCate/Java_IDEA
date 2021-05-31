package Day20.c_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat 抽象类
 * SimpleDateFormatter 演示
 */

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = simpleDateFormat.format(new Date());

        System.out.println(format);

        Date parse = simpleDateFormat.parse("2019年12月31日 23:59:59");
        System.out.println(parse);

        SimpleDateFormat  simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String format2 = simpleDateFormat2.format(parse);
        System.out.println(format2);
    }
}
