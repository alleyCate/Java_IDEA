package Day20.c_date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat 抽象类
 * SimpleDateFormatter 演示
 */

public class Demo2 {
    public static void main(String[] args) {
        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = simpleDateFormat.format(new Date());

        System.out.println(format);
    }
}
