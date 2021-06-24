package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/23
 */
public class Code77 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> listSon = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(n,k,1);
        return lists;
    }

    private void dfs(int n, int k, int i) {

        if(listSon.size()>k+(n-i+1)){
            return;
        }
        if(listSon.size() == k){
            lists.add(new ArrayList(listSon));
            return;
        }

        listSon.add(i);
        dfs(n,k,i+1);
        listSon.remove(listSon.size()-1);
        dfs(n,k,i+1);


    }
}
