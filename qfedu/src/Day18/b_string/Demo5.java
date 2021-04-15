package Day18.b_string;

/*
 * 字符串其他方法
 */

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("abcabcacbacb".replace('a', 'A'));
        System.out.println("abcabcacbacb".replaceAll("ab", "AB"));
        System.out.println("abcabcacbacb".replaceFirst("ab", "AB"));

        String[] split = "A, B, C, D, E, F, G".split(",");
        System.out.println(Arrays.toString(split));

        System.out.println("ABCDEF".substring(2));
        System.out.println("ABCDEF".substring(2, 5));

        System.out.println("abcdef".toUpperCase());
        System.out.println("ABCDEF".toLowerCase());

        System.out.println("      ABCDEF      ABCDEF      ".trim());

        char A = 'A' + 32;

        System.out.println(A);
    }
}
