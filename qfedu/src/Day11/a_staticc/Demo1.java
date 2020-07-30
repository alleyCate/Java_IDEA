package Day11.a_staticc;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        MyArrays.reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}

/**
 * 自定义数组工具类
 * 工具类当中大多数方法，都是静态方法。
 * @author alleyCat
 */
class MyArrays {
    /**
     * 数组工具类中，数组逆序的方法
     *
     * @param arr 这里需要的是一个int类型数组
     */
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}