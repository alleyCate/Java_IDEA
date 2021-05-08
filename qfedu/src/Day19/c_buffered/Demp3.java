package Day19.c_buffered;

import java.io.*;

public class Demp3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        useBuffered();

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));

    }

    public static void useBuffered() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("D:/aaa/5.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("D:/aaa/buffered.txt")));

            int content = -1;

            while ((content = bis.read()) != 1) {
                bos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copy() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:/aaa/5.txt");
            fos = new FileOutputStream("D:/aaa/copy.txt");

            int content = -1;

            while ((content = fis.read()) != 1) {
                fos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
