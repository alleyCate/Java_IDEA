package Day21.b_synchronized;

/*
 * 共享资源冲突问题
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingleThread4(), "淘票票");
        Thread thread2 = new Thread(new SingleThread4(), "猫眼");
        Thread thread3 = new Thread(new SingleThread4(), "美图");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/**
 * 自定义售票线程类
 * @author zy
 */
class SingleThread4 implements Runnable {

    // 共享资源
    private static int ticket = 100;

    // 定义一个成员变量
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            // lock对象加锁
            lock.lock();
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

            lock.unlock();
        }
    }
}
