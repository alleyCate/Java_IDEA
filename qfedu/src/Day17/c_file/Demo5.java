package Day17.c_file;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        String str = "Z:/aaa/bbb/nmd";
        File file = new File(str);
        System.out.println(file.getPath());

        System.out.println(file.getName());
        // lastIndexOf
        // substring(int formIndex, int endIndex)
        // substring(int begin)
        System.out.println(str.substring(str.lastIndexOf('/') + 1));
        System.out.println("-----------------------------");

        System.out.println(file.getParent());
        System.out.println(str.substring(0,str.lastIndexOf('/')));
        System.out.println("-----------------------------");

        System.out.println(new File(".").getAbsolutePath());
        System.out.println(new File(".").getAbsoluteFile());
    }
}
