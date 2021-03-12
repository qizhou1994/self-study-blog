package com.zq.code.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code51 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        double sum = 1;
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        while (b > 0) {
            if ((b & 1) == 1) {
                sum = sum * x;
            }
            x = x * x;
            b = b / 2;
        }
        return sum;
    }


    public List<List<String>> solveNQueens(int n) {
        int[] c = new int[n];
        int[] dialog1 = new int[n * 3];
        int[] dialog2 = new int[n * 3];
        List<List<String>> lists = new ArrayList<>();
        dfs(n, 0, c, dialog1, dialog2, new ArrayList<>(), lists);
        return lists;
    }


    private void dfs(int x, int r, int[] c, int[] dialog1, int[] dialog2, List<String> l, List<List<String>> lists) {

        if (r == x ) {
            lists.add(new ArrayList<>(l));
        }

        for (int col = 0; col < x; col++) {
            if (c[col] == 1) {
                continue;
            }
            if (dialog1[r + col] == 1) {
                continue;
            }

            if (r - col >= 0) {
                if (dialog2[r - col] == 1) {
                    continue;
                }
                dialog2[r - col] = 1;
            } else {
                if (dialog2[r - col + x + x] == 1) {
                    continue;
                }
                dialog2[r - col + x + x] = 1;
            }
            dialog1[r + col] = 1;
            c[col] = 1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < x; i++) {
                if (i == col) {
                    stringBuilder.append("Q");
                } else {
                    stringBuilder.append(".");
                }
            }
            String s = stringBuilder.toString();
            l.add(s);
            dfs(x, r + 1, c, dialog1, dialog2, l, lists);
            if (r - col >= 0) {
                dialog2[r - col] = 0;
            } else {
                dialog2[r - col + x + x] = 0;
            }
            dialog1[r + col] = 0;
            c[col] = 0;
            if (l.size() != 0) {
                l.remove(l.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
//        System.out.println(new Code51().myPow(2.100, -2));
        List<List<String>> l = new Code51().solveNQueens(4);
        for (List<String> list : l) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("----");
        }

    }
}
