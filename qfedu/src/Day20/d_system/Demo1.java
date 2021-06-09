package Day20.d_system;

import java.util.Arrays;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) {
        // 获取时间戳毫秒数
        long time = System.currentTimeMillis();

        // 属性类
        Properties properties = System.getProperties();
        properties.list(System.out);
        System.out.println("----------------------");

        // 可以获取系统对应属性的数据
        String  property = System.getProperty("os.name");
        System.out.println(property);
        System.out.println("----------------------");

        // 数组拷贝方法
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] temp = new int[10];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        System.out.println(Arrays.toString(temp));
        System.out.println("----------------------");

        // 退出整个程序的方法，0表示正常退出，其他数据都是非法退出
        // exit code : 0 or -1
        System.exit(0);
    }
}
