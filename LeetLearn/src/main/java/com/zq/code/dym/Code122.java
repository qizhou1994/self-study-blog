package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code122 {
    public int maxProfit(int[] prices) {

        int max = 0;
        int[][] x= new int[prices.length][prices.length];
        for(int i = 0 ; i < prices.length;i++){
        for(int j = 0 ; j < prices.length;j++) {
            x[i][j] = prices[j]-prices[i];
        }

        }
        return max;
    }
}
