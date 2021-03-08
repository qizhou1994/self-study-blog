package com.zq.code.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code49 {



    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<Integer,HashMap<Long,List<String>> > hashMap = new HashMap<>();
        for(int i = 0 ; i < strs.length;i++){
            String temp = strs[i];
            long sum = 1;
            long sum1 = 0;
            for(char a : temp.toCharArray()){
                sum=sum*(a-'a'+1);
                sum1 = sum1 + a-'a';
            }
            sum = sum1+sum;
            System.out.println("length = "+ temp.length()+",sum = "+ sum+",temp = "+ temp);
            HashMap<Long,List<String>> map = hashMap.get(temp.length());
            if(map ==null){
                map = new HashMap<>();
            }

            List<String> ls = map.get(sum);
            if(ls == null){
                ls = new ArrayList<>();
            }
            ls.add(temp);

            map.put(sum,ls);
            hashMap.put(temp.length(),map);
        }

        for(Map.Entry<Integer,HashMap<Long,List<String>>> mapEntry: hashMap.entrySet()){
            for(Map.Entry<Long,List<String>> m :mapEntry.getValue().entrySet()){
                lists.add(m.getValue());
            }
        }
        return lists;

    }


    public static void main(String[] args) {
        System.out.print(new Code49().groupAnagrams(new String[]{ "ate", "nat", "bat"}));
        System.out.print(new Code49().groupAnagrams(new String[]{"rig","coy","foxtrot","dispossession","floodgate","unfriendliest","semimonthlies","dwellers","walkways","wastrels"}));
    }
}
