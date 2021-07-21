package com.zq.code.dym;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code740 {

    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int x = nums.length - 1; x >= 0; x--) {
            max = Math.max(max, nums[x]);
        }
        int[] sum = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[nums[i]] += nums[i];
        }
        int f1 = 0;
        int f2 = 0;
        for (int x = 0; x < sum.length ; x++) {
            if (x == 0) {
                f1 = sum[0];
                continue;
            } else if (x == 1) {
                f2 = sum[1];
                continue;
            }
            max = Math.max(f1 + sum[x], f2);
            f1 = Math.max(f1, f2);
            f2 = max;
        }

        return max;
    }


}
