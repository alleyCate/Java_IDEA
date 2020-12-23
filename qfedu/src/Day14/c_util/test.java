package Day14.c_util;

import Day14.c_util.MyArrayList;

public class test {
    public static void main(String[] args) {
        MyArrayList<String> cList = new MyArrayList<>();

        cList.add("张三");
        cList.add("李四");
        cList.add("王五");
        cList.add("赵六");
        cList.add("周七");

        MyArrayList<String> cList2 = new MyArrayList<>();

        cList2.add("李四");
        cList2.add("赵六");

        System.out.println(cList.containsAll(cList2));

    }
}
