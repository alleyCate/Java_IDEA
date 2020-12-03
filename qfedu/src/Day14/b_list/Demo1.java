package Day14.b_list;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        // List接口导包注意 java.util.List
        List<String> list = new ArrayList<String>();

        list.add("盒饭");
        list.add("大锅菜");
        list.add("焖面");
        list.add("热干面");
        list.add("牛肉罩饼");
        list.add("饸烙面");
        list.add("炒饼");
        System.out.println(list);

        list.add(3, "炒饭");
        System.out.println(list);

        List<String> list2 = new ArrayList<String>();

        list2.add("干炒牛河");
        list2.add("牛肉煎包");
        list2.add("牛肉串");

        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.remove(5));
        System.out.println(list);

        String str = list.set(1, "油焖大虾");
        System.out.println(str);
        System.out.println(list);

        int index = list.indexOf("干炒牛河");
        System.out.println(index);

        int lastIndexOff = list.lastIndexOf("干炒牛河");
        System.out.println(lastIndexOff);
        System.out.println(list);

        // 重点
        // java中所有的范围约束都是要头不要尾
        // fromIndex <= n < endIndex
        List<String> subList =  list.subList(0,5);
        System.out.println(subList);
    }
}
