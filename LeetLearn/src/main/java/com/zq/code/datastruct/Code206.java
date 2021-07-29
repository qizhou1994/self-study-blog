package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code206 {
    public ListNode reverseList(ListNode head) {
        ListNode node = new ListNode();
        while (head != null) {
            if(node.next != null){
                ListNode temp = node.next;
                node.next = head;
                head = head.next;
                node.next.next = temp;
            }else {
                node.next = head;
                head = head.next;
                node.next.next = null;
            }
        }
        return node.next;
    }
}
