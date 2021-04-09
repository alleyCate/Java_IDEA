package Day18.b_string;

/*
 * 转换方法
 */

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        String str1 = new String(arr);
        System.out.println(str1);

        String str2 = new String(arr, 2, 5);
        System.out.println(str2);

        String str3 = String.valueOf(arr);
        System.out.println(str3);

        String str4 = String.valueOf(arr, 2, 5);
        System.out.println(str4);

        char[] charArray = "这个字符串会变成一个字符数组".toCharArray();
        System.out.println(Arrays.toString(charArray));

    }
}
