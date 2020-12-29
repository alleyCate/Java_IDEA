package Day15.c_util;

public class MyLinkedList<E> {
    /**
     * 有效元素个数
     */
    private int size = 0;

    /**
     * 第一个Node节点首地址
     */
    private Node<E> first;

    /**
     * 最后一个Node节点首地址
     */
    private Node<E> last;

    /**
     * 静态成员内部类
     *
     * @param <E> 和MyListedList一致的泛型
     */
    private static class Node<E> {
        /**
         * 在LinkedList中保存的Node节点元素内容
         */
        E item;

        /**
         * 下一个Node节点引用，保存下一个节点的空间首地址
         */
        Node<E> next;

        /**
         * 上一个Node节点引用，保存下一个节点的空间首地址
         */
        Node<E> prev;

    }

    /**
     * 空MyLinkedList集合，只是准备了一个所谓的链表头
     */
    public MyLinkedList() {

    }

    /**
     * 添加一个符合当前MyLinkedList泛型约束数据类型一致的元素到集合中
     *
     * @param e 符合MyLinkedList要求的元素
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(E e) {

    }

}
