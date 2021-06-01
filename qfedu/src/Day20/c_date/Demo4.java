package Day20.c_date;

import java.util.Calendar;

public class Demo4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.YEAR, -2);

        System.out.println(calendar.getTime());
    }
}
