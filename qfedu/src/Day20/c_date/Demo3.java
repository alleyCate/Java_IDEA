package Day20.c_date;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar日历类展示
 */

public class Demo3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        System.out.println(year + "-" + month + "-" + day + "-" + hour + ":" + minute + ":" + second + " " + dayOfWeek);

        System.out.println("-------------------------------------");

        calendar.set(Calendar.YEAR, 2008);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 8);

        Date date = calendar.getTime();

        System.out.println(date);
    }
}
