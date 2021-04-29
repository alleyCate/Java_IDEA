package Day19.c_buffered;

/*
 * 字节缓冲流
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream(new File("D:/aaa/1.txt"));

        int content = -1;

        while ((content = fileInputStream.read()) != -1) {

        }

        fileInputStream.close();

        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - start));
    }

    private static void bufferedReadTest() throws IOException {
        long start = System.currentTimeMillis();
        // 1.找到对应文件
        File file = new File("D:/aaa/1.txt");

        // 2.创建对应的FileInputStream输入字节流对象
        FileInputStream fileInputStream = new FileInputStream(file);

        // 3.根据文件操作字节输入流对象，创建对应的缓冲流数组
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);

        // 4.读取数据过程，读取过程中使用的方法是FileInputStream提供的方法
        int content = -1;
        while ((content = bis.read()) != 1) {

        }

        // 5.关闭资源
        /*
         * 使用缓冲流对象close方法，这里首先会清空缓冲流占用的内存，同时释放
         * 并且关闭创建缓冲流使用的字节输入流对象
         */
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - start));
    }
}
