package com.zq.code.recall_back;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/23
 */
public class Code79 {


    public static void main(String[] args) {
        char[][] a = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(new Code79().exist(a, "ABCCED"));
    }

    public boolean exist(char[][] board, String word) {

        int[][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //遍历回溯所有的点直到匹配
                if (check(i, j, 0, visited, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(int i, int j, int k, int[][] visited, char[][] board, String word) {

        if (board[i][j] != word.charAt(k)) {
            return false;
        } else if (k == word.length() - 1) {
            return true;
        }

        int[][] around = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        visited[i][j] = 1;
        for (int[] temp : around) {
            if (i + temp[0] < board.length && i + temp[0] >= 0 && j + temp[1] >= 0 && j + temp[1] < board[0].length && visited[i + temp[0]][j + temp[1]] == 0) {
                if (check(i + temp[0], j + temp[1], k + 1, visited, board, word)) {
                    return true;
                }
            }
        }
        visited[i][j] = 0;
        return false;
    }

























/*    public boolean exist(char[][] board, String word) {
        char[][] visited = new char[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (check(i, j, 0, board,visited, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(int i, int j, int k,char[][] board, char[][] visited, String word) {
        System.out.println("word(k) = "+ word.charAt(k)+",board="+board[i][j]);
        if (board[i][j] != word.charAt(k)) {
            return false;
        } else if (k ==word.length()-1){
            return true;
        }
         visited[i][j] = 1;
        boolean result = false;

        System.out.println("--- "+ word.charAt(k)+",board="+board[i][j]);
        if(j+1<board[0].length&&!result){
            if(visited[i][j+1]==0) {
                if (check(i , j + 1, k + 1, board, visited, word)) {
                    result = true;
                }
                ;
            }
        }
        if(j-1>=0&&!result){
            if(visited[i][j-1]==0) {
                if (check(i, j - 1, k + 1, board, visited, word)) {
                    result = true;
                }
                ;
            }
        }
        if(i+1<board.length&&!result){
            if(visited[i+1][j]==0) {
                if (check(i + 1, j, k + 1, board, visited, word)) {
                    result = true;
                }
                ;
            }
        }
        if(i-1>=0&&!result){
            if(visited[i-1][j]==0){
                if(check(i-1,j,k+1,board,visited,word)){
                    result = true;
                };
            }
        }
        visited[i][j] = 0;
        return result;
    }*/

}
