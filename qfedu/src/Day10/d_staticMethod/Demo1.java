package Day10.d_staticMethod;

public class Demo1 {
    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
    }
}

class TestStatic {
    //非静态成员变量
    public String name;

    //静态成员变量
    public static int num = 10;

    public TestStatic() {
    }

    //静态成员方法
    public static void staticMethod() {
        System.out.println("静态成员方法");
    }

    //非静态成员方法
    public void test() {
        System.out.println("非静态成员方法");
    }
}