package Day02;

public class Demo4 {
    public static void main(String[] args) {
        double num1 = 3.9;

        //这里存在数据精度丢失，并且是不可逆的
        int num2 = (int) num1;

        System.out.println(num2);

    }

}
