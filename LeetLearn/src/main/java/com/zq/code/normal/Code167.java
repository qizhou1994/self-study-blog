package com.zq.code.normal;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code167 {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer>hashMap = new HashMap<>();
        for(int i = 0 ; i < numbers.length;i++){
            hashMap.put(numbers[i],i);
        }
        for(int i = 0 ; i < numbers.length;i++){
            if(hashMap.get(target - numbers[i])!=null){
                return new int[]{i+1,hashMap.get(target - numbers[i])+1};
            }
        }
        return null;
    }
}
