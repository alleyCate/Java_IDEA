package Day13.c_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * 因为Collection<E>使用一个接口，接口没有自己的类对象
         * 这里使用Collection接口的实现类来完成显示过程ArrayList<E>
         */
        Collection<String> c = new ArrayList<String>();

        c.add("82年的拉菲");
        c.add("82年的雪碧");
        c.add("82年的可乐");
        c.add("82年的雪花");

        System.out.println(c);

        Collection<String> c1 = new ArrayList<String>();

        c.add("百威");
        c.add("福佳白");
        c.add("精酿啤酒");
        c.add("修道院啤酒");

        c.addAll(c1);
        System.out.println(c);

        c.remove("82年的雪碧");
        System.out.println(c);

        //c.removeAll(c1);
        //System.out.println(c);

        //c.retainAll(c1);
        //System.out.println(c);

        System.out.println("size:" + c.size());
    }
}
