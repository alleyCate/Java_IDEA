package Day10.e_staticBlock;

public class Demo3 {

    public static void main(String[] args) {
        Demo3 demo1 = new Demo3();
    }

    Demo3 demo1 = new Demo3();
    Demo3 demo2 = new Demo3();

    {
        //1
        System.out.println("构造代码块");
    }

    static {
        //2
        System.out.println("静态代码块");
    }

    //3
    public Demo3() {
        System.out.println("构造方法");
    }

}

/*  构造代码块
    构造方法
    构造代码块
    构造方法
    静态代码块
    构造代码块
    构造方法*/
