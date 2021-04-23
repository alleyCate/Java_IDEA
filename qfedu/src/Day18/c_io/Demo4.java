package Day18.c_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) {
        readTest2();
    }

    private static void readTest2() {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(new File("D:/aaa/3.txt"));

            char[] buf = new char[1024 * 4];
            int length = -1;

            while ((length = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readTest1() {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(new File("D:/aaa/3.txt"));

            int content = -1;

            while ((content = fileReader.read()) != -1) {
                System.out.println((char)content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
