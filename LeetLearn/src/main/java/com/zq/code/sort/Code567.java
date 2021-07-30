package com.zq.code.sort;

import java.util.Arrays;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code567 {
    public boolean checkInclusion(String s1, String s2) {

        if(s2==null||s2.length()==0||s1==null||s1.length()==0||s1.length()>s2.length()){
            return false;
        }
        int[] s1Sum = new int[26];
        int[] s2Sum = new int[26];
        for(int i = 0 ; i < s1.length();i++){
            s1Sum[s1.charAt(i)-'a'] ++;
            s2Sum[s2.charAt(i)-'a'] ++;
        }
        if(Arrays.equals(s1Sum,s2Sum)){
            return true;
        }
        for(int i = s1.length(); i < s2.length();i++){
            s2Sum[s2.charAt(i)-'a']++;
            s2Sum[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(s1Sum,s2Sum)){
                return true;
            }


        }
        return false;
    }
}
