package Day18.c_io;

/*
 * 文件拷贝操作
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) {
        long strat = System.currentTimeMillis();

        copyTest2();

        long end = System.currentTimeMillis();

        System.out.println("Time : " + (end - strat));
    }

    public static void copyTest1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1.创建文件输入字节流
            fis = new FileInputStream("D:/aaa/1.mp4");
            // 2.创建文件输出字节流
            fos = new FileOutputStream("D:/aaa/2.mp4");

            // 3.准备一个8KB缓冲数组
            byte[] buf = new byte[1024 * 8];
            int length = -1;

            // 4.读取文件数据
            while ((length = fis.read(buf)) != -1) {
                // 6.写入数据
                fos.write(buf, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //先开后关，后开先关
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void copyTest2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1.创建文件输入字节流
            fis = new FileInputStream("D:/aaa/1.mp4");
            // 2.创建文件输出字节流
            fos = new FileOutputStream("D:/aaa/2.mp4");

            // 3.每次读取一个字节，写入一个字节
            int conter = -1;

            // 4.读取文件数据
            while ((conter = fis.read()) != -1) {
                // 6.写入数据
                fos.write(conter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //先开后关，后开先关
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
