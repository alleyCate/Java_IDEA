package Day10.c_staticField;

/*
 * 演示static关键字修饰成员变量
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        SingleDog singleDog1 = new SingleDog("老王");
        SingleDog singleDog2 = new SingleDog("老李");
        SingleDog singleDog3 = new SingleDog("老张");
        SingleDog singleDog4 = new SingleDog("老孙");
        SingleDog singleDog5 = new SingleDog("老杨");
        SingleDog singleDog6 = new SingleDog("老马");

        //使用static修饰的SingleDog类内的info成员变量，应该通过静态方式访问
        System.out.println(SingleDog.info);
        System.out.println(singleDog2.info);

        singleDog2.info = "单身汪";

        System.out.println(singleDog3.info);
        System.out.println(singleDog4.info);
        System.out.println(singleDog5.info);
        System.out.println(singleDog6.info);
        */

        //在没有类对象的情况下，可以直接通过类名调用静态成员变量
        System.out.println(SingleDog.info);

        //曾经有过一个对象，32行代码运行完成，对象销毁
        new SingleDog();

        //对象被销毁之后，依然可用过类名调用静态成员变量
        //静态成员变量使用类名调用是没有任何问题的。【强烈推荐方式】
        System.out.println(SingleDog.info);
    }
}

class SingleDog {
    //static修饰的静态成员变量
    public static String info = "单身狗";

    //非静态成员变量
    public String name;

    public SingleDog() { }

    public SingleDog(String name) {
        this.name = name;
    }

    //非静态成员方法
    public void test() {}
}