package Day19.c_buffered;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(new File("D:aaa/森巴口.txt")));

            bw.write("冰咖啡");
            bw.newLine();
            bw.write("星冰乐");
            bw.newLine();
            bw.write("摩卡咖啡");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void bufferedReader() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("D:/aaa/1.txt")));

            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
