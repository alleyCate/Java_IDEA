package Day17.c_file;

import java.io.File;

/*
 * 创建File类对象
 */

public class Demo1 {
    public static void main(String[] args) {
        /*
         * 1.路径分隔符 \\ or / or File.separator
         * 2.操作文件必须带有文件的后缀名，例如：1.txt, 2.java
         */
        File file = new File("D:\\aaa");
        File file1 = new File("D:" + File.separator +"aaa");
        File file2 = new File("c:/aaa", "1.txt");
        File file3 = new File(file,"bbb");

    }
}
