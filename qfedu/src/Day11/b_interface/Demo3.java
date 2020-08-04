package Day11.b_interface;

/*
 * JDK1.8新特性
 */

public class Demo3 {
    public static void main(String[] args) {
        new TypeC().testF();
    }
}


interface F {
    /*
     * 接口当中的默认方法
     * default
     * default修饰的方法，是拥有方法体的
     *      1.接口提供了最基本的处理方式
     *      2.非强制实现方法，可选完成
     */
    default void testF() {
        System.out.println("接口中的默认方法，非强制实现");
    }

}

/**
 * 没有任何的错误，因为在接口中的方法是default修饰，非强制实现
 *
 * @author alleyCat
 */
class TypeC implements F {

}