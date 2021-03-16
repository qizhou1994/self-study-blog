package thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/16
 */
public class CyclicBarrierDemo {

    static class Soldier implements Runnable{

        private String soldier;
        private final CyclicBarrier cyclic ;

        Soldier(CyclicBarrier cyclic,String soldierName){
            this.cyclic = cyclic;
            this.soldier = soldierName;
        }

        @Override
        public void run() {
            //等待士兵到齐
            try {
                System.out.println( "1");
                cyclic.await();
                System.out.println( "2");
                doWork();
                System.out.println( "3");
                cyclic.await();
                System.out.println( "4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }

        private void doWork() throws InterruptedException {
            Thread.sleep(2000);
            System.out.println(soldier+":任务完成");
        }
    }

    static class BarrierRun implements Runnable{

        boolean flag;
        int N;
        public BarrierRun(boolean flag,int N){
            this.flag = flag;
            this.N = N;
        }

        @Override
        public void run() {
            if(flag){
                System.out.println("司令:士兵"+N+"个，任务完成");
            }else {
                System.out.println("司令:士兵"+N+"个，集合完成");
                flag = true;
            }
        }
    }




    public static void main(String[] args) {
        int N = 10;
        Thread[] allSoldier = new Thread[N];
        boolean flag = false;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N,new BarrierRun(flag,N));
        System.out.println("集合队伍！");
        for(int i = 0 ; i < N;++i){
            System.out.println("士兵 "+i+"报道！");
            allSoldier[i] = new Thread(new Soldier(cyclicBarrier,"士兵 "+i));
            allSoldier[i].start();
            if(i==5){
                allSoldier[0].interrupt();
            }
        }
    }
}
