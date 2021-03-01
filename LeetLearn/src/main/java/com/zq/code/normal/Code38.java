package com.zq.code.normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/1
 */
public class Code38 {

    public String countAndSay(int n) {
        String s = "1";
        String next = "";
        for(int i = 1; i < n ; i++) {
            int temp = 0;
            int tempkey=0;
            for (int j = 0; j < s.length(); j++) {
                if(tempkey!=(s.charAt(j)-'0')){
                    if(temp !=0){
                        next=next+temp+""+tempkey;
                    }
                    tempkey = (s.charAt(j)-'0');
                    temp=1;
                }else {
                    temp++;
                };
            }
            s=next+temp+""+tempkey;
            next="";
        }
        return s;
    }

    public static void main(String[] args) {
        Code38 l = new Code38();
        System.out.println("l = "+l.countAndSay(5));
    }
}
