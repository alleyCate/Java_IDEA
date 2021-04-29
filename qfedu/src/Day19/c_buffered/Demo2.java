package Day19.c_buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("D:/aaa/6.txt")));

        for (int i = 0; i < 100000; i++) {
            bos.write('A');
        }

        bos.close();
    }
}
