package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code152 {

    public int maxProduct(int[] nums) {

        int max = 1; int sum = 1;
        int tempMax = 1;
        for(int i = 0 ; i < nums.length;i++){
            sum = Math.max(sum*nums[i],nums[i]);
            tempMax = Math.max(tempMax*nums[i],tempMax);
            max = Math.max(sum,max);
        }

        return max;
    }

}
