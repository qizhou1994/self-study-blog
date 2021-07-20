package com.zq.code.dym;

import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] sum = new int[cost.length];
        for(int i = 0 ; i < cost.length;i++){
            if(i == 0){
                sum[0] = cost[0];
                continue;
            }else if(i==1){
                sum[1] = cost[1];
                continue;
            }
            sum[i] = Math.min(sum[i-1]+cost[i],sum[i-2]+cost[i]);
        }
        return Math.min(cost.length<2?0:sum[cost.length-2],sum[cost.length-1]);
    }
}
