package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/13
 */
public class Code705 {


    class MyHashSet {

        int [] a = new int[1000000000];
        /** Initialize your data structure here. */
        public MyHashSet() {

        }

        public void add(int key) {
            a[key]=1;
        }

        public void remove(int key) {
            a[key]=0;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            if(a[key]==1){
                return true;
            }
            return false;
        }
    }
    static volatile int k = 0;
    static Code705 instance = new Code705();


    public static Code705 getInstance(){
        synchronized (Code705.class){
            if(instance == null){
                synchronized (instance){
                    if(instance == null){
                        instance = new Code705();
                    }
                }

            }
        }

        return instance;
    }


    static class Th extends Thread{

        @Override
        public void run() {
            for(int i = 0 ; i< 10000;i++){
                synchronized (instance){
                    k++;
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
          Th t1 = new Th();
          Th t2 = new Th();
          t1.start();
          t2.start();
          t1.join();
          t2.join();
          System.out.println(k);
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
