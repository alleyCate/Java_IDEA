package Day19.a_homework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("D:/aaa/4.txt"));

        int[] counts = new int[52];
        char[] buf = new char[1024];
        int lenght = -1;

        lenght = fileReader.read(buf);

        for (int i = 0; i < lenght; i++) {
            if (buf[i] >= 'A' && buf[i] <= 'Z') {
                counts[buf[i] - 65] +=1;
            } else if (buf[i] >= 'a' && buf[i] <= 'z') {
                counts[buf[i] - 71] +=1;
            }
        }

        System.out.println(Arrays.toString(counts));

        fileReader.close();
    }
}
