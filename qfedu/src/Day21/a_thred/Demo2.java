package Day21.a_thred;

public class Demo2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread("测试线程");

        // 给予Thread类构造方法Runnable接口实现类对象
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类对象作为线程的执行目标");
            }
        });

        // 给予Thread类构造方法Runnable接口实现类对象
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Type");
            }
        }, "匿名内部类对象");
    }
}
