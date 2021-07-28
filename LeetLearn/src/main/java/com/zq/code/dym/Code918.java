package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code918 {

    //有环 用和减去 最小得最大值得和 就是最大值
    //五环 就是53
    public int maxSubarraySumCircular(int[] nums) {

        int max = nums[0] ;
        int sum = nums[0];
        int min = nums[0] ;
        int sumMin = nums[0];
        int sumMax = nums[0];
        for(int i= 1 ; i < nums.length;i++){
            sumMax += nums[i];
            sum = Math.max(sum+nums[i],nums[i]);
            max = Math.max(sum,max);

            sumMin = Math.min(sumMin+nums[i],nums[i]);
            min = Math.min(min,sumMin);
        }
        if(sumMax == min){
            return max;
        }
        return Math.max(sumMax-min,max);
    }
}
