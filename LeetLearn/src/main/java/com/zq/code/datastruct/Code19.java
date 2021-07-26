package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode del = head;
        ListNode delLast = newHead;
        while (head != null) {
            head = head.next;
            if (--n < 0 && del != null && delLast != null) {
                del = del.next;
                delLast = delLast.next;
            }
        }
        if (del != null && delLast != null) {
            del = del.next;
            delLast = delLast.next;
        }
        delLast.next = del.next;
        return newHead.next;
    }
}
