package Day17.c_file;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(new File("D:/aaa/1.txt").isFile());
        System.out.println(new File("D:/aaa/1.txt").isDirectory());
        System.out.println(new File("D:/aaa/bbb").isFile());
        System.out.println(new File("D:/aaa/bbb").isDirectory());
        System.out.println("--------------------------");


        // 如果文件或者文件夹是不存在的，isFile和isDirectory结果是false
        System.out.println(new File("D:/aaa/20.txt").isFile());
        System.out.println(new File("D:/aaa/ddd").isDirectory());
        System.out.println("--------------------------");


        // 判断是否使用绝对路径和当前文件或者文件夹是否存在无关
        System.out.println(new File("D:/aaa/1.txt").isAbsolute());
        System.out.println(new File("D:/aaa/10.txt").isAbsolute());
        System.out.println("--------------------------");

        System.out.println(new File("D:/aaa/1.txt").isHidden());
        System.out.println(new File("D:/aaa/10.txt").isHidden());
        System.out.println("--------------------------");

        System.out.println(new File("D:/aaa/1.txt").exists());
        System.out.println(new File("D:/aaa/10.txt").exists());
        System.out.println("--------------------------");

    }
}
