package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int tempMax = nums[0];
        for(int i = 0 ; i < nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            tempMax = Math.max(tempMax,sum);
        }
        return tempMax;
    }
}
