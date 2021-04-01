package com.zq.code.normal;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/23
 */
public class Code76 {


    public void testMi() {
        StringBuilder s = new StringBuilder("  ");
        StringBuilder t = new StringBuilder("");
        minWindow(s.toString(), t.toString());
    }

    public String minWindow(String s, String t) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char t1 : t.toCharArray()) {
            tMap.put(t1, tMap.getOrDefault(t1, 0) + 1);
        }
        int min = s.length();
        String temp = "";
        hashMap.put(s.charAt(0), 1);
        while (r >= l && r < s.length()) {

            boolean con = true;
            for (char t1 : tMap.keySet()) {
                if (tMap.get(t1)>hashMap.getOrDefault(t1,0)) {
                    con = false;
                }
            }
            if (con == false) {
                r++;
                if (r == s.length()) {
                    break;
                }
                if (hashMap.getOrDefault(s.charAt(r), 0) <= 0) {
                    hashMap.put(s.charAt(r), 1);
                } else {
                    hashMap.put(s.charAt(r), hashMap.get(s.charAt(r)) + 1);
                }
            } else {
                if (min > r - l) {
                    temp = s.substring(l, r + 1);
                    min = r - l;
                }
                if (hashMap.getOrDefault(s.charAt(l), 0) > 0) {
                    hashMap.put(s.charAt(l), hashMap.get(s.charAt(l)) - 1);
                }
                l++;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        new Code76().testMi();
    }
}
