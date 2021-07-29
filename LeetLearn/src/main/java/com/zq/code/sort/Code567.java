package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/29
 */
public class Code567 {
    public boolean checkInclusion(String s1, String s2) {

        if(s2==null||s2.length()==0||s1==null||s1.length()==0){
            return false;
        }
        for(int i = 0 ; i < s2.length();i++){
            boolean contain = true;
            for(int j = 0 ; j < s1.length();j++){
                if(s1.charAt(j)!=s2.charAt(i+j)){
                    contain = false;
                    j = s1.length();
                }
            }
            return contain;
        }
        return false;
    }
}
