package Day17.c_file;

import java.io.File;

/*
 * 删除文件或者文件夹
 */

public class Demo3 {
    public static void main(String[] args) {
        File file = new File("D:/aaa/1.txt");
        File file2 = new File("D:/aaa/bbb/23333.txt");

        file2.deleteOnExit();

        boolean ret = file.delete();
        System.out.println(ret);
    }
}
