package com.zq.code.normal;

import java.util.Arrays;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/19
 */
public class Code66 {
    public int[] plusOne(int[] digits) {
        int temp = 1;
        int[] newx = new int[digits.length+1];
        for(int i = digits.length-1;i>=0;i--){
            temp = temp+digits[i];
            if(temp>=10){
                newx[i+1] = temp%10;
                temp = 1;
            }else {
                newx[i+1] = temp;
                temp = 0;
            }
        }
        if(temp>0){
            newx[0] = 1;
            return newx;
        }
        return Arrays.copyOfRange(newx,1,newx.length);
    }
}
