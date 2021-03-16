package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/16
 */
public class Code58 {




    public int lengthOfLastWord(String s) {

        int length = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(length == 0){
                    continue;
                }else {
                    break;
                }
            }else {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {

    }
}
