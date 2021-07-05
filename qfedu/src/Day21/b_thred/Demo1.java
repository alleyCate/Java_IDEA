package Day21.b_thred;

/*
 * 共享资源冲突问题
 */

public class Demo1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingleThread(), "淘票票");
        Thread thread2 = new Thread(new SingleThread(), "猫眼");
        Thread thread3 = new Thread(new SingleThread(), "美图");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/**
 * 自定义售票线程类
 * 使用同步代码块来完成对于线程安全问题的解决
 * @author zy
 */
class SingleThread implements Runnable {

    // 共享资源
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            synchronized ("锁") {
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
                    break;
                }
            }
        }
    }
}
