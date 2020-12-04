package Day14.c_util;

public class MyArrayList {
    /**
     * 准备一个底层数组，用于存储数据内容
     */
    private Object[] elements;

    /**
     * 初始化默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 最大数组容量，-8是为了腾出一定的空间，保存数组的必要内容
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 当前数组容量
     */
    private int size = 0;

    /**
     * 无参构造方法，但是需要提供给用户一个初始化容量来保存必要的数据
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 用户制定保存元素容量的初始化过程，要求用户指定的容量范围是有效的
     * @param initCapacity 用户指定的初始化容量，但是不能小于0，不能大于MAX_ARRAY_SIZE
     */
    public MyArrayList(int initCapacity) {
        //用户传入参数的合法性判断过程
        if (initCapacity <= 0 || initCapacity > MAX_ARRAY_SIZE) {
            //抛出异常
            //IllegalArgumentException 是一个 RuntimeException运行时异常的子类 不需要强制声明抛出异常
            throw new IllegalArgumentException("IllegalArgumentException : " + initCapacity);
        }

        elements = new Object[initCapacity];
    }
}
