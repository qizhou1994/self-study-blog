package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/22
 */
public class Code75 {


   /* *//**
     * 堆排序
     * @param nums
     *//*
    public void sortColors(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            buildDump(nums, i, nums.length);
        }

        for (int i = nums.length-1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            buildDump(nums, 0,i);
        }
    }

    private void buildDump(int[] nums, int i, int length) {

        int l = i * 2 + 1;
        int r = l + 1;
        int last = i;
        if (l < length && nums[l] > nums[last]) {
            last = l;
        }
        if (r < length && nums[r] > nums[last]) {
            last = r;
        }

        if(last!=i){
            int temp = nums[i];
            nums[i] = nums[last];
            nums[last] = temp;
            buildDump(nums,last,length);
        }

    }*/





    /*
     */
/**
 * 归并
 * 快排
 *
 * @param nums
 *//*

    public void sortColors(int[] nums) {
        int[] temp = new int[nums.length];
        mergesort(nums, temp, 0, nums.length - 1);
    }

    private void mergesort(int[] nums, int[] temp, int start, int end) {

        if(start >=end){
            return;
        }
        int mid = (start + end) / 2;
        mergesort(nums, temp, start, mid);
        mergesort(nums, temp, mid + 1, end);
        mergesortSon(nums, temp, start, end, mid);
    }

    private void mergesortSon(int[] nums, int[] temp, int start, int end, int mid) {

        int l = start;
        int l2 = mid + 1;
        int t = 0;
        while (l <= mid && l2 <= end) {
            if (nums[l] <= nums[l2]) {
                temp[t] = nums[l];
                l++;
            } else {
                temp[t] = nums[l2];
                l2++;
            }
            t++;
        }
        while (l <= mid) {
            temp[t++] = nums[l++];
        }
        while (l2 <= end) {
            temp[t++] = nums[l2++];
        }
        //最后还要记得把临时数组拷贝到原数组中
        t=0;
        while (start <= end) {
            nums[start++] = temp[t++];
        }

    }
*/


/*    //插入排序
    public void sortColors(int[] nums) {
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            int j = i ;
            temp = nums[j];
            while (j>0&&nums[j]<temp){
                nums[j]=nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
    }*/
    /*//选择排序
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length;i++){
            int temp =  i;
            for(int j = i ; j < nums.length;j++){
                if(nums[temp]>nums[j]){
                    temp = j;
                }
            }
            int t = nums[i];
            nums[i] = nums[temp];
            nums[temp] = t;
        }
    }*/


 /*   //冒泡
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length;i++){
            for(int j = 0 ; j < nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int t = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }*/

}
