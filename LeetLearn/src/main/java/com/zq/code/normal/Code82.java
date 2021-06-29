package com.zq.code.normal;

import com.zq.code.bean.ListNode;

import java.util.concurrent.DelayQueue;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/25
 */
public class Code82 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode headNew = new ListNode(-1);
        headNew.next = head;
        ListNode tempHead = headNew;
        while (tempHead.next != null && tempHead.next.next != null) {
            if (tempHead.next.val == tempHead.next.next.val) {
                int x = tempHead.next.val;
                //判断下一个不重复的点
                while (tempHead.next != null && tempHead.next.val == x) {
                    tempHead.next = tempHead.next.next;
                }
            } else {
                tempHead = tempHead.next;
            }
        }
        return headNew.next;
    }
}
