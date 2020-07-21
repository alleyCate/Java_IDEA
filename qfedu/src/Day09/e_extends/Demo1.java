package Day09.e_extends;

public class Demo1 {
    public static void main(String[] args) {
        Father father = new Father();

        father.name = "马化腾";
        father.game();

        Son son = new Son();

        //可以使用自定义的成员变量和成员方法
        son.age = 16;
        son.work();

        //通过继承之后，可以获取到父类中的非私有化成员变量和成员方法
        son.name = "马曼琳";
    }
}

class Father {
    // public 修饰的公开成员变量name
    public String name;

    // private 修饰的私有化成员变量salary
    private double salary;

    public Father() {

    }

    public Father(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /*
     * public 修饰的公开方法
     */
    public void game() {
        System.out.println("黄金矿工");
    }

    private void testPrivate() {
        System.out.println("父类私有化方法");
    }

}

/**
 * Son类是Father类的一个子类
 * Father类是一个Son类的唯一父类
 */
class Son extends Father {
    int age;

    public void work() {
        System.out.println("程序员！");
    }
}