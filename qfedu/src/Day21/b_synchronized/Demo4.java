package Day21.b_synchronized;

/*
 * 共享资源冲突问题
 */

public class Demo4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingleThread3(), "淘票票");
        Thread thread2 = new Thread(new SingleThread3(), "猫眼");
        Thread thread3 = new Thread(new SingleThread3(), "美图");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/**
 * 自定义售票线程类
 * 使用静态成员同步方法，来完成线程同步问题
 * @author zy
 */
class SingleThread3 implements Runnable {

    // 共享资源
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            /*
             * 调用一个同步方法
             */
            sellTicket();

            if (0 == ticket) {
                break;
            }
        }
    }

    /**
     * 完成一个static修饰的静态同步成员方法，锁对象是当前类名.class 是唯一的！！！
     */
    public static synchronized void sellTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售出了" + ticket + "张票");
            ticket -= 1;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "售罄");
        }
    }
}


