package com.zq.code.datastruct;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/27
 */
public class Code3 {

    public int lengthOfLongestSubstring(String s) {

        int l = 0 ;
        int r = 0;
        int max = 0;
        HashSet<Character> x = new HashSet<Character>();
        for(int i = 0 ; i < s.length();i++) {
            while (l<i&&x.contains(s.charAt(i))){
                x.remove(s.charAt(l++));
            }
            if(!x.contains(s.charAt(i))){
                r++;
                x.add(s.charAt(i));
            }
            max = Math.max(max,r-l);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Code3().lengthOfLongestSubstring("dvdf"));
        System.out.println(new Code3().lengthOfLongestSubstring(""));
        System.out.println(new Code3().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new Code3().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new Code3().lengthOfLongestSubstring("pwwkew"));
    }

}
