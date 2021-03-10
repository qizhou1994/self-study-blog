package com.zq.code.sort;

import com.zq.code.bean.ListNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/9
 */
public class QuickSort {


    public int[] heapSotr(int[] n) {
        for (int i = n.length / 2 - 1; i >= 0; i--) {
            buildDump(n, i, n.length);
        }
        for (int i = n.length - 1; i > 0; i--) {
            int t = n[i];
            n[i] = n[0];
            n[0] = t;
            buildDump(n, 0, i);
        }
        return n;
    }

    //第几个节点
    private void buildDump(int[] n, int i, int length) {
        int l = 2 * i + 1;
        int r = l + 1;
        int last = i;
        if (l < length && n[l] > n[last]) {
            last = l;
        }
        if (r < length && n[r] > n[last]) {
            last = r;
        }
        if (last != i) {
            //交换最后的数 将最大的数放在最上面
            int t = n[last];
            n[last] = n[i];
            n[i] = t;
            //再来一次判断 构建后的左右节点是否小于当前节点
            buildDump(n, last, length);
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode listNode = new ListNode();
        ListNode newList = listNode;

        while (true) {
            int minI = -1;
            ListNode tempN = null;
            for (int i = 0; i < lists.length; i++) {
                ListNode tem = lists[i];
                if (tem == null) {
                    continue;
                } else {
                    if (tempN == null) {
                        tempN = tem;
                        minI = i;
                    } else if (tempN.val >= tem.val) {
                        tempN = tem;
                        minI = i;
                    }
                }
            }
            if (minI == -1) {
                break;
            }
            lists[minI] = tempN.next;
            newList.next = tempN;
            newList = newList.next;
        }
        return listNode.next;

    }


    public void quickSort(int[] n) {
        quickSort(n, 0, n.length - 1);
    }

    private void quickSort(int[] n, int start, int end) {
        if (start >= end) {
            return;
        }
        int m = partition1(n, start, end);
        quickSort(n, start, m - 1);
        quickSort(n, m + 1, end);
    }

    private int partition1(int[] n, int start, int end) {

        int pivot = n[start];
        int left = start + 1;
        int right = end;
        while (left < right) {
            while (left < right && n[left] <= pivot) {
                left++;
            }

            while (left < right && n[end] >= pivot) {
                right--;
            }
            if (left < right) {
                int a = n[right];
                n[right] = n[left];
                n[left] = a;
                left++;
                right--;
            }
        }
        if (left == right && n[right] > pivot) {
            right--;
        }
        int a = n[right];
        n[right] = n[start];
        n[start] = a;
        return right;
    }


    public int[] sortArray(int[] nums) {

        quickSort1(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort1(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }
        int middle = partition2(nums, s, e);
        quickSort1(nums, s, middle - 1);
        quickSort1(nums, middle + 1, e);
    }

    private int partition2(int[] nums, int s, int e) {
        int poivt = nums[s];
        int l = s + 1;
        int r = e;
        while (l < r) {
            while (l < r && nums[l] <= poivt) {
                l++;
            }
            if (l != r) {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                r--;
            }
        }

        if (l == r && nums[r] > poivt) {
            r--;
        }
        if (r != s) {
            int t = nums[r];
            nums[r] = nums[s];
            nums[s] = t;
        }
        return r;
    }

    public int majorityElement(int[] nums) {

        int x = findx(nums, 0, nums.length - 1);
        return x;
    }

    private int findx(int[] nums, int start, int end) {
        if(start>=end){
            return -1;
        }
        int middle = partitionx(nums, start, end);
        findx(nums, start, middle - 1);
        findx(nums, middle + 1, end);
        return nums[nums.length/2];
    }

    private int partitionx(int[] nums, int start, int end) {

        int poivt = nums[start];
        int left = start + 1;
        int right = end;


        while (left < right) {
            while (left < right && nums[left] <= poivt) {
                left++;
            }
            if (left != right) {
                int t = nums[right];
                nums[right] = nums[left];
                nums[left] = t;
                right--;
            }
        }
        if (left == right && nums[right] > poivt) {
            right--;
        }
        if (right != start) {
            int t = nums[right];
            nums[right] = nums[start];
            nums[start] = t;
        }
        return right;
    }

    
    
/*

    public void mergeSort(int[] nums, int l , int r,int[] result){
        if(l == r){
            return;
        }
        int middle = (l+r)/2;
        mergeSort(nums,l,middle,result);
        mergeSort(nums,middle+1,r,result);
        merge(nums,l,r,result);
    }

    private void merge(int[] nums, int l, int r, int[] result) {

        int start1 = l;
        int end1 = (l+r)/2;
        int start2 = end1+1;
        int end2 = r;
        int resultIndex = start1;
        while (start1<=end1&&start2<=end2){
            if(nums[start1]<=nums[start2]){
                result[resultIndex++]=nums[start1++];
            }else {
                result[resultIndex++]=nums[start2++];
            }
        }

        while (start1<=end1){
            result[resultIndex++]=nums[start1++];
        }
        while (start2<=end2){
            result[resultIndex++]=nums[start2++];
        }
        for (int i = l; i <= r; i++) {
            nums[i] = result[i];
        }
    }*/



    public void mergeSort(int[] nums, int l , int r ){
        if(l == r){
            return;
        }
        int middle = (l+r)/2;
        mergeSort(nums,l,middle);
        mergeSort(nums,middle+1,r);
        merge(nums,l,r);
    }

    /*private void merge(int[] nums, int l, int r ) {

        int start1 = l;
        int end1 = (l+r)/2;
        int start2 = end1+1;
        int end2 = r;
        while (start1<=end1&&start2<=end2){
            if(nums[start1]<=nums[start2]){
               start1++;
            }else {
                int temp = nums[start2];
                int index = start2;
                //插入拍寻 大的数值 放在1的最后 默认两个数组是已经排序好的 所以start2是第二个数组最小的
                while (index>start1){
                    nums[index]=nums[index-1];
                    index--;
                }
                nums[index]=temp;
                start1++;
                start2++;
                end1++;
            }
        }
    }*/

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
        int[] i = new int[]{3,2,1,4};
//        ListNode listNode = new QuickSort().mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5)))
//                , new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))});
//
//        while (listNode != null) {
//            System.out.print("," + listNode.val);
//            listNode = listNode.next;
//        }
      new QuickSort().mergeSort(i,0,i.length-1 );
        System.out.println("," + i);
        for (int i1 : i) {
            System.out.print("," + i1);
        }


    }
}
