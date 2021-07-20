package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code704 {
    public int search(int[] nums, int target) {

        int r = nums.length-1;
        int l = 0;
        int mid = (l+r)/2;
        while (l<=r){
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                return mid;
            }
            mid = (l+r)/2;
        }
        return -1;
    }
}
