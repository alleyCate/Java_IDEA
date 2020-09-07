package Day10.d_staticMethod;

public class Demo1 {
    public static void main(String[] args) {
        TestStatic ts = new TestStatic();

        //The static method staticMethod() from the type TestStatic should be accessed in a static way
        //在TestStatic类内使用static修饰的静态成员方法staticMethod应通过静态方式访问
        //ts.staticMethod();
        //通过类名调用没有任何的问题
        TestStatic.staticMethod();

        //静态方法中可以new对象
        new TestStatic();

        TestStatic.staticMethod();
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
        //静态方法中会用静态成员变量
        num = 20;

        //静态方法中使用非静态成员变量 NO
        //Non-static field 'name' cannot be referenced from a static context
        //不能定义一个静态引用指向一个非静态成员变量
        //name = "岳云鹏";

        //静态方法中使用非静态成员方法
        //Non-static method 'test()' cannot be referenced from a static context
        //不能在一个静态方法中去使用非静态成员方法;
        //test();

        //cannot be referenced from a static context
        //在静态代码区间内不能使用this关键字
        //this.name = "孙悦";

        System.out.println("静态成员方法");
    }

    //非静态成员方法
    public void test() {
        System.out.println("非静态成员方法");
    }
}