package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/23
 */
public class Code121 {
    public int maxProfit(int[] prices) {

        int max = 0;
        int tempMax = 0;

        for(int i = 0 ; i < prices.length;i++){
            if(i == 0){
                tempMax = prices[0];
            }
            if(tempMax>prices[i]){
                tempMax = prices[i];
            }
            max = Math.min(max,tempMax-prices[i]);
        }
        return max;
    }
}
