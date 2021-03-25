package Day17.b_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("张三", "1");
        map.put("李四", "1");
        map.put("王五", "1");
        map.put("赵六", "1");

        System.out.println(map);

        TreeMap<Dog, String> map2 = new TreeMap<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        map2.put(new Dog("可可", 1), "111");
        map2.put(new Dog("八公", 2), "111");
        map2.put(new Dog("豆豆", 3), "111");
        map2.put(new Dog("老黄", 4), "111");
        map2.put(new Dog("旺财", 5), "111");

        System.out.println(map2);
    }
}
