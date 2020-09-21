package Day13.a_generictity;

public class Demo3 {
    public static void main(String[] args) {
        /*
         * 自由模式
         */
        TypeB<Integer> typeB = new TypeB<>();
        typeB.test(123);

        /*
         * 规矩模式
         */
        TypeC typeC = new TypeC();
        typeC.test("比较无聊，但是很规矩");
    }

}

interface A<T> {
    void test(T t);
}

/*
 * 接口带有泛型，遵从接口的实现类有两种方案可以implements当前接口
 *      1.自由
 *      2.规矩
 */

/**
 * 自由方式，类名之后和接口同名自定义泛型，泛型对应的具体数据类型是需要在创建当前类对象时进行约束使用的
 *
 * @param <T> 遵从接口和借口一致的泛型
 */
class TypeB<T> implements A<T> {
    @Override
    public void test(T t) {
        System.out.println("自由模式");
    }
}

/**
 * 规矩模式，遵从接口时，接口使用泛型对应的具体数据类型已经明确在类内使用接口中缺省属性为public abstract方法时，泛型已确认
 */
class TypeC implements A<String> {
    @Override
    public void test(String s) {
        System.out.println("规矩模式");
    }
}