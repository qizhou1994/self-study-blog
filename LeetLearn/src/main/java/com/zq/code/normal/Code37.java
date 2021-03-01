package com.zq.code.normal;

import java.util.TreeMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/1
 */
public class Code37 {

    public void solveSudoku(char[][] board) {
        int[][] colum = new int[9][9];
        int[][] row = new int[9][9];
        int[][] block = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    row[i][num] = 1;
                    colum[j][num] = 1;
                    block[i / 3 * 3 + j / 3][num] = 1;
                }
            }
        }

        dfs(board, block, row, colum, 0, 0);
    }

    private boolean dfs(char[][] board, int[][] block, int[][] row, int[][] colum, int i, int j) {

        while (i < 9) {
            if (board[i][j] != '.') {
                j++;
                if (j >= 9) {
                    j = 0;
                    i++;
                }
                continue;
            }
            break;
        }
        if (i >=9) {
            return true;
        }

        for (int num = 0; num < 9; num++) {
            int blockIndex = i / 3 * 3 + j / 3;
            if (block[blockIndex][num] == 0 && row[i][num] == 0 && colum[j][num] == 0) {
                board[i][j] = (char) (num + '1');
                row[i][num] = 1;
                colum[j][num] = 1;
                block[blockIndex][num] = 1;
                if (dfs(board, block,row, colum, i, j)) {
                    return true;
                } else {
                    row[i][num] = 0;
                    colum[j][num] = 0;
                    block[blockIndex][num] = 0;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Code37 l = new Code37();
        char[][] c = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        l.solveSudoku(c);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + ",");
            }
            System.out.println();
        }
    }
}
