package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code1014 {

    public int maxScoreSightseeingPair(int[] values) {

        int l = 0;
        int max = 0;
        int tempMin = 0;
        int tempL = values[0] + 0;
        for (int i = 1; i < values.length; i++) {

            if (l < i - 1) {
                if (values[l] + l <= values[i - 1] + (i - 1)) {
                    l++;
                    tempL = values[i - 1] + (i - 1);
                }
            }

            if (tempL + values[i] - i >= max) {
                max = tempL + values[i] - i;
            }
        }
        return max;
    }
}
