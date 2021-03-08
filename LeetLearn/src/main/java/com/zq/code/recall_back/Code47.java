package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/5
 */
public class Code47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, new int[nums.length], 0, lists, new ArrayList<>());
        return lists;
    }


    private void dfs(int[] nums, int temps[], int depth, List<List<Integer>> lists, List<Integer> temp) {
        if (depth == nums.length) {
            lists.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if((i>0&&nums[i]==nums[i-1]&&temps[i-1]==0)){
                continue;
            }

            if (temps[i] == 1) {
                continue;
            }

            temps[i] = 1;
            temp.add(nums[i]);
            dfs(nums, temps, temp.size(), lists, temp);
            temps[i] = 0;
            if (temp.size() != 0) {
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3};
        Code47 solution = new Code47();
        List<List<Integer>> lists = solution.permuteUnique(nums);
        System.out.println(lists);
    }
}
