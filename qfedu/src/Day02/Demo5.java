package Day02;

public class Demo5 {
    public static void main(String[] args) {
        /* 算数运算符演示 */
        int num1 = 10;
        int num2 = 20;

        /*
        1.变量操作过程中，注意变量的值是否发生过改变
        2.有且只有赋值操作可以修改变量的内容，没有复制无法修改
        */
        num2 = num1 = num2;
        // num1 = 10  num2 = 30

        num2 = num1 * num2;
        // num1 = 10  num2 = 300

        num2 = num1 / num2;
        // num1 = 10  num2 = 0

        num2 = num1 * num2;
        // num1 = 10  num2 = 0
    }
}
