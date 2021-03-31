package com.zq.code.normal;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/31
 */
public class Code83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode n = head;
        while (head != null) {
            if (head.next != null && head.next.val == head.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return n;
    }

    public static void main(String[] args) {

    }
}
