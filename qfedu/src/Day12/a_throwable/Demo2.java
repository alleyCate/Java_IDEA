package Day12.a_throwable;

/*
 * NullPointerException 空指针异常，操作null地址异常
 * OutOfMemoryError 内存溢出异常
 * StackOverflowError 栈内存溢出错误
 */

public class Demo2 {
    public static void main(String[] args) {
        //int[] arr = null;

        //arr[0] = 10;

        long[] arr = new long[1024 * 1024 * 1024 * 4];
    }
}
