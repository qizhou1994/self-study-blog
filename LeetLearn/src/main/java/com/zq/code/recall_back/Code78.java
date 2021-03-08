package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/4
 */
public class Code78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int temps[] = new int[nums.length];
        dfs(nums,temps,0,new ArrayList<>(),lists);
        return lists;
    }

    private void dfs(int[] nums,int[] temps,int dep,List<Integer> temp,List<List<Integer>> lists){
        lists.add(new ArrayList<>(temp));

        for(int i = dep ; i < nums.length;i++){
            if(temps[i]==1){
                continue;
            }
            temps[i]=1;
            temp.add(nums[i]);
            dfs(nums,temps,i,temp,lists);
            temps[i]=0;
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2,3};
        Code78 solution = new Code78();
        List<List<Integer>> lists = solution.subsets(nums);
        System.out.println(lists);
    }
}
