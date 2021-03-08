package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/4
 */
public class Code46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int temps[] = new int[nums.length];
        dfs(nums, temps,0, lists, new ArrayList<>());
        return lists;
    }


    private void dfs(int[] nums,int temps[], int depth, List<List<Integer>> lists, List<Integer> temp) {
        if (depth == nums.length) {
            lists.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temps[i]==1) {
                continue;
            }
            temps[i]=1;
            temp.add(nums[i]);
            dfs(nums, temps,temp.size(), lists, temp);
            temps[i]=0;
            if (temp.size() != 0) {
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        Code46 solution = new Code46();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}
