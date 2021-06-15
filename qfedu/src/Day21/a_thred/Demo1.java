package Day21.a_thred;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程");
        }

        // 创建一个继承Thread类自定义线程类对象
        MyThread1 myThread1 = new MyThread1();
        // 这里不是启动线程，而是将run方法做出一个普通方法执行
        // myThread1.run();
        myThread1.start();

        // 创建一个Thread类对象，使用遵从Runnable接口的实现类作为构造方法参数
        Thread thread = new Thread(new MyThread2());

        // 借助于Thread类内的start方法开启线程
        thread.start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("匿名内部类方式创建对象，作为线程执行代码");
                }
            }
        }).start();
    }
}

/*
 * 自定义线程类 MyThread1 继承 Thread 类
 */

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("继承Thread类自定义线程类");
        }
    }
}

/*
 * 自定义线程类 MyThread2 遵从 Runnable 接口
 */

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("遵从Runnable接口实现自定义线程");
        }
    }
}