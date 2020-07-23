package Day10.e_staticBlock;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请问Cat类在当前情况需要加载吗");
    }
}

class Cat {
    static {
        System.out.println("静态代码块");
    }
}