package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code198 {

    public static void main(String[] args) {
//        new Code198().rob(new int[]{1,2,3,1});
        new Code198().rob(new int[]{2,1,1,2});
    }
    public int rob(int[] nums) {

        int sum = 0;
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum = s1 = nums[0];
                continue;
            }
            if (i == 1) {
                s2 = nums[1];
                sum = Math.max(s1, s2);
                continue;
            }
            sum = Math.max(s1 + nums[i], s2);
            s1 = Math.max(s1 , s2);
            s2 = sum;

            System.out.println("sum = "+sum);
        }
        return sum;
    }

}
