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
            System.out.println("自定义线程");
        }

        try {
            // 为什么这里只能捕获异常，不能抛出
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
