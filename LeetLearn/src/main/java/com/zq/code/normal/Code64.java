package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/19
 */
public class Code64 {

    public int minPathSum(int[][] grid) {

        int[][] min = new int[grid.length][grid[0].length];
        for(int i = 0;i < grid.length;i++){
            min[i][0]= grid[i][0];
            if(i>0){
                min[i][0]+=min[i-1][0];
            }
        }
        for(int i = 0;i < grid[0].length;i++){
            min[0][i]= grid[0][i];
            if(i>0){
                min[0][i]+=min[0][i-1];
            }
        }


        for(int i = 1; i <grid.length;i++){
            for(int j = 1 ; j<grid[0].length;j++){
                min[i][j]+=(Math.min(min[i-1][j],min[i][j-1])+grid[i][j]);
            }
        }
        return min[grid.length-1][grid[0].length-1];
    }


    public static void main(String[] args) {
        System.out.println(new Code64().minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
