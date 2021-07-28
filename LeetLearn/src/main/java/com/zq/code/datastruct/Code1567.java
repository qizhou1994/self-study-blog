package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/28
 */
public class Code1567 {
    public int getMaxLen(int[] nums) {

        int max = 1;
        int sum = 1;
        int min = 1;
        int minSum = 1;

        int maxNum = 0;
        int tempMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = min = sum = minSum = nums[0];
                continue;
            }
            int tempSummin = Math.min(max * nums[i], nums[i]);
            int tempSummax = Math.max(min * nums[i], nums[i]);


            minSum = Math.min(minSum * nums[i], nums[i]);
            minSum = Math.min(minSum, tempSummin);

            min = Math.min(minSum, min);

            sum = Math.max(sum * nums[i], nums[i]);
            sum = Math.max(sum, tempSummax);
            max = Math.max(sum, max);
        }
        return max;
    }
}
