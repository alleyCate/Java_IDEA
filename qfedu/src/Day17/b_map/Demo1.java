package Day17.b_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "一");
        map.put("3", "三");
        map.put("2", "二");
        map.put("4", "四");
        System.out.println(map);

        HashMap<String, String> map2 = new HashMap<>();

        map2.put("5", "五");
        map2.put("7", "七");
        map2.put("6", "六");

        map.putAll(map2);
        System.out.println(map);

        map.remove("4");
        System.out.println(map);

        map.put("7", "柒");
        System.out.println(map);

        System.out.println(map.containsKey("9"));
        System.out.println(map.containsValue("九"));

        System.out.println(map.containsKey("6"));
        System.out.println(map.containsValue("六"));

        Set<String> key = map.keySet();
        System.out.println(key);

        Collection<String> values = map.values();
        System.out.println(values);
    }
}
