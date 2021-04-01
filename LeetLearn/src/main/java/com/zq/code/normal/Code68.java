package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/4/1
 */
public class Code68 {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        List<String> listTemp = new ArrayList<>();
        int tempWidth = 0;
        for (String t : words) {
            if (tempWidth == 0) {
                listTemp.add(t);
                tempWidth = t.length();
            } else if (tempWidth + 1 + t.length() <= maxWidth) {
                listTemp.add(t);
                tempWidth += (t.length() + 1);
            } else {
                String tempS = "";
                int s = listTemp.size();

                int sc = tempWidth;
                int newS = (maxWidth - sc);
                int max = 0;
                if (s != 1) {
                    sc = tempWidth - s + 1;
                    newS = (maxWidth - sc) / (s - 1);
                    max = (maxWidth - sc) % (s - 1);
                }

                for (String x : listTemp) {
                    tempS += x;
                    if (max-- > 0) {
                        tempS += " ";
                    }
                    if (tempS.length() != 0 && tempS.length() + newS <= maxWidth) {
                        for (int i = 0; i < newS; i++) {
                            tempS += " ";
                        }
                    }
                }
                list.add(tempS);
                listTemp.clear();
                listTemp.add(t);
                tempWidth = t.length();
            }
        }
        String tempS = "";
        int max = listTemp.size();
        for (String x : listTemp) {
            System.out.println(" max = "+ max+",x="+x);
            tempS += x;
            if (max-- > 0) {
                tempS += " ";
            }
        }
        while (tempS.length()<maxWidth){
            tempS+=" ";
        }
        list.add(tempS);
        return list;
    }

    public static void main(String[] args) {

//        List<String> list = new Code68().fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "example", "of", "text", "justification."}, 16);
        List<String> list = new Code68().fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16);
        for (String s : list) {
            System.out.println("s =" + s);
        }
    }
}
