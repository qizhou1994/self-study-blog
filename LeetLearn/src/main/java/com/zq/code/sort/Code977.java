package com.zq.code.sort;

import java.util.Arrays;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code977 {

    //非递减 所以双指针处理会更好
    public int[] sortedSquares(int[] nums) {

        for(int i = 0 ; i < nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
