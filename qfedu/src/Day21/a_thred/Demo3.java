package Day21.a_thred;

/*
 * Thread类成员方法
 */

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程目标代码");
            }
        }, "测试线程");

        // main线程
        Thread currentThread = Thread.currentThread();

        System.out.println(thread.getName());
        thread.setName("名称线程");
        System.out.println(thread.getName());

        Thread.sleep(1000);

        System.out.println(thread.getPriority());
        /*
         * 优先级范围 1 - 10
         * Thread.MAX_PRIORITY 最大优先级10
         * Thread.MIN_PRIORITY 最小优先级1
         * Thread.NORM_PRIORITY 默认优先级5
         */
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // MyThread3线程
            Thread currentThread = Thread.currentThread();
            try {
                /*
                 * 为什么这里只能捕获异常，不能抛出？
                 * run方法是实现/重写Runnable接口/Thread类方法
                 * 重写方法有一个要求，方法的声明必须和接口或者说父类一致
                 * Runnable接口和Thread类内run方法都没有进行任何的抛出操作
                 * 子类中重写run方法也不能抛出，保障声明一致。
                 *
                 * @Override注解，要求代码严格格式检查！
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("自定义线程");
        }
    }
}
