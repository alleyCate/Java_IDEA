package Day17.c_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo6 {
    public static void main(String[] args) {
        File file = new File("D:/aaa/1.txt");

        // file,lastModified 最后一次修改时间
        long lastModified = file.lastModified();
        System.out.println(lastModified);

        // 对于日期展示的处理方式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(new Date(lastModified));
        System.out.println(format);

        System.out.println(file.length());
        System.out.println(new File("D:/aaa").length());
    }
}
