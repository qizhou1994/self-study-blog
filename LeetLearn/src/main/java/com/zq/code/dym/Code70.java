package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code70 {
    public int climbStairs(int n) {

        int fn = 1;
        int f1=0;
        while (n-->0){
            int temp = fn;
            fn = f1+fn;
            f1 = temp;
        }
        return fn;
    }
}
