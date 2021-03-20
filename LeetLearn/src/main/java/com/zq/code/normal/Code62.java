package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/18
 */
public class Code62 {


    public int uniquePaths(int m, int n) {

        int[][] x = new int[m][n];

        for (int j = 0; j < n; j++) {
            x[0][j] = 1;
        }
        for (int j = 0; j < m; j++) {
            x[j][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

            }
        }

        return x[m - 1][n - 1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] c = obstacleGrid[0];
        int m = obstacleGrid.length;
        int n = c.length;
        int[][] x = new int[obstacleGrid.length][c.length];

        for (int j = 0; j < n; j++) {
            x[0][j] = obstacleGrid[0][j] == 1 ? 0 : 1;
        }
        for (int j = 0; j < m; j++) {
            x[j][0] = obstacleGrid[j][0] == 1 ? 0 : 1;;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j]!=1){
                    if(i-1>=0&&j-1>=0){
                        x[i][j] = x[i - 1][j] + x[i][j - 1];
                    }else if(i-1>=0){
                        x[i][j] = x[i - 1][j];
                    }else if(j-1>=0){
                        x[i][j] = x[i][j-1];
                    }
                }
            }
        }
        return x[m - 1][n - 1];
    }

    public static void main(String[] args) {

//        System.out.println(new Code62().uniquePaths(3, 7));
        System.out.println(new Code62().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
