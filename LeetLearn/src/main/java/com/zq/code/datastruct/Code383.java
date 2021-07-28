package com.zq.code.datastruct;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < magazine.length();i++){
            hashMap.put(magazine.charAt(i),hashMap.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i = 0 ; i < ransomNote.length();i++){
            int num = hashMap.getOrDefault(ransomNote.charAt(i),0);
            if(--num<0){
                return false;
            }
            hashMap.put(ransomNote.charAt(i),num);
        }
        return true;
    }
}
