package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code35 {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            } else if (nums[i] == target) {
                return i;
            } else {
                return i;
            }
        }
        return nums.length;
    }
}
