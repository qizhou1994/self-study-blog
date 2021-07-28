package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/28
 */
public class Code203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode newList = new ListNode();
        newList.next = head;
        ListNode lastList = newList;
        while (head != null) {

            if (head.val != val) {
                lastList = lastList.next;
            } else {
                if (lastList!=null&&lastList.next != null)
                    lastList.next = lastList.next.next;
            }
            head = head.next;
        }
        return newList.next;
    }
}
