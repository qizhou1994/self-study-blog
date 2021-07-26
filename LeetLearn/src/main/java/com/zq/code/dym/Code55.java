package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code55 {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex <= i && nums[i] == 0&&i!=nums.length-1) {
                return false;
            }
            maxIndex = Math.max(i+nums[i], maxIndex);
        }
        return true;
    }
}
