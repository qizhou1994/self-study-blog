package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/15
 */
public class ThreadTest {

    static class Lo extends ReentrantLock{
        @Override
        public void unlock() {
            System.out.println("111unlock = ");
            super.unlock();
        }
    }
    static class Thread1 implements Runnable{
        public Lo lock = new Lo();
        public Condition condition = lock.newCondition();


        @Override
        public void run() {
            try {
                lock.lock();
                System.out.println("await = ");
                condition.await();
                System.out.println("lock = ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
//                lock.unlock();
                System.out.println("unlock = ");
            }

        }

        public Condition getCondition() {
            return condition;
        }

        public ReentrantLock getLock() {
            return lock;
        }
    }




    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread thread = new Thread(t);
        thread.start();
        System.out.println("start = ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end = ");
        t.lock.lock();
        t.getCondition().signal();
        t.lock.unlock();
    }
}
