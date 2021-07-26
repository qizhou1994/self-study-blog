package com.zq.code.datastruct;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code876 {
    public ListNode middleNode(ListNode head) {

        int length = 1;
        ListNode mid = head;
        ListNode head1 = head;
        while (head1!=null){
            head1 = head1.next;
            if(length%2 ==0){
                mid = mid.next;
            }
            length++;
        }
        return mid;
    }
}
