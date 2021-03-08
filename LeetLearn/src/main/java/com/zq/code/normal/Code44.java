package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/5
 */
public class Code44 {

    public boolean isMatch(String s, String p) {

        int s1 = 0;
        int p1 = 0;
        int start = -1;
        int temp = 0;
        if(s == null||s.length()==0){
            if(p==null||p.length()==0){
                return true;
            }
        }
        if(p==null||p.length()==0){
            return false;
        }

        while (s1 < s.length()) {
            if (p.charAt(p1) == s.charAt(s1) || p.charAt(p1) == '?') {
                p1++;
                s1++;
                if(p1>=p.length()&&s1 < s.length()){
                    if(start >= 0) {
                        p1 = start;
                        s1 = ++temp;
                    }else {
                        break;
                    }
                }
                continue;
            }

            if (p.charAt(p1) == '*') {
                start = p1++;
                if(p1 == p.length()){
                    break;
                }
                temp = s1;
                continue;
            }

            if (start >= 0) {
                p1 = start;
                s1 = ++temp;
                continue;
            }
            System.out.println("false");
            return false;
        }

        while (p1<p.length()&&p.charAt(p1)=='*'){
                p1++;
        }

        while (s1<s.length()&&p.charAt(p1-1)=='*'){
            s1++;
        }
        return p1 == p.length()&&s1==s.length() ;
    }
//    public boolean isMatch(String s, String p) {
//        if (p == null||p.length()==0) {
//            if(s==null||s.length()==0){
//                return true;
//            }
//            return false;
//        }
//
//        int pi = 0;
//        int si = 0;
//        int ts = 0,tp=0;
//        while (pi < p.length()) {
//
//            char p1 = p.charAt(pi);
//            if(p1!='*'&&(s==null||s.length()==0||si == s.length())){
//                return false;
//            }
//            else if(p1 == '*'){
//                if(s==null||s.length()==0||si == s.length()){
//                    pi++;
//                }else if(pi+1<p.length()){
//                    pi++;
//
//                    if(ts == 0){
//                        ts= si;
//                    }
////                    if(isMatch(s.substring(si),p.substring(pi+1))){
////                        //向下
////                        return true;
////                    }else {
////                        if(si+1<s.length()){
////                            si++;
////                        }else {
////                            return false;
////                        }
////                    }
//                }else {
//                    return true;
//                }
//            }else if(p1 == s.charAt(si)||p1=='?'){
//                si++;
//                pi++;
//            }else {
//                return false;
//            }
//        }
//        if(si<s.length()){
//            return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Code44 l = new Code44();
        System.out.println("l = " + l.isMatch("hi", "*?"));
    }
}
