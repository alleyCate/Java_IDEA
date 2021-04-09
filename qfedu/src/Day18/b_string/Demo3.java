package Day18.b_string;

/*
 * 字符串判断方法
 */

public class Demo3 {
    public static void main(String[] args) {
        String str1 = "红烧茄子";

        boolean ret = str1.endsWith("茄子");
        System.out.println(ret);

        boolean ret2 = str1.isEmpty();
        System.out.println(ret2);
        System.out.println("".isEmpty());

//        String str = null;
//        System.out.println(str.isEmpty());

        System.out.println("ABCDEFG".contains("AB"));

        System.out.println("abcdefg".equals("ABCDEFG"));
        System.out.println("abcdefg".equalsIgnoreCase("ABCDEFG"));
    }
}
