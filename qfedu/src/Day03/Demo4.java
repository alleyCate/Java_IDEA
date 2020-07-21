package Day03;

public class Demo4 {
    public static void main(String[] args) {
        int num = 10;
        boolean ret = 10 > 5 && num++ >10;

        /*
        断路原则问题：
            逻辑与断路元素问题
            10 > 15 该表达式结果为false，已经决定了当前整个逻辑与表达式的结果为false，计算机为了提高效率，
            从逻辑与false条件开始，之后表达式不再运行。
        */
        System.out.println("num : " + num);
        System.out.println("ret : " + ret);

        int num1 = 10;
        boolean ret1 = 10 > 5 || ++num1 > 5;

        /*
        断路原则问题：
            逻辑或断路原则问题
            在逻辑表达式中，出现了第一个为true条件，整个表达式结果已经明确为true，不需要在进行之后的判断，
            节约计算资源，提高效率。
        */
        System.out.println("num1 : " + num1);
        System.out.println("ret1 : " + ret1);
    }
}
