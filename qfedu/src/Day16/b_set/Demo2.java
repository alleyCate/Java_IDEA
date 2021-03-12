package Day16.b_set;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        Person p1 = new Person(1, "老大", 10);
        Person p2 = new Person(2, "老二", 15);
        Person p3 = new Person(3, "老三", 2);
        Person p4 = new Person(4, "老四", -5);
        Person p5 = new Person(5, "老五", 11);

        /*
         * 当前这里两个元素，ID一样 --> hashCode值是一致的，会通过底层哈希表运算保存到同一个单元格位置。
         *
         * 这里会通过equals方法，比较两个对象是否一致，来决定是否能够保存。
         * 如果两个对象一致，无法保存
         *
         * 期望每一个哈希表单元格内保存的数据是唯一的
         */
        Person p6 = new Person(6, "老六", 8);
        Person p7 = new Person(6, "老七", 5);

        hashSet.add(p4);
        hashSet.add(p3);
        hashSet.add(p5);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p6);
        hashSet.add(p7);

        System.out.println(hashSet);

    }
}
