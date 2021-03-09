package com.zq.code.sort;

import com.zq.code.bean.ListNode;

import java.util.Arrays;
import java.util.HashMap;

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

//    public int[] sortArray(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            int j = i - 1;
//            int temp = nums[i];
//            while (j >= 0 && temp < nums[j]) {
//                nums[j + 1] = nums[j];
//                j--;
//            }
//            nums[j + 1] = temp;
//        }
//        return nums;
//    }


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


    public int[] sortArray(int[] nums) {

        int max = 0;
        while (max <= nums.length / 3) {
            max = max * 3 + 1;
        }
        for (int gap = max; gap >= 1; gap = (gap - 1) / 3) {
            for (int i = gap; i < nums.length; i++) {
                int preIndex = i - gap;
                int current = nums[i];
                while (preIndex >= 0 && current < nums[preIndex]) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex = preIndex - gap;
                }
                nums[preIndex + gap] = current;
            }
        }
        return nums;
    }

    public String[] findRelativeRanks(int[] score) {
        String[] s = new String[score.length];
        HashMap<String, Integer> hashMap = new HashMap<>();
        int gapMax = 0;
        while (gapMax <= score.length / 3) {
            gapMax = gapMax * 3 + 1;
        }
        for (int i = 0; i < score.length; i++) {
            s[i] = String.valueOf(score[i]);
            hashMap.put(String.valueOf(score[i]), i);
        }
        for (int gap = gapMax; gap >= 1; gap = (gap - 1) / 3) {
            for (int i = gap; i < score.length; i++) {
                int pre = i - gap;
                int current = score[i];
                while (pre >= 0 && current > score[pre]) {
                    score[pre + gap] = score[pre];
                    hashMap.put(String.valueOf(score[pre + gap]), (pre + gap));
                    pre = pre - gap;
                }
                score[pre + gap] = current;
                hashMap.put(String.valueOf(score[pre + gap]), (pre + gap));
            }
        }

        for (int i = 0; i < s.length; i++) {
            Integer index = hashMap.get(s[i]);
            if (index != null) {
                if (index == 0) {
                    s[i] = "Gold Medal";
                } else if (score.length > 1 && index == 1) {
                    s[i] = "Silver Medal";
                } else if (score.length > 2 && index == 2) {
                    s[i] = "Bronze Medal";
                } else {
                    s[i] = String.valueOf(index + 1);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {


        new Code912().findRelativeRanks(new int[]{5, 4, 31, 2, 1});

    }
}
