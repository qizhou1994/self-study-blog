package com.zq.code.datastruct;

import java.util.Stack;

/**
 * @author zhouqi
 * @desc
 * @data 2021/8/2
 */
public class Code20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length();i++){
            char temp = s.charAt(i);
            if(temp == '('||temp == '['||temp == '{'){
                stack.push(temp);
            }else {
                if(stack.size() == 0){
                    return false;
                }
                char tempC = stack.pop();
                if(tempC=='('&&temp==')'){
                    continue;
                }else if(tempC=='['&&temp==']'){
                    continue;
                }else if(tempC=='{'&&temp=='}'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        if(stack.size()==0){
            return true;
        }else {
            return false;
        }
    }
}
