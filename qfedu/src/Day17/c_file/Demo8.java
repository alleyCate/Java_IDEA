package Day17.c_file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo8 {
    public static void main(String[] args) {
        File file = new File("D:/aaa/ddd");

        // 使用匿名内部类的匿名对象直接作为方法参数
        file.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                /*
                 * dir是当前操作的文件夹类对象
                 * name是当前文件夹下的子文件或者子文件夹名字
                 *
                 * 获取对应的java文件
                 *      1.判断是不是普通文件
                 *      2.判断当前文件名是不是.java结尾
                 */

                return new File(dir, name).isFile() && name.endsWith(".java"); // endsWith字符串方法，判断当前字符串是不是已指定要求结尾
            }
        });
    }
}
