package Day13.a_generictity;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * test方法使用了自定义泛型，传入的实际参数是什么类型
         * 泛型T对应的具体数据类型是什么类型
         */
        Integer test = test(123);
        String test1 = test("你好");
        Demo1 test2 = test(new Demo1());

        String[] arr1 = {"豆腐脑", "油条", "油饼","烤包子", "烧饼"};
        printArray(arr1);

        System.out.println("---------------------------------------");

        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(arr2);

        System.out.println("---------------------------------------");

        Demo1[] arr3 = {new Demo1(), new Demo1(), new Demo1(), new Demo1()};
        printArray(arr3);

    }

    /*
     * 声明一个带有自定义泛型的方法
     */
    /**
     * 带有自定义泛型声明的方法
     *
     * @param t 指定的泛型数据类型，由用户约束
     * @param <T> 自定义泛型无意义占位符
     * @return 对应的T类型，具体数据类型由用户约束
     */
    public static <T> T test(T t) {
        return t;
    }

    /*
     * 展示任意类型数组中数据的方法
     */

    /**
     * 展示任意类型数组的方式
     *
     * @param arr 用户指定类型的数组，同时约束自定义泛型对应的具体数据类型
     * @param <T> 自定义泛型无意义占位符
     */
    public static <T> void printArray(T[] arr) {
        for (int i= 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
