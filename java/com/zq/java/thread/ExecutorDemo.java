package thread;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolChooser;

import java.util.concurrent.*;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/17
 */
public class ExecutorDemo {

     static class MyTask implements Runnable{

         int a;
         int b ;
         public MyTask(int a, int b){
             this.a = a;
             this.b = b;
         }
         @Override
         public void run() {

             double r = a/b;
             System.out.println("r="+r);
//             System.out.println(System.currentTimeMillis()+":Thread Id:" +Thread.currentThread().getId());
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
         }
     }

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0,Integer.MAX_VALUE,
                0L, TimeUnit.SECONDS,
                new SynchronousQueue<>());
        for(int i = 0 ; i < 5;i++){
            threadPoolExecutor.execute(new MyTask(100,i));
        }
//        MyTask myTask = new MyTask();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for(int i = 0 ; i < 10;i++){
//            executorService.submit(myTask);
//        }
//        executorService.shutdown();
    }
}
