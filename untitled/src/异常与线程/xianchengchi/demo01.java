package 异常与线程.xianchengchi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo01 {
    public static void main(String[] args) {
        //1创建指定数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //3.submit
        es.submit(new demo01runnableimpl());

    }
}
