package com.zq.code.recall_back;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/17
 */
public class Code60 {


    int z = 0;
    public String getPermutation(int n, int k) {

        List<String> l = new ArrayList<>();
        String s = new String();
        int[] c = new int[n];

        for(int i = 0 ; i < n;i++) {
            dfs(l,s,i,n,c,k);
        }
        return l.get(k-1);
    }

    private void dfs(List<String> l, String s, int i, int n, int[] c,int k ) {
        if(z>=k ){
            return;
        }
        for(int x = 0 ; x<n;x++){

            if(c[x]==1){
                continue;
            }
            s = s+(x+1);
            c[x]=1;
            if(s.length() == n){
                l.add(s);
                ++z;
                s = new String();
            }else {
                dfs(l,s,i+1,n,c,k);
            }

            c[x]=0;
            if(s.length()>0){
                s = s.substring(0,s.length()-1);
            }

        }
    }


    public static void main(String[] args) {

        System.out.print("x = "+new Code60().getPermutation(3,1));
    }
}
