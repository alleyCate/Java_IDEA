package Day03;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        /*
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个int类型数据:");
        num =  sc.nextInt();

        System.out.println("num : " + num);
        */

        //空字符
        char ch = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符:");
        ch = sc.nextLine().charAt(0);

        System.out.println("ch :" + ch);
    }
}
