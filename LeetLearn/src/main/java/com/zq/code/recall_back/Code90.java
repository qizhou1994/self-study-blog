package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/4
 */
public class Code90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] temps = new int[nums.length];
        Arrays.sort(nums);
        dfs(nums,0,temps,new ArrayList<>(),lists);
        return lists;
    }

    private void dfs(int[] nums, int dep, int[] temps,List<Integer> tep, List<List<Integer>> lists) {

        lists.add(new ArrayList<>(tep));
        for(int i = dep ; i <nums.length;i++){
            if(i>dep&&nums[i]==nums[i-1]){
                continue;
            }
            if(tep.contains(nums[i])){
                continue;
            }
            temps[i]=1;
            tep.add(nums[i]);
            dfs(nums,i+1,temps,tep,lists);
            temps[i]=0;
            tep.remove(tep.size()-1);
        }
    }


    public static void main(String[] args) {
        Code90 code90 =new Code90();
        List<List<Integer>>  l = code90.subsetsWithDup(new int[]{1,2,2});
        System.out.println(l);
    }
}
