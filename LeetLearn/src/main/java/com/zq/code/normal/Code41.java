package com.zq.code.normal;

import java.util.Arrays;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/5
 */
public class Code41 {
    public int firstMissingPositive(int[] nums) {
        int min = -1;
        int[] temp = new int[nums.length+1];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>=1&&nums[i]<=nums.length){
                temp[nums[i]]= nums[i];
            }
        }
        for(int i = 1 ; i < nums.length+1 ; i++){
            if(temp[i]==0){
              min = i;
              break;
            }
        }
        if(min == -1){
            min = nums.length+1;
        }
        return min;
    }

    public static void main(String[] args) {
        Code41 l = new Code41();
        System.out.println("l = "+l.firstMissingPositive(new int[]{1}));
    }
}
