package Day18.c_io;

/*
 * 文件操作输出字节流
 *      1.确定文件
 *      2.创建FileOutputStream
 *      3.写入数据到文件中
 *      4.关闭资源
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        // 1.确定文件
        File file = new File("D:\\aaa\\要挣大钱.txt");

        // 2.文件操作字节输出流对象
        FileOutputStream fileOutputStream = null;

        try {
            // 3.创建FileOutputStream
            fileOutputStream = new FileOutputStream(file);

            // 4.准备byte类型数组
            byte[] bytes = "加油赚钱，使劲赚钱！".getBytes();
            byte[] arr = {65, 66, 67, 68, 69, 70, 71};

            // 4.写入数据
            fileOutputStream.write(bytes);
            fileOutputStream.write(arr, 2, 3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭资源
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeTest1() {
        // 1.确定文件
        File file = new File("D:\\aaa\\努力挣钱.txt");

        // 2.文件操作字节输出流对象
        FileOutputStream fileOutputStream = null;
        try {
            // 3.创建FileOutputStream
            fileOutputStream = new FileOutputStream(file, true);

            // 4.写入数据
            fileOutputStream.write('D');
            fileOutputStream.write('D');
            fileOutputStream.write('D');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭资源
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
