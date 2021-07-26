package com.zq.code.dym;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code45 {

    public int jump(int[] nums) {

        int maxIndex = 0 ;
        int num = 0;
        int tempEnd = 0;
        for(int i = 0 ; i < nums.length-1;i++){

            maxIndex = Math.max(nums[i]+i, maxIndex);
            if(i == tempEnd){
                tempEnd = maxIndex;
                num++;
            }
        }
        return num;
    }
}

