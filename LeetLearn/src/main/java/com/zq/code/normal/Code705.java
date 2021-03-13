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

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
