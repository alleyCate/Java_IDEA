package Day03;

public class Demo3 {
    public static void main(String[] args) {
        int num = 10;

        //先执行该行语句，在执行自增操作
        System.out.println("num++ : " + num++);
        System.out.println("num ： " + num);

        //限制性自增操作，在执行该行语句
        System.out.println("++num : " + ++num);
        System.out.println("num : " + num);
    }
}
