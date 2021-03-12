package Day16.b_set;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        // 存储自定义数据类型Person
        /*
         * Exception in thread "main" java.lang.ClassCastException: Day16.b_set.Person cannot be cast to java.base/java.lang.Comparable
         * 提示当前Person类不能强转成Comparable类型，也就是说当前Person类没有比较方式
         */
        TreeSet<Person> set = new TreeSet<>();

        Person p1 = new Person(1, "老大", 10);
        Person p2 = new Person(2, "老二", 15);
        Person p3 = new Person(3, "老三", 2);
        Person p4 = new Person(4, "老四", -5);
        Person p5 = new Person(5, "老五", 11);
        Person p6 = new Person(6, "老六", 8);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
    }
}
