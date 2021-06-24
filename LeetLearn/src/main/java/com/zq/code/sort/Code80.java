package com.zq.code.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/24
 */
public class Code80 {

    public int removeDuplicates(int[] nums) {

        int temp = 0 ;
        int tempValue = 0;
        List<Integer> listIndex = new ArrayList<>();

        for(int i = 0 ; i < nums.length;i++){
            if(nums[temp] == nums[i]){
                if(tempValue>=2){
                    listIndex.add(i);
                }else {
                    tempValue++;
                }
            }else {
                tempValue=1;
                temp = i;
            }
        }

        temp = 0;
        tempValue = nums.length - listIndex.size();
        for (int i = 0 ; i < nums.length;i++){
            if(listIndex.get(0)==i){
                temp++;
                listIndex.remove(0);
            }
            nums[i]=nums[i+temp];
        }
        return tempValue;
    }
}
