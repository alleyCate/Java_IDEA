package Day14.c_util;

import java.util.Arrays;

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
     *
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
     *
     * @param e 要求是符合泛型约束的指定数据类型
     * @return 添加成功返回true，否则返回false
     */
    public boolean add(E e) {
        //直接调用在指定下标位置添加元素的方法，只不过这里的制定下标位置就是尾插法下标位置
        return add(size, e);
    }

    /**
     * 在底层数组的指定下标位置保存对应的元素
     *
     * @param index 指定下标位置，不能超出有效范围，0 <= index <= size
     * @param e 符合泛型约束的数据类型
     * @return 添加成功返回true，否者返回false
     */
    public boolean add(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        ensureCapactiy(size + 1);

        for (int i = size - 1; i > index; i++) {
            elements[i] = elements[i - 1];
        }

        elements[index] = e;
        size += 1;

        return true;
    }

    /*
     * addAll方法
     *      1.需要得到添加集合中元素内容，有效元素个数
     *      2.确认容量问题
     *      3.size = srcSize + newSize
     */

    /**
     * 添加另一个集合到当前集合的末尾
     *
     * @param list MyArrayList类型，自定义ArrayList，要求存储元素和当前集合一致，或者是其子类
     * @return 添加成功返回true，添加失败返回false
     */
    public boolean addAll(MyArrayList<? extends E> list) {
        Object[] array = list.toArray();
        int newSize = array.length;

        ensureCapactiy(size + newSize);

        for (int i = 0; i < newSize; i++) {
            elements[i + size] = array[i];
        }

        size += newSize;
        return true;
    }

    public boolean addAll(int index, MyArrayList<? extends E> list) {
        Object[] array = list.toArray();
        int newSize = array.length;

        ensureCapactiy(size + newSize);

        for (int i = 0; i < newSize; i++) {
            elements[i + index + newSize] = elements[i + index];
            elements[i + index] = array[i];
        }

        size += newSize;
        return true;
    }

    /**
     * 删除指定元素
     * @param obj 指定删除的元素
     * @return 删除成功返回true
     */
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);

        return null != remove(indexOf);
    }

    /**
     * 删除指定下标元素
     * @param index 指定的下标范围
     * @return 删除成功返回对应元素，失败返回null
     */
    public E remove(int index) {
        if (-1 == index) {
            return null;
        }

        for (int i = index; i <size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // 原本最后一个有效元素位置上的内容赋值为null
        elements[size] = null;
        size -= 1;

        return elements[index];
    }

    /**
     * 查询指定元素在集合中第一次出现的下标位置
     * @param obj 指定的元素
     * @return 返回值大于等于0，否则返回-1
     */
    public int indexOf(Object obj) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            // equals 判断对象是否一致的方法
            if (obj.equals(elements[i])) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * 查询指定元素在集合中最后一次出现的下标位置
     * @param obj 指定的元素
     * @return 返回值大于等于0，否则返回-1
     */
    public int lastIndexOf(Object obj) {
        int index = -1;

        for (int i = size - 1; i >= 0; i--) {
            // equals 判断对象是否一致的方法
            if (obj.equals(elements[i])) {
                index = i;
                break;
            }
        }

        return index;
    }

    public E get() {

    }

    /**
     * 返回MyArrayList集合中所有有效元素的Object数组
     *
     * @return 包含所有集合元素的object类型数组
     */
    public Object[] toArray() {
        // size是有效元素个数，通过该方法可以获取到一个只有当前数组中有效元素的数组
        return Arrays.copyOf(elements, size);
    }

    /*
     * 这里需要类内使用的可以用于判定当前容量是否满足添加要求的方法，如果满足直接进入添加模式
     * 如果不满足，需要执行grow方法，完成底层数组的扩容问题
     */

    /**
     * 每一次添加元素，都要进行容量判定，如果满足可以进行添加操作，不满足需要进行grow方法
     *
     * @param minCapacity 要求的最小容量
     */
    private void ensureCapactiy(int minCapacity) {
        if (minCapacity >= elements.length){
            //完成一个底层数组的扩容方法
            grow(minCapacity);
        }
    }

    /**
     * 底层数组的扩容方法，原理是创建新数组，移植数据，保存新数组地址
     *
     * @param minCapacity 要求的最小容量
     */
    private void grow(int minCapacity) {
        // 1.获取原数组容量
        int oldCapacity = elements.length;

        // 2.计算得到新数组容量
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        // 3.判断新数组容量是否满足要求
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        // 新数组容量大于允许的最大数组容量
        if (newCapacity > MAX_ARRAY_SIZE) {
            // 二次判断 minCapacity 是否小于 MAX_ARRAY_SIZE
            if (minCapacity < MAX_ARRAY_SIZE) {
                // 最小要求是不大于MAX_ARRAY_SIZE, 代码可以运行
                newCapacity = minCapacity;
            } else {
                throw new OutOfMemoryError("Overflow MAX_ARRAY_SIZE");
            }
        }

        /*
         * 4.使用数组工具类方法完成操作
         * Arrays.copyOf(源数据数组_可以使任意类型_采用泛型约束, 指定的新数组容量);
         *      a.根据指定的新数组容量创建对应泛型数据类型的新数组
         *      b.从源数据数组中拷贝内容到新数组中
         *      c.返回新数组首地址
         */
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
