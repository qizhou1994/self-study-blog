package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/28
 */
public class Code1567 {
    public int getMaxLen(int[] nums) {

        int max = nums[0];
        int sum = nums[0];
        int min = nums[0];
        int sumMin = nums[0];

        int maxNum = 0;
        int minNum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i == 0) {
                max = min = sum = sumMin = nums[0];
                continue;
            }

            int tempSum = Math.min(sum * nums[i], nums[i]);
            if (sumMin * nums[i] < nums[i]) {
                minNum++;
            } else {
                minNum = 0;
            }
            sumMin = Math.min(sumMin * nums[i], nums[i]);
            sumMin = Math.min(sumMin, tempSum);
            min = Math.min(min, sumMin);

            int tempMin = Math.max(sumMin * nums[i], nums[i]);
            sum = Math.max(sum * nums[i], nums[i]);
            sum = Math.max(sum, tempMin);
            if (sum * nums[i] < nums[i]) {
                maxNum++;
            } else {
                maxNum = 0;
            }

            max = Math.max(max, sum);
        }
        return maxNum;
    }
}
