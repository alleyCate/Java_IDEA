package Day13.a_generictity;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * 创建带有自定义泛型类的对象
         * TypeA<String> typeA = new TypeA<String>(); Eclipse标准写法
         * TypeA<String> typeA = new Type<>(); IDEA写法
         */
        //明确告知编译器，这里泛型对应的具体数据类型是String类型
        TypeA<String> typeA = new TypeA<>();

        String test1 = typeA.test1("北京烤鸭");
        typeA.test2("驴肉火烧", "饸烙面");

        //明确告知编译器这里泛型对应的具体数据类型是Demo2类型
        TypeA<Demo2> typeA2 = new TypeA<>();

        Demo2 test12 = typeA2.test1(new Demo2());
        typeA2.test2(new Demo2(), new Demo2());

        /*
         * 没有告知编译器泛型对应的具体数据类型，那么在类内的所有非静态成员方法中使用到的泛型，都是object类型，
         * 虽然可以支持任意类型传入参数，但是缺少了数据类型一致化的约束。
         * 不推荐！！！
         */
        TypeA<Object> typeA3 = new TypeA<>();
    }
}

/*
 * 定义一个带有自定义泛型的类
 */

class TypeA<T> {
    /**
     * 使用和类名一致的自定义泛型，需要通过【类对象】来约束
     *
     * @param t 对应泛型具体数据类型的参数
     * @return 对应泛型具体数据类型的返回值
     */
    public T test1(T t) {
        return t;
    }

    /**
     * 使用和类名一致的自定义泛型，需要通过【类对象】来约束
     *
     * @param t1 对应泛型集体数据类型的参数
     * @param t2 对应泛型集体数据类型的参数
     */
    public void test2(T t1, T t2) {
        System.out.println(t1);
        System.out.println(t2);
    }

    /*
     * 为什么类名自定义的泛型不能用于当前类内的静态成员方法
     *      静态成员方法是在类文件的在阶段准备完毕，已经可以明确的保证该方法是可以执行的。
     *      如果使用类声明的自定义泛型，对应泛型的具体数据类型需要在创建类对象之后才可以明确。
     *      当前静态方法在类文件加载阶段无法明确泛型数据类型是那一个，也无法保证执行
     *      【没有对象】
     *
     * 如果方法想要使用自定义泛型，自娱自乐，自己定义自己用！！！
     * 要求自定义的泛型占位符和类声明泛型占位符不一致，避免没有必要的歧义，提高阅读性
     */
    public static <E> E staticMethod(E e) {
        return e;
    }
}