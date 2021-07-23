package com.zq.code.normal;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code189 {
    public void rotate(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < nums.length;i++){
            if(hashMap.get(i)==null){
                hashMap.put((k+i)%nums.length,nums[(k+i)%nums.length]);
                nums[(k+i)%nums.length]=nums[i];
            }else {
                int temp = hashMap.get((k+i)%nums.length);
                nums[(k+i)%nums.length]=temp;
            }
        }
    }
}
