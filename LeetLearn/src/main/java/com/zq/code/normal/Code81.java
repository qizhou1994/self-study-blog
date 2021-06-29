package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/25
 */
public class Code81 {

    public boolean search(int[] nums, int target) {

        int index = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }

}
