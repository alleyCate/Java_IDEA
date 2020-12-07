package Day14.c_util;

public class MyArrayList<E> {
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

    /*
     * 增加方法
     */

    /**
     * 添加元素到当前集合的末尾
     * @param e 要求是符合泛型约束的指定数据类型
     * @return 添加成功返回true，否则返回false
     */
    public boolean add(E e) {
        //直接调用在指定下标位置添加元素的方法，只不过这里的制定下标位置就是尾插法下标位置
        return add(size, e);
    }


    public boolean add(int index, E e) {

    }

    /*
     * 这里需要类内使用的可以用于判定当前容量是否满足添加要求的方法，如果满足直接进入添加模式
     * 如果不满足，需要执行grow方法，完成底层数组的扩容问题
     */

    /**
     * 每一次添加元素，都要进行容量判定，如果满足可以进行添加操作，不满足需要进行grow方法
     * @param minCapacity
     */
    private void ensureCapactiy(int minCapacity) {
        if (minCapacity >= elements.length){
            //完成一个底层数组的扩容方法
            grow(minCapacity);
        }
    }
}
