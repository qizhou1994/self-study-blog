package com.zq.code.dym;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/8/4
 */
public class Code139 {
    public boolean wordBreak(String s, List<String> wordDict) {

        List<String> conList = new ArrayList<>();
        for(String word: wordDict){
            if(s.contains(word)){
                conList.add(word);
                s = s.replace(word,"");
            }else if(conList.contains(word)){
                continue;
            }else {

            }
        }
        return s == null || s.length() == 0;
    }
}
