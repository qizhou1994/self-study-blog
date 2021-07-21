package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code1 {
//暴力枚举或者哈希表
    public int[] twoSum(int[] nums, int target) {
        int[] idx = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    idx[0]=i;
                    idx[1]=j;
                    return idx;
                }
            }
        }
        return idx;
    }

}
