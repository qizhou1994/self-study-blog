package com.zq.code.normal;

import java.util.Arrays;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/15
 */
public class Code56 {
//57

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] news = new int[intervals.length + 1][2];
        int r = 0;
        int i = 0;
        news[0][0] = newInterval[0];
        news[0][1] = newInterval[1];
        while (i < intervals.length) {
            int temp0 = news[r][0];
            int temp1 = news[r][1];
            if (temp0 > intervals[i][1]) {
                System.out.println("temp0 = "+ temp0);
                news[r][0] = intervals[i][0];
                news[r][1] = intervals[i][1];
                System.out.println("temp0 = "+ temp0);
                news[r + 1][0] = temp0;
                news[r + 1][1] = temp1;
                r++;
            } else if (temp1 < intervals[i][0]) {
                news[r + 1][0] = intervals[i][0];
                news[r + 1][1] = intervals[i][1];
                r++;
            } else {
                news[r][0] = Math.min(temp0, intervals[i][0]);
                news[r][1] = Math.max(temp1, intervals[i][1]);
            }
            i++;
        }
        int[][] ints = Arrays.copyOf(news,r+1);
        return ints;
    }


    public static void main(String[] args) {

    }
}
