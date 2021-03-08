package com.zq.code.sort;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/8
 */
public class Code912 {

//    public int[] sortArray(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int min = i;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[min] > nums[j]) {
//                    min = j;
//                }
//            }
//            int t = nums[min];
//            nums[min] = nums[i];
//            nums[i] = t;
//        }
//        return nums;
//    }

    public void merge(int[] A, int m, int[] B, int n) {

        for (int i = 0; i < A.length && i < n; i++) {
            A[i + m] = B[i];
        }

        for (int i = 0; i < A.length; i++) {
            int min = i;
            for (int j = i; j < A.length; j++) {
                if (A[min] > A[j]) {
                    min = j;
                }
            }
            int t = A[min];
            A[min] = A[i];
            A[i] = t;
        }
    }

    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
        return nums;
    }


    public ListNode insertionSortList(ListNode head) {

        ListNode headNew = new ListNode(0);
        headNew.next = head;
        if (head == null) {
            return head;
        }
        //记录最后一个元素
        ListNode lastNode = head;
        ListNode currentNode = lastNode.next;
        while (currentNode != null) {
            if (lastNode.val <= currentNode.val) {
                lastNode = lastNode.next;
            } else {
                ListNode p = headNew;
                while (currentNode.val >= p.next.val) {
                    p = p.next;
                }
                //下一个坐标
                lastNode.next = currentNode.next;
                //插入到p之前
                currentNode.next = p.next;
                p.next = currentNode;
            }
            currentNode = lastNode.next;
        }
        return headNew.next;
    }

    public static void main(String[] args) {

    }
}
