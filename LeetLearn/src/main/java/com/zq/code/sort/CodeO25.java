package com.zq.code.sort;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/9
 */
public class CodeO25 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode newlist = listNode;

        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                newlist.next = l1;
                l1 = l1.next;
            }else {
                newlist.next=l2;
                l2 = l2.next;
            }
            newlist = newlist.next;
        }
        if (l1!=null){
            newlist.next = l1;
        }
        if (l2!=null){
            newlist.next = l2;
        }
        return listNode.next;
    }



    int max = 0;

    
    public void mergeSort(int[] nums,int l,int r){
        if(l>r){
            return;
        }
        int middle = (l+r)/2;
        mergeSort(nums,l,middle);
        mergeSort(nums,middle+1,r);
        merge(nums,l,r);
    }

    private void merge(int[] nums, int l, int r ) {

        int start1 = l;
        int end1 = (l+r)/2;
        int start2 = end1+1;
        int end2 = r;
        while (start1<=end1&&start2<=end2){
            if(nums[start1]>nums[start2]){

                //交换数
                int temp = nums[start2];
                nums[start2] = nums[start1];
                nums[start1] = temp;
                //现在 之前的start1 就是start2 要找到其再数组中的定位
                temp = nums[start2];
                int index = start2;
                //插入拍寻   默认两个数组是已经排序好的  确认temp再start2中的未知
                while (index<end2&& nums[index+1]<temp){
                    nums[index]=nums[index+1];
                    index++;
                }
                nums[index]=temp;
            }
            start1++;
        }
    }

    public static void main(String[] args) {

        ListNode listNode = new CodeO25().mergeTwoLists(new ListNode(1, new ListNode(4, new ListNode(5))),new ListNode(1, new ListNode(4, new ListNode(5))));

        while (listNode!=null){
            System.out.print(","+listNode.val);
            listNode=listNode.next;
        }
    }
}
