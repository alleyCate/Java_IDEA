package Day20.c_date;

import java.io.File;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long lastModified = new File("D:/aaa/1.txt").lastModified();
        Date date2 = new Date(lastModified);
        System.out.println(date2);
    }
}
