package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code557 {

    public String reverseWords(String s) {

        StringBuilder temp = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int ti = 0; ti < st.length(); ti++) {
                    temp.append(s.charAt(i-1 - ti));
                }
                temp.append(s.charAt(i));
                st = new StringBuilder();
                continue;
            }
            st.append(s.charAt(i));
        }
        if(st.length()!=0)
        for (int ti = 0; ti < st.length(); ti++) {
            temp.append( st.charAt(st.length()-ti-1));
        }
        return temp.toString();
    }

}
