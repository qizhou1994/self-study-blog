package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/5
 */
public class Code232 {

    class MyQueue {

        private int index;
        private List<Integer> list;
        private int length;

        /** Initialize your data structure here. */
        public MyQueue() {
            list = new ArrayList<>();
            length =0;
            index=0;
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            list.add(x);
            length++;
            index=0;

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            length--;
            return list.remove(index);
        }

        /** Get the front element. */
        public int peek() {
            return list.get(index);
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return  length == 0;
        }
    }
}
