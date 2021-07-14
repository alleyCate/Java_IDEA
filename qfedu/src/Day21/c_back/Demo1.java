package Day21.c_back;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new BackUpThread());

        // 当前线程作为守护线程使用
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i <= 100; i++) {
            Thread.sleep(100);
            System.out.println("主线程运行中...");
        }
    }
}

class BackUpThread implements Runnable {
    @Override
    public void run() {
        for (int i= 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Loading..." + i + "%");

            if (100 == i) {
                System.out.println("Loading Complete...");
            }
        }
    }
}



