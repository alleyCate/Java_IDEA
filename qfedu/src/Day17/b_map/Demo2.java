package Day17.b_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "一");
        map.put("3", "三");
        map.put("2", "二");
        map.put("4", "四");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
    }
}
