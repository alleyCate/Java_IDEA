package Day12.a_throwable;

public class Demo1 {
    public static void main(String[] args) {
        Throwable throwable = new Throwable("SingleDogException");

        System.out.println(throwable.getMessage());
        System.out.println(throwable.toString());
        throwable.printStackTrace();
    }

    public static void test() {
        new Throwable("异常提醒").printStackTrace();
    }
}
