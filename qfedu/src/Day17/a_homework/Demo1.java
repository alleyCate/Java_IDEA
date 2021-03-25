package Day17.a_homework;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        selectSort(array);

        System.out.println(Arrays.toString(array));

        Person p1 = new Person(1, "老大", 10);
        Person p2 = new Person(2, "老二", 15);
        Person p3 = new Person(3, "老三", 2);
        Person p4 = new Person(4, "老四", -5);
        Person p5 = new Person(5, "老五", 11);
        Person p6 = new Person(6, "老六", 8);

        Person[] persons = {p1, p2, p3, p4, p5, p6};

//        selectSort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                BigDecimal bd1 = new BigDecimal(o1.getSalary() + "");
//                BigDecimal bd2 = new BigDecimal(o2.getSalary() + "");
//
//                BigDecimal ret = bd1.subtract(bd2).multiply(new BigDecimal("100"));
//                System.out.println(ret.intValue());
//                return ret.intValue();
//            }
//        });


        selectSort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                BigDecimal bd1 = new BigDecimal(o1.getSalary() + "");
                BigDecimal bd2 = new BigDecimal(o2.getSalary() + "");

                return bd2.compareTo(bd1);
            }
        });

        System.out.println(Arrays.toString(persons));
    }

    /*
     * 使用泛型和Comparator<T>接口完成普适性选择算法
     * 泛型：
     *      用于满足任意类型的数组，但是又坐到了数据类型一致化的强制要求
     * Comparator<T>：
     *      用于满足比较条件约束，同时用泛型和数组参数一致，提供的Compare方法可以用于在排序算法中比较核心的比较条件问题。
     *
     * 方法声明：
     *      需要做成一个工具类方法
     *          public static
     *      声明泛型
     *          <T>
     *      返回值类型
     *          void
     *      方法名
     *          selectSort
     *      形式参数列表
     *          (T[] arr， Comparator<T> comparator)
     *
     * 方发声明：
     *      public static <T> void selectSort(T[] arr, Comparator<T> comparator) {}
     */

    /**
     * 可以满足任意类型数据进行排序操作的算法，但是要求用户根据当前数据类型数组提供对应的比较方式，借助于Comparator接口实现类对象传入
     *
     * @param <T> 自定义泛型T
     * @param arr arr 任意类型数组，同事约束当前泛型T对应的具体数据类型
     * @param comparator Comparator接口的实现类对象，对应的具体数据类型和数组一致
     */
    public static <T> void selectSort(T[] arr, Comparator<T> comparator) {
        if (null == arr || null == comparator || arr.length == 0) {
            throw new NullPointerException();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length - 1; j ++) {
                // 使用Comparator接口来约束比较规则
                if (comparator.compare(arr[index], arr[j]) > 0)  {
                    index = j;
                }
            }

            // 交换使用的数据类型是泛型T
            if (index != i) {
                T temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void selectSort(int[] arr) {
        if (null == arr || arr.length == 0) {
            throw new NullPointerException();
        }

        for (int i = 0; i < arr.length; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }


}
