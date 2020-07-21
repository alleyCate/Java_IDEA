package Day02;

public class VariableTest {
    public static void main(String[] args) {
        /* 整型变量 */
        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 30;
        long longNumber = 40L;

        /* 整形变量展示 */
        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        /* 浮点型变量 */
        float floatNumber = 3.14F;
        double doubleNumber = 0.618;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        /*
        字符型变量
        字符常量：
            单引号包含的单个元素'a'
        */
        char ch1 = 'A';
        char ch2 = '中';

        /* 字符型变量展示*/
        System.out.println(ch1);
        System.out.println(ch2);

        /* 布尔类型 */
        boolean ret1 = true;
        boolean ret2 = false;

        /* 布尔类型展示*/
        System.out.println(ret1);
        System.out.println(ret2);

        //int num;
        //System.out.println(num);

        //num = 10;

    }
}
