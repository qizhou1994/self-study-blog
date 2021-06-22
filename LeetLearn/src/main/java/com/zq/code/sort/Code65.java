package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/21
 */
public class Code65 {


    public boolean isNumber(String s) {
        if(s==null||s.trim().length()==0){
            return false;
        }
        boolean isNum = false;
        boolean ispoint = false;
        boolean isnatural = false;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                isNum = true;
            }else if(s.charAt(i)=='.'&&!ispoint&&!isnatural){
                ispoint =true;
            }else if((s.charAt(i)=='E'||s.charAt(i)=='e')&&!isnatural&&isNum){
                isnatural = true;
                isNum = false;
            }else if((s.charAt(i)=='-'||s.charAt(i)=='+')){
                if(i==0||(s.charAt(i-1)=='e'||s.charAt(i-1)=='E')){
                continue;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return isNum;
    }
}
