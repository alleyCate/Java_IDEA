package Day10.a_extends;

public class Demo2 {
    public static void main(String[] args) {
        Yasuo yasuo = new Yasuo();

        yasuo.Q();
        yasuo.W();
        yasuo.E();
        yasuo.R();

        Garen garen = new Garen();

        garen.Q();
        garen.W();
        garen.E();
        garen.R();
    }
}

/*
 * abstract使用
 *
 * 第一个错误：
 *      Abstract methods do not specify a body
 *      abstract修饰的方法是没有方法体
 * 快速修复提示：
 *      Remove method body
 *      删除方法体
 *
 * 第二个错误：
 *      The abstract method Q in type Hero can only be defined by an abstract class
 *      在Hero中使用abstract修饰的方法Q,只能定义在abstract修饰的类
 * 快速修复提示:
 *      Make Type 'Hero' abstract
 *
 * 第三个错误：The type Yasuo must implement the inherited abstract method Hero.Q()
 *      “ Yasuo”类必须实现继承而来的abstract方法 Hero. Q
 * 快速修复提示：
 *      Add unimplemented methods
 *      添加没有实现的父类中的abstract方法
 */
abstract class Hero {
    abstract public void Q();

    abstract public void W();

    abstract public void E();

    abstract public void R();
}

/*
 * 子类继承父类可以直接使用父类的方法，但是在这种情况下我们可以发现父类的方法是一定不能在子类中使用，
 * 但是又没有一个强制要求。
 *
 * 需求：
 *      强制要求子类重写父类的方法，从语法角度约束
 */
class Yasuo extends Hero {
    @Override
    public void Q() {
        System.out.println("斩钢闪");
    }

    @Override
    public void W() {
        System.out.println("风之障壁");
    }

    @Override
    public void E() {
        System.out.println("踏前斩");
    }

    @Override
    public void R() {
        System.out.println("狂风绝息斩");
    }
}

class Garen extends Hero {
    @Override
    public void Q() {
        System.out.println("致命打击");
    }

    @Override
    public void W() {
        System.out.println("勇气");
    }

    @Override
    public void E() {
        System.out.println("审判");
    }

    @Override
    public void R() {
        System.out.println("德玛西亚正义");
    }
}