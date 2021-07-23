package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/23
 */
public class Code121 {
    public int maxProfit(int[] prices) {

        int[][] x = new int[prices.length][prices.length];
        int max = 0;
        for(int i = 0 ; i < prices.length;i++){
        for(int j = 0 ; j < prices.length;j++) {
            x[i][j] = prices[j]-prices[i];
            max = Math.max(max,x[i][j]);
        }
        }
        return max;
    }
}
