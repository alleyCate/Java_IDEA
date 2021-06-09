package Day20.f_number;

public class Demo1 {
    public static void main(String[] args) {
        //自动方式
        // 基本类型
        int num = 5;

        // 基本数据类型赋值给包装类，自动装箱的过程
        Integer num1 = num;
        System.out.println(num1);

        // 包装类转换成基本数据类型，自动拆箱过程
        int num2 = num1;
        System.out.println(num2);

        // 强行包装
        Integer i = new Integer(5);
        Integer ii = Integer.valueOf(5);

        // 强制拆箱
        int intValue = i.intValue();
    }
}
