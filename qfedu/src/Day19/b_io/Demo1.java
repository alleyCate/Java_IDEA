package Day19.b_io;

/*
 * 文件操作字符输出流
 *
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(new File("D:/aaa/5.txt"), true);

            char[] charArray = "先得努力学习".toCharArray();

            fileWriter.write(charArray);
            fileWriter.write("学习进度不容乐观");
            fileWriter.write("\r\n");
            fileWriter.write(charArray, 0, 5);
            fileWriter.write("学习进度不容乐观", 0, 5);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeTest1() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("D:/aaa/5.txt"), true);

            fileWriter.write('加');
            fileWriter.write('油');
            fileWriter.write('赚');
            fileWriter.write('钱');
            fileWriter.write('，');
            fileWriter.write('使');
            fileWriter.write('劲');
            fileWriter.write('赚');
            fileWriter.write('钱');
            fileWriter.write(',');
            fileWriter.write('过');
            fileWriter.write('好');
            fileWriter.write('日');
            fileWriter.write('子');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
