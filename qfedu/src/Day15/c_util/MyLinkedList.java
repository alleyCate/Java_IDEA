package Day15.c_util;

import java.util.NoSuchElementException;

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
         * 上一个Node节点引用，保存上一个节点的空间首地址
         */
        Node<E> prev;

        /**
         * Node<E> 没有无参构造方法，创建对应Node对象，需要保存前后节点位置，同时需要包装保存需要存储的数据，在当前Node节点中
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
        // 原本最后一个节点位置，当前Node节点之后的存储位置
        Node<E> l = last;

        // 创建得到一个新的node节点
        Node<E> newNode = new Node<>(l, e, null);

        // 因为当前元素需要保存到LinkedList结尾last一定要被赋值newNode
        last = newNode;

        // 第一个有效节点时，first同时指向当前节点
        if (null == first) {
            first = newNode;
        } else {
            // 原本最后一个节点next指向新newNode
            l.next = newNode;
        }

        // 有效元素+1
        size += 1;

        return  true;
    }

    /**
     * 同样是尾插法操作
     *
     * @param e 符合泛型约束的具体数据类型
     */
    public void addLast(E e) {
        add(e);
    }

    /**
     * 在LinkedList链表头添加一个元素
     *
     * @param e 符合泛型约束的具体数据类型
     */
    public void addFirst(E e) {
        /*
         * 三个地址：
         *      1.inkedList链表头first --> newNode
         *      2.newNode.next --> old FirstNode
         *      3.old FirstNode.prev --> newNode
         */
        // 原始的first节点
        Node<E> f = first;

        // 创建新newNode
        Node<E> newNode = new Node<>(null, e, f);

        // LinkedList链表头内first一定执行newNode
        first = newNode;

        if (null == first) {
            last = newNode;
        } else {
            // 原始的first节点，prev赋值为newNode
            f.prev = newNode;
        }

        size += 1;
    }

    /**
     * 获取第一个节点元素
     *
     * @return 第一个Node保存内容
     */
    public E getFirst() {
        Node<E> f = first;

        if (null == f) {
            throw new NoSuchElementException();
        }

        return f.item;
    }

    /**
     * 获取最后一个节点元素
     *
     * @return 最后一个Node保存内容
     */
    public E getLast() {
        Node<E> l = last;

        if (null == l) {
            throw new NoSuchElementException();
        }

        return l.item;
    }

    /**
     * 获取指定下标(指定计数，第几个节点内存储的元素)
     *
     * @param index 指定的下标位置，计数
     * @return 对应元素内容
     */
    public E get(int index) {
        if (index <= 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index < (size >> 1)) {
            Node<E> n = first;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }

            return n.item;
        } else {
            Node<E> n = last;
            for (int i = size - 1; i > index; i--) {
                n = n.prev;
            }

            return n.item;
        }
    }

    /**
     * 删除最后一个元素
     *
     * @return 返回值是保存的被删除元素内容
     */
    public E removeLast() {
        // 最后一个节点
        Node<E> l = last;
        // 最后一个节点的前节点
        Node<E> prev = last.prev;

        if (null == l) {
            throw new NoSuchElementException();
        }

        // 原最后一个节点的前节点空间地址赋值为null
        l.prev = null;

        // last指向原本最后一个节点的前节点
        last = prev;

        // 前节点为null
        if (null == prev) {
            first = null;
        } else {
            prev.next = null;
        }

        // 取出节点中保存的数据内容
        E e = l.item;

        // 原最后节点内所有数据全部为null，GC更快的销毁内存
        l.item = null;

        size -= 1;
        return e;
    }

    public E removeFirst() {
        // 获取第一个节点
        Node<E> f = first;
        // 第一个节点的后节点
        Node<E> next = first.next;

        if (null == f) {
            throw new NoSuchElementException();
        }

        // 原第一个节点的后节点空间地址赋值为null
        f.next = null;

        // first指向原本第一个节点的后节点
        first = next;

        // 后节点为null
        if (null == next) {
            last = null;
        } else {
            next.prev = null;
        }

        // 取出节点中保存的内容
        E e = f.item;

        // 原第一个节点内所有数据为null，GC更快销毁内存
        f.item = null;

        size -= 1;
        return e;
    }

    /**
     * 删除LinkedList中指定元素
     *
     * @param obj 删除的指定元素
     * @return 删除成功返回true，失败返回false
     */
    public boolean remove(Object obj) {
        Node<E> n = first;
        Node<E> del = null;

        // 1.利用for循环，以及size有效元素个数，遍历LinkedList
        for (int i = 0; i < size; i++) {
            if (n.item.equals(obj)) {
                // 保留需要删除的节点
                del = n;
                break;
            }
            n = n.next;
        }

        return remove(del) != null;
    }

    /**
     * 删除制定下标的节点
     *
     * @param index 指定下标位置
     * @return 被删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> del = null;
        if (index < (size >> 1)) {
            del = first;
            for (int i = 0; i < index; i++) {
                del = del.next;
            }
        } else {
            del = last;
            for (int i = size - 1; i > index; i--) {
                del = del.prev;
            }
        }

        return remove(del);
    }

    /**
     * 类内私有化方法，用于删除指定节点
     *
     * @param node 需要删除的节点
     * @return 被删除元素对象，没有删除返回null
     */
    public E remove(Node<E> node) {
        if (null == node) {
            return null;
        }

        E e = null;

        if (null == node.prev) {
            return removeFirst();
        } else if (null == node.next) {
            return removeLast();
        } else {
            Node<E> prev = node.prev;
            Node<E> next = node.next;

            prev.next = next;
            next.prev = prev;

            e = node.item;

            node.prev = null;
            node.next = null;
            node.item = null;

            size -= 1;
            return e;
        }

    }

    public void show() {}
}
