package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/28
 */
public class Code84 {

    public int largestRectangleArea(int[] heights) {
        int l = 0;
        int r = heights.length;
        int max = 0;

        for (int i = 0; i < r; i++) {
            int min = i;
            int w = (Math.abs(i - j) + 1);
            int temp = heights[i];
            if (heights[j] <= 0) {
                j = r;
                continue;
            } else if (heights[min] > heights[j]) {
                min = j;
            }
            temp = heights[min] * w;
            if (max < temp) {
                max = temp;
            }
        }
    }
        return max;
}
}
