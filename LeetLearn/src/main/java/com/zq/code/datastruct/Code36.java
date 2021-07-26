package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code36 {
    public boolean isValidSudoku(char[][] board) {

        int[][] r = new int[9][9];
        int[][] cc = new int[9][9];
        int[][] xx = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int c = 0; c < board[0].length; c++) {
                int box_index = (i/3) * 3 + c/3;
                if ('1' <= board[i][c] && board[i][c] <= '9') {
                    r[i][board[i][c] - '1']++;
                    cc[c][board[i][c] - '1']++;
                    xx[box_index][board[i][c] - '1']++;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int c = 0; c < board[0].length; c++) {
                int box_index = (i/3) * 3 + c/3;
                if ('1' <= board[i][c] && board[i][c] <= '9') {
                    if (r[board[i][c] - '1'][i] > 1) {
                        return false;
                    }
                    if (cc[i][board[i][c] - '1'] > 1) {
                        return false;
                    }
                    if (xx[box_index][board[i][c] - '1'] > 1) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
