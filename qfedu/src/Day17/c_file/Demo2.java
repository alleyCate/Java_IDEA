package Day17.c_file;

import java.io.File;
import java.io.IOException;

/*
 * 创建文件或者文件夹
 */

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/aaa");

        File file2 = new File(file, "2.txt");
        System.out.println(file2.createNewFile());

        File file3 = new File(file, "bbb");
        System.out.println(file3.mkdir());

        File file4 = new File("D:/aaa/bbb/c/d/e/f/g");
        System.out.println(file4.mkdirs());

        file2.renameTo(new File("D:\\aaa\\bbb\\23333.txt"));
    }
}
