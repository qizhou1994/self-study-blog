package com.zq.code.recall_back;

import java.util.*;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/2
 */
public class Code39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();

        dfs(candidates,candidates.length,0,new ArrayList<>(),lists,target);
        return lists;
    }



    private void dfs(int[] nums, int len, int depth,
                     List<Integer> path, List<List<Integer>> res,int target) {
        if (target ==0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if(target<0){
            return;
        }
        for (int i = depth; i < len; i++) {
            if (target - nums[i]>=0) {
                path.add(nums[i]);
                dfs(nums, len, i , path, res, target-nums[i]);
                if(path.size()!=0){
                    path.remove(path.size()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        Code39 solution = new Code39();
        List<List<Integer>> lists = solution.combinationSum(nums, 8);
        System.out.println(lists);
    }

}
