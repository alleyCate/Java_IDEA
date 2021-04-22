package Day18.c_io;

/*
 * 文件操作输入字节流
 *  1.确认读取哪一个文件
 *  2.创建对应文件的FileInPutStream
 *  3.读取数据
 *  3.关闭资源【重点】
 */

/*
 * 文件读取使用缓冲和非缓冲差距、
 *  内存的运作速度看作是火箭，硬盘是一个自行车
 *      代码中，使用缓冲之后，从硬盘中一口气读取8KB数据存储在内存中，供程序使用
 *
 * 8KB
 *      固态硬盘，4KB对齐，固态硬盘中每一个扇区都是4KB。缓冲这里要求CPU读取两个4KB数据，对于CPU没有太多压力。
 *      如果是一个字节一个字节读取，CPU取出4KB数据，结果有4095无效
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        readTest1();

        long end = System.currentTimeMillis();

        System.out.println("Time : " + (end - start));
    }

    private static void readTest2() {
        // 1.确定读取哪一个文件
        File file = new File("D:/aaa/1.txt");

        // 2.字节输入流读取文件
        FileInputStream fileInputStream = null;

        try {
            // 3.根据File类对象创建对应的字节输入流
            fileInputStream = new FileInputStream(file);

            // 4.准备一个8KB字节缓冲数组
            byte[] buf = new byte[1024 * 8];
            int length = -1;

            // 5.读取数据
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6.在finally代码块中关闭资源
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readTest1() {
        // 1.确定读取哪一个文件
        File file = new File("D:/aaa/1.txt");

        // 2.字节输入流读取文件
        FileInputStream fileInputStream = null;

        try {
            // 3.根据File类对象创建对应的字节输入流
            fileInputStream = new FileInputStream(file);

            // 4.读取文件
            int content = -1;

            while ((content = fileInputStream.read()) != -1) {
                System.out.println((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 用于处理代码中使用到的资源，无论发生什么样的错误，finally中的代码一定会执行
            // 这里发现fileInputStream不是null，证明已经打开了文件资源，关闭资源，捕获异常
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
