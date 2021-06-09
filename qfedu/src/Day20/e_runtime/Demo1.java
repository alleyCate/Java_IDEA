package Day20.e_runtime;

import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());

        Process exec = runtime.exec("D:\\Program Files\\Microsoft VS Code\\Code.exe");

        Thread.sleep(5000);

        exec.destroy();
    }
}
