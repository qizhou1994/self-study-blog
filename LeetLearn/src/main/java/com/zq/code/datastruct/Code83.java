package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode listNode = new ListNode();

        listNode.next = head;
        ListNode temp =listNode;
        temp = temp.next;
        while (temp!=null){
            if(temp.next!=null&&temp.val==temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return listNode.next;
    }
}
