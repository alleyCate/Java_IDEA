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

        /**
         * Node<E> 没有无参构造方法，创建对应Node对象，需要保存前后节点位置，同时需要保存需要存储的数据，在当前Node节点中
         *
         * @param prev 前节点位置
         * @param element 存储元素
         * @param next 后节点位置
         */
        public Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }

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
        //最后一个节点位置，当前Node节点之后的存储位置
        Node<E> l = last;

        //创建得到一个新的node节点
        Node<E> newNode = new Node<>(l, e, null);

        // 因为当前元素需要保存到LinkedList结尾last一定要被赋值newNode
        last = newNode;

        // 第一个有效节点时，first同时指向当前节点
        if (null == first) {
            first = newNode;
        }

    }

}
