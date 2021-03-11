package Day16.b_set;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(5);
        System.out.println(set.add(4));

        System.out.println(set.add(1));

        System.out.println(set);

    }
}
