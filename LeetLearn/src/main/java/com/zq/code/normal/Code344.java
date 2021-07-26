package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code344 {

    public void reverseString(char[] s) {

        for(int i = 0 ; i < s.length/2;i++){
            char temp = s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }

}
