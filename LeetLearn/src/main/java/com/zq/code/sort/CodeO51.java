package com.zq.code.sort;

import com.zq.code.normal.Code51;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/10
 */
public class CodeO51 {

    public int reversePairs(int[] nums) {

        mergSort(nums,0,nums.length-1,new int[nums.length]);
        return a;

    }

    int a = 0;
    private void mergSort(int[] nums,int left,int right,int[] res){
        if(left>=right){
            return;
        }
        int middle = (left+right)/2;
        mergSort(nums,left,middle,res);
        mergSort(nums,middle+1,right,res);
        merg(nums,left,right,res);
    }

    private void merg(int[] nums, int left, int right,int[] res) {
        int midlle = (left+right)/2;
        int start = left;
        int end = midlle;

        int start1 = midlle+1;
        int end1 = right;
        int index = left;
        while (start<=end&&start1<=end1){
            if(nums[start]>nums[start1]){
                a=a+midlle-start+1;
                res[index++] = nums[start1++];
            }else {
                res[index++] = nums[start++];
            }
        }
        while (start<=end ){
            res[index++] = nums[start++];
        }
        while (start1<=end1 ){
            res[index++] = nums[start1++];
        }
        for (int i = left; i <= right; i++) {
            nums[i] = res[i];
        }

    }

    public static void main(String[] args) {
        int[] i = new int[]{7,5,6,4};
        System.out.println(new CodeO51().reversePairs(i));
        for(int a : i){
            System.out.print(","+a);
        }
    }
}
