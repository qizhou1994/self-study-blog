package com.zq.code.datastruct;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code387 {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < s.length();i++){
            if(hashMap.getOrDefault(s.charAt(i),0)==1){
                return i;
            };
        }
        return -1;
    }
}
