package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/10
 */
public class Code53 {

    public int maxSubArray(int[] nums) {
        int sum= 0;
        int max = nums[0];
        int l = 0 ;
        int r = 0;
        for(int i = 0 ; i < nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            max = Math.max(max,sum);
        }
        return max;
    }




    public static void main(String[] args) {

    }
}
