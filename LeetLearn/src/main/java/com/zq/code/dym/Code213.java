package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code213 {
    public int rob(int[] nums) {
        return Math.max(getSum(nums,nums.length,1),getSum(nums,nums.length-1,0));
    }

    private int getSum(int[] nums,int length,int start){
        if(nums == null||nums.length == 0||length<0||start>=nums.length){
            return 0;
        }
        int sum = nums[start];
        int s1 = 0;
        int s2 = 0;
        for (int i = start; i < length; i++) {
            if (i == start) {
                sum = s1 = nums[start];
                continue;
            }
            if (i == start+1) {
                s2 = nums[start+1];
                sum = Math.max(s1, s2);
                continue;
            }
            sum = Math.max(s1 + nums[i], s2);
            s1 = Math.max(s1, s2);
            s2 = sum;
        }
        return sum;
    }
}
