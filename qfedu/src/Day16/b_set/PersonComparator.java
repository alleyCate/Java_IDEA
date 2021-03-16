package Day16.b_set;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("【Comparable 接口中的 compareTo 方法被调用】");
        int ret = (int) ((o1.getSalary() - o2.getSalary()) * 100);

        return ret;
    }
}
