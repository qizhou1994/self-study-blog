package com.zq.code.normal;

import java.util.Stack;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code32 {


    public int longestValidParentheses(String s) {

        int max = 0;
        int[] t = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i)==')'){
                    //并列的括号
                    if(s.charAt(i-1)=='('){
                        t[i]= (i>=2?t[i-2]:0)+2;
                    }else
                        //嵌套括号 i-t[i-1]-1 前一个的定位
                    //i - t[i - 1] - 2 ((()))再更前一点的括号数
                        if(i-t[i-1]>0&&s.charAt(i-t[i-1]-1)=='('){
                            t[i] = t[i-1]+((i - t[i - 1]) >= 2 ? t[i - t[i - 1] - 2] : 0) + 2;;
                        }
                    max = Math.max(max, t[i]);
                }
        }

        return max;
    }


    public static void main(String[] args) {


        System.out.println(new Code32().longestValidParentheses("(()())"));
        System.out.println(new Code32().longestValidParentheses(""));
    }
}
