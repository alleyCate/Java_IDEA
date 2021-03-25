package Day17.c_file;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        File[] listRoots = File.listRoots();

        /*
         * for (数据类型 变量名：数组/集合) {
         *
         * }
         */
        for (File file : listRoots) {
            System.out.println(file);
        }
        System.out.println("------------------------------");

        File file = new File("D:/aaa");
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            System.out.println(file2);
        }
        System.out.println("------------------------------");

        String[] list = file.list();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
