package Day16.b_set;

import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        /*
         * 目前存储的数据类型Integer类型是存在自然顺序。
         */
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        System.out.println(treeSet);
    }
}
