package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/28
 */
public class Code141 {
    public boolean hasCycle(ListNode head) {
        ListNode next = head;
        ListNode nextNext = head;
        if(nextNext!=null&&nextNext.next!=null){
            nextNext = nextNext.next.next;
        }else {
            return false;
        }
        while (next!=null&&nextNext!=null&&nextNext.next!=null){
            if(next == nextNext){
                return true;
            }
            next=next.next;
            nextNext = nextNext.next.next;
        }
        return false;
    }
}
