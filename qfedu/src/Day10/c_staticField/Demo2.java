package Day10.c_staticField;

/*
 * 演示static关键字修饰成员变量
 */
public class Demo2 {
    public static void main(String[] args) {

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