package com.zq.code.datastruct;

import java.util.Enumeration;
import java.util.Stack;

/**
 * @author zhouqi
 * @desc
 * @data 2021/8/2
 */
public class Code232 {

    class MyQueue {

        private Stack<Integer> stack;
        private Stack<Integer> stack2;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            stack2.push(x);
            stack.clear();
            Stack<Integer> stackTemp = new Stack<>() ;
            stackTemp.addAll(stack2);
            while (!stackTemp.empty()) {
                stack.push(stackTemp.pop());
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            int t = stack.pop();
            stack2.clear();
            Stack<Integer> stackTemp = new Stack<>() ;
            stackTemp.addAll(stack);
            while (!stackTemp.empty()) {
                stack2.push(stackTemp.pop());
            }
            return t;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return stack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.empty();
        }
    }
}
