package Day13.b_anonymous;

/*
 * 匿名内部类演示
 */

public class Demo1 {
    public static void main(String[] args) {
        TypeA typeA = new TypeA();
        typeA.test();

        /*
         * A接口的引用, new 调用A接口的构造方法 【注意】这里不是创建A接口对象
         * Anonymous Inner Type 提示是完成了一个要求是【遵从】接口A必须实现的方法
         *
         * 大括号{}里面的内容和一个普通类遵从接口A的效果是一模一样的。
         * 大括号里面的内容可以认为是【类的本体】
         * 但是大括号之前没有类名，这就是匿名内部类
         *
         * new关键字在内存堆区申请了空间，创建了一个隐含遵从接口A的匿名内部类对向
         * 并且把该对象的空间首地址，赋值给接口A的引用数据类型变量，还有一个知识点
         * 接口的引用指向遵从接口的类对象，这就是多态
         *
         * low！！！
         */
        A a = new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类的对象赋值给接口的引用");
            }
        };

        a.test();

        //匿名内部类的匿名对象直接调用实现的方法 little low！！！
        new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类的匿名对象直接调用方法");
            }
        }.test();

        //匿名内部类的匿名对象直接作为方法的参数   终极奥义！！！
        testInterface(new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类的匿名对象直接作为方法的参数");
            }
        });

    }

    /**
     * 需要接口A的实现类对象作为方法的参数
     *
     * @param a 接口A的实现类对象
     */
    public static void testInterface(A a) {
        a.test();
    }
}

interface A {
    void test();
}

/**
 * 非abstract修饰TypeA遵从接口A，要求强制实现接口A中的test方法
 */
class TypeA implements A {
    @Override
    public void test() {
        System.out.println("TypeA遵从A接口，实现A接口中的test方法");
    }
}