package com.zq.code.normal;

import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/12
 */
public class Code52 {

    int sum = 0;

    public int totalNQueens(int n) {
        int[] c = new int[n];
        int[] dialog1 = new int[n * 3];
        int[] dialog2 = new int[n * 3];
       
        dfs(n, 0,  c, dialog1, dialog2);
        return sum;
    }

    private void dfs(int x, int r, int[] c, int[] dialog1, int[] dialog2) {

        int length = x;
        if (r == length) {
            sum++;
        }
        for (int column = 0; column < length; column++) {
            if (c[column] == 1) {
                continue;
            }
            if (r - column >= 0) {
                if (dialog1[r - column] == 1) {
                    continue;
                }
            } else if (dialog1[r - column + length + length] == 1) {
                continue;
            }
            if (dialog2[r + column] == 1) {
                continue;
            }

            c[column] = 1;
            if (r - column >= 0) {
                dialog1[r - column] = 1;
            } else {
                dialog1[r - column + length + length] = 1;
            }
            dialog2[r + column] = 1;
            dfs(x, r+1, c, dialog1, dialog2);
            c[column] = 0;
            if (r - column >= 0) {
                dialog1[r - column] = 0;
            } else {
                dialog1[r - column + length + length] = 0;
            }
            dialog2[r + column] = 0;
        }
    }


    public static void main(String[] args) {
            System.out.println("----="+new Code52().totalNQueens(4));
    }
}
