package Day14.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("烤羊排");
        c.add("油焖大虾");
        c.add("土豆牛肉");
        c.add("黄焖鸡米饭");
        c.add("麻辣香锅");
        c.add("孜然肉片");
        c.add("酸汤肥牛");

        System.out.println(c);

        /*
         * 获取当前集合对应的Iterator迭代器对象
         */
        Iterator<String> iterator = c.iterator();

        System.out.println("当前Iterator是否可以继续运行：" + iterator.hasNext());
        System.out.println("获取当前Iterator指向元素：" + iterator.next());
    }
}
