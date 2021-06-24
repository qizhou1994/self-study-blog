package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/22
 */
public class Code72 {

    public int minDistance(String word1, String word2) {

        if(word1==null||word1.trim().length()==0){
            return (word2==null||word2.trim().length()==0)?0:word2.length();
        }
        if(word2==null||word2.trim().length()==0){
            return word1.length();
        }
        int[][] dp = new int[word1.length()+1][word2.length()+1];


        /**
         * 增删的操作
         */
        for(int i = 0 ; i <=word1.length();i++){
            dp[i][0]= i;
        }
        for(int i = 0 ; i <=word2.length();i++){
            dp[0][i]= i;
        }

//        dp[0][0] = (word1.charAt(0) == word2.charAt(0)?0:1);

        for(int i = 1 ; i <=word1.length();i++){
            for(int j = 1 ; j <=word2.length();j++){
                /**
                 * 增删操作
                 */
                dp[i][j] = Math.min(dp[i-1][j]+1,dp[i][j-1]+1);
                /**
                 * 替换的操作
                 */
                dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1]+(word1.charAt(i-1) == word2.charAt(j-1)?0:1));
            }
        }

        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        System.out.println(new Code72().minDistance("horse","ros"));
    }
}
