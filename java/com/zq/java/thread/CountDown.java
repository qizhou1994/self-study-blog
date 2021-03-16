package thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/16
 */
public class CountDown {


    static CountDownLatcDemo demo = new CountDownLatcDemo();
    static CountDownLatch end = new CountDownLatch(10);
    static class CountDownLatcDemo implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(new Random().nextInt(10)*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("check complete");
            end.countDown();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        });
        for(int i = 0 ; i < 10;i++){
            exec.submit(demo);
        }

        try {
            end.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fire！");
        exec.shutdown();
    }
}
