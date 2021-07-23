package com.zq.code.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/23
 */
public class Code350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int max = 0;
        for(int x:nums1){
            max=max>x?max:x;
        }
        int[] x= new int[max+1];
        for(int x1:nums1){
            x[x1]+=1;
        }
        List<Integer> l = new ArrayList<>();
        for(int x1 = 0 ; x1 < nums2.length;x1++){
            if(x[nums2[x1]]>0){
                x[nums2[x1]]-=1;
               l.add(nums2[x1]) ;
           }
        }
        int[] xx = new int[l.size()];
        for(int x1 = 0  ; x1 < l.size();x1++){
            xx[x1] = l.get(x1);
        }
        return  xx;
    }
}
