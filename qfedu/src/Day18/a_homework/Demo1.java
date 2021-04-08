package Day18.a_homework;

import java.io.File;
import java.io.IOException;

/*
 * 文件归档
 *      1.获取对应当前文件的所有子文件和子文件夹 list or listFiles
 *      2.便利判断是普通文件，还是文件夹 isFile or isDirectory
 *      3.分门别类处理
 *          3.1 文件处理
 *              3.1.1 获取文件后缀名 substring lastIndexOf
 *              3.1.2 创建对应当前文件后缀名的全大写文件夹
 *              3.1.3 移动文件到指定文件夹
 *          3.2 文件夹处理
 *              3.2.1 创建subDir文件夹
 *              3.2.2 移动文件夹到subDir下
 */

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 目标文件夹的File类对象
        File file = new File("D:/aaa/eee");

        // 需要创建的文件夹类对象
        File toBeCreateDir = null;

        // 判断是否是文件夹
        if (file.isFile() || !file.exists()) {
            return;
        }

        // 当前文件夹已经归档完成，不需要在此归档
        if (new File(file, "file.lock").exists()) {
            System.out.println("已归档完成");
            return;
        }

        // 当前文件夹下的所有子文件和子文件夹的File类对象数组
        File[] listFiles = file.listFiles();

        // 遍历File类对象数组
        for (File srcFile : listFiles) {
            // 如果是普通文件，获取文件后缀名
            if (srcFile.isFile()) {
                String fileName = srcFile.getName();
                String upperSuffix = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
                toBeCreateDir = new File(file, upperSuffix);
            } else {
                toBeCreateDir = new File(file,"subDir");
            }

            // 创建文件夹
            toBeCreateDir.mkdir();

            // 移动文件或文件夹
            srcFile.renameTo(new File(toBeCreateDir, srcFile.getName()));
        }

        // 创建一个锁文件
        new File(file, "file.lock").createNewFile();
    }
}
