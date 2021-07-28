package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code152 {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int sum = nums[0];
        int min = nums[0];
        int sumMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMin = Math.max(sumMin * nums[i], nums[i]);
            int tempSum = Math.min(sum * nums[i], nums[i]);

            sumMin = Math.min(sumMin * nums[i], nums[i]);
            sumMin = Math.min(sumMin, tempSum);
            min = Math.min(min, sumMin);

            sum = Math.max(sum * nums[i], nums[i]);
            sum = Math.max(sum, tempMin);

            max = Math.max(max, sum);
            System.out.println("max = " + max + ",min = " + min);
        }

        return max;
    }

    public static void main(String[] args) {
        new Code152().maxProduct(new int[]{-2, 3, -2, 4});
    }
}
