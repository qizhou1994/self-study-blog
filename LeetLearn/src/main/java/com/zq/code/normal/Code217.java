package com.zq.code.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code217 {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.getOrDefault(x,0)!=0){
                return true;
            }else {
                map.put(x,1);
            }
        }
        return false;
    }
}
