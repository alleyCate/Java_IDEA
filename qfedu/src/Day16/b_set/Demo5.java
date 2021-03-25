package Day16.b_set;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                BigDecimal bd1 = new BigDecimal(o1.getSalary() + "");
                BigDecimal bd2 = new BigDecimal(o2.getSalary() + "");

                BigDecimal ret = bd1.subtract(bd2).multiply(new BigDecimal("100"));
                System.out.println(ret.intValue());
                return ret.intValue();
            }
        });

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

        System.out.println(set);
    }
}
