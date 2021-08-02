package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/8/2
 */
public class Code695 {

    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int c = 0; c < grid[0].length; c++) {
                max = Math.max(max, dfs(grid,i,c,0));
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int c, int max) {
        if (i < 0 || c < 0 || i >= grid.length || c >= grid[0].length || grid[i][c] == 0) {
            return 0;
        }
        grid[i][c]=0;
        int s = dfs(grid, i - 1, c, max);
        int x = dfs(grid, i + 1, c, max);
        int l = dfs(grid, i, c - 1, max);
        int r = dfs(grid, i, c + 1, max);
        return s + x + l + r+1;
    }

    public static void main(String[] args) {
        System.out.println("max = " + new Code695().maxAreaOfIsland(new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        }));
    }
}
