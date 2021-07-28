package com.zq.code.datastruct;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < t.length();i++){
            int num = hashMap.getOrDefault(t.charAt(i),0)-1;
            hashMap.put(t.charAt(i),num);
        }
        for(int i : hashMap.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
